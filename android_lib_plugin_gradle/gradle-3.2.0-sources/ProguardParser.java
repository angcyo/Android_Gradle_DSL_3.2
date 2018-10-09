// $ANTLR 3.5.2 Proguard.g 2018-09-17 19:32:17

import static com.android.build.gradle.shrinker.parser.ModifierSpecification.*;
import static org.objectweb.asm.Opcodes.*;

import com.android.build.gradle.shrinker.parser.AnnotationSpecification;
import com.android.build.gradle.shrinker.parser.ClassSpecification;
import com.android.build.gradle.shrinker.parser.ClassTypeSpecification;
import com.android.build.gradle.shrinker.parser.FilterSpecification;
import com.android.build.gradle.shrinker.parser.GrammarActions;
import com.android.build.gradle.shrinker.parser.GrammarActions.FilterSeparator;
import com.android.build.gradle.shrinker.parser.InheritanceSpecification;
import com.android.build.gradle.shrinker.parser.KeepModifier;
import com.android.build.gradle.shrinker.parser.ModifierSpecification;
import com.android.build.gradle.shrinker.parser.NameSpecification;
import com.android.build.gradle.shrinker.parser.ProguardFlags;
import com.android.build.gradle.shrinker.parser.ProguardParserException;
import com.android.build.gradle.shrinker.parser.UnsupportedFlagsHandler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProguardParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINE_COMMENT", "NAME", "NEGATOR", 
		"WS", "'%'", "'('", "')'", "','", "'-adaptclassstrings'", "'-adaptresourcefilecontents'", 
		"'-adaptresourcefilenames'", "'-addconfigurationdebugging'", "'-allowaccessmodification'", 
		"'-android'", "'-applymapping'", "'-assumenoescapingparameters'", "'-assumenoexternalreturnvalues'", 
		"'-assumenoexternalsideeffects'", "'-assumenosideeffects'", "'-basedirectory'", 
		"'-classobfuscationdictionary'", "'-dontnote'", "'-dontobfuscate'", "'-dontoptimize'", 
		"'-dontpreverify'", "'-dontshrink'", "'-dontskipnonpubliclibraryclasses'", 
		"'-dontskipnonpubliclibraryclassmembers'", "'-dontusemixedcaseclassnames'", 
		"'-dontwarn'", "'-dump'", "'-flattenpackagehierarchy'", "'-forceprocessing'", 
		"'-if'", "'-ignorewarnings'", "'-include'", "'-injars'", "'-keep'", "'-keepattributes'", 
		"'-keepclasseswithmembernames'", "'-keepclasseswithmembers'", "'-keepclassmembernames'", 
		"'-keepclassmembers'", "'-keepdirectories'", "'-keepnames'", "'-keeppackagenames'", 
		"'-keepparameternames'", "'-libraryjars'", "'-mergeinterfacesaggressively'", 
		"'-microedition'", "'-obfuscationdictionary'", "'-optimizationpasses'", 
		"'-optimizations'", "'-outjars'", "'-overloadaggressively'", "'-packageobfuscationdictionary'", 
		"'-printconfiguration'", "'-printmapping'", "'-printseeds'", "'-printusage'", 
		"'-renamesourcefileattribute'", "'-repackageclasses'", "'-skipnonpubliclibraryclasses'", 
		"'-target'", "'-useuniqueclassmembernames'", "'-verbose'", "'-whyareyoukeeping'", 
		"':'", "';'", "'<fields>'", "'<init>'", "'<methods>'", "'@'", "'[]'", 
		"'\\''", "'abstract'", "'allowobfuscation'", "'allowoptimization'", "'allowshrinking'", 
		"'bridge'", "'class'", "'enum'", "'extends'", "'final'", "'implements'", 
		"'includedescriptorclasses'", "'interface'", "'native'", "'private'", 
		"'protected'", "'public'", "'static'", "'strictfp'", "'synchronized'", 
		"'synthetic'", "'transient'", "'varargs'", "'volatile'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int LINE_COMMENT=4;
	public static final int NAME=5;
	public static final int NEGATOR=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProguardParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProguardParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProguardParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Proguard.g"; }


	  @Override
	  public void emitErrorMessage(String msg) {
	    throw new ProguardParserException(msg);
	  }



	// $ANTLR start "prog"
	// Proguard.g:33:1: prog[ProguardFlags flags, UnsupportedFlagsHandler flagsHandler, String baseDirectory] : ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )* EOF ;
	public final void prog(ProguardFlags flags, UnsupportedFlagsHandler flagsHandler, String baseDirectory) throws RecognitionException {
		Token baseDir=null;
		Token proguardFile=null;
		Token target=null;
		KeepModifier keepModifier =null;
		ClassSpecification classSpec =null;
		ParserRuleReturnScope unFlag =null;

		try {
			// Proguard.g:34:3: ( ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )* EOF )
			// Proguard.g:35:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )* EOF
			{
			// Proguard.g:35:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )*
			loop1:
			while (true) {
				int alt1=14;
				switch ( input.LA(1) ) {
				case 23:
					{
					alt1=1;
					}
					break;
				case 39:
				case 76:
					{
					alt1=2;
					}
					break;
				case 46:
					{
					alt1=3;
					}
					break;
				case 44:
					{
					alt1=4;
					}
					break;
				case 41:
					{
					alt1=5;
					}
					break;
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 24:
				case 25:
				case 28:
				case 30:
				case 31:
				case 32:
				case 34:
				case 35:
				case 36:
				case 37:
				case 40:
				case 42:
				case 43:
				case 45:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 68:
				case 69:
					{
					alt1=6;
					}
					break;
				case 33:
					{
					alt1=7;
					}
					break;
				case 38:
					{
					alt1=8;
					}
					break;
				case 67:
					{
					alt1=9;
					}
					break;
				case 70:
					{
					alt1=10;
					}
					break;
				case 29:
					{
					alt1=11;
					}
					break;
				case 27:
					{
					alt1=12;
					}
					break;
				case 26:
					{
					alt1=13;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// Proguard.g:36:5: ( '-basedirectory' baseDir= NAME )
					{
					// Proguard.g:36:5: ( '-basedirectory' baseDir= NAME )
					// Proguard.g:36:6: '-basedirectory' baseDir= NAME
					{
					match(input,23,FOLLOW_23_in_prog67); 
					baseDir=(Token)match(input,NAME,FOLLOW_NAME_in_prog71); 
					baseDirectory=(baseDir!=null?baseDir.getText():null);
					}

					}
					break;
				case 2 :
					// Proguard.g:37:7: ( '-include' | '@' ) proguardFile= NAME
					{
					if ( input.LA(1)==39||input.LA(1)==76 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					proguardFile=(Token)match(input,NAME,FOLLOW_NAME_in_prog90); 
					GrammarActions.include((proguardFile!=null?proguardFile.getText():null), baseDirectory, flags, flagsHandler);
					}
					break;
				case 3 :
					// Proguard.g:38:7: ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					{
					// Proguard.g:38:7: ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					// Proguard.g:38:8: '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification
					{
					match(input,46,FOLLOW_46_in_prog101); 
					pushFollow(FOLLOW_keepOptionModifier_in_prog105);
					keepModifier=keepOptionModifier();
					state._fsp--;

					pushFollow(FOLLOW_classSpecification_in_prog109);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 4 :
					// Proguard.g:39:7: ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					{
					// Proguard.g:39:7: ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					// Proguard.g:39:8: '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification
					{
					match(input,44,FOLLOW_44_in_prog121); 
					pushFollow(FOLLOW_keepOptionModifier_in_prog125);
					keepModifier=keepOptionModifier();
					state._fsp--;

					pushFollow(FOLLOW_classSpecification_in_prog129);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassesWithMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 5 :
					// Proguard.g:40:7: ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification )
					{
					// Proguard.g:40:7: ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification )
					// Proguard.g:40:8: '-keep' keepModifier= keepOptionModifier classSpec= classSpecification
					{
					match(input,41,FOLLOW_41_in_prog141); 
					pushFollow(FOLLOW_keepOptionModifier_in_prog145);
					keepModifier=keepOptionModifier();
					state._fsp--;

					pushFollow(FOLLOW_classSpecification_in_prog149);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassSpecification(flags, classSpec, keepModifier);
					}

					}
					break;
				case 6 :
					// Proguard.g:41:7: (unFlag= unsupportedFlag )
					{
					// Proguard.g:41:7: (unFlag= unsupportedFlag )
					// Proguard.g:41:8: unFlag= unsupportedFlag
					{
					pushFollow(FOLLOW_unsupportedFlag_in_prog163);
					unFlag=unsupportedFlag();
					state._fsp--;

					flagsHandler.unsupportedFlag((unFlag!=null?input.toString(unFlag.start,unFlag.stop):null));
					}

					}
					break;
				case 7 :
					// Proguard.g:42:7: ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] )
					{
					// Proguard.g:42:7: ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] )
					// Proguard.g:42:8: '-dontwarn' filter[class_filter, FilterSeparator.CLASS]
					{
					match(input,33,FOLLOW_33_in_prog175); 
					List<FilterSpecification> class_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_prog179);
					filter(class_filter, FilterSeparator.CLASS);
					state._fsp--;

					GrammarActions.dontWarn(flags, class_filter);
					}

					}
					break;
				case 8 :
					// Proguard.g:43:7: ( '-ignorewarnings' )
					{
					// Proguard.g:43:7: ( '-ignorewarnings' )
					// Proguard.g:43:8: '-ignorewarnings'
					{
					match(input,38,FOLLOW_38_in_prog192); 
					GrammarActions.ignoreWarnings(flags);
					}

					}
					break;
				case 9 :
					// Proguard.g:44:7: ( '-target' target= NAME )
					{
					// Proguard.g:44:7: ( '-target' target= NAME )
					// Proguard.g:44:8: '-target' target= NAME
					{
					match(input,67,FOLLOW_67_in_prog204); 
					target=(Token)match(input,NAME,FOLLOW_NAME_in_prog208); 
					GrammarActions.target(flags, (target!=null?target.getText():null));
					}

					}
					break;
				case 10 :
					// Proguard.g:45:7: ( '-whyareyoukeeping' classSpec= classSpecification )
					{
					// Proguard.g:45:7: ( '-whyareyoukeeping' classSpec= classSpecification )
					// Proguard.g:45:8: '-whyareyoukeeping' classSpec= classSpecification
					{
					match(input,70,FOLLOW_70_in_prog220); 
					pushFollow(FOLLOW_classSpecification_in_prog224);
					classSpec=classSpecification();
					state._fsp--;

					 GrammarActions.whyAreYouKeeping(flags, classSpec); 
					}

					}
					break;
				case 11 :
					// Proguard.g:46:7: ( '-dontshrink' )
					{
					// Proguard.g:46:7: ( '-dontshrink' )
					// Proguard.g:46:8: '-dontshrink'
					{
					match(input,29,FOLLOW_29_in_prog236); 
					 GrammarActions.dontShrink(flags); 
					}

					}
					break;
				case 12 :
					// Proguard.g:47:7: ( '-dontoptimize' )
					{
					// Proguard.g:47:7: ( '-dontoptimize' )
					// Proguard.g:47:8: '-dontoptimize'
					{
					match(input,27,FOLLOW_27_in_prog249); 
					 GrammarActions.dontOptimize(flags); 
					}

					}
					break;
				case 13 :
					// Proguard.g:48:7: ( '-dontobfuscate' )
					{
					// Proguard.g:48:7: ( '-dontobfuscate' )
					// Proguard.g:48:8: '-dontobfuscate'
					{
					match(input,26,FOLLOW_26_in_prog262); 
					 GrammarActions.dontObfuscate(flags); 
					}

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_prog274); 
			}

		}
		catch (RecognitionException e) {

			    throw e;
			  
		}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"


	public static class unsupportedFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "unsupportedFlag"
	// Proguard.g:56:9: private unsupportedFlag : ( '-allowaccessmodification' | '-addconfigurationdebugging' | '-android' | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-dontpreverify' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-dontusemixedcaseclassnames' | '-forceprocessing' | '-injars' inJars= classpath | '-keepparameternames' | '-libraryjars' libraryJars= classpath | '-mergeinterfacesaggressively' | '-microedition' | '-obfuscationdictionary' obfuscationDictionary= NAME | '-outjars' outJars= classpath | '-overloadaggressively' | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | '-skipnonpubliclibraryclasses' | '-useuniqueclassmembernames' | '-verbose' | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-applymapping' mapping= NAME ) | ( '-assumenoescapingparameters' classSpecification ) | ( '-assumenoexternalreturnvalues' classSpecification ) | ( '-assumenoexternalsideeffects' classSpecification ) | ( '-assumenosideeffects' classSpecification ) | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | ( '-dump' ( NAME )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keepclasseswithmembernames' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) | ( '-keepnames' classSpec= classSpecification ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-optimizationpasses' NAME ) | ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | ( '-printconfiguration' ( NAME )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-printusage' NAME ) | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-if' classSpecification ) ) ;
	public final unsupportedFlag_return unsupportedFlag() throws RecognitionException {
		unsupportedFlag_return retval = new unsupportedFlag_return();
		retval.start = input.LT(1);

		Token classObfuscationDictionary=null;
		Token obfuscationDictionary=null;
		Token packageObfuscationDictionary=null;
		Token outputMapping=null;
		Token mapping=null;
		Token newPackage=null;
		Token seedOutputFile=null;
		Token sourceFile=null;
		KeepModifier keepModifier =null;
		ClassSpecification classSpec =null;

		try {
			// Proguard.g:57:3: ( ( '-allowaccessmodification' | '-addconfigurationdebugging' | '-android' | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-dontpreverify' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-dontusemixedcaseclassnames' | '-forceprocessing' | '-injars' inJars= classpath | '-keepparameternames' | '-libraryjars' libraryJars= classpath | '-mergeinterfacesaggressively' | '-microedition' | '-obfuscationdictionary' obfuscationDictionary= NAME | '-outjars' outJars= classpath | '-overloadaggressively' | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | '-skipnonpubliclibraryclasses' | '-useuniqueclassmembernames' | '-verbose' | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-applymapping' mapping= NAME ) | ( '-assumenoescapingparameters' classSpecification ) | ( '-assumenoexternalreturnvalues' classSpecification ) | ( '-assumenoexternalsideeffects' classSpecification ) | ( '-assumenosideeffects' classSpecification ) | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | ( '-dump' ( NAME )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keepclasseswithmembernames' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) | ( '-keepnames' classSpec= classSpecification ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-optimizationpasses' NAME ) | ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | ( '-printconfiguration' ( NAME )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-printusage' NAME ) | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-if' classSpecification ) ) )
			// Proguard.g:58:3: ( '-allowaccessmodification' | '-addconfigurationdebugging' | '-android' | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-dontpreverify' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-dontusemixedcaseclassnames' | '-forceprocessing' | '-injars' inJars= classpath | '-keepparameternames' | '-libraryjars' libraryJars= classpath | '-mergeinterfacesaggressively' | '-microedition' | '-obfuscationdictionary' obfuscationDictionary= NAME | '-outjars' outJars= classpath | '-overloadaggressively' | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | '-skipnonpubliclibraryclasses' | '-useuniqueclassmembernames' | '-verbose' | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-applymapping' mapping= NAME ) | ( '-assumenoescapingparameters' classSpecification ) | ( '-assumenoexternalreturnvalues' classSpecification ) | ( '-assumenoexternalsideeffects' classSpecification ) | ( '-assumenosideeffects' classSpecification ) | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | ( '-dump' ( NAME )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keepclasseswithmembernames' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) | ( '-keepnames' classSpec= classSpecification ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-optimizationpasses' NAME ) | ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | ( '-printconfiguration' ( NAME )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-printusage' NAME ) | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-if' classSpecification ) )
			{
			// Proguard.g:58:3: ( '-allowaccessmodification' | '-addconfigurationdebugging' | '-android' | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-dontpreverify' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-dontusemixedcaseclassnames' | '-forceprocessing' | '-injars' inJars= classpath | '-keepparameternames' | '-libraryjars' libraryJars= classpath | '-mergeinterfacesaggressively' | '-microedition' | '-obfuscationdictionary' obfuscationDictionary= NAME | '-outjars' outJars= classpath | '-overloadaggressively' | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | '-skipnonpubliclibraryclasses' | '-useuniqueclassmembernames' | '-verbose' | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-applymapping' mapping= NAME ) | ( '-assumenoescapingparameters' classSpecification ) | ( '-assumenoexternalreturnvalues' classSpecification ) | ( '-assumenoexternalsideeffects' classSpecification ) | ( '-assumenosideeffects' classSpecification ) | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | ( '-dump' ( NAME )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keepclasseswithmembernames' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) | ( '-keepnames' classSpec= classSpecification ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-optimizationpasses' NAME ) | ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | ( '-printconfiguration' ( NAME )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-printusage' NAME ) | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-if' classSpecification ) )
			int alt11=47;
			switch ( input.LA(1) ) {
			case 16:
				{
				alt11=1;
				}
				break;
			case 15:
				{
				alt11=2;
				}
				break;
			case 17:
				{
				alt11=3;
				}
				break;
			case 24:
				{
				alt11=4;
				}
				break;
			case 28:
				{
				alt11=5;
				}
				break;
			case 30:
				{
				alt11=6;
				}
				break;
			case 31:
				{
				alt11=7;
				}
				break;
			case 32:
				{
				alt11=8;
				}
				break;
			case 36:
				{
				alt11=9;
				}
				break;
			case 40:
				{
				alt11=10;
				}
				break;
			case 50:
				{
				alt11=11;
				}
				break;
			case 51:
				{
				alt11=12;
				}
				break;
			case 52:
				{
				alt11=13;
				}
				break;
			case 53:
				{
				alt11=14;
				}
				break;
			case 54:
				{
				alt11=15;
				}
				break;
			case 57:
				{
				alt11=16;
				}
				break;
			case 58:
				{
				alt11=17;
				}
				break;
			case 59:
				{
				alt11=18;
				}
				break;
			case 61:
				{
				alt11=19;
				}
				break;
			case 66:
				{
				alt11=20;
				}
				break;
			case 68:
				{
				alt11=21;
				}
				break;
			case 69:
				{
				alt11=22;
				}
				break;
			case 12:
				{
				alt11=23;
				}
				break;
			case 13:
				{
				alt11=24;
				}
				break;
			case 14:
				{
				alt11=25;
				}
				break;
			case 18:
				{
				alt11=26;
				}
				break;
			case 19:
				{
				alt11=27;
				}
				break;
			case 20:
				{
				alt11=28;
				}
				break;
			case 21:
				{
				alt11=29;
				}
				break;
			case 22:
				{
				alt11=30;
				}
				break;
			case 25:
				{
				alt11=31;
				}
				break;
			case 34:
				{
				alt11=32;
				}
				break;
			case 35:
				{
				alt11=33;
				}
				break;
			case 42:
				{
				alt11=34;
				}
				break;
			case 43:
				{
				alt11=35;
				}
				break;
			case 45:
				{
				alt11=36;
				}
				break;
			case 47:
				{
				alt11=37;
				}
				break;
			case 48:
				{
				alt11=38;
				}
				break;
			case 49:
				{
				alt11=39;
				}
				break;
			case 55:
				{
				alt11=40;
				}
				break;
			case 56:
				{
				alt11=41;
				}
				break;
			case 60:
				{
				alt11=42;
				}
				break;
			case 62:
				{
				alt11=43;
				}
				break;
			case 63:
				{
				alt11=44;
				}
				break;
			case 64:
				{
				alt11=45;
				}
				break;
			case 65:
				{
				alt11=46;
				}
				break;
			case 37:
				{
				alt11=47;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// Proguard.g:59:7: '-allowaccessmodification'
					{
					match(input,16,FOLLOW_16_in_unsupportedFlag307); 
					}
					break;
				case 2 :
					// Proguard.g:60:7: '-addconfigurationdebugging'
					{
					match(input,15,FOLLOW_15_in_unsupportedFlag315); 
					}
					break;
				case 3 :
					// Proguard.g:61:7: '-android'
					{
					match(input,17,FOLLOW_17_in_unsupportedFlag323); 
					}
					break;
				case 4 :
					// Proguard.g:62:7: '-classobfuscationdictionary' classObfuscationDictionary= NAME
					{
					match(input,24,FOLLOW_24_in_unsupportedFlag331); 
					classObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag335); 
					}
					break;
				case 5 :
					// Proguard.g:63:7: '-dontpreverify'
					{
					match(input,28,FOLLOW_28_in_unsupportedFlag343); 
					}
					break;
				case 6 :
					// Proguard.g:64:7: '-dontskipnonpubliclibraryclasses'
					{
					match(input,30,FOLLOW_30_in_unsupportedFlag351); 
					}
					break;
				case 7 :
					// Proguard.g:65:7: '-dontskipnonpubliclibraryclassmembers'
					{
					match(input,31,FOLLOW_31_in_unsupportedFlag359); 
					}
					break;
				case 8 :
					// Proguard.g:66:7: '-dontusemixedcaseclassnames'
					{
					match(input,32,FOLLOW_32_in_unsupportedFlag367); 
					}
					break;
				case 9 :
					// Proguard.g:67:7: '-forceprocessing'
					{
					match(input,36,FOLLOW_36_in_unsupportedFlag375); 
					}
					break;
				case 10 :
					// Proguard.g:68:7: '-injars' inJars= classpath
					{
					match(input,40,FOLLOW_40_in_unsupportedFlag383); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag387);
					classpath();
					state._fsp--;

					}
					break;
				case 11 :
					// Proguard.g:69:7: '-keepparameternames'
					{
					match(input,50,FOLLOW_50_in_unsupportedFlag395); 
					}
					break;
				case 12 :
					// Proguard.g:70:7: '-libraryjars' libraryJars= classpath
					{
					match(input,51,FOLLOW_51_in_unsupportedFlag403); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag407);
					classpath();
					state._fsp--;

					}
					break;
				case 13 :
					// Proguard.g:71:7: '-mergeinterfacesaggressively'
					{
					match(input,52,FOLLOW_52_in_unsupportedFlag415); 
					}
					break;
				case 14 :
					// Proguard.g:72:7: '-microedition'
					{
					match(input,53,FOLLOW_53_in_unsupportedFlag423); 
					}
					break;
				case 15 :
					// Proguard.g:73:7: '-obfuscationdictionary' obfuscationDictionary= NAME
					{
					match(input,54,FOLLOW_54_in_unsupportedFlag431); 
					obfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag435); 
					}
					break;
				case 16 :
					// Proguard.g:74:7: '-outjars' outJars= classpath
					{
					match(input,57,FOLLOW_57_in_unsupportedFlag443); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag447);
					classpath();
					state._fsp--;

					}
					break;
				case 17 :
					// Proguard.g:75:7: '-overloadaggressively'
					{
					match(input,58,FOLLOW_58_in_unsupportedFlag455); 
					}
					break;
				case 18 :
					// Proguard.g:76:7: '-packageobfuscationdictionary' packageObfuscationDictionary= NAME
					{
					match(input,59,FOLLOW_59_in_unsupportedFlag463); 
					packageObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag467); 
					}
					break;
				case 19 :
					// Proguard.g:77:7: '-printmapping' (outputMapping= NAME )?
					{
					match(input,61,FOLLOW_61_in_unsupportedFlag475); 
					// Proguard.g:77:36: (outputMapping= NAME )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==NAME) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// Proguard.g:77:36: outputMapping= NAME
							{
							outputMapping=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag479); 
							}
							break;

					}

					}
					break;
				case 20 :
					// Proguard.g:78:7: '-skipnonpubliclibraryclasses'
					{
					match(input,66,FOLLOW_66_in_unsupportedFlag488); 
					}
					break;
				case 21 :
					// Proguard.g:79:7: '-useuniqueclassmembernames'
					{
					match(input,68,FOLLOW_68_in_unsupportedFlag496); 
					}
					break;
				case 22 :
					// Proguard.g:80:7: '-verbose'
					{
					match(input,69,FOLLOW_69_in_unsupportedFlag504); 
					}
					break;
				case 23 :
					// Proguard.g:81:7: ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] )
					{
					// Proguard.g:81:7: ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] )
					// Proguard.g:81:8: '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL]
					{
					match(input,12,FOLLOW_12_in_unsupportedFlag513); 
					List<FilterSpecification> filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag517);
					filter(filter, FilterSeparator.GENERAL);
					state._fsp--;

					}

					}
					break;
				case 24 :
					// Proguard.g:82:7: ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] )
					{
					// Proguard.g:82:7: ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] )
					// Proguard.g:82:8: '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE]
					{
					match(input,13,FOLLOW_13_in_unsupportedFlag528); 
					List<FilterSpecification> file_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag532);
					filter(file_filter, FilterSeparator.FILE);
					state._fsp--;

					}

					}
					break;
				case 25 :
					// Proguard.g:83:7: ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] )
					{
					// Proguard.g:83:7: ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] )
					// Proguard.g:83:8: '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE]
					{
					match(input,14,FOLLOW_14_in_unsupportedFlag544); 
					List<FilterSpecification> file_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag548);
					filter(file_filter, FilterSeparator.FILE);
					state._fsp--;

					}

					}
					break;
				case 26 :
					// Proguard.g:84:7: ( '-applymapping' mapping= NAME )
					{
					// Proguard.g:84:7: ( '-applymapping' mapping= NAME )
					// Proguard.g:84:8: '-applymapping' mapping= NAME
					{
					match(input,18,FOLLOW_18_in_unsupportedFlag560); 
					mapping=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag564); 
					}

					}
					break;
				case 27 :
					// Proguard.g:85:7: ( '-assumenoescapingparameters' classSpecification )
					{
					// Proguard.g:85:7: ( '-assumenoescapingparameters' classSpecification )
					// Proguard.g:85:8: '-assumenoescapingparameters' classSpecification
					{
					match(input,19,FOLLOW_19_in_unsupportedFlag575); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag577);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 28 :
					// Proguard.g:86:7: ( '-assumenoexternalreturnvalues' classSpecification )
					{
					// Proguard.g:86:7: ( '-assumenoexternalreturnvalues' classSpecification )
					// Proguard.g:86:8: '-assumenoexternalreturnvalues' classSpecification
					{
					match(input,20,FOLLOW_20_in_unsupportedFlag587); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag589);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 29 :
					// Proguard.g:87:7: ( '-assumenoexternalsideeffects' classSpecification )
					{
					// Proguard.g:87:7: ( '-assumenoexternalsideeffects' classSpecification )
					// Proguard.g:87:8: '-assumenoexternalsideeffects' classSpecification
					{
					match(input,21,FOLLOW_21_in_unsupportedFlag599); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag601);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 30 :
					// Proguard.g:88:7: ( '-assumenosideeffects' classSpecification )
					{
					// Proguard.g:88:7: ( '-assumenosideeffects' classSpecification )
					// Proguard.g:88:8: '-assumenosideeffects' classSpecification
					{
					match(input,22,FOLLOW_22_in_unsupportedFlag611); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag613);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 31 :
					// Proguard.g:89:7: ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] )
					{
					// Proguard.g:89:7: ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] )
					// Proguard.g:89:8: '-dontnote' filter[class_filter, FilterSeparator.CLASS]
					{
					match(input,25,FOLLOW_25_in_unsupportedFlag623); 
					List<FilterSpecification> class_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag627);
					filter(class_filter, FilterSeparator.CLASS);
					state._fsp--;

					}

					}
					break;
				case 32 :
					// Proguard.g:90:7: ( '-dump' ( NAME )? )
					{
					// Proguard.g:90:7: ( '-dump' ( NAME )? )
					// Proguard.g:90:8: '-dump' ( NAME )?
					{
					match(input,34,FOLLOW_34_in_unsupportedFlag638); 
					// Proguard.g:90:16: ( NAME )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==NAME) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Proguard.g:90:16: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag640); 
							}
							break;

					}

					}

					}
					break;
				case 33 :
					// Proguard.g:91:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// Proguard.g:91:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// Proguard.g:91:8: '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,35,FOLLOW_35_in_unsupportedFlag652); 
					// Proguard.g:91:35: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==78) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Proguard.g:91:36: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,78,FOLLOW_78_in_unsupportedFlag655); 
							// Proguard.g:91:51: (newPackage= NAME )?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==NAME) ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// Proguard.g:91:51: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag659); 
									}
									break;

							}

							match(input,78,FOLLOW_78_in_unsupportedFlag662); 
							}
							break;

					}

					}

					}
					break;
				case 34 :
					// Proguard.g:92:7: ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] )
					{
					// Proguard.g:92:7: ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] )
					// Proguard.g:92:8: '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE]
					{
					match(input,42,FOLLOW_42_in_unsupportedFlag675); 
					List<FilterSpecification> attribute_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag679);
					filter(attribute_filter, FilterSeparator.ATTRIBUTE);
					state._fsp--;

					}

					}
					break;
				case 35 :
					// Proguard.g:93:7: ( '-keepclasseswithmembernames' keepModifier= keepOptionModifier classSpec= classSpecification )
					{
					// Proguard.g:93:7: ( '-keepclasseswithmembernames' keepModifier= keepOptionModifier classSpec= classSpecification )
					// Proguard.g:93:8: '-keepclasseswithmembernames' keepModifier= keepOptionModifier classSpec= classSpecification
					{
					match(input,43,FOLLOW_43_in_unsupportedFlag691); 
					pushFollow(FOLLOW_keepOptionModifier_in_unsupportedFlag695);
					keepModifier=keepOptionModifier();
					state._fsp--;

					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag699);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 36 :
					// Proguard.g:94:7: ( '-keepclassmembernames' classSpec= classSpecification )
					{
					// Proguard.g:94:7: ( '-keepclassmembernames' classSpec= classSpecification )
					// Proguard.g:94:8: '-keepclassmembernames' classSpec= classSpecification
					{
					match(input,45,FOLLOW_45_in_unsupportedFlag711); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag715);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 37 :
					// Proguard.g:95:7: ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] )
					{
					// Proguard.g:95:7: ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] )
					// Proguard.g:95:8: '-keepdirectories' filter[directory_filter, FilterSeparator.FILE]
					{
					match(input,47,FOLLOW_47_in_unsupportedFlag727); 
					List<FilterSpecification> directory_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag731);
					filter(directory_filter, FilterSeparator.FILE);
					state._fsp--;

					}

					}
					break;
				case 38 :
					// Proguard.g:96:7: ( '-keepnames' classSpec= classSpecification )
					{
					// Proguard.g:96:7: ( '-keepnames' classSpec= classSpecification )
					// Proguard.g:96:8: '-keepnames' classSpec= classSpecification
					{
					match(input,48,FOLLOW_48_in_unsupportedFlag742); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag746);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 39 :
					// Proguard.g:97:7: ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] )
					{
					// Proguard.g:97:7: ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] )
					// Proguard.g:97:8: '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL]
					{
					match(input,49,FOLLOW_49_in_unsupportedFlag757); 
					List<FilterSpecification> package_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag761);
					filter(package_filter, FilterSeparator.GENERAL);
					state._fsp--;

					}

					}
					break;
				case 40 :
					// Proguard.g:98:7: ( '-optimizationpasses' NAME )
					{
					// Proguard.g:98:7: ( '-optimizationpasses' NAME )
					// Proguard.g:98:8: '-optimizationpasses' NAME
					{
					match(input,55,FOLLOW_55_in_unsupportedFlag773); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag775); 
					}

					}
					break;
				case 41 :
					// Proguard.g:99:7: ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] )
					{
					// Proguard.g:99:7: ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] )
					// Proguard.g:99:8: '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL]
					{
					match(input,56,FOLLOW_56_in_unsupportedFlag786); 
					List<FilterSpecification> optimization_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag790);
					filter(optimization_filter, FilterSeparator.GENERAL);
					state._fsp--;

					}

					}
					break;
				case 42 :
					// Proguard.g:100:7: ( '-printconfiguration' ( NAME )? )
					{
					// Proguard.g:100:7: ( '-printconfiguration' ( NAME )? )
					// Proguard.g:100:8: '-printconfiguration' ( NAME )?
					{
					match(input,60,FOLLOW_60_in_unsupportedFlag801); 
					// Proguard.g:100:30: ( NAME )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==NAME) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Proguard.g:100:30: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag803); 
							}
							break;

					}

					}

					}
					break;
				case 43 :
					// Proguard.g:101:7: ( '-printseeds' (seedOutputFile= NAME )? )
					{
					// Proguard.g:101:7: ( '-printseeds' (seedOutputFile= NAME )? )
					// Proguard.g:101:8: '-printseeds' (seedOutputFile= NAME )?
					{
					match(input,62,FOLLOW_62_in_unsupportedFlag815); 
					// Proguard.g:101:36: (seedOutputFile= NAME )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==NAME) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// Proguard.g:101:36: seedOutputFile= NAME
							{
							seedOutputFile=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag819); 
							}
							break;

					}

					}

					}
					break;
				case 44 :
					// Proguard.g:102:7: ( '-printusage' NAME )
					{
					// Proguard.g:102:7: ( '-printusage' NAME )
					// Proguard.g:102:8: '-printusage' NAME
					{
					match(input,63,FOLLOW_63_in_unsupportedFlag831); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag833); 
					}

					}
					break;
				case 45 :
					// Proguard.g:103:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					{
					// Proguard.g:103:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					// Proguard.g:103:8: '-renamesourcefileattribute' (sourceFile= NAME )?
					{
					match(input,64,FOLLOW_64_in_unsupportedFlag844); 
					// Proguard.g:103:47: (sourceFile= NAME )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==NAME) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Proguard.g:103:47: sourceFile= NAME
							{
							sourceFile=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag848); 
							}
							break;

					}

					}

					}
					break;
				case 46 :
					// Proguard.g:104:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// Proguard.g:104:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// Proguard.g:104:8: '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,65,FOLLOW_65_in_unsupportedFlag859); 
					// Proguard.g:104:28: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==78) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// Proguard.g:104:29: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,78,FOLLOW_78_in_unsupportedFlag862); 
							// Proguard.g:104:44: (newPackage= NAME )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==NAME) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// Proguard.g:104:44: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag866); 
									}
									break;

							}

							match(input,78,FOLLOW_78_in_unsupportedFlag869); 
							}
							break;

					}

					}

					}
					break;
				case 47 :
					// Proguard.g:105:7: ( '-if' classSpecification )
					{
					// Proguard.g:105:7: ( '-if' classSpecification )
					// Proguard.g:105:8: '-if' classSpecification
					{
					match(input,37,FOLLOW_37_in_unsupportedFlag882); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag884);
					classSpecification();
					state._fsp--;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unsupportedFlag"



	// $ANTLR start "classpath"
	// Proguard.g:109:9: private classpath : NAME ( ( ':' | ';' ) classpath )? ;
	public final void classpath() throws RecognitionException {
		try {
			// Proguard.g:110:3: ( NAME ( ( ':' | ';' ) classpath )? )
			// Proguard.g:110:6: NAME ( ( ':' | ';' ) classpath )?
			{
			match(input,NAME,FOLLOW_NAME_in_classpath905); 
			// Proguard.g:110:11: ( ( ':' | ';' ) classpath )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= 71 && LA12_0 <= 72)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Proguard.g:110:12: ( ':' | ';' ) classpath
					{
					if ( (input.LA(1) >= 71 && input.LA(1) <= 72) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_classpath_in_classpath914);
					classpath();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classpath"



	// $ANTLR start "filter"
	// Proguard.g:113:9: private filter[List<FilterSpecification> filter, FilterSeparator separator] : ( nonEmptyFilter[filter, separator] |);
	public final void filter(List<FilterSpecification> filter, FilterSeparator separator) throws RecognitionException {
		try {
			// Proguard.g:114:3: ( nonEmptyFilter[filter, separator] |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= NAME && LA13_0 <= NEGATOR)) ) {
				alt13=1;
			}
			else if ( (LA13_0==EOF||(LA13_0 >= 12 && LA13_0 <= 70)||LA13_0==76) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Proguard.g:115:3: nonEmptyFilter[filter, separator]
					{
					pushFollow(FOLLOW_nonEmptyFilter_in_filter935);
					nonEmptyFilter(filter, separator);
					state._fsp--;

					}
					break;
				case 2 :
					// Proguard.g:116:5: 
					{
					GrammarActions.filter(filter, false, "**", separator);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "filter"



	// $ANTLR start "nonEmptyFilter"
	// Proguard.g:120:9: private nonEmptyFilter[List<FilterSpecification> filter, FilterSeparator separator] : ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? ) ;
	public final void nonEmptyFilter(List<FilterSpecification> filter, FilterSeparator separator) throws RecognitionException {
		Token NAME1=null;


		  boolean negator = false;

		try {
			// Proguard.g:124:3: ( ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? ) )
			// Proguard.g:125:3: ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? )
			{
			// Proguard.g:125:3: ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? )
			// Proguard.g:125:4: ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )?
			{
			// Proguard.g:125:4: ( NEGATOR )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==NEGATOR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Proguard.g:125:5: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_nonEmptyFilter969); 
					negator=true;
					}
					break;

			}

			NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_nonEmptyFilter975); 
			GrammarActions.filter(filter, negator, (NAME1!=null?NAME1.getText():null), separator);
			// Proguard.g:125:102: ( ',' nonEmptyFilter[filter, separator] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==11) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Proguard.g:125:103: ',' nonEmptyFilter[filter, separator]
					{
					match(input,11,FOLLOW_11_in_nonEmptyFilter980); 
					pushFollow(FOLLOW_nonEmptyFilter_in_nonEmptyFilter982);
					nonEmptyFilter(filter, separator);
					state._fsp--;

					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nonEmptyFilter"



	// $ANTLR start "classSpecification"
	// Proguard.g:128:9: private classSpecification returns [ClassSpecification classSpec] : ( annotation )? cType= classModifierAndType[modifier] classNames (inheritanceSpec= inheritance )? ( members[classSpec] )? ;
	public final ClassSpecification classSpecification() throws RecognitionException {
		ClassSpecification classSpec = null;


		ClassTypeSpecification cType =null;
		InheritanceSpecification inheritanceSpec =null;
		List<NameSpecification> classNames2 =null;
		AnnotationSpecification annotation3 =null;


		  ModifierSpecification modifier = new ModifierSpecification();
		  boolean hasNameNegator = false;

		try {
			// Proguard.g:133:3: ( ( annotation )? cType= classModifierAndType[modifier] classNames (inheritanceSpec= inheritance )? ( members[classSpec] )? )
			// Proguard.g:134:3: ( annotation )? cType= classModifierAndType[modifier] classNames (inheritanceSpec= inheritance )? ( members[classSpec] )?
			{
			// Proguard.g:134:3: ( annotation )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==76) ) {
				int LA16_1 = input.LA(2);
				if ( ((LA16_1 >= NAME && LA16_1 <= NEGATOR)) ) {
					alt16=1;
				}
			}
			switch (alt16) {
				case 1 :
					// Proguard.g:134:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_classSpecification1012);
					annotation3=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_classModifierAndType_in_classSpecification1020);
			cType=classModifierAndType(modifier);
			state._fsp--;

			pushFollow(FOLLOW_classNames_in_classSpecification1025);
			classNames2=classNames();
			state._fsp--;

			classSpec = GrammarActions.classSpec(classNames2, cType, annotation3, modifier);
			// Proguard.g:137:3: (inheritanceSpec= inheritance )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==86||LA17_0==88) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Proguard.g:137:4: inheritanceSpec= inheritance
					{
					pushFollow(FOLLOW_inheritance_in_classSpecification1034);
					inheritanceSpec=inheritance();
					state._fsp--;

					classSpec.setInheritance(inheritanceSpec);
					}
					break;

			}

			// Proguard.g:138:3: ( members[classSpec] )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==102) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Proguard.g:138:3: members[classSpec]
					{
					pushFollow(FOLLOW_members_in_classSpecification1042);
					members(classSpec);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return classSpec;
	}
	// $ANTLR end "classSpecification"



	// $ANTLR start "classNames"
	// Proguard.g:141:9: private classNames returns [List<NameSpecification> names] : firstName= className ( ',' otherName= className )* ;
	public final List<NameSpecification> classNames() throws RecognitionException {
		List<NameSpecification> names = null;


		NameSpecification firstName =null;
		NameSpecification otherName =null;


		  names = new ArrayList<NameSpecification>();

		try {
			// Proguard.g:145:3: (firstName= className ( ',' otherName= className )* )
			// Proguard.g:146:3: firstName= className ( ',' otherName= className )*
			{
			pushFollow(FOLLOW_className_in_classNames1071);
			firstName=className();
			state._fsp--;

			names.add(firstName);
			// Proguard.g:147:3: ( ',' otherName= className )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==11) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Proguard.g:147:4: ',' otherName= className
					{
					match(input,11,FOLLOW_11_in_classNames1078); 
					pushFollow(FOLLOW_className_in_classNames1082);
					otherName=className();
					state._fsp--;

					names.add(otherName);
					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return names;
	}
	// $ANTLR end "classNames"



	// $ANTLR start "className"
	// Proguard.g:150:9: private className returns [NameSpecification nameSpec] : ( NEGATOR )? NAME ;
	public final NameSpecification className() throws RecognitionException {
		NameSpecification nameSpec = null;


		Token NAME4=null;


		    boolean hasNameNegator = false;

		try {
			// Proguard.g:154:3: ( ( NEGATOR )? NAME )
			// Proguard.g:155:3: ( NEGATOR )? NAME
			{
			// Proguard.g:155:3: ( NEGATOR )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==NEGATOR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Proguard.g:155:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_className1111); 
					hasNameNegator = true;
					}
					break;

			}

			NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_className1119); 
			nameSpec=GrammarActions.className((NAME4!=null?NAME4.getText():null), hasNameNegator);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nameSpec;
	}
	// $ANTLR end "className"



	// $ANTLR start "classModifierAndType"
	// Proguard.g:159:9: private classModifierAndType[ModifierSpecification modifier] returns [ClassTypeSpecification cType] : ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) ;
	public final ClassTypeSpecification classModifierAndType(ModifierSpecification modifier) throws RecognitionException {
		ClassTypeSpecification cType = null;


		ClassTypeSpecification cmat =null;
		int classType5 =0;


		  boolean hasNegator = false;

		try {
			// Proguard.g:163:3: ( ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) )
			// Proguard.g:164:3: ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			{
			// Proguard.g:164:3: ( NEGATOR )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==NEGATOR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Proguard.g:164:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classModifierAndType1146); 
					hasNegator = true;
					}
					break;

			}

			// Proguard.g:165:3: ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			int alt22=4;
			switch ( input.LA(1) ) {
			case 94:
				{
				alt22=1;
				}
				break;
			case 79:
				{
				alt22=2;
				}
				break;
			case 87:
				{
				alt22=3;
				}
				break;
			case 76:
			case 84:
			case 85:
			case 90:
				{
				alt22=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// Proguard.g:166:3: 'public' cmat= classModifierAndType[modifier]
					{
					match(input,94,FOLLOW_94_in_classModifierAndType1158); 
					GrammarActions.addAccessFlag(modifier, AccessFlag.PUBLIC, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1164);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 2 :
					// Proguard.g:167:5: 'abstract' cmat= classModifierAndType[modifier]
					{
					match(input,79,FOLLOW_79_in_classModifierAndType1173); 
					GrammarActions.addModifier(modifier, Modifier.ABSTRACT, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1179);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 3 :
					// Proguard.g:168:5: 'final' cmat= classModifierAndType[modifier]
					{
					match(input,87,FOLLOW_87_in_classModifierAndType1188); 
					GrammarActions.addModifier(modifier, Modifier.FINAL, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1194);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 4 :
					// Proguard.g:169:5: classType
					{
					pushFollow(FOLLOW_classType_in_classModifierAndType1203);
					classType5=classType();
					state._fsp--;

					cType=GrammarActions.classType(classType5, hasNegator); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return cType;
	}
	// $ANTLR end "classModifierAndType"



	// $ANTLR start "classType"
	// Proguard.g:173:9: private classType returns [int type] : ( '@' )? ( 'interface' | 'enum' | 'class' ) ;
	public final int classType() throws RecognitionException {
		int type = 0;



		  type = 0;

		try {
			// Proguard.g:177:3: ( ( '@' )? ( 'interface' | 'enum' | 'class' ) )
			// Proguard.g:178:3: ( '@' )? ( 'interface' | 'enum' | 'class' )
			{
			// Proguard.g:178:3: ( '@' )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==76) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Proguard.g:178:4: '@'
					{
					match(input,76,FOLLOW_76_in_classType1236); 
					type |= ACC_ANNOTATION;
					}
					break;

			}

			// Proguard.g:179:3: ( 'interface' | 'enum' | 'class' )
			int alt24=3;
			switch ( input.LA(1) ) {
			case 90:
				{
				alt24=1;
				}
				break;
			case 85:
				{
				alt24=2;
				}
				break;
			case 84:
				{
				alt24=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// Proguard.g:179:4: 'interface'
					{
					match(input,90,FOLLOW_90_in_classType1245); 
					type |= ACC_INTERFACE;
					}
					break;
				case 2 :
					// Proguard.g:180:5: 'enum'
					{
					match(input,85,FOLLOW_85_in_classType1253); 
					type |= ACC_ENUM;
					}
					break;
				case 3 :
					// Proguard.g:181:5: 'class'
					{
					match(input,84,FOLLOW_84_in_classType1261); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "classType"



	// $ANTLR start "members"
	// Proguard.g:185:9: private members[ClassSpecification classSpec] : '{' ( member[classSpec] )* '}' ;
	public final void members(ClassSpecification classSpec) throws RecognitionException {
		try {
			// Proguard.g:186:3: ( '{' ( member[classSpec] )* '}' )
			// Proguard.g:187:3: '{' ( member[classSpec] )* '}'
			{
			match(input,102,FOLLOW_102_in_members1284); 
			// Proguard.g:188:5: ( member[classSpec] )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= NAME && LA25_0 <= NEGATOR)||LA25_0==8||(LA25_0 >= 73 && LA25_0 <= 76)||LA25_0==79||LA25_0==83||LA25_0==87||(LA25_0 >= 91 && LA25_0 <= 101)) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// Proguard.g:188:5: member[classSpec]
					{
					pushFollow(FOLLOW_member_in_members1290);
					member(classSpec);
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,103,FOLLOW_103_in_members1296); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "members"



	// $ANTLR start "member"
	// Proguard.g:192:9: private member[ClassSpecification classSpec] : ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | ( type )? '<methods>' | ( type )? '<fields>' ) ';' ;
	public final void member(ClassSpecification classSpec) throws RecognitionException {
		Token name=null;
		String typeSig =null;
		String signature =null;
		AnnotationSpecification annotation6 =null;
		ModifierSpecification modifiers7 =null;

		try {
			// Proguard.g:193:3: ( ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | ( type )? '<methods>' | ( type )? '<fields>' ) ';' )
			// Proguard.g:194:5: ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | ( type )? '<methods>' | ( type )? '<fields>' ) ';'
			{
			// Proguard.g:194:5: ( annotation )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==76) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Proguard.g:194:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_member1317);
					annotation6=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_modifiers_in_member1320);
			modifiers7=modifiers();
			state._fsp--;

			// Proguard.g:195:5: ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | ( type )? '<methods>' | ( type )? '<fields>' )
			int alt31=3;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// Proguard.g:196:7: (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |)
					{
					// Proguard.g:196:7: (typeSig= type )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==NAME) ) {
						int LA27_1 = input.LA(2);
						if ( (LA27_1==NAME||LA27_1==74||LA27_1==77) ) {
							alt27=1;
						}
					}
					else if ( (LA27_0==8) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// Proguard.g:196:8: typeSig= type
							{
							pushFollow(FOLLOW_type_in_member1337);
							typeSig=type();
							state._fsp--;

							}
							break;

					}

					name=input.LT(1);
					if ( input.LA(1)==NAME||input.LA(1)==74 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// Proguard.g:196:44: (signature= arguments |)
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==9) ) {
						alt28=1;
					}
					else if ( (LA28_0==72) ) {
						alt28=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// Proguard.g:196:45: signature= arguments
							{
							pushFollow(FOLLOW_arguments_in_member1352);
							signature=arguments();
							state._fsp--;

							GrammarActions.method(classSpec, annotation6, typeSig, (name!=null?name.getText():null), signature, modifiers7);
							}
							break;
						case 2 :
							// Proguard.g:197:21: 
							{
							GrammarActions.fieldOrAnyMember(classSpec, annotation6, typeSig, (name!=null?name.getText():null), modifiers7);
							}
							break;

					}

					}
					break;
				case 2 :
					// Proguard.g:198:9: ( type )? '<methods>'
					{
					// Proguard.g:198:9: ( type )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==NAME||LA29_0==8) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// Proguard.g:198:9: type
							{
							pushFollow(FOLLOW_type_in_member1387);
							type();
							state._fsp--;

							}
							break;

					}

					match(input,75,FOLLOW_75_in_member1390); 
					GrammarActions.method(classSpec, annotation6,
					          GrammarActions.getSignature("***", 0), "*", "\\("+ GrammarActions.getSignature("...", 0) + "\\)",
					          modifiers7);
					}
					break;
				case 3 :
					// Proguard.g:201:9: ( type )? '<fields>'
					{
					// Proguard.g:201:9: ( type )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==NAME||LA30_0==8) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// Proguard.g:201:9: type
							{
							pushFollow(FOLLOW_type_in_member1402);
							type();
							state._fsp--;

							}
							break;

					}

					match(input,73,FOLLOW_73_in_member1405); 
					GrammarActions.field(classSpec, annotation6, null, "*", modifiers7);
					}
					break;

			}

			match(input,72,FOLLOW_72_in_member1415); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "member"



	// $ANTLR start "annotation"
	// Proguard.g:205:9: private annotation returns [AnnotationSpecification annotSpec] : '@' ( NEGATOR )? NAME ;
	public final AnnotationSpecification annotation() throws RecognitionException {
		AnnotationSpecification annotSpec = null;


		Token NAME8=null;


		  boolean hasNameNegator = false;

		try {
			// Proguard.g:209:3: ( '@' ( NEGATOR )? NAME )
			// Proguard.g:209:6: '@' ( NEGATOR )? NAME
			{
			match(input,76,FOLLOW_76_in_annotation1439); 
			// Proguard.g:209:10: ( NEGATOR )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==NEGATOR) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Proguard.g:209:11: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_annotation1442); 
					hasNameNegator = true;
					}
					break;

			}

			NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_annotation1448); 
			annotSpec = GrammarActions.annotation((NAME8!=null?NAME8.getText():null), hasNameNegator);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return annotSpec;
	}
	// $ANTLR end "annotation"



	// $ANTLR start "modifiers"
	// Proguard.g:211:9: private modifiers returns [ModifierSpecification modifiers] : ( modifier[modifiers] )* ;
	public final ModifierSpecification modifiers() throws RecognitionException {
		ModifierSpecification modifiers = null;



		  modifiers = new ModifierSpecification();

		try {
			// Proguard.g:215:3: ( ( modifier[modifiers] )* )
			// Proguard.g:216:3: ( modifier[modifiers] )*
			{
			// Proguard.g:216:3: ( modifier[modifiers] )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==NEGATOR||LA33_0==79||LA33_0==83||LA33_0==87||(LA33_0 >= 91 && LA33_0 <= 101)) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// Proguard.g:216:3: modifier[modifiers]
					{
					pushFollow(FOLLOW_modifier_in_modifiers1472);
					modifier(modifiers);
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return modifiers;
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "modifier"
	// Proguard.g:219:9: private modifier[ModifierSpecification modifiers] : ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) ;
	public final void modifier(ModifierSpecification modifiers) throws RecognitionException {

		  boolean hasNegator = false;

		try {
			// Proguard.g:223:3: ( ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) )
			// Proguard.g:224:3: ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			{
			// Proguard.g:224:3: ( NEGATOR )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==NEGATOR) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Proguard.g:224:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_modifier1498); 
					hasNegator = true;
					}
					break;

			}

			// Proguard.g:225:3: ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			int alt35=14;
			switch ( input.LA(1) ) {
			case 94:
				{
				alt35=1;
				}
				break;
			case 92:
				{
				alt35=2;
				}
				break;
			case 93:
				{
				alt35=3;
				}
				break;
			case 95:
				{
				alt35=4;
				}
				break;
			case 97:
				{
				alt35=5;
				}
				break;
			case 101:
				{
				alt35=6;
				}
				break;
			case 91:
				{
				alt35=7;
				}
				break;
			case 79:
				{
				alt35=8;
				}
				break;
			case 96:
				{
				alt35=9;
				}
				break;
			case 87:
				{
				alt35=10;
				}
				break;
			case 99:
				{
				alt35=11;
				}
				break;
			case 98:
				{
				alt35=12;
				}
				break;
			case 83:
				{
				alt35=13;
				}
				break;
			case 100:
				{
				alt35=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Proguard.g:226:5: 'public'
					{
					match(input,94,FOLLOW_94_in_modifier1512); 
					modifiers.addAccessFlag(AccessFlag.PUBLIC, hasNegator);
					}
					break;
				case 2 :
					// Proguard.g:227:7: 'private'
					{
					match(input,92,FOLLOW_92_in_modifier1522); 
					modifiers.addAccessFlag(AccessFlag.PRIVATE, hasNegator);
					}
					break;
				case 3 :
					// Proguard.g:228:7: 'protected'
					{
					match(input,93,FOLLOW_93_in_modifier1532); 
					modifiers.addAccessFlag(AccessFlag.PROTECTED, hasNegator);
					}
					break;
				case 4 :
					// Proguard.g:229:7: 'static'
					{
					match(input,95,FOLLOW_95_in_modifier1542); 
					modifiers.addModifier(Modifier.STATIC, hasNegator);
					}
					break;
				case 5 :
					// Proguard.g:230:7: 'synchronized'
					{
					match(input,97,FOLLOW_97_in_modifier1552); 
					modifiers.addModifier(Modifier.SYNCHRONIZED, hasNegator);
					}
					break;
				case 6 :
					// Proguard.g:231:7: 'volatile'
					{
					match(input,101,FOLLOW_101_in_modifier1562); 
					modifiers.addModifier(Modifier.VOLATILE, hasNegator);
					}
					break;
				case 7 :
					// Proguard.g:232:7: 'native'
					{
					match(input,91,FOLLOW_91_in_modifier1572); 
					modifiers.addModifier(Modifier.NATIVE, hasNegator);
					}
					break;
				case 8 :
					// Proguard.g:233:7: 'abstract'
					{
					match(input,79,FOLLOW_79_in_modifier1582); 
					modifiers.addModifier(Modifier.ABSTRACT, hasNegator);
					}
					break;
				case 9 :
					// Proguard.g:234:7: 'strictfp'
					{
					match(input,96,FOLLOW_96_in_modifier1592); 
					modifiers.addModifier(Modifier.STRICTFP, hasNegator);
					}
					break;
				case 10 :
					// Proguard.g:235:7: 'final'
					{
					match(input,87,FOLLOW_87_in_modifier1602); 
					modifiers.addModifier(Modifier.FINAL, hasNegator);
					}
					break;
				case 11 :
					// Proguard.g:236:7: 'transient'
					{
					match(input,99,FOLLOW_99_in_modifier1612); 
					modifiers.addModifier(Modifier.TRANSIENT, hasNegator);
					}
					break;
				case 12 :
					// Proguard.g:237:7: 'synthetic'
					{
					match(input,98,FOLLOW_98_in_modifier1622); 
					modifiers.addModifier(Modifier.SYNTHETIC, hasNegator);
					}
					break;
				case 13 :
					// Proguard.g:238:7: 'bridge'
					{
					match(input,83,FOLLOW_83_in_modifier1632); 
					modifiers.addModifier(Modifier.BRIDGE, hasNegator);
					}
					break;
				case 14 :
					// Proguard.g:239:7: 'varargs'
					{
					match(input,100,FOLLOW_100_in_modifier1642); 
					modifiers.addModifier(Modifier.VARARGS, hasNegator);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "modifier"



	// $ANTLR start "inheritance"
	// Proguard.g:243:9: private inheritance returns [InheritanceSpecification inheritanceSpec] : ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME ;
	public final InheritanceSpecification inheritance() throws RecognitionException {
		InheritanceSpecification inheritanceSpec = null;


		Token NAME9=null;
		AnnotationSpecification annotation10 =null;


		  boolean hasNameNegator = false;

		try {
			// Proguard.g:247:3: ( ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME )
			// Proguard.g:248:3: ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME
			{
			if ( input.LA(1)==86||input.LA(1)==88 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Proguard.g:249:3: ( annotation )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==76) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Proguard.g:249:3: annotation
					{
					pushFollow(FOLLOW_annotation_in_inheritance1683);
					annotation10=annotation();
					state._fsp--;

					}
					break;

			}

			// Proguard.g:249:15: ( NEGATOR )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==NEGATOR) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Proguard.g:249:16: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_inheritance1687); 
					hasNameNegator = true;
					}
					break;

			}

			NAME9=(Token)match(input,NAME,FOLLOW_NAME_in_inheritance1693); 
			inheritanceSpec = GrammarActions.createInheritance((NAME9!=null?NAME9.getText():null), hasNameNegator, annotation10);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return inheritanceSpec;
	}
	// $ANTLR end "inheritance"



	// $ANTLR start "arguments"
	// Proguard.g:251:9: private arguments returns [String signature] : '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' ;
	public final String arguments() throws RecognitionException {
		String signature = null;


		String parameterSig =null;

		try {
			// Proguard.g:252:3: ( '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' )
			// Proguard.g:253:3: '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')'
			{
			match(input,9,FOLLOW_9_in_arguments1713); 
			signature = "\\(";
			// Proguard.g:254:5: ( (parameterSig= type ( ',' parameterSig= type )* )? )
			// Proguard.g:255:7: (parameterSig= type ( ',' parameterSig= type )* )?
			{
			// Proguard.g:255:7: (parameterSig= type ( ',' parameterSig= type )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==NAME||LA39_0==8) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Proguard.g:256:9: parameterSig= type ( ',' parameterSig= type )*
					{
					pushFollow(FOLLOW_type_in_arguments1741);
					parameterSig=type();
					state._fsp--;

					signature += parameterSig;
					// Proguard.g:257:9: ( ',' parameterSig= type )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==11) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// Proguard.g:257:10: ',' parameterSig= type
							{
							match(input,11,FOLLOW_11_in_arguments1754); 
							pushFollow(FOLLOW_type_in_arguments1758);
							parameterSig=type();
							state._fsp--;

							signature += parameterSig;
							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}

			}

			match(input,10,FOLLOW_10_in_arguments1787); 
			signature += "\\)";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return signature;
	}
	// $ANTLR end "arguments"



	// $ANTLR start "type"
	// Proguard.g:263:9: private type returns [String signature] : (typeName= ( '%' | NAME ) ( '[]' )* ) ;
	public final String type() throws RecognitionException {
		String signature = null;


		Token typeName=null;


		  int dim = 0;

		try {
			// Proguard.g:267:3: ( (typeName= ( '%' | NAME ) ( '[]' )* ) )
			// Proguard.g:268:3: (typeName= ( '%' | NAME ) ( '[]' )* )
			{
			// Proguard.g:268:3: (typeName= ( '%' | NAME ) ( '[]' )* )
			// Proguard.g:269:5: typeName= ( '%' | NAME ) ( '[]' )*
			{
			typeName=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==8 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Proguard.g:269:27: ( '[]' )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==77) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Proguard.g:269:28: '[]'
					{
					match(input,77,FOLLOW_77_in_type1832); 
					dim++;
					}
					break;

				default :
					break loop40;
				}
			}

			String sig = (typeName!=null?typeName.getText():null); signature = GrammarActions.getSignature(sig == null ? "" : sig, dim);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return signature;
	}
	// $ANTLR end "type"



	// $ANTLR start "keepOptionModifier"
	// Proguard.g:273:9: private keepOptionModifier returns [KeepModifier modifier] : ( ',' ( 'allowshrinking' | 'allowoptimization' | 'includedescriptorclasses' | 'allowobfuscation' ) )* ;
	public final KeepModifier keepOptionModifier() throws RecognitionException {
		KeepModifier modifier = null;



		  modifier = new KeepModifier();

		try {
			// Proguard.g:277:3: ( ( ',' ( 'allowshrinking' | 'allowoptimization' | 'includedescriptorclasses' | 'allowobfuscation' ) )* )
			// Proguard.g:277:5: ( ',' ( 'allowshrinking' | 'allowoptimization' | 'includedescriptorclasses' | 'allowobfuscation' ) )*
			{
			// Proguard.g:277:5: ( ',' ( 'allowshrinking' | 'allowoptimization' | 'includedescriptorclasses' | 'allowobfuscation' ) )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==11) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// Proguard.g:277:6: ',' ( 'allowshrinking' | 'allowoptimization' | 'includedescriptorclasses' | 'allowobfuscation' )
					{
					match(input,11,FOLLOW_11_in_keepOptionModifier1867); 
					// Proguard.g:278:3: ( 'allowshrinking' | 'allowoptimization' | 'includedescriptorclasses' | 'allowobfuscation' )
					int alt41=4;
					switch ( input.LA(1) ) {
					case 82:
						{
						alt41=1;
						}
						break;
					case 81:
						{
						alt41=2;
						}
						break;
					case 89:
						{
						alt41=3;
						}
						break;
					case 80:
						{
						alt41=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}
					switch (alt41) {
						case 1 :
							// Proguard.g:278:4: 'allowshrinking'
							{
							match(input,82,FOLLOW_82_in_keepOptionModifier1872); 
							modifier.setAllowShrinking();
							}
							break;
						case 2 :
							// Proguard.g:279:5: 'allowoptimization'
							{
							match(input,81,FOLLOW_81_in_keepOptionModifier1880); 
							}
							break;
						case 3 :
							// Proguard.g:280:5: 'includedescriptorclasses'
							{
							match(input,89,FOLLOW_89_in_keepOptionModifier1887); 
							}
							break;
						case 4 :
							// Proguard.g:281:5: 'allowobfuscation'
							{
							match(input,80,FOLLOW_80_in_keepOptionModifier1894); 
							modifier.setAllowObfuscation();
							}
							break;

					}

					}
					break;

				default :
					break loop42;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return modifier;
	}
	// $ANTLR end "keepOptionModifier"

	// Delegated rules


	protected DFA31 dfa31 = new DFA31(this);
	static final String DFA31_eotS =
		"\7\uffff";
	static final String DFA31_eofS =
		"\7\uffff";
	static final String DFA31_minS =
		"\3\5\3\uffff\1\5";
	static final String DFA31_maxS =
		"\1\113\2\115\3\uffff\1\115";
	static final String DFA31_acceptS =
		"\3\uffff\1\1\1\2\1\3\1\uffff";
	static final String DFA31_specialS =
		"\7\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\1\2\uffff\1\2\100\uffff\1\5\1\3\1\4",
			"\1\3\3\uffff\1\3\76\uffff\1\3\1\5\1\3\1\4\1\uffff\1\6",
			"\1\3\103\uffff\1\5\1\3\1\4\1\uffff\1\6",
			"",
			"",
			"",
			"\1\3\103\uffff\1\5\1\3\1\4\1\uffff\1\6"
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "195:5: ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | ( type )? '<methods>' | ( type )? '<fields>' )";
		}
	}

	public static final BitSet FOLLOW_23_in_prog67 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog71 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_set_in_prog82 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog90 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_46_in_prog101 = new BitSet(new long[]{0x0000000000000840L,0x0000000044B09000L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog105 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_prog109 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_44_in_prog121 = new BitSet(new long[]{0x0000000000000840L,0x0000000044B09000L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog125 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_prog129 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_41_in_prog141 = new BitSet(new long[]{0x0000000000000840L,0x0000000044B09000L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog145 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_prog149 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_unsupportedFlag_in_prog163 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_33_in_prog175 = new BitSet(new long[]{0xFFFFFFFFFFFFF060L,0x000000000000107FL});
	public static final BitSet FOLLOW_filter_in_prog179 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_38_in_prog192 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_67_in_prog204 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog208 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_70_in_prog220 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_prog224 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_29_in_prog236 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_27_in_prog249 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_26_in_prog262 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x000000000000107FL});
	public static final BitSet FOLLOW_EOF_in_prog274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_unsupportedFlag307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_unsupportedFlag315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_unsupportedFlag323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_unsupportedFlag331 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_unsupportedFlag343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_unsupportedFlag351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_unsupportedFlag359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_unsupportedFlag367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_unsupportedFlag375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_unsupportedFlag383 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_unsupportedFlag395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unsupportedFlag403 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_unsupportedFlag415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_unsupportedFlag423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unsupportedFlag431 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unsupportedFlag443 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_unsupportedFlag455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_unsupportedFlag463 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_unsupportedFlag475 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_unsupportedFlag488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_unsupportedFlag496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_unsupportedFlag504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_unsupportedFlag513 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_unsupportedFlag528 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_unsupportedFlag544 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_unsupportedFlag560 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_unsupportedFlag575 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_unsupportedFlag587 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_unsupportedFlag599 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_unsupportedFlag611 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_unsupportedFlag623 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_unsupportedFlag638 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_unsupportedFlag652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_unsupportedFlag655 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_unsupportedFlag662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_unsupportedFlag675 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_unsupportedFlag691 = new BitSet(new long[]{0x0000000000000840L,0x0000000044B09000L});
	public static final BitSet FOLLOW_keepOptionModifier_in_unsupportedFlag695 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_unsupportedFlag711 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_unsupportedFlag727 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_unsupportedFlag742 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_unsupportedFlag757 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unsupportedFlag773 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_unsupportedFlag786 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_unsupportedFlag801 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_unsupportedFlag815 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_unsupportedFlag831 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_unsupportedFlag844 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_unsupportedFlag859 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_unsupportedFlag862 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_unsupportedFlag869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_unsupportedFlag882 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_classpath905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
	public static final BitSet FOLLOW_set_in_classpath908 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_classpath914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonEmptyFilter_in_filter935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_nonEmptyFilter969 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_nonEmptyFilter975 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_nonEmptyFilter980 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_nonEmptyFilter_in_nonEmptyFilter982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_classSpecification1012 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classModifierAndType_in_classSpecification1020 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_classNames_in_classSpecification1025 = new BitSet(new long[]{0x0000000000000002L,0x0000004001400000L});
	public static final BitSet FOLLOW_inheritance_in_classSpecification1034 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_members_in_classSpecification1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_className_in_classNames1071 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_classNames1078 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_className_in_classNames1082 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NEGATOR_in_className1111 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_className1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_classModifierAndType1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000044B09000L});
	public static final BitSet FOLLOW_94_in_classModifierAndType1158 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_classModifierAndType1173 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_classModifierAndType1188 = new BitSet(new long[]{0x0000000000000040L,0x0000000044B09000L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classType_in_classModifierAndType1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_classType1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000004300000L});
	public static final BitSet FOLLOW_90_in_classType1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_classType1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_classType1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_members1284 = new BitSet(new long[]{0x0000000000000160L,0x000000BFF8889E00L});
	public static final BitSet FOLLOW_member_in_members1290 = new BitSet(new long[]{0x0000000000000160L,0x000000BFF8889E00L});
	public static final BitSet FOLLOW_103_in_members1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_member1317 = new BitSet(new long[]{0x0000000000000160L,0x0000003FF8888E00L});
	public static final BitSet FOLLOW_modifiers_in_member1320 = new BitSet(new long[]{0x0000000000000120L,0x0000000000000E00L});
	public static final BitSet FOLLOW_type_in_member1337 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000400L});
	public static final BitSet FOLLOW_set_in_member1343 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_member1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_type_in_member1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_member1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_type_in_member1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_member1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_member1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_annotation1439 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_annotation1442 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_annotation1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers1472 = new BitSet(new long[]{0x0000000000000042L,0x0000003FF8888000L});
	public static final BitSet FOLLOW_NEGATOR_in_modifier1498 = new BitSet(new long[]{0x0000000000000000L,0x0000003FF8888000L});
	public static final BitSet FOLLOW_94_in_modifier1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_modifier1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_modifier1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_modifier1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_modifier1552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_modifier1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_modifier1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_modifier1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_modifier1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_modifier1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_modifier1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_modifier1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_modifier1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inheritance1673 = new BitSet(new long[]{0x0000000000000060L,0x0000000000001000L});
	public static final BitSet FOLLOW_annotation_in_inheritance1683 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_inheritance1687 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_inheritance1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_arguments1713 = new BitSet(new long[]{0x0000000000000520L});
	public static final BitSet FOLLOW_type_in_arguments1741 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_11_in_arguments1754 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_type_in_arguments1758 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_10_in_arguments1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_type1823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_type1832 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_11_in_keepOptionModifier1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000002070000L});
	public static final BitSet FOLLOW_82_in_keepOptionModifier1872 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_81_in_keepOptionModifier1880 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_89_in_keepOptionModifier1887 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_80_in_keepOptionModifier1894 = new BitSet(new long[]{0x0000000000000802L});
}
