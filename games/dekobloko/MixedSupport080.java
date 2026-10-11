/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport080 extends ResourceSupport003 {
    private MixedSupport073 mixedSupport073State0002;
    static int integerState0429;
    private byte[] byteArrayState0013;
    static String stringState0326;
    private MixedSupport090 mixedSupport090State0001;
    private CacheWorkQueue cacheWorkQueueState0001;
    static SceneWidget[] sceneWidgetArrayState0002;
    private int integerState0430;
    private MixedSupport073 mixedSupport073State0003;
    private ResourceSupport001 resourceSupport001State0002;
    private MixedSupport120 mixedSupport120State0001;
    private byte[] byteArrayState0014;
    static RenderingSupport015 renderingSupport015State0004;
    private NetworkSupport003 networkSupport003State0001;
    private int integerState0431;
    private int integerState0432;
    static int integerState0433;
    private NodeDeque nodeDequeState0015;
    private boolean booleanState0099;
    private NodeDeque nodeDequeState0016;
    private int integerState0434;
    static Framebuffer framebufferState0001;
    static int integerState0435;
    private boolean booleanState0100;
    static ResourceArchive resourceArchiveState0011;
    private long longState0028;
    private boolean booleanState0101;

    final ResourceSupport001 computeResourceSupport0011070(boolean booleanArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        byte[] byteArrayLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        byte[] byteArrayLocal5 = null;
        byte[] byteArrayLocal6 = null;
        byte[] byteArrayLocal7 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (null != this.resourceSupport001State0002) {
          return this.resourceSupport001State0002;
        }
        if (this.mixedSupport120State0001 == null) {
          if (this.networkSupport003State0001.computeBoolean0378(booleanArgument1)) {
            return null;
          }
          this.mixedSupport120State0001 = (MixedSupport120) ((Object) this.networkSupport003State0001.computeResourceSupport0040379(true, (byte) 0, true, 255, this.integerState0432));
        }
        if (this.mixedSupport120State0001.booleanState0173) {
          return null;
        }
        if (!booleanArgument1) {
          return (ResourceSupport001) null;
        }
        byteArrayLocal7 = this.mixedSupport120State0001.computeByteArray0518((byte) 70);
        byteArrayLocal6 = byteArrayLocal7;
        byteArrayLocal5 = byteArrayLocal6;
        byteArrayLocal2 = byteArrayLocal5;
        if (this.mixedSupport120State0001 instanceof ArchiveRequestManager) {
          try {
            if (byteArrayLocal5 == null) {
              throw new RuntimeException();
            }
            this.resourceSupport001State0002 = new ResourceSupport001(byteArrayLocal7, this.integerState0430, this.byteArrayState0014);
            if (this.integerState0431 != this.resourceSupport001State0002.integerState0022) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException caughtParameterLocal8) {
            caughtExceptionLocal1 = caughtParameterLocal8;
            runtimeExceptionLocal3 = caughtExceptionLocal1;
            this.resourceSupport001State0002 = null;
            if (!this.networkSupport003State0001.computeBoolean0378(true)) {
              this.mixedSupport120State0001 = (MixedSupport120) ((Object) this.networkSupport003State0001.computeResourceSupport0040379(true, (byte) 0, booleanArgument1, 255, this.integerState0432));
            } else {
              this.mixedSupport120State0001 = null;
            }
            return null;
          }
        } else {
          try {
            if (byteArrayLocal5 == null) {
              throw new RuntimeException();
            }
            this.resourceSupport001State0002 = new ResourceSupport001(byteArrayLocal7, this.integerState0430, this.byteArrayState0014);
          } catch (java.lang.RuntimeException caughtParameterLocal9) {
            caughtExceptionLocal1 = caughtParameterLocal9;
            runtimeExceptionLocal3 = caughtExceptionLocal1;
            this.networkSupport003State0001.performAction0375(8192);
            this.resourceSupport001State0002 = null;
            if (this.networkSupport003State0001.computeBoolean0378(true)) {
              this.mixedSupport120State0001 = null;
            } else {
              this.mixedSupport120State0001 = (MixedSupport120) ((Object) this.networkSupport003State0001.computeResourceSupport0040379(true, (byte) 0, booleanArgument1, 255, this.integerState0432));
            }
            return null;
          }
          if (this.mixedSupport073State0003 != null) {
            this.cacheWorkQueueState0001.computeArchiveRequestManager0840(this.integerState0432, this.mixedSupport073State0003, byteArrayLocal7, (byte) 67);
          }
        }
        if (null != this.mixedSupport073State0002) {
          this.byteArrayState0013 = new byte[this.resourceSupport001State0002.integerState0023];
        }
        this.mixedSupport120State0001 = null;
        return this.resourceSupport001State0002;
    }

    public static void performAction1074(boolean booleanArgument1) {
        framebufferState0001 = null;
        sceneWidgetArrayState0002 = null;
        resourceArchiveState0011 = null;
        stringState0326 = null;
        if (!booleanArgument1) {
          return;
        }
        renderingSupport015State0004 = null;
    }

    final void performAction1072(int integerArgument1) {
        int integerLocal1 = 0;
        MixedSupport120 discarded$0 = null;
        MixedSupport120 discarded$1 = null;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.nodeDequeState0015 == null) {
          return;
        }
        if (null == this.computeResourceSupport0011070(true)) {
          return;
        }
        HashNode hashNodeLocal5 = this.nodeDequeState0016.computeHashNode1970((byte) -113);
        while (hashNodeLocal5 != null) {
          integerLocal1 = (int)hashNodeLocal5.key;
          if (integerLocal1 < 0) {
            hashNodeLocal5.performAction0161((byte) 105);
          } else {
            if (this.resourceSupport001State0002.integerState0023 <= integerLocal1) {
              hashNodeLocal5.performAction0161((byte) 105);
            } else {
              if (this.resourceSupport001State0002.integerArrayState0011[integerLocal1] == 0) {
                hashNodeLocal5.performAction0161((byte) 105);
              } else {
                if (0 == this.byteArrayState0013[integerLocal1]) {
                  discarded$0 = this.computeMixedSupport1201069(1, integerLocal1, (byte) -20);
                }
                if (-1 == this.byteArrayState0013[integerLocal1]) {
                  discarded$1 = this.computeMixedSupport1201069(2, integerLocal1, (byte) -20);
                }
                if (this.byteArrayState0013[integerLocal1] == 1) {
                  hashNodeLocal5.performAction0161((byte) 117);
                }
              }
            }
          }
          hashNodeLocal5 = this.nodeDequeState0016.computeHashNode1974(true);
        }
        if (integerArgument1 != 16322) {
          this.performAction1072(-71);
        }
    }

    final int computeInteger1068(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 103 % ((integerArgument2 - 5) / 58);
        MixedSupport120 cachedMixedSupport120Local2 = (MixedSupport120) (this.mixedSupport090State0001.computeHashNode1260((long)integerArgument1, 77));
        MixedSupport120 mixedSupport120Local3 = cachedMixedSupport120Local2;
        MixedSupport120 mixedSupport120Local4 = cachedMixedSupport120Local2;
        if (mixedSupport120Local3 != null) {
          return mixedSupport120Local3.computeInteger0516(false);
        }
        return 0;
    }

    final void performAction1071(byte byteArgument1) {
        if (null == this.mixedSupport073State0002) {
          return;
        }
        if (byteArgument1 != 0) {
          this.resourceSupport001State0002 = (ResourceSupport001) null;
        }
        this.booleanState0100 = true;
        if (this.nodeDequeState0015 == null) {
          this.nodeDequeState0015 = new NodeDeque();
        }
    }

    private final MixedSupport120 computeMixedSupport1201069(int integerArgument1, int integerArgument2, byte byteArgument3) {
        Object stackObjectLocal1 = null;
        Throwable caughtExceptionLocal2 = null;
        Object objectLocal3 = null;
        byte[] byteArrayLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        Exception exceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        MixedSupport120 mixedSupport120Local12 = null;
        byte[] byteArrayLocal13 = null;
        byte[] byteArrayLocal14 = null;
        byte[] byteArrayLocal15 = null;
        byte[] byteArrayLocal16 = null;
        byte[] byteArrayLocal17 = null;
        byte[] byteArrayLocal18 = null;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport120 cachedMixedSupport120Local19 = (MixedSupport120) (this.mixedSupport090State0001.computeHashNode1260((long)integerArgument2, 95));
        mixedSupport120Local12 = cachedMixedSupport120Local19;
        objectLocal3 = cachedMixedSupport120Local19;
        if (mixedSupport120Local12 != null &&
          integerArgument1 == 0 &&
          !mixedSupport120Local12.booleanState0172 &&
          mixedSupport120Local12.booleanState0173) {
          mixedSupport120Local12.performAction0161((byte) 114);
          objectLocal3 = null;
        }
        if (objectLocal3 == null) {
          if (integerArgument1 == 0) {
            if (null != this.mixedSupport073State0002 &&
              this.byteArrayState0013[integerArgument2] != -1) {
              objectLocal3 = this.cacheWorkQueueState0001.computeArchiveRequestManager0839(integerArgument2, this.mixedSupport073State0002, -98);
            } else {
              if (this.networkSupport003State0001.computeBoolean0378(true)) {
                return null;
              }
              objectLocal3 = this.networkSupport003State0001.computeResourceSupport0040379(true, (byte) 2, true, this.integerState0432, integerArgument2);
            }
          } else {
            if (1 == integerArgument1) {
              if (null == this.mixedSupport073State0002) {
                throw new RuntimeException();
              }
              objectLocal3 = this.cacheWorkQueueState0001.computeArchiveRequestManager0838(integerArgument2, this.mixedSupport073State0002, (byte) 61);
            } else {
              if (integerArgument1 != 2) {
                throw new RuntimeException();
              }
              if (null == this.mixedSupport073State0002) {
                throw new RuntimeException();
              }
              if (this.byteArrayState0013[integerArgument2] != -1) {
                throw new RuntimeException();
              }
              if (this.networkSupport003State0001.computeBoolean0382(0)) {
                return null;
              }
              objectLocal3 = this.networkSupport003State0001.computeResourceSupport0040379(false, (byte) 2, true, this.integerState0432, integerArgument2);
            }
          }
          this.mixedSupport090State0001.performAction1261((long)integerArgument2, -1, (HashNode) (objectLocal3));
        }
        if (((MixedSupport120) (objectLocal3)).booleanState0173) {
          return null;
        }
        byteArrayLocal14 = ((MixedSupport120) (objectLocal3)).computeByteArray0518((byte) 79);
        byteArrayLocal13 = byteArrayLocal14;
        byteArrayLocal4 = byteArrayLocal13;
        if (byteArgument3 != -20) {
          this.integerState0430 = 57;
        }
        if (objectLocal3 instanceof ArchiveRequestManager) {
          try {
            if (byteArrayLocal4 != null &&
              byteArrayLocal14.length > 2) {
              DualNodeDeque.cRC32State0001.reset();
              DualNodeDeque.cRC32State0001.update(byteArrayLocal4, 0, -2 + byteArrayLocal14.length);
              integerLocal5 = (int)DualNodeDeque.cRC32State0001.getValue();
              if (this.resourceSupport001State0002.integerArrayState0010[integerArgument2] != integerLocal5) {
                throw new RuntimeException();
              }
              if (this.resourceSupport001State0002.byteArrayArrayState0001 != null &&
                null != this.resourceSupport001State0002.byteArrayArrayState0001[integerArgument2]) {
                byteArrayLocal16 = this.resourceSupport001State0002.byteArrayArrayState0001[integerArgument2];
                byteArrayLocal15 = MixedSupport139.computeByteArray1899(0, byteArrayLocal4, 0, byteArrayLocal14.length - 2);
                for (integerLocal9 = 0; 64 > integerLocal9; integerLocal9++) {
                  if (~byteArrayLocal15[integerLocal9] != ~byteArrayLocal16[integerLocal9]) {
                    throw new RuntimeException();
                  }
                }
              }
              integerLocal8 = ((byteArrayLocal4[byteArrayLocal14.length - 2] & 255) << 8) + (byteArrayLocal4[byteArrayLocal14.length - 1] & 255);
              if ((this.resourceSupport001State0002.integerArrayState0007[integerArgument2] & 65535) != integerLocal8) {
                throw new RuntimeException();
              }
              if (this.byteArrayState0013[integerArgument2] != 1) {
                if (0 != this.byteArrayState0013[integerArgument2]) {
                }
                this.byteArrayState0013[integerArgument2] = (byte) 1;
              }
              if (!((MixedSupport120) (objectLocal3)).booleanState0172) {
                ((MixedSupport120) (objectLocal3)).performAction0161((byte) 115);
              }
              stackObjectLocal1 = objectLocal3;
              return (MixedSupport120) (stackObjectLocal1);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception caughtParameterLocal20) {
            caughtExceptionLocal2 = caughtParameterLocal20;
            exceptionLocal7 = (Exception) (Object) caughtExceptionLocal2;
            this.byteArrayState0013[integerArgument2] = (byte)-1;
            ((MixedSupport120) (objectLocal3)).performAction0161((byte) 119);
            if (!((MixedSupport120) (objectLocal3)).booleanState0172) {
              return null;
            }
            if (!this.networkSupport003State0001.computeBoolean0378(true)) {
              objectLocal3 = this.networkSupport003State0001.computeResourceSupport0040379(true, (byte) 2, true, this.integerState0432, integerArgument2);
              this.mixedSupport090State0001.performAction1261((long)integerArgument2, byteArgument3 ^ 19, (HashNode) (objectLocal3));
            }
            return null;
          }
        }
        try {
          if (byteArrayLocal4 != null &&
            byteArrayLocal14.length > 2) {
            DualNodeDeque.cRC32State0001.reset();
            DualNodeDeque.cRC32State0001.update(byteArrayLocal4, 0, -2 + byteArrayLocal14.length);
            integerLocal5 = (int)DualNodeDeque.cRC32State0001.getValue();
            if (this.resourceSupport001State0002.integerArrayState0010[integerArgument2] != integerLocal5) {
              throw new RuntimeException();
            }
            if (this.resourceSupport001State0002.byteArrayArrayState0001 != null &&
              null != this.resourceSupport001State0002.byteArrayArrayState0001[integerArgument2]) {
              byteArrayLocal17 = this.resourceSupport001State0002.byteArrayArrayState0001[integerArgument2];
              byteArrayLocal18 = MixedSupport139.computeByteArray1899(0, byteArrayLocal4, 0, -2 + byteArrayLocal14.length);
              integerLocal11 = 0;
              integerLocal9 = integerLocal11;
              while (integerLocal11 < 64) {
                if (~byteArrayLocal17[integerLocal11] != ~byteArrayLocal18[integerLocal11]) {
                  throw new RuntimeException();
                }
                integerLocal11++;
              }
            }
            this.networkSupport003State0001.integerState0132 = 0;
            this.networkSupport003State0001.integerState0131 = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException caughtParameterLocal21) {
          caughtExceptionLocal2 = caughtParameterLocal21;
          runtimeExceptionLocal6 = (RuntimeException) (Object) caughtExceptionLocal2;
          this.networkSupport003State0001.performAction0375(8192);
          ((MixedSupport120) (objectLocal3)).performAction0161((byte) 117);
          if (!((MixedSupport120) (objectLocal3)).booleanState0172) {
            return null;
          }
          if (this.networkSupport003State0001.computeBoolean0378(true)) {
            return null;
          }
          objectLocal3 = this.networkSupport003State0001.computeResourceSupport0040379(true, (byte) 2, true, this.integerState0432, integerArgument2);
          this.mixedSupport090State0001.performAction1261((long)integerArgument2, -1, (HashNode) (objectLocal3));
          return null;
        }
        byteArrayLocal4[-2 + byteArrayLocal14.length] = (byte)(this.resourceSupport001State0002.integerArrayState0007[integerArgument2] >>> 8);
        byteArrayLocal4[-1 + byteArrayLocal14.length] = (byte)this.resourceSupport001State0002.integerArrayState0007[integerArgument2];
        if (null != this.mixedSupport073State0002) {
          this.cacheWorkQueueState0001.computeArchiveRequestManager0840(integerArgument2, this.mixedSupport073State0002, byteArrayLocal14, (byte) -68);
          if (this.byteArrayState0013[integerArgument2] != 1) {
            this.byteArrayState0013[integerArgument2] = (byte) 1;
          }
        }
        if (!((MixedSupport120) (objectLocal3)).booleanState0172) {
          ((MixedSupport120) (objectLocal3)).performAction0161((byte) 117);
        }
        return (MixedSupport120) (objectLocal3);
    }

    final static int computeInteger1073(int integerArgument1, int integerArgument2) {
        if (integerArgument1 != 32085) {
          MixedSupport080.performAction1074(false);
        }
        return 500 * ((-1 + integerArgument2) * integerArgument2);
    }

    final static void performAction1066(byte byteArgument1, int integerArgument2) {
        PlatformSupport002.integerState0147 = integerArgument2 * 100 / 150;
        PlatformSupport002.integerState0148 = (integerArgument2 << 16) / 150;
        PlatformSupport002.integerState0146 = integerArgument2 * 400 / 150;
        int integerLocal1 = 101 % ((8 - byteArgument1) / 52);
    }

    final void performAction1075(boolean booleanArgument1) {
        MixedSupport120 discarded$3 = null;
        MixedSupport120 discarded$2 = null;
        MixedSupport120 discarded$1 = null;
        MixedSupport120 discarded$0 = null;
        int integerLocal5;
        MixedSupport120 mixedSupport120Local6;
        HashNode hashNodeLocal7;
        int integerLocal8;
        int integerLocal9;
        HashNode hashNodeLocal10;
        HashNode hashNodeLocal11;
        int integerLocal12;
        int integerLocal13;
        HashNode hashNodeLocal14;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!booleanArgument1) {
          this.performAction1075(false);
        }
        boolean frameRemainderLocal15 = true;
        if (null != this.nodeDequeState0015) {
          if (null == this.computeResourceSupport0011070(booleanArgument1)) {
            return;
          }
          if (this.booleanState0099) {
            integerLocal5 = 1;
            hashNodeLocal7 = this.nodeDequeState0015.computeHashNode1970((byte) 54);
            while (hashNodeLocal7 != null) {
              integerLocal8 = (int)hashNodeLocal7.key;
              if (this.byteArrayState0013[integerLocal8] == 0) {
                discarded$3 = this.computeMixedSupport1201069(1, integerLocal8, (byte) -20);
              }
              if (this.byteArrayState0013[integerLocal8] != 0) {
                hashNodeLocal7.performAction0161((byte) 121);
              } else {
                integerLocal5 = 0;
              }
              hashNodeLocal7 = this.nodeDequeState0015.computeHashNode1974(true);
            }
            scanLoop1: while (true) {
              if (this.integerState0434 < this.resourceSupport001State0002.integerArrayState0011.length) {
                if (0 != this.resourceSupport001State0002.integerArrayState0011[this.integerState0434]) {
                  if (this.cacheWorkQueueState0001.integerState0333 >= 250) {
                    integerLocal5 = 0;
                    break scanLoop1;
                  }
                  if (this.byteArrayState0013[this.integerState0434] == 0) {
                    discarded$2 = this.computeMixedSupport1201069(1, this.integerState0434, (byte) -20);
                  }
                  if (0 == this.byteArrayState0013[this.integerState0434]) {
                    hashNodeLocal10 = new HashNode();
                    hashNodeLocal10.key = (long)this.integerState0434;
                    this.nodeDequeState0015.performAction1963(hashNodeLocal10, 2777);
                    integerLocal5 = 0;
                  }
                }
                this.integerState0434 = this.integerState0434 + 1;
                continue;
              }
              break;
            }
            if ((integerLocal5 != 0)) {
              this.integerState0434 = 0;
              this.booleanState0099 = false;
            }
            frameRemainderLocal15 = false;
          }
          else {
            if (this.booleanState0100) {
              integerLocal12 = 1;
              hashNodeLocal14 = this.nodeDequeState0015.computeHashNode1970((byte) 77);
              while (hashNodeLocal14 != null) {
                integerLocal13 = (int)hashNodeLocal14.key;
                if (1 != this.byteArrayState0013[integerLocal13]) {
                  discarded$1 = this.computeMixedSupport1201069(2, integerLocal13, (byte) -20);
                }
                if (this.byteArrayState0013[integerLocal13] != 1) {
                  integerLocal12 = 0;
                } else {
                  hashNodeLocal14.performAction0161((byte) 102);
                }
                hashNodeLocal14 = this.nodeDequeState0015.computeHashNode1974(true);
              }
              scanLoop2: while (true) {
                if (this.integerState0434 < this.resourceSupport001State0002.integerArrayState0011.length) {
                  if (this.resourceSupport001State0002.integerArrayState0011[this.integerState0434] != 0) {
                    if (this.networkSupport003State0001.computeBoolean0382(0)) {
                      integerLocal12 = 0;
                      break scanLoop2;
                    }
                    if (this.byteArrayState0013[this.integerState0434] != 1) {
                      discarded$0 = this.computeMixedSupport1201069(2, this.integerState0434, (byte) -20);
                    }
                    if (1 != this.byteArrayState0013[this.integerState0434]) {
                      hashNodeLocal11 = new HashNode();
                      hashNodeLocal11.key = (long)this.integerState0434;
                      this.nodeDequeState0015.performAction1963(hashNodeLocal11, 2777);
                      integerLocal12 = 0;
                    }
                  }
                  this.integerState0434 = this.integerState0434 + 1;
                  continue;
                }
                break;
              }
              if ((integerLocal12 != 0)) {
                this.integerState0434 = 0;
                this.booleanState0100 = false;
              }
              frameRemainderLocal15 = false;
            }
            else {
              this.nodeDequeState0015 = null;
            }
          }
        }
        if (this.booleanState0101 &&
          MixedSupport063.computeLong0827(4) >= this.longState0028) {
          mixedSupport120Local6 = (MixedSupport120) (this.mixedSupport090State0001.computeHashNode1257((byte) 126));
          while (mixedSupport120Local6 != null) {
            if (!mixedSupport120Local6.booleanState0173) {
              if (mixedSupport120Local6.booleanState0174) {
                if (!mixedSupport120Local6.booleanState0172) {
                  throw new RuntimeException();
                }
                mixedSupport120Local6.performAction0161((byte) 101);
              } else {
                mixedSupport120Local6.booleanState0174 = true;
              }
            }
            mixedSupport120Local6 = (MixedSupport120) (this.mixedSupport090State0001.computeHashNode1263((byte) 107));
          }
          this.longState0028 = MixedSupport063.computeLong0827(4) + 1000L;
        }
    }

    final byte[] computeByteArray1067(int integerArgument1, byte byteArgument2) {
        MixedSupport120 mixedSupport120Local1 = this.computeMixedSupport1201069(0, integerArgument1, (byte) -20);
        if (mixedSupport120Local1 == null) {
          return null;
        }
        byte[] byteArrayLocal2 = mixedSupport120Local1.computeByteArray0518((byte) 126);
        mixedSupport120Local1.performAction0161((byte) 107);
        if (byteArgument2 != 91) {
          return (byte[]) null;
        }
        return byteArrayLocal2;
    }

    MixedSupport080(int integerArgument1, MixedSupport073 mixedSupport073Argument2, MixedSupport073 mixedSupport073Argument3, NetworkSupport003 networkSupport003Argument4, CacheWorkQueue cacheWorkQueueArgument5, int integerArgument6, byte[] byteArrayArgument7, int integerArgument8, boolean booleanArgument9) {
        boolean stackBooleanLocal1 = false;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        RuntimeException runtimeExceptionLocal14 = null;
        this.mixedSupport090State0001 = new MixedSupport090(16);
        this.integerState0434 = 0;
        this.nodeDequeState0016 = new NodeDeque();
        this.longState0028 = 0L;
        try {
          this.mixedSupport073State0002 = mixedSupport073Argument2;
          this.integerState0432 = integerArgument1;
          if (null != this.mixedSupport073State0002) {
            this.booleanState0099 = true;
            this.nodeDequeState0015 = new NodeDeque();
          } else {
            this.booleanState0099 = false;
          }
          this.integerState0430 = integerArgument6;
          this.networkSupport003State0001 = networkSupport003Argument4;
          stackBooleanLocal1 = (booleanArgument9);
          this.booleanState0101 = stackBooleanLocal1;
          this.byteArrayState0014 = byteArrayArgument7;
          this.mixedSupport073State0003 = mixedSupport073Argument3;
          this.integerState0431 = integerArgument8;
          this.cacheWorkQueueState0001 = cacheWorkQueueArgument5;
          if (null != this.mixedSupport073State0003) {
            this.mixedSupport120State0001 = (MixedSupport120) ((Object) this.cacheWorkQueueState0001.computeArchiveRequestManager0839(this.integerState0432, this.mixedSupport073State0003, -36));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal13 = caughtParameterLocal15;
          runtimeExceptionLocal14 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal14;
          stackStringBuilderLocal3 = new StringBuilder().append("le.<init>(").append(integerArgument1).append(',');
          if (mixedSupport073Argument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (mixedSupport073Argument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (networkSupport003Argument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (cacheWorkQueueArgument5 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument6).append(',');
          if (byteArrayArgument7 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument8).append(',').append(booleanArgument9).append(')').toString());
        }
    }

    static {
        stringState0326 = "No highscores";
        renderingSupport015State0004 = new RenderingSupport015();
    }
}
