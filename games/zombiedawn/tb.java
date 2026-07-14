/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb extends an {
    private int field_L;
    static int field_E;
    private int field_N;
    private int field_H;
    private boolean field_F;
    static vn field_G;
    private long field_M;
    private int field_O;
    private boolean field_I;
    private long field_J;
    static dj field_K;

    private final void c(boolean param0) {
        if (!(!(((tb) this).field_v instanceof ok))) {
            ((ok) (Object) ((tb) this).field_v).b((tb) this, -19);
        }
        if (param0) {
            ((tb) this).field_J = -25L;
        }
    }

    private final int b(boolean param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        if (((tb) this).field_N == 0) {
            return ((tb) this).field_N;
        }
        if (!param0) {
            field_K = null;
        }
        for (var2 = ((tb) this).field_N - 1; (var2 ^ -1) < -1; var2--) {
            // if_icmpeq L66
        }
        return var2;
    }

    private final void g(byte param0) {
        if (param0 >= -1) {
            ((tb) this).j(-105);
        }
        this.k(-127);
        this.h(121);
    }

    final static vn[] c(int param0, int param1, int param2, int param3) {
        if (param2 != -2967) {
            return null;
        }
        return kj.a(1, param1, 12692, param3, param0);
    }

    final void a(boolean param0, boolean param1, String param2) {
        if (param2 == null) {
            param2 = "";
        }
        ((tb) this).field_o = param2;
        int var4 = param2.length();
        if ((((tb) this).field_O ^ -1) != 0) {
            if (var4 > ((tb) this).field_O) {
                ((tb) this).field_o = ((tb) this).field_o.substring(0, ((tb) this).field_O);
            }
        }
        ((tb) this).field_H = ((tb) this).field_o.length();
        ((tb) this).field_N = ((tb) this).field_o.length();
        if (param0) {
            return;
        }
        if (!(param1)) {
            ((tb) this).d((byte) 77);
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((tb) this).field_H == ((tb) this).field_N)) {
            var2 = ((tb) this).field_H < ((tb) this).field_N ? ((tb) this).field_H : ((tb) this).field_N;
            var3 = ((tb) this).field_N > ((tb) this).field_H ? ((tb) this).field_N : ((tb) this).field_H;
            ((tb) this).field_H = var2;
            ((tb) this).field_N = var2;
            ((tb) this).field_o = ((tb) this).field_o.substring(0, var2) + ((tb) this).field_o.substring(var3, ((tb) this).field_o.length());
            ((tb) this).d((byte) -113);
        }
        var2 = -113 % ((param0 - -26) / 49);
    }

    final void j(int param0) {
        ((tb) this).field_o = "";
        ((tb) this).field_H = 0;
        ((tb) this).field_N = param0;
        ((tb) this).d((byte) 119);
    }

    void a(ga param0, byte param1, int param2, int param3) {
        ak var6 = null;
        int var7 = 0;
        int var5 = 108 / ((46 - param1) / 42);
        super.a(param0, (byte) 119, param2, param3);
        this.i(-94);
        if (1 == ((tb) this).field_m) {
            if (!(((tb) this).field_h instanceof ak)) {
                ((tb) this).field_M = pd.a(-22826);
            } else {
                var6 = (ak) (Object) ((tb) this).field_h;
                var7 = var6.a((ga) this, -1, param2, ha.field_b, ei.field_K, param3);
                if (-1 != var7) {
                    if (((tb) this).field_F) {
                        if (var7 < ((tb) this).field_L) {
                            if (((tb) this).field_H < var7) {
                                var7 = ((tb) this).field_L;
                            }
                        }
                    }
                    ((tb) this).field_N = var7;
                }
                ((tb) this).field_M = pd.a(-22826);
            }
        }
    }

    void d(byte param0) {
        if (!(!(((tb) this).field_v instanceof ok))) {
            ((ok) (Object) ((tb) this).field_v).a((tb) this, 8);
        }
        int var2 = 4 % ((-50 - param0) / 49);
    }

    tb(String param0, sk param1, int param2) {
        super(param0, param1);
        ((tb) this).field_L = -1;
        ((tb) this).field_F = false;
        ((tb) this).field_J = 0L;
        ((tb) this).field_h = se.field_j.field_b;
        ((tb) this).field_O = param2;
        ((tb) this).a(false, true, param0);
        ((tb) this).field_I = true;
        ((tb) this).field_M = pd.a(-22826);
    }

    private final int f(byte param0) {
        int var4 = ZombieDawn.field_J;
        int var2 = ((tb) this).field_o.length();
        if (var2 == ((tb) this).field_N) {
            return ((tb) this).field_N;
        }
        int var3 = ((tb) this).field_N - -1;
        if (param0 != 7) {
            ((tb) this).field_F = false;
        }
        while (var3 < var2) {
            // if_icmpeq L75
            var3++;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ak var8 = null;
        long var6 = 0L;
        if (param3 != 0) {
            byte discarded$0 = tb.a('ﾲ', 59);
        }
        if (((tb) this).field_h != null) {
            if (param1 == 0) {
                ((tb) this).field_h.a(16777215, ((tb) this).field_C, param0, (ga) this, param2);
                if (!(!(((tb) this).field_h instanceof ak))) {
                    var8 = (ak) (Object) ((tb) this).field_h;
                    if (!(((tb) this).field_H == ((tb) this).field_N)) {
                        var8.a(-118, ((tb) this).field_H, param0, (ga) this, param2, ((tb) this).field_N);
                    }
                    var6 = pd.a(-22826);
                    if (!(((var6 + -((tb) this).field_M) % 1000L ^ -1L) <= -501L)) {
                        var8.a(((tb) this).field_N, param2, param0, param3 ^ -39, (ga) this);
                    }
                }
            }
        }
    }

    public static void d(boolean param0) {
        field_G = null;
        field_K = null;
        if (!param0) {
            tb.d(true);
        }
    }

    private final void k(int param0) {
        if (param0 >= -40) {
            return;
        }
        String var2 = this.e((byte) 112);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.e((byte) -10)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (((tb) this).field_O != -1) {
            var3 = ((tb) this).field_O + -((tb) this).field_o.length();
            if (0 <= var3) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((tb) this).field_N != ((tb) this).field_o.length()) {
            ((tb) this).field_o = ((tb) this).field_o.substring(0, ((tb) this).field_N) + param0 + ((tb) this).field_o.substring(((tb) this).field_N, ((tb) this).field_o.length());
        } else {
            ((tb) this).field_o = ((tb) this).field_o + param0;
        }
        ((tb) this).field_N = ((tb) this).field_N + param0.length();
        ((tb) this).field_H = ((tb) this).field_N;
        if (param1 != -37) {
            ((tb) this).field_J = -49L;
        }
        ((tb) this).d((byte) -103);
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        int var2 = param1.charAt(0);
        for (var3 = 1; var3 < param1.length(); var3++) {
            if (param1.charAt(var3) != var2) {
                return false;
            }
        }
        if (param0 != -10723) {
            return false;
        }
        return true;
    }

    private final void a(int param0, int param1) {
        ((tb) this).field_N = param0;
        if (!bo.field_p[param1]) {
            ((tb) this).field_H = ((tb) this).field_N;
        }
    }

    private final void g(int param0) {
        try {
            int var2 = 0;
            Exception var3 = null;
            String var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = -11 % ((-30 - param0) / 58);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                            this.h(127);
                            this.a(var3_ref, (byte) -37);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String e(byte param0) {
        int var2 = ((tb) this).field_N <= ((tb) this).field_H ? ((tb) this).field_N : ((tb) this).field_H;
        int var4 = -7 / ((param0 - 66) / 34);
        int var3 = ((tb) this).field_H < ((tb) this).field_N ? ((tb) this).field_N : ((tb) this).field_H;
        return ((tb) this).field_o.substring(var2, var3);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1 ^ 0, param2, param3, param4, param5, param6)) {
            if (!(!(((tb) this).field_h instanceof ak))) {
                var8_int = ((ak) (Object) ((tb) this).field_h).a((ga) this, param1 + -2, param2, ha.field_b, ei.field_K, param4);
                this.a((var8_int ^ -1) == 0 ? 0 : var8_int, 81);
                var8 = pd.a(param1 + -22827);
                ((tb) this).field_F = -251L < (-((tb) this).field_J + var8 ^ -1L) ? true : false;
                if (!(!((tb) this).field_F)) {
                    ((tb) this).field_H = this.b(true);
                    ((tb) this).field_N = this.f((byte) 7);
                    if (-1 > (((tb) this).field_N ^ -1)) {
                        if (((tb) this).field_o.charAt(-1 + ((tb) this).field_N) == 32) {
                            ((tb) this).field_N = ((tb) this).field_N - 1;
                        }
                    }
                    ((tb) this).field_L = ((tb) this).field_N;
                }
                ((tb) this).field_J = var8;
                return true;
            }
        }
        if (param1 != 1) {
            return false;
        }
        return false;
    }

    private final void i(int param0) {
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ak var9 = null;
        var8 = ZombieDawn.field_J;
        if (!((tb) this).field_I) {
          ((tb) this).field_u = 0;
          ((tb) this).field_p = 0;
          return;
        } else {
          if (((tb) this).field_h instanceof ak) {
            L0: {
              if (param0 < -87) {
                break L0;
              } else {
                field_E = -5;
                break L0;
              }
            }
            var9 = (ak) (Object) ((tb) this).field_h;
            var3 = var9.a(98, (ga) this);
            var4 = var3.b((byte) 123);
            var5 = var9.a((byte) 124, (ga) this);
            var6 = var9.a(5) >> 1632976737;
            if (var5 - var6 <= var4) {
              L1: {
                var7 = ((tb) this).field_u - -var3.a((byte) -72, ((tb) this).field_N);
                if (var7 <= var5 - var6) {
                  if (var7 >= var6) {
                    break L1;
                  } else {
                    ((tb) this).field_u = ((tb) this).field_u - -var6 + -var7;
                    break L1;
                  }
                } else {
                  ((tb) this).field_u = var5 - (var6 + (var7 - ((tb) this).field_u));
                  break L1;
                }
              }
              L2: {
                if (0 < ((tb) this).field_u) {
                  ((tb) this).field_u = 0;
                  break L2;
                } else {
                  if (-var5 - -var6 > ((tb) this).field_u) {
                    ((tb) this).field_u = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              ((tb) this).field_u = 0;
              ((tb) this).field_p = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = ZombieDawn.field_J;
              if (0 >= param0) {
                break L2;
              } else {
                if (param0 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (param0 > 255) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            if (8364 == param0) {
              var2 = -128;
              break L0;
            } else {
              if (param0 == 8218) {
                var2 = -126;
                break L0;
              } else {
                if (param0 == 402) {
                  var2 = -125;
                  break L0;
                } else {
                  if (param0 != 8222) {
                    if (param0 == 8230) {
                      var2 = -123;
                      break L0;
                    } else {
                      if (param0 != 8224) {
                        if (8225 == param0) {
                          var2 = -121;
                          break L0;
                        } else {
                          if (param0 == 710) {
                            var2 = -120;
                            break L0;
                          } else {
                            if (param0 == 8240) {
                              var2 = -119;
                              break L0;
                            } else {
                              if (352 == param0) {
                                var2 = -118;
                                break L0;
                              } else {
                                if (param0 == 8249) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (338 == param0) {
                                    var2 = -116;
                                    break L0;
                                  } else {
                                    if (param0 != 381) {
                                      if (param0 != 8216) {
                                        if (param0 == 8217) {
                                          var2 = -110;
                                          break L0;
                                        } else {
                                          if (param0 != 8220) {
                                            if (param0 == 8221) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param0 == 8226) {
                                                var2 = -107;
                                                break L0;
                                              } else {
                                                if (8211 != param0) {
                                                  if (param0 == 8212) {
                                                    var2 = -105;
                                                    break L0;
                                                  } else {
                                                    if (732 == param0) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param0 == 8482) {
                                                        var2 = -103;
                                                        break L0;
                                                      } else {
                                                        if (param0 == 353) {
                                                          var2 = -102;
                                                          break L0;
                                                        } else {
                                                          if (param0 != 8250) {
                                                            if (param0 == 339) {
                                                              var2 = -100;
                                                              break L0;
                                                            } else {
                                                              if (param0 != 382) {
                                                                if (param0 != 376) {
                                                                  var2 = 63;
                                                                  break L0;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            var2 = -109;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -114;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var2 = -122;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -124;
                    break L0;
                  }
                }
              }
            }
          }
          var2 = (byte)param0;
          break L0;
        }
        if (param1 == -8225) {
          return (byte) var2;
        } else {
          return (byte) 9;
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ((tb) this).field_M = pd.a(-22826);
        if (param3 == 60) {
          return false;
        } else {
          if (param3 != 62) {
            L0: {
              var5 = -121 / ((param0 - -83) / 32);
              if (param3 < 32) {
                break L0;
              } else {
                if (126 >= param3) {
                  L1: {
                    if (((tb) this).field_N != ((tb) this).field_H) {
                      this.h(77);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (-1 == ((tb) this).field_O) {
                        break L3;
                      } else {
                        if (((tb) this).field_o.length() < ((tb) this).field_O) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (((tb) this).field_N < ((tb) this).field_o.length()) {
                        ((tb) this).field_o = ((tb) this).field_o.substring(0, ((tb) this).field_N) + param3 + ((tb) this).field_o.substring(((tb) this).field_N, ((tb) this).field_o.length());
                        ((tb) this).field_N = ((tb) this).field_N + 1;
                        ((tb) this).field_H = ((tb) this).field_N;
                        break L4;
                      } else {
                        ((tb) this).field_o = ((tb) this).field_o + param3;
                        ((tb) this).field_N = ((tb) this).field_o.length();
                        ((tb) this).field_H = ((tb) this).field_o.length();
                        break L4;
                      }
                    }
                    ((tb) this).d((byte) -101);
                    break L2;
                  }
                  return true;
                } else {
                  break L0;
                }
              }
            }
            L5: {
              if (-86 != (param1 ^ -1)) {
                if (param1 != 101) {
                  if ((param1 ^ -1) != -14) {
                    if (param1 == 96) {
                      if (-1 > (((tb) this).field_N ^ -1)) {
                        L6: {
                          stackOut_46_0 = this;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_47_0 = stackOut_46_0;
                          if (!bo.field_p[82]) {
                            stackOut_48_0 = this;
                            stackOut_48_1 = ((tb) this).field_N - 1;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            break L6;
                          } else {
                            stackOut_47_0 = this;
                            stackOut_47_1 = this.b(true);
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            break L6;
                          }
                        }
                        this.a(stackIn_49_1, 81);
                        return true;
                      } else {
                        break L5;
                      }
                    } else {
                      if (param1 != 97) {
                        if (param1 != -103) {
                          if (-104 == param1) {
                            this.a(((tb) this).field_o.length(), 81);
                            return true;
                          } else {
                            if (84 != param1) {
                              L7: {
                                if (!bo.field_p[82]) {
                                  break L7;
                                } else {
                                  if (65 == param1) {
                                    this.g((byte) -58);
                                    return true;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (!bo.field_p[82]) {
                                  break L8;
                                } else {
                                  if (-67 != (param1 ^ -1)) {
                                    break L8;
                                  } else {
                                    this.k(-111);
                                    return true;
                                  }
                                }
                              }
                              if (!bo.field_p[82]) {
                                break L5;
                              } else {
                                if (67 != param1) {
                                  break L5;
                                } else {
                                  this.g(91);
                                  return true;
                                }
                              }
                            } else {
                              this.c(false);
                              return true;
                            }
                          }
                        } else {
                          this.a(0, 81);
                          return true;
                        }
                      } else {
                        if (((tb) this).field_N < ((tb) this).field_o.length()) {
                          L9: {
                            stackOut_24_0 = this;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (!bo.field_p[82]) {
                              stackOut_26_0 = this;
                              stackOut_26_1 = 1 + ((tb) this).field_N;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              break L9;
                            } else {
                              stackOut_25_0 = this;
                              stackOut_25_1 = this.f((byte) 7);
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_27_1 = stackOut_25_1;
                              break L9;
                            }
                          }
                          this.a(stackIn_27_1, 81);
                          return true;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    ((tb) this).j(0);
                    return true;
                  }
                } else {
                  if (((tb) this).field_H != ((tb) this).field_N) {
                    this.h(-96);
                    return true;
                  } else {
                    if (((tb) this).field_N < ((tb) this).field_o.length()) {
                      ((tb) this).field_H = ((tb) this).field_N - -1;
                      this.h(-82);
                      return true;
                    } else {
                      break L5;
                    }
                  }
                }
              } else {
                if (((tb) this).field_H == ((tb) this).field_N) {
                  if (((tb) this).field_N <= 0) {
                    break L5;
                  } else {
                    ((tb) this).field_H = -1 + ((tb) this).field_N;
                    this.h(75);
                    return true;
                  }
                } else {
                  this.h(28);
                  return true;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    static {
    }
}
