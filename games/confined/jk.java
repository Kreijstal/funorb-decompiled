/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static od[] field_c;
    private ag field_d;
    private mi field_a;
    private mi field_b;

    final static void a(int param0, boolean param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    Object discarded$1 = kf.a((byte) 53, "resizing", ii.b(param1), new Object[1]);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) (Object) var2_ref, "jk.C(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -5 / ((-36 - param1) / 52);
                var3 = 0;
                var4 = tg.field_H;
                if (var4 >= 5) {
                  break L2;
                } else {
                  var3 = var4 * var4 * 8192 / 1100;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 >= 105) {
                  break L3;
                } else {
                  var3 = (-40960 + var4 * 16384) / 220;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (var4 < 120) {
                var4 = -var4 + 120;
                var3 = -(8192 * (var4 * var4) / 3300) + 8192;
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              var5 = 1;
              var6 = 0;
              if (param0 != 1) {
                break L4;
              } else {
                var6 = 1;
                break L4;
              }
            }
            L5: {
              if (param0 != 3) {
                break L5;
              } else {
                var5 = -1;
                break L5;
              }
            }
            L6: {
              if (param0 != 4) {
                break L6;
              } else {
                var5 = 1;
                var6 = 1;
                break L6;
              }
            }
            L7: {
              if (param0 == 5) {
                var5 = -1;
                var6 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (6 != param0) {
                break L8;
              } else {
                var5 = 1;
                var6 = -1;
                break L8;
              }
            }
            L9: {
              L10: {
                if (7 == param0) {
                  break L10;
                } else {
                  if (8 != param0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var5 = -1;
              var6 = -1;
              break L9;
            }
            L11: {
              if (11 == param0) {
                var5 = -1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (12 != param0) {
                break L12;
              } else {
                var6 = -1;
                var5 = -1;
                break L12;
              }
            }
            L13: {
              if (param0 != 13) {
                break L13;
              } else {
                var6 = -1;
                var5 = 1;
                break L13;
              }
            }
            L14: {
              if (param0 != 14) {
                break L14;
              } else {
                var6 = 1;
                var5 = -1;
                break L14;
              }
            }
            L15: {
              if (15 == param0) {
                var5 = 1;
                var6 = 1;
                break L15;
              } else {
                break L15;
              }
            }
            gd.field_m = fj.a(var3 * var5, (byte) 122, var3 * var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "jk.B(" + param0 + ',' + param1 + ')');
        }
    }

    final lb b(int param0, int param1) {
        lb var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        lb stackIn_4_0 = null;
        lb stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        lb stackOut_3_0 = null;
        lb stackOut_16_0 = null;
        try {
          L0: {
            var3 = (lb) ((jk) this).field_d.a(param0 ^ param0, (long)param1);
            if (null != var3) {
              stackOut_3_0 = (lb) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                L2: {
                  if (param1 >= 32768) {
                    break L2;
                  } else {
                    var4 = ((jk) this).field_a.a((byte) -2, 1, param1);
                    if (!Confined.field_J) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = ((jk) this).field_b.a((byte) -2, 1, 32767 & param1);
                break L1;
              }
              L3: {
                var3 = new lb();
                if (null != var4) {
                  var3.a(-119, new kg(var4));
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 >= 32768) {
                  var3.f(0);
                  break L4;
                } else {
                  break L4;
                }
              }
              ((jk) this).field_d.a((byte) -2, (long)param1, (Object) (Object) var3);
              stackOut_16_0 = (lb) var3;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3_ref, "jk.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              bg.field_d = tl.a(4314);
              vg.field_Z = new sh();
              if (param0 <= -29) {
                break L1;
              } else {
                jk.a(54);
                break L1;
              }
            }
            wl.a(-106, true, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "jk.F(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var4 = -29 / ((param0 - 87) / 36);
              if ((param1 & 7) != 0) {
                var2_int = 8 - (7 & param1);
                break L1;
              } else {
                break L1;
              }
            }
            var3 = param1 - -var2_int;
            stackOut_4_0 = var3;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "jk.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static nf b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        nf var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        nf stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        nf stackOut_10_0 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = sd.field_f[0] * rg.field_I[0];
            var2 = rj.field_f[0];
            var3 = new int[var1_int];
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var1_int >= ~var4_int) {
                    break L3;
                  } else {
                    var3[var4_int] = an.field_p[va.a(255, (int) var2[var4_int])];
                    var4_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 255) {
                  break L2;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (nf) (Object) stackIn_9_0;
                }
              }
              var4 = new nf(kb.field_a, em.field_e, jl.field_p[0], ij.field_r[0], rg.field_I[0], sd.field_f[0], var3);
              ql.a(false);
              stackOut_10_0 = (nf) var4;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "jk.E(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    public static void a(int param0) {
        if (param0 >= -72) {
            return;
        }
        try {
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "jk.G(" + param0 + ')');
        }
    }

    private jk() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "jk.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new od[13];
    }
}
