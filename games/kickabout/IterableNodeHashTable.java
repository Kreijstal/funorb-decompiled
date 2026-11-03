/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static ResourceArchive field_c;
    IntrusiveNode[] field_e;
    static String field_a;
    private IntrusiveNode field_f;
    static ResourceArchive field_b;
    int field_d;

    final void a(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.field_b) {
            param0.c((byte) -109);
          }
          if (param1 >= -14) {
            field_a = (String) null;
          }
          var5 = this.field_e[(int)((long)(this.field_d - 1) & param2)];
          param0.field_d = var5;
          param0.field_b = var5.field_b;
          param0.field_b.field_d = param0;
          param0.field_d.field_b = param0;
          param0.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ht.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode a(long param0, byte param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = Kickabout.field_G;
        if (param1 < 1) {
          return (IntrusiveNode) null;
        }
        var4 = this.field_e[(int)(param0 & (long)(-1 + this.field_d))];
        this.field_f = var4.field_d;
        while (true) {
          if (var4 == this.field_f) {
            this.field_f = null;
            return null;
          }
          if (param0 != this.field_f.field_a) {
            this.field_f = this.field_f.field_d;
            continue;
          }
          break;
        }
        var5 = this.field_f;
        this.field_f = this.field_f.field_d;
        return var5;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final static void a(boolean param0, byte param1) {
        double stackIn_5_0 = 0.0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_242_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_267_0 = 0;
        int stackIn_285_0 = 0;
        double var2;
        double var4;
        double var6;
        double var8;
        double var10;
        double var12_double;
        int var12;
        double var14;
        double var16;
        double var18;
        double var20;
        double var22;
        double var24;
        double var26;
        double var8Lifetime1;
        double var10Lifetime1;
        double var12_doubleLifetime1;
        int var12Lifetime1;
        double var14Lifetime1;
        double var16Lifetime1;
        double var18Lifetime1;
        double var20Lifetime1;
        double var22Lifetime1;
        double var24Lifetime1;
        double var26Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        if (848.0 > PlayArea.field_d) {
          PlayArea.field_d = 848.0;
        }
        stackIn_5_0 = (param0) ? 1.4 : 0.013999999999999999;
        var2 = stackIn_5_0;
        if (2048.0 < PlayArea.field_d) {
          PlayArea.field_d = 2048.0;
        }
        var4 = CachedArchiveSource.field_C - UiLayoutNode.field_K;
        var6 = -jr.field_Gb + AuctionLogEntry.field_f;
        if (param1 != 89) {
          field_c = (ResourceArchive) null;
          var8 = PlayArea.field_d - InstrumentNoteMask.field_f;
          var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
          if (var10 > 0.0001) {
            var12_double = mc.a(var10, var2, false) / var10;
            var14 = var12_double * var4;
            var16 = var12_double * var6;
            var18 = var12_double * var8;
            var20 = var14 - PlayerStats.field_f;
            var22 = -IntrusiveDeque.field_a + var16;
            var24 = -DualLinkDeque.field_e + var18;
            var26 = Math.sqrt(var24 * var24 + (var22 * var22 + var20 * var20));
            if (var2 < var26) {
              var22 = var2 * var22 / var26;
              var24 = var24 * var2 / var26;
              var20 = var20 * var2 / var26;
            }
            PlayerStats.field_f = PlayerStats.field_f + var20;
            DualLinkDeque.field_e = DualLinkDeque.field_e + var24;
            IntrusiveDeque.field_a = IntrusiveDeque.field_a + var22;
          }
          stackIn_17_0 = (!(UiLayoutNode.field_K < CachedArchiveSource.field_C)) ? 0 : 1;
          var12 = stackIn_17_0;
          UiLayoutNode.field_K = UiLayoutNode.field_K + PlayerStats.field_f;
          if (var12 != 0 &&
            UiLayoutNode.field_K > CachedArchiveSource.field_C) {
            UiLayoutNode.field_K = CachedArchiveSource.field_C;
          } else {
            if (var12 == 0 &&
              UiLayoutNode.field_K < CachedArchiveSource.field_C) {
              UiLayoutNode.field_K = CachedArchiveSource.field_C;
            }
          }
          stackIn_28_0 = (!(AuctionLogEntry.field_f > jr.field_Gb)) ? 0 : 1;
          var12Lifetime2 = stackIn_28_0;
          jr.field_Gb = jr.field_Gb + IntrusiveDeque.field_a;
          if (var12Lifetime2 != 0) {
            if (jr.field_Gb > AuctionLogEntry.field_f ||
              var12Lifetime2 == 0 &&
              AuctionLogEntry.field_f > jr.field_Gb) {
              jr.field_Gb = AuctionLogEntry.field_f;
            }
          } else {
            if (var12Lifetime2 == 0 &&
              AuctionLogEntry.field_f > jr.field_Gb) {
              jr.field_Gb = AuctionLogEntry.field_f;
            }
          }
          stackIn_40_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
          var12Lifetime3 = stackIn_40_0;
          InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
          if (var12Lifetime3 != 0 &&
            InstrumentNoteMask.field_f > PlayArea.field_d) {
            InstrumentNoteMask.field_f = PlayArea.field_d;
          } else {
            if (var12Lifetime3 == 0 &&
              PlayArea.field_d > InstrumentNoteMask.field_f) {
              InstrumentNoteMask.field_f = PlayArea.field_d;
            }
          }
          ShopPlayerSlot.i(-320);
          if (0.0 != MyPitchScreen.field_G) {
            MyPitchScreen.field_G = MyPitchScreen.field_G * -0.9;
          }
          InstrumentNoteMask.field_i = (int)InstrumentNoteMask.field_f >> 3;
          return;
        }
        var8Lifetime1 = PlayArea.field_d - InstrumentNoteMask.field_f;
        var10Lifetime1 = Math.sqrt(var4 * var4 + var6 * var6 + var8Lifetime1 * var8Lifetime1);
        if (var10Lifetime1 > 0.0001) {
          var12_doubleLifetime1 = mc.a(var10Lifetime1, var2, false) / var10Lifetime1;
          var14Lifetime1 = var12_doubleLifetime1 * var4;
          var16Lifetime1 = var12_doubleLifetime1 * var6;
          var18Lifetime1 = var12_doubleLifetime1 * var8Lifetime1;
          var20Lifetime1 = var14Lifetime1 - PlayerStats.field_f;
          var22Lifetime1 = -IntrusiveDeque.field_a + var16Lifetime1;
          var24Lifetime1 = -DualLinkDeque.field_e + var18Lifetime1;
          var26Lifetime1 = Math.sqrt(var24Lifetime1 * var24Lifetime1 + (var22Lifetime1 * var22Lifetime1 + var20Lifetime1 * var20Lifetime1));
          if (var2 < var26Lifetime1) {
            var22Lifetime1 = var2 * var22Lifetime1 / var26Lifetime1;
            var24Lifetime1 = var24Lifetime1 * var2 / var26Lifetime1;
            var20Lifetime1 = var20Lifetime1 * var2 / var26Lifetime1;
          }
          PlayerStats.field_f = PlayerStats.field_f + var20Lifetime1;
          DualLinkDeque.field_e = DualLinkDeque.field_e + var24Lifetime1;
          IntrusiveDeque.field_a = IntrusiveDeque.field_a + var22Lifetime1;
        }
        stackIn_59_0 = (!(UiLayoutNode.field_K < CachedArchiveSource.field_C)) ? 0 : 1;
        var12Lifetime1 = stackIn_59_0;
        UiLayoutNode.field_K = UiLayoutNode.field_K + PlayerStats.field_f;
        if (var12Lifetime1 != 0) {
          if (UiLayoutNode.field_K > CachedArchiveSource.field_C) {
            UiLayoutNode.field_K = CachedArchiveSource.field_C;
            stackIn_64_0 = (!(AuctionLogEntry.field_f > jr.field_Gb)) ? 0 : 1;
            var12Lifetime1 = stackIn_64_0;
            jr.field_Gb = jr.field_Gb + IntrusiveDeque.field_a;
            if (var12Lifetime1 != 0 &&
              jr.field_Gb > AuctionLogEntry.field_f ||
              var12Lifetime1 == 0 &&
              AuctionLogEntry.field_f > jr.field_Gb) {
              jr.field_Gb = AuctionLogEntry.field_f;
            }
            stackIn_74_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
            var12Lifetime1 = stackIn_74_0;
            InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
            if (var12Lifetime1 != 0 &&
              InstrumentNoteMask.field_f > PlayArea.field_d) {
              InstrumentNoteMask.field_f = PlayArea.field_d;
            } else {
              if (var12Lifetime1 == 0 &&
                PlayArea.field_d > InstrumentNoteMask.field_f) {
                InstrumentNoteMask.field_f = PlayArea.field_d;
              }
            }
          } else {
            if (var12Lifetime1 == 0 &&
              UiLayoutNode.field_K < CachedArchiveSource.field_C) {
              UiLayoutNode.field_K = CachedArchiveSource.field_C;
            }
            stackIn_91_0 = (!(AuctionLogEntry.field_f > jr.field_Gb)) ? 0 : 1;
            var12Lifetime1 = stackIn_91_0;
            jr.field_Gb = jr.field_Gb + IntrusiveDeque.field_a;
            if (var12Lifetime1 == 0) {
              if (AuctionLogEntry.field_f > jr.field_Gb) {
                jr.field_Gb = AuctionLogEntry.field_f;
              }
              stackIn_98_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
              var12Lifetime1 = stackIn_98_0;
              InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
              if (var12Lifetime1 != 0 &&
                InstrumentNoteMask.field_f > PlayArea.field_d) {
                InstrumentNoteMask.field_f = PlayArea.field_d;
              } else {
                if (var12Lifetime1 == 0 &&
                  PlayArea.field_d > InstrumentNoteMask.field_f) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                }
              }
            } else {
              if (jr.field_Gb > AuctionLogEntry.field_f) {
                jr.field_Gb = AuctionLogEntry.field_f;
                stackIn_131_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
                var12Lifetime1 = stackIn_131_0;
                InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
                if (var12Lifetime1 != 0 &&
                  InstrumentNoteMask.field_f > PlayArea.field_d) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                } else {
                  if (var12Lifetime1 == 0 &&
                    PlayArea.field_d > InstrumentNoteMask.field_f) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  }
                }
              } else {
                if (var12Lifetime1 == 0 &&
                  AuctionLogEntry.field_f > jr.field_Gb) {
                  jr.field_Gb = AuctionLogEntry.field_f;
                }
                stackIn_117_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
                var12Lifetime1 = stackIn_117_0;
                InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
                if (var12Lifetime1 != 0 &&
                  InstrumentNoteMask.field_f > PlayArea.field_d) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                } else {
                  if (var12Lifetime1 == 0 &&
                    PlayArea.field_d > InstrumentNoteMask.field_f) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  }
                }
              }
            }
          }
        } else {
          if (var12Lifetime1 != 0) {
            stackIn_147_0 = (!(AuctionLogEntry.field_f > jr.field_Gb)) ? 0 : 1;
            var12Lifetime1 = stackIn_147_0;
            jr.field_Gb = jr.field_Gb + IntrusiveDeque.field_a;
            boolean decompiledFrameRemainder1 = true;
            if (var12Lifetime1 == 0) {
              if (var12Lifetime1 == 0) {
                if (!(AuctionLogEntry.field_f > jr.field_Gb)) {
                  stackIn_174_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
                  var12Lifetime1 = stackIn_174_0;
                  InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
                  if (var12Lifetime1 != 0 &&
                    InstrumentNoteMask.field_f > PlayArea.field_d) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  } else {
                    if (var12Lifetime1 == 0 &&
                      PlayArea.field_d > InstrumentNoteMask.field_f) {
                      InstrumentNoteMask.field_f = PlayArea.field_d;
                      ShopPlayerSlot.i(-320);
                      if (0.0 != MyPitchScreen.field_G) {
                        MyPitchScreen.field_G = MyPitchScreen.field_G * -0.9;
                      }
                      InstrumentNoteMask.field_i = (int)InstrumentNoteMask.field_f >> 3;
                      return;
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  jr.field_Gb = AuctionLogEntry.field_f;
                }
              }
            } else {
              if (!(jr.field_Gb > AuctionLogEntry.field_f)) {
                if (var12Lifetime1 == 0 &&
                  AuctionLogEntry.field_f > jr.field_Gb) {
                  jr.field_Gb = AuctionLogEntry.field_f;
                }
                stackIn_157_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
                var12Lifetime1 = stackIn_157_0;
                InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
                if (var12Lifetime1 != 0 &&
                  InstrumentNoteMask.field_f > PlayArea.field_d) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                } else {
                  if (var12Lifetime1 == 0 &&
                    PlayArea.field_d > InstrumentNoteMask.field_f) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  }
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                jr.field_Gb = AuctionLogEntry.field_f;
              }
            }
            if (decompiledFrameRemainder1) {
              stackIn_191_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
              var12Lifetime1 = stackIn_191_0;
              InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
              if (var12Lifetime1 == 0) {
                if (var12Lifetime1 == 0 &&
                  PlayArea.field_d > InstrumentNoteMask.field_f) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                }
              } else {
                if (InstrumentNoteMask.field_f > PlayArea.field_d) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                } else {
                  if (var12Lifetime1 == 0 &&
                    PlayArea.field_d > InstrumentNoteMask.field_f) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  }
                }
              }
            }
          } else {
            if (UiLayoutNode.field_K < CachedArchiveSource.field_C) {
              UiLayoutNode.field_K = CachedArchiveSource.field_C;
              stackIn_218_0 = (!(AuctionLogEntry.field_f > jr.field_Gb)) ? 0 : 1;
              var12Lifetime1 = stackIn_218_0;
              jr.field_Gb = jr.field_Gb + IntrusiveDeque.field_a;
              if (var12Lifetime1 != 0 &&
                jr.field_Gb > AuctionLogEntry.field_f ||
                var12Lifetime1 == 0 &&
                AuctionLogEntry.field_f > jr.field_Gb) {
                jr.field_Gb = AuctionLogEntry.field_f;
              }
              stackIn_228_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
              var12Lifetime1 = stackIn_228_0;
              InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
              if (var12Lifetime1 != 0 &&
                InstrumentNoteMask.field_f > PlayArea.field_d) {
                InstrumentNoteMask.field_f = PlayArea.field_d;
              } else {
                if (var12Lifetime1 == 0 &&
                  PlayArea.field_d > InstrumentNoteMask.field_f) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                }
              }
            } else {
              stackIn_242_0 = (!(AuctionLogEntry.field_f > jr.field_Gb)) ? 0 : 1;
              boolean decompiledFrameRemainder0 = true;
              var12Lifetime1 = stackIn_242_0;
              jr.field_Gb = jr.field_Gb + IntrusiveDeque.field_a;
              if (var12Lifetime1 == 0) {
                decompiledFrameRemainder0 = (var12Lifetime1 == 0);
                if ((decompiledFrameRemainder0) &&
                  (!(AuctionLogEntry.field_f > jr.field_Gb))) {
                  stackIn_267_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
                  var12Lifetime1 = stackIn_267_0;
                  InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
                  if (var12Lifetime1 != 0 &&
                    InstrumentNoteMask.field_f > PlayArea.field_d) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  } else {
                    if (var12Lifetime1 == 0 &&
                      PlayArea.field_d > InstrumentNoteMask.field_f) {
                      InstrumentNoteMask.field_f = PlayArea.field_d;
                      ShopPlayerSlot.i(-320);
                      if (0.0 != MyPitchScreen.field_G) {
                        MyPitchScreen.field_G = MyPitchScreen.field_G * -0.9;
                      }
                      InstrumentNoteMask.field_i = (int)InstrumentNoteMask.field_f >> 3;
                      return;
                    }
                  }
                  ShopPlayerSlot.i(-320);
                  if (0.0 == MyPitchScreen.field_G) {
                    InstrumentNoteMask.field_i = (int)InstrumentNoteMask.field_f >> 3;
                    return;
                  }
                  MyPitchScreen.field_G = MyPitchScreen.field_G * -0.9;
                  InstrumentNoteMask.field_i = (int)InstrumentNoteMask.field_f >> 3;
                  return;
                }
              } else {
                if (!(jr.field_Gb > AuctionLogEntry.field_f)) {
                  if (var12Lifetime1 == 0 &&
                    AuctionLogEntry.field_f > jr.field_Gb) {
                    jr.field_Gb = AuctionLogEntry.field_f;
                  }
                  stackIn_251_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
                  var12Lifetime1 = stackIn_251_0;
                  InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
                  if (var12Lifetime1 != 0 &&
                    InstrumentNoteMask.field_f > PlayArea.field_d) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  } else {
                    if (var12Lifetime1 == 0 &&
                      PlayArea.field_d > InstrumentNoteMask.field_f) {
                      InstrumentNoteMask.field_f = PlayArea.field_d;
                    }
                  }
                  ShopPlayerSlot.i(-320);
                  if (0.0 != MyPitchScreen.field_G) {
                    MyPitchScreen.field_G = MyPitchScreen.field_G * -0.9;
                  }
                  InstrumentNoteMask.field_i = (int)InstrumentNoteMask.field_f >> 3;
                  return;
                }
              }
              if (decompiledFrameRemainder0) {
                jr.field_Gb = AuctionLogEntry.field_f;
              }
              stackIn_285_0 = (!(PlayArea.field_d > InstrumentNoteMask.field_f)) ? 0 : 1;
              var12Lifetime1 = stackIn_285_0;
              InstrumentNoteMask.field_f = InstrumentNoteMask.field_f + DualLinkDeque.field_e;
              if (var12Lifetime1 == 0) {
                if (PlayArea.field_d > InstrumentNoteMask.field_f) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                }
              } else {
                if (InstrumentNoteMask.field_f > PlayArea.field_d) {
                  InstrumentNoteMask.field_f = PlayArea.field_d;
                } else {
                  if (var12Lifetime1 == 0 &&
                    PlayArea.field_d > InstrumentNoteMask.field_f) {
                    InstrumentNoteMask.field_f = PlayArea.field_d;
                  }
                }
              }
            }
          }
        }
        ShopPlayerSlot.i(-320);
        if (0.0 != MyPitchScreen.field_G) {
          MyPitchScreen.field_G = MyPitchScreen.field_G * -0.9;
        }
        InstrumentNoteMask.field_i = (int)InstrumentNoteMask.field_f >> 3;
        return;
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_e = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_e[var2] = dupTemp$0;
          var3.field_d = var3;
          var3.field_b = var3;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          field_c = (ResourceArchive) null;
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_a = "type in name and press 'Enter' to search for team";
    }
}
