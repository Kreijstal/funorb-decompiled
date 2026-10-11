/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart004 extends SceneWidget {
    private SceneWidget sceneWidgetState0045;
    static String stringState0215;
    static MusicTrack musicTrackState0001;
    private StringBuilder stringBuilderState0002;
    static int integerState0267;
    private SceneWidget sceneWidgetState0046;
    private int integerState0268;
    static String[][] stringArrayArrayState0003;
    static String stringState0216;
    static String stringState0217;
    static int[] integerArrayState0053;

    final int computeInteger0678(byte byteArgument1, boolean booleanArgument2) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int integerLocal5;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.performAction2002(false, booleanArgument2);
        if (!booleanArgument2) {
          this.sceneWidgetState0046.stringState0598 = this.stringBuilderState0002.toString();
          if (booleanArgument2 &&
            SceneWidgetPart005.integerState0328 != 0 &&
            this.integerState0891 == 0) {
            this.integerState0268 = 1;
          }
          if (byteArgument1 == -63) {
            return this.integerState0268;
          }
          integerState0267 = 87;
          return this.integerState0268;
        }
        while (true) {
          if (!DualNodeDeque.computeBoolean0028(-126)) {
            this.sceneWidgetState0046.stringState0598 = this.stringBuilderState0002.toString();
            if (booleanArgument2 &&
              SceneWidgetPart005.integerState0328 != 0 &&
              this.integerState0891 == 0) {
              this.integerState0268 = 1;
              if (byteArgument1 != -63) {
                integerState0267 = 87;
              }
              return this.integerState0268;
            }
            if (byteArgument1 == -63) {
              return this.integerState0268;
            }
            integerState0267 = 87;
            return this.integerState0268;
          }
          if (85 == MixedSupport153.integerState0931 &&
            this.stringBuilderState0002.length() > 0) {
            MixedSupport144.computeStringBuilder1942(this.stringBuilderState0002, -23510, -1 + this.stringBuilderState0002.length(), ' ');
          }
          if (CodecSupport003.computeBoolean1616(byteArgument1 ^ 9, ArchiveRequestManager.characterState0002, (CharSequence) ((Object) this.stringBuilderState0002))) {
            discarded$1 = this.stringBuilderState0002.append(ArchiveRequestManager.characterState0002);
          } else {
            if (this.stringBuilderState0002.length() == 0 &&
              91 == ArchiveRequestManager.characterState0002) {
              discarded$2 = this.stringBuilderState0002.append(ArchiveRequestManager.characterState0002);
            } else {
              if (this.stringBuilderState0002.length() == 1 &&
                ArchiveRequestManager.characterState0002 == 35) {
                discarded$3 = this.stringBuilderState0002.append(ArchiveRequestManager.characterState0002);
              } else {
                if (ArchiveRequestManager.characterState0002 == 93) {
                  discarded$4 = this.stringBuilderState0002.append(ArchiveRequestManager.characterState0002);
                }
              }
            }
          }
          if (MixedSupport153.integerState0931 != 84) {
            if (MixedSupport153.integerState0931 != 13) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (this.stringBuilderState0002.length() <= 0) {
          return 1;
        }
        this.stringState0598 = this.stringBuilderState0002.toString();
        return 2;
    }

    final boolean computeBoolean0681(int integerArgument1) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int integerLocal10;
        int integerLocal11;
        if (this.integerState0268 != 0) {
          return false;
        }
        if (MixedSupport153.integerState0931 != 85) {
          if (this.stringBuilderState0002.length() < 12) {
            integerLocal10 = Character.toLowerCase(ArchiveRequestManager.characterState0002);
            if (integerLocal10 == 32) {
              integerLocal10 = 95;
            }
            if (95 == integerLocal10 &&
              0 < this.stringBuilderState0002.length()) {
              discarded$6 = this.stringBuilderState0002.append((char) integerLocal10);
            }
            if (MixedSupport141.computeBoolean1908((char) integerLocal10, -24380)) {
              discarded$7 = this.stringBuilderState0002.append((char) integerLocal10);
            } else {
              if (MixedSupport042.computeBoolean0591((char) integerLocal10, (byte) 23)) {
                discarded$8 = this.stringBuilderState0002.append((char) integerLocal10);
                if (MixedSupport153.integerState0931 == 84) {
                  if (this.stringBuilderState0002.length() > 0) {
                    this.stringState0598 = this.stringBuilderState0002.toString();
                    this.integerState0268 = 2;
                  } else {
                    this.integerState0268 = 1;
                  }
                }
                if (MixedSupport153.integerState0931 == 13) {
                  this.integerState0268 = 1;
                }
                if (integerArgument1 == 261) {
                  return true;
                }
                this.computeInteger0678((byte) 13, false);
                return true;
              }
            }
          }
          if (MixedSupport153.integerState0931 == 84) {
            if (this.stringBuilderState0002.length() <= 0) {
              this.integerState0268 = 1;
            } else {
              this.stringState0598 = this.stringBuilderState0002.toString();
              this.integerState0268 = 2;
            }
          }
          if (MixedSupport153.integerState0931 == 13) {
            this.integerState0268 = 1;
          }
          if (integerArgument1 != 261) {
            this.computeInteger0678((byte) 13, false);
          }
          return true;
        }
        if (this.stringBuilderState0002.length() <= 0) {
          if (this.stringBuilderState0002.length() < 12) {
            integerLocal11 = Character.toLowerCase(ArchiveRequestManager.characterState0002);
            if (integerLocal11 == 32) {
              integerLocal11 = 95;
            }
            if (95 == integerLocal11 &&
              0 < this.stringBuilderState0002.length()) {
              discarded$3 = this.stringBuilderState0002.append((char) integerLocal11);
            }
            if (MixedSupport141.computeBoolean1908((char) integerLocal11, -24380)) {
              discarded$4 = this.stringBuilderState0002.append((char) integerLocal11);
            } else {
              if (MixedSupport042.computeBoolean0591((char) integerLocal11, (byte) 23)) {
                discarded$5 = this.stringBuilderState0002.append((char) integerLocal11);
                if (MixedSupport153.integerState0931 == 84) {
                  if (this.stringBuilderState0002.length() > 0) {
                    this.stringState0598 = this.stringBuilderState0002.toString();
                    this.integerState0268 = 2;
                  } else {
                    this.integerState0268 = 1;
                  }
                }
                if (MixedSupport153.integerState0931 == 13) {
                  this.integerState0268 = 1;
                }
                if (integerArgument1 != 261) {
                  this.computeInteger0678((byte) 13, false);
                }
                return true;
              }
            }
          }
          if (MixedSupport153.integerState0931 != 84) {
            if (MixedSupport153.integerState0931 == 13) {
              this.integerState0268 = 1;
            }
            if (integerArgument1 != 261) {
              this.computeInteger0678((byte) 13, false);
            }
            return true;
          }
          if (this.stringBuilderState0002.length() <= 0) {
            this.integerState0268 = 1;
            if (MixedSupport153.integerState0931 == 13) {
              this.integerState0268 = 1;
            }
            if (integerArgument1 != 261) {
              this.computeInteger0678((byte) 13, false);
            }
            return true;
          }
          this.stringState0598 = this.stringBuilderState0002.toString();
          this.integerState0268 = 2;
          if (MixedSupport153.integerState0931 != 13) {
            if (integerArgument1 != 261) {
              this.computeInteger0678((byte) 13, false);
            }
            return true;
          }
          this.integerState0268 = 1;
        } else {
          MixedSupport144.computeStringBuilder1942(this.stringBuilderState0002, integerArgument1 ^ -23249, this.stringBuilderState0002.length() - 1, ' ');
          if (this.stringBuilderState0002.length() < 12) {
            integerLocal11 = Character.toLowerCase(ArchiveRequestManager.characterState0002);
            if (integerLocal11 == 32) {
              integerLocal11 = 95;
            }
            if (95 == integerLocal11 &&
              0 < this.stringBuilderState0002.length()) {
              discarded$0 = this.stringBuilderState0002.append((char) integerLocal11);
            }
            if (MixedSupport141.computeBoolean1908((char) integerLocal11, -24380)) {
              discarded$1 = this.stringBuilderState0002.append((char) integerLocal11);
            } else {
              if (MixedSupport042.computeBoolean0591((char) integerLocal11, (byte) 23)) {
                discarded$2 = this.stringBuilderState0002.append((char) integerLocal11);
                if (MixedSupport153.integerState0931 == 84) {
                  if (this.stringBuilderState0002.length() > 0) {
                    this.stringState0598 = this.stringBuilderState0002.toString();
                    this.integerState0268 = 2;
                  } else {
                    this.integerState0268 = 1;
                  }
                }
                if (MixedSupport153.integerState0931 == 13) {
                  this.integerState0268 = 1;
                }
                if (integerArgument1 != 261) {
                  this.computeInteger0678((byte) 13, false);
                }
                return true;
              }
            }
          }
          if (MixedSupport153.integerState0931 != 84) {
            if (MixedSupport153.integerState0931 == 13) {
              this.integerState0268 = 1;
              if (integerArgument1 != 261) {
                this.computeInteger0678((byte) 13, false);
              }
              return true;
            }
          } else {
            if (this.stringBuilderState0002.length() <= 0) {
              this.integerState0268 = 1;
            } else {
              this.stringState0598 = this.stringBuilderState0002.toString();
              this.integerState0268 = 2;
            }
            if (MixedSupport153.integerState0931 == 13) {
              this.integerState0268 = 1;
            }
          }
        }
        if (integerArgument1 == 261) {
          return true;
        }
        this.computeInteger0678((byte) 13, false);
        return true;
    }

    final static void performAction0679(byte[] byteArrayArgument1, int integerArgument2, IndexedSprite[] indexedSpriteArrayArgument3, ResourceArchive resourceArchiveArgument4, String[] stringArrayArgument5, int integerArgument6, int integerArgument7, ResourceArchive resourceArchiveArgument8, String[][] stringArrayArrayArgument9, RgbSprite[][] rgbSpriteArrayArrayArgument10, boolean booleanArgument11, int[] integerArrayArgument12, RgbSprite[][] rgbSpriteArrayArrayArgument13, byte[] byteArrayArgument14, String[][] stringArrayArrayArgument15, ResourceArchive resourceArchiveArgument16, int integerArgument17, String[] stringArrayArgument18, int[] integerArrayArgument19, String[] stringArrayArgument20) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        StringBuilder stackStringBuilderLocal16 = null;
        String stackStringLocal17 = null;
        StringBuilder stackStringBuilderLocal18 = null;
        String stackStringLocal19 = null;
        StringBuilder stackStringBuilderLocal20 = null;
        String stackStringLocal21 = null;
        StringBuilder stackStringBuilderLocal22 = null;
        String stackStringLocal23 = null;
        StringBuilder stackStringBuilderLocal24 = null;
        String stackStringLocal25 = null;
        StringBuilder stackStringBuilderLocal26 = null;
        String stackStringLocal27 = null;
        StringBuilder stackStringBuilderLocal28 = null;
        String stackStringLocal29 = null;
        StringBuilder stackStringBuilderLocal30 = null;
        String stackStringLocal31 = null;
        RuntimeException caughtExceptionLocal32 = null;
        RuntimeException runtimeExceptionLocal33 = null;
        try {
          GameDomainSupport001.performAction0106(false, resourceArchiveArgument16, indexedSpriteArrayArgument3, integerArrayArgument12, resourceArchiveArgument8);
          MixedSupport078.performAction1049(resourceArchiveArgument16, 32373);
          UiComponentPart019.performAction1175(integerArgument7, stringArrayArgument20, byteArrayArgument1, resourceArchiveArgument16, -8894, stringArrayArrayArgument9, rgbSpriteArrayArrayArgument10, integerArgument2, stringArrayArrayArgument15, stringArrayArgument18, stringArrayArgument5, rgbSpriteArrayArrayArgument13, integerArgument17, byteArrayArgument14, integerArrayArgument19);
          if (integerArgument6 != 3) {
            SceneWidgetPart004.performAction0680(-36);
          }
          MixedSupport132.performAction1836(46, resourceArchiveArgument16, booleanArgument11, resourceArchiveArgument4);
          RenderingSupport003.performAction0628((byte) 123);
          SceneWidgetPart012.performAction1827((byte) -27);
          MixedSupport033.performAction0550(18);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal34) {
          caughtExceptionLocal32 = caughtParameterLocal34;
          runtimeExceptionLocal33 = caughtExceptionLocal32;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal33;
          stackStringBuilderLocal2 = new StringBuilder().append("hb.D(");
          if (byteArrayArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument2).append(',');
          if (indexedSpriteArrayArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (resourceArchiveArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArrayArgument5 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',');
          if (resourceArchiveArgument8 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (stringArrayArrayArgument9 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',');
          if (rgbSpriteArrayArrayArgument10 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          stackStringBuilderLocal16 = ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(booleanArgument11).append(',');
          if (integerArrayArgument12 == null) {
            stackStringLocal17 = "null";
          } else {
            stackStringLocal17 = "{...}";
          }
          stackStringBuilderLocal18 = ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',');
          if (rgbSpriteArrayArrayArgument13 == null) {
            stackStringLocal19 = "null";
          } else {
            stackStringLocal19 = "{...}";
          }
          stackStringBuilderLocal20 = ((StringBuilder) (Object) stackStringBuilderLocal18).append(stackStringLocal19).append(',');
          if (byteArrayArgument14 == null) {
            stackStringLocal21 = "null";
          } else {
            stackStringLocal21 = "{...}";
          }
          stackStringBuilderLocal22 = ((StringBuilder) (Object) stackStringBuilderLocal20).append(stackStringLocal21).append(',');
          if (stringArrayArrayArgument15 == null) {
            stackStringLocal23 = "null";
          } else {
            stackStringLocal23 = "{...}";
          }
          stackStringBuilderLocal24 = ((StringBuilder) (Object) stackStringBuilderLocal22).append(stackStringLocal23).append(',');
          if (resourceArchiveArgument16 == null) {
            stackStringLocal25 = "null";
          } else {
            stackStringLocal25 = "{...}";
          }
          stackStringBuilderLocal26 = ((StringBuilder) (Object) stackStringBuilderLocal24).append(stackStringLocal25).append(',').append(integerArgument17).append(',');
          if (stringArrayArgument18 == null) {
            stackStringLocal27 = "null";
          } else {
            stackStringLocal27 = "{...}";
          }
          stackStringBuilderLocal28 = ((StringBuilder) (Object) stackStringBuilderLocal26).append(stackStringLocal27).append(',');
          if (integerArrayArgument19 == null) {
            stackStringLocal29 = "null";
          } else {
            stackStringLocal29 = "{...}";
          }
          stackStringBuilderLocal30 = ((StringBuilder) (Object) stackStringBuilderLocal28).append(stackStringLocal29).append(',');
          if (stringArrayArgument20 == null) {
            stackStringLocal31 = "null";
          } else {
            stackStringLocal31 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal30).append(stackStringLocal31).append(')').toString());
        }
    }

    public static void performAction0680(int integerArgument1) {
        integerArrayState0053 = null;
        stringArrayArrayState0003 = (String[][]) null;
        if (integerArgument1 < -48) {
          stringState0217 = null;
          stringState0215 = null;
          musicTrackState0001 = null;
          stringState0216 = null;
          return;
        }
        stringState0215 = (String) null;
        stringState0217 = null;
        stringState0215 = null;
        musicTrackState0001 = null;
        stringState0216 = null;
    }

    SceneWidgetPart004(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, String stringArgument5, SceneWidget sceneWidgetArgument6, SceneWidget sceneWidgetArgument7, SceneWidget sceneWidgetArgument8) {
        super(0L, sceneWidgetArgument6);
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        this.integerState0268 = 0;
        try {
          this.sceneWidgetState0045 = new SceneWidget(0L, sceneWidgetArgument7, stringArgument5);
          this.performAction1998(this.sceneWidgetState0045, -16834);
          this.sceneWidgetState0046 = new SceneWidget(0L, sceneWidgetArgument8);
          this.sceneWidgetState0046.integerState0910 = 16764006;
          this.performAction1998(this.sceneWidgetState0046, -16834);
          this.sceneWidgetState0046.stringState0599 = "|";
          this.stringBuilderState0002 = new StringBuilder(12);
          integerLocal11 = this.sceneWidgetState0045.computeInteger2000(true);
          this.sceneWidgetState0045.performAction1994(integerLocal11, 0, 3, ComponentContainer.integerState0377, 5);
          this.sceneWidgetState0046.performAction1994(integerLocal11, 0, ComponentContainer.integerState0377 + 3, ComponentContainer.integerState0377, 5);
          integerLocal13 = 10 + integerLocal11;
          integerLocal14 = 3 + (3 + 2 * ComponentContainer.integerState0377);
          integerLocal15 = MixedSupport146.computeInteger1953(integerArgument3, -18265, integerLocal13, integerArgument1);
          integerLocal16 = MixedSupport093.computeInteger1303(integerArgument4, 0, integerLocal14, integerArgument2);
          this.performAction1994(integerLocal13, 0, integerLocal16, integerLocal14, integerLocal15);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal10 = caughtParameterLocal17;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal12;
          stackStringBuilderLocal2 = new StringBuilder().append("hb.<init>(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (stringArgument5 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (sceneWidgetArgument6 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (sceneWidgetArgument7 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (sceneWidgetArgument8 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    static {
        stringState0215 = "Players";
        stringState0216 = "Please try changing the following settings:  ";
        integerArrayState0053 = new int[16384];
    }
}
