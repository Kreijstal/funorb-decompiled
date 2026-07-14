/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends rm {
    private boolean field_I;
    static String field_M;
    private boolean field_G;
    private int field_N;
    private long field_P;
    static int[] field_K;
    private int field_L;
    static int[] field_J;
    private int field_O;
    private long field_H;
    static boolean field_R;
    private int field_Q;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((nk) this).field_O == ((nk) this).field_L) {
            break L0;
          } else {
            L1: {
              if (((nk) this).field_O <= ((nk) this).field_L) {
                stackOut_3_0 = ((nk) this).field_O;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((nk) this).field_L;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (((nk) this).field_L >= ((nk) this).field_O) {
                stackOut_6_0 = ((nk) this).field_L;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((nk) this).field_O;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            ((nk) this).field_O = var2;
            ((nk) this).field_L = var2;
            ((nk) this).field_q = ((nk) this).field_q.substring(0, var2) + ((nk) this).field_q.substring(var3, ((nk) this).field_q.length());
            ((nk) this).f((byte) 100);
            break L0;
          }
        }
        if (param0) {
          ((nk) this).field_G = false;
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        if (param0 == -31523) {
          ((nk) this).field_O = param1;
          if (!lk.field_g[81]) {
            ((nk) this).field_L = ((nk) this).field_O;
            return;
          } else {
            return;
          }
        } else {
          ((nk) this).a(-33, -31, 0, 101);
          ((nk) this).field_O = param1;
          if (lk.field_g[81]) {
            return;
          } else {
            ((nk) this).field_L = ((nk) this).field_O;
            return;
          }
        }
    }

    private final void m(int param0) {
        this.j(-117);
        if (param0 <= 93) {
            nk.n(-47);
            this.a(false);
            return;
        }
        this.a(false);
    }

    private final void b(boolean param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.a(false);
              if (param0) {
                this.a(-127, var2);
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (((nk) this).field_l instanceof vc) {
            L0: {
              var8_int = ((vc) (Object) ((nk) this).field_l).a(param2, (byte) 76, nc.field_g, param0, (n) this, rf.field_X);
              stackOut_4_0 = this;
              stackOut_4_1 = -31523;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (var8_int != -1) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = var8_int;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_7_1, stackIn_7_2);
              var8 = bb.b(-1);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-251L >= (-((nk) this).field_H + var8 ^ -1L)) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((nk) this).field_G = stackIn_10_1 != 0;
            if (((nk) this).field_G) {
              ((nk) this).field_L = this.a((byte) 70);
              ((nk) this).field_O = this.e((byte) -88);
              if ((((nk) this).field_O ^ -1) < -1) {
                if (32 == ((nk) this).field_q.charAt(((nk) this).field_O + -1)) {
                  ((nk) this).field_O = ((nk) this).field_O - 1;
                  ((nk) this).field_Q = ((nk) this).field_O;
                  ((nk) this).field_H = var8;
                  return true;
                } else {
                  ((nk) this).field_Q = ((nk) this).field_O;
                  ((nk) this).field_H = var8;
                  return true;
                }
              } else {
                ((nk) this).field_Q = ((nk) this).field_O;
                ((nk) this).field_H = var8;
                return true;
              }
            } else {
              ((nk) this).field_H = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void a(int param0, n param1, int param2, byte param3) {
        vc var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.k(-62);
        if ((((nk) this).field_v ^ -1) == -2) {
          if (!(((nk) this).field_l instanceof vc)) {
            ((nk) this).field_P = bb.b(-1);
            return;
          } else {
            L0: {
              var5 = (vc) (Object) ((nk) this).field_l;
              var6 = var5.a(param2, (byte) 110, nc.field_g, param0, (n) this, rf.field_X);
              if (var6 == -1) {
                break L0;
              } else {
                L1: {
                  if (!((nk) this).field_G) {
                    break L1;
                  } else {
                    if (var6 >= ((nk) this).field_Q) {
                      break L1;
                    } else {
                      if (var6 <= ((nk) this).field_L) {
                        break L1;
                      } else {
                        var6 = ((nk) this).field_Q;
                        break L1;
                      }
                    }
                  }
                }
                ((nk) this).field_O = var6;
                break L0;
              }
            }
            ((nk) this).field_P = bb.b(-1);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        vc var8 = null;
        if (((nk) this).field_l != null) {
          if (-1 == (param3 ^ -1)) {
            L0: {
              ((nk) this).field_l.a(((nk) this).field_D, param2, -101, (n) this, param1);
              if (!(((nk) this).field_l instanceof vc)) {
                break L0;
              } else {
                L1: {
                  var8 = (vc) (Object) ((nk) this).field_l;
                  if (((nk) this).field_O != ((nk) this).field_L) {
                    var8.a(-108, param1, param2, ((nk) this).field_O, ((nk) this).field_L, (n) this);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = bb.b(-1);
                if (-501L < ((var6 + -((nk) this).field_P) % 1000L ^ -1L)) {
                  var8.a(param2, (n) this, ((nk) this).field_O, (byte) -98, param1);
                  break L0;
                } else {
                  if (param0 != -9532) {
                    this.k(-36);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != -9532) {
              this.k(-36);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -9532) {
              this.k(-36);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -9532) {
            this.k(-36);
            return;
          } else {
            return;
          }
        }
    }

    private final String g(byte param0) {
        int var3 = -83 / ((-74 - param0) / 45);
        int var2 = ((nk) this).field_L >= ((nk) this).field_O ? ((nk) this).field_O : ((nk) this).field_L;
        int var4 = ((nk) this).field_L >= ((nk) this).field_O ? ((nk) this).field_L : ((nk) this).field_O;
        return ((nk) this).field_q.substring(var2, var4);
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        var2 = ((nk) this).field_q.length();
        if (((nk) this).field_O != var2) {
          if (param0 == -88) {
            var3 = 1 + ((nk) this).field_O;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (((nk) this).field_q.charAt(var3 + -1) ^ -1)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return -8;
          }
        } else {
          return ((nk) this).field_O;
        }
    }

    nk(String param0, tb param1, int param2) {
        super(param0, param1);
        ((nk) this).field_G = false;
        ((nk) this).field_Q = -1;
        ((nk) this).field_H = 0L;
        ((nk) this).field_N = param2;
        ((nk) this).field_l = pc.field_b.field_s;
        ((nk) this).a(true, param0, 1471);
        ((nk) this).field_I = true;
        ((nk) this).field_P = bb.b(-1);
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        L0: {
          if (0 != (((nk) this).field_N ^ -1)) {
            var3 = ((nk) this).field_N + -((nk) this).field_q.length();
            if (0 > var3) {
              param1 = param1.substring(0, var3);
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (param0 < -117) {
          if (((nk) this).field_O == ((nk) this).field_q.length()) {
            ((nk) this).field_q = ((nk) this).field_q + param1;
            ((nk) this).field_O = ((nk) this).field_O + param1.length();
            ((nk) this).field_L = ((nk) this).field_O;
            ((nk) this).f((byte) -123);
            return;
          } else {
            ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_O) + param1 + ((nk) this).field_q.substring(((nk) this).field_O, ((nk) this).field_q.length());
            ((nk) this).field_O = ((nk) this).field_O + param1.length();
            ((nk) this).field_L = ((nk) this).field_O;
            ((nk) this).f((byte) -123);
            return;
          }
        } else {
          ((nk) this).field_L = -34;
          if (((nk) this).field_O == ((nk) this).field_q.length()) {
            ((nk) this).field_q = ((nk) this).field_q + param1;
            ((nk) this).field_O = ((nk) this).field_O + param1.length();
            ((nk) this).field_L = ((nk) this).field_O;
            ((nk) this).f((byte) -123);
            return;
          } else {
            ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_O) + param1 + ((nk) this).field_q.substring(((nk) this).field_O, ((nk) this).field_q.length());
            ((nk) this).field_O = ((nk) this).field_O + param1.length();
            ((nk) this).field_L = ((nk) this).field_O;
            ((nk) this).f((byte) -123);
            return;
          }
        }
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (((nk) this).field_O == 0) {
          return ((nk) this).field_O;
        } else {
          var2 = -1 + ((nk) this).field_O;
          var3 = 56 / ((5 - param0) / 42);
          L0: while (true) {
            if ((var2 ^ -1) < -1) {
              if (32 != ((nk) this).field_q.charAt(-1 + var2)) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        }
    }

    private final void l(int param0) {
        if (!(((nk) this).field_t instanceof ed)) {
          if (param0 <= 83) {
            int discarded$4 = this.e((byte) -112);
            return;
          } else {
            return;
          }
        } else {
          ((ed) (Object) ((nk) this).field_t).a((byte) 19, (nk) this);
          if (param0 > 83) {
            return;
          } else {
            int discarded$5 = this.e((byte) -112);
            return;
          }
        }
    }

    void f(byte param0) {
        if (!(!(((nk) this).field_t instanceof ed))) {
            ((ed) (Object) ((nk) this).field_t).a((nk) this, -110);
        }
        int var2 = 81 % ((param0 - -44) / 59);
    }

    private final void k(int param0) {
        int var3 = 0;
        lm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vc var10 = null;
        var9 = HoldTheLine.field_D;
        if (((nk) this).field_I) {
          if (((nk) this).field_l instanceof vc) {
            var10 = (vc) (Object) ((nk) this).field_l;
            var3 = 14 / ((70 - param0) / 49);
            var4 = var10.a((byte) 20, (n) this);
            var5 = var4.a((byte) 98);
            var6 = var10.a(9, (n) this);
            var7 = var10.a(true) >> 1791053921;
            if (var6 + -var7 <= var5) {
              var8 = ((nk) this).field_m - -var4.a(16777215, ((nk) this).field_O);
              if (-var7 + var6 >= var8) {
                if (var8 >= var7) {
                  if (0 >= ((nk) this).field_m) {
                    if (((nk) this).field_m < -var6 - -var7) {
                      ((nk) this).field_m = -var6 - -var7;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((nk) this).field_m = 0;
                    return;
                  }
                } else {
                  ((nk) this).field_m = ((nk) this).field_m - -var7 + -var8;
                  if (0 >= ((nk) this).field_m) {
                    if (((nk) this).field_m >= -var6 - -var7) {
                      return;
                    } else {
                      ((nk) this).field_m = -var6 - -var7;
                      return;
                    }
                  } else {
                    ((nk) this).field_m = 0;
                    return;
                  }
                }
              } else {
                ((nk) this).field_m = ((nk) this).field_m - (var8 - -var7) + var6;
                if (0 >= ((nk) this).field_m) {
                  if (((nk) this).field_m >= -var6 - -var7) {
                    return;
                  } else {
                    ((nk) this).field_m = -var6 - -var7;
                    return;
                  }
                } else {
                  ((nk) this).field_m = 0;
                  return;
                }
              }
            } else {
              ((nk) this).field_y = 0;
              ((nk) this).field_m = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          ((nk) this).field_m = 0;
          ((nk) this).field_y = 0;
          return;
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        Object stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        Object stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        ((nk) this).field_P = bb.b(-1);
        if (param2 == -78) {
          L0: {
            if (param3 == 60) {
              break L0;
            } else {
              if (param3 == 62) {
                break L0;
              } else {
                if (param3 < 32) {
                  L1: {
                    if (param1 == 85) {
                      if (((nk) this).field_L != ((nk) this).field_O) {
                        this.a(false);
                        return true;
                      } else {
                        if ((((nk) this).field_O ^ -1) >= -1) {
                          break L1;
                        } else {
                          ((nk) this).field_L = -1 + ((nk) this).field_O;
                          this.a(false);
                          return true;
                        }
                      }
                    } else {
                      if (param1 == 101) {
                        if (((nk) this).field_L == ((nk) this).field_O) {
                          if (((nk) this).field_O >= ((nk) this).field_q.length()) {
                            break L1;
                          } else {
                            ((nk) this).field_L = 1 + ((nk) this).field_O;
                            this.a(false);
                            return true;
                          }
                        } else {
                          this.a(false);
                          return true;
                        }
                      } else {
                        if (13 != param1) {
                          if (param1 == 96) {
                            if (0 >= ((nk) this).field_O) {
                              break L1;
                            } else {
                              L2: {
                                stackOut_103_0 = this;
                                stackOut_103_1 = -31523;
                                stackIn_105_0 = stackOut_103_0;
                                stackIn_105_1 = stackOut_103_1;
                                stackIn_104_0 = stackOut_103_0;
                                stackIn_104_1 = stackOut_103_1;
                                if (lk.field_g[82]) {
                                  stackOut_105_0 = this;
                                  stackOut_105_1 = stackIn_105_1;
                                  stackOut_105_2 = this.a((byte) -37);
                                  stackIn_106_0 = stackOut_105_0;
                                  stackIn_106_1 = stackOut_105_1;
                                  stackIn_106_2 = stackOut_105_2;
                                  break L2;
                                } else {
                                  stackOut_104_0 = this;
                                  stackOut_104_1 = stackIn_104_1;
                                  stackOut_104_2 = -1 + ((nk) this).field_O;
                                  stackIn_106_0 = stackOut_104_0;
                                  stackIn_106_1 = stackOut_104_1;
                                  stackIn_106_2 = stackOut_104_2;
                                  break L2;
                                }
                              }
                              this.a(stackIn_106_1, stackIn_106_2);
                              return true;
                            }
                          } else {
                            if ((param1 ^ -1) == -98) {
                              if (((nk) this).field_O >= ((nk) this).field_q.length()) {
                                break L1;
                              } else {
                                L3: {
                                  stackOut_98_0 = this;
                                  stackOut_98_1 = -31523;
                                  stackIn_100_0 = stackOut_98_0;
                                  stackIn_100_1 = stackOut_98_1;
                                  stackIn_99_0 = stackOut_98_0;
                                  stackIn_99_1 = stackOut_98_1;
                                  if (!lk.field_g[82]) {
                                    stackOut_100_0 = this;
                                    stackOut_100_1 = stackIn_100_1;
                                    stackOut_100_2 = 1 + ((nk) this).field_O;
                                    stackIn_101_0 = stackOut_100_0;
                                    stackIn_101_1 = stackOut_100_1;
                                    stackIn_101_2 = stackOut_100_2;
                                    break L3;
                                  } else {
                                    stackOut_99_0 = this;
                                    stackOut_99_1 = stackIn_99_1;
                                    stackOut_99_2 = this.e((byte) -88);
                                    stackIn_101_0 = stackOut_99_0;
                                    stackIn_101_1 = stackOut_99_1;
                                    stackIn_101_2 = stackOut_99_2;
                                    break L3;
                                  }
                                }
                                this.a(stackIn_101_1, stackIn_101_2);
                                return true;
                              }
                            } else {
                              if ((param1 ^ -1) != -103) {
                                if (103 != param1) {
                                  if (84 != param1) {
                                    if (!lk.field_g[82]) {
                                      if (!lk.field_g[82]) {
                                        if (!lk.field_g[82]) {
                                          break L1;
                                        } else {
                                          if (67 != param1) {
                                            break L1;
                                          } else {
                                            this.b(true);
                                            return true;
                                          }
                                        }
                                      } else {
                                        if (-67 == (param1 ^ -1)) {
                                          this.j(-73);
                                          return true;
                                        } else {
                                          if (lk.field_g[82]) {
                                            if (67 == param1) {
                                              this.b(true);
                                              return true;
                                            } else {
                                              return false;
                                            }
                                          } else {
                                            return false;
                                          }
                                        }
                                      }
                                    } else {
                                      if (param1 != -66) {
                                        L4: {
                                          if (!lk.field_g[82]) {
                                            break L4;
                                          } else {
                                            if (-67 != param1) {
                                              break L4;
                                            } else {
                                              this.j(-73);
                                              return true;
                                            }
                                          }
                                        }
                                        if (lk.field_g[82]) {
                                          if (67 != param1) {
                                            return false;
                                          } else {
                                            this.b(true);
                                            return true;
                                          }
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        this.m(103);
                                        return true;
                                      }
                                    }
                                  } else {
                                    this.l(93);
                                    return true;
                                  }
                                } else {
                                  this.a(-31523, ((nk) this).field_q.length());
                                  return true;
                                }
                              } else {
                                this.a(-31523, 0);
                                return true;
                              }
                            }
                          }
                        } else {
                          ((nk) this).o(1);
                          return true;
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (param3 <= 126) {
                    L5: {
                      if (((nk) this).field_L == ((nk) this).field_O) {
                        break L5;
                      } else {
                        this.a(false);
                        break L5;
                      }
                    }
                    if (0 == (((nk) this).field_N ^ -1)) {
                      if (((nk) this).field_O < ((nk) this).field_q.length()) {
                        ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_O) + param3 + ((nk) this).field_q.substring(((nk) this).field_O, ((nk) this).field_q.length());
                        ((nk) this).field_O = ((nk) this).field_O + 1;
                        ((nk) this).field_L = ((nk) this).field_O;
                        ((nk) this).f((byte) 126);
                        return true;
                      } else {
                        ((nk) this).field_q = ((nk) this).field_q + param3;
                        ((nk) this).field_O = ((nk) this).field_q.length();
                        ((nk) this).field_L = ((nk) this).field_q.length();
                        ((nk) this).f((byte) 126);
                        return true;
                      }
                    } else {
                      if (((nk) this).field_q.length() >= ((nk) this).field_N) {
                        return true;
                      } else {
                        L6: {
                          if (((nk) this).field_O < ((nk) this).field_q.length()) {
                            ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_O) + param3 + ((nk) this).field_q.substring(((nk) this).field_O, ((nk) this).field_q.length());
                            ((nk) this).field_O = ((nk) this).field_O + 1;
                            ((nk) this).field_L = ((nk) this).field_O;
                            ((nk) this).f((byte) 126);
                            break L6;
                          } else {
                            ((nk) this).field_q = ((nk) this).field_q + param3;
                            ((nk) this).field_O = ((nk) this).field_q.length();
                            ((nk) this).field_L = ((nk) this).field_q.length();
                            ((nk) this).f((byte) 126);
                            break L6;
                          }
                        }
                        return true;
                      }
                    }
                  } else {
                    if (param1 == 85) {
                      if (((nk) this).field_L == ((nk) this).field_O) {
                        if ((((nk) this).field_O ^ -1) >= -1) {
                          return false;
                        } else {
                          ((nk) this).field_L = -1 + ((nk) this).field_O;
                          this.a(false);
                          return true;
                        }
                      } else {
                        this.a(false);
                        return true;
                      }
                    } else {
                      if (param1 == 101) {
                        if (((nk) this).field_L == ((nk) this).field_O) {
                          if (((nk) this).field_O >= ((nk) this).field_q.length()) {
                            return false;
                          } else {
                            ((nk) this).field_L = 1 + ((nk) this).field_O;
                            this.a(false);
                            return true;
                          }
                        } else {
                          this.a(false);
                          return true;
                        }
                      } else {
                        if (13 != param1) {
                          if (param1 == 96) {
                            if (0 < ((nk) this).field_O) {
                              L7: {
                                stackOut_43_0 = this;
                                stackOut_43_1 = -31523;
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                if (lk.field_g[82]) {
                                  stackOut_45_0 = this;
                                  stackOut_45_1 = stackIn_45_1;
                                  stackOut_45_2 = this.a((byte) -37);
                                  stackIn_46_0 = stackOut_45_0;
                                  stackIn_46_1 = stackOut_45_1;
                                  stackIn_46_2 = stackOut_45_2;
                                  break L7;
                                } else {
                                  stackOut_44_0 = this;
                                  stackOut_44_1 = stackIn_44_1;
                                  stackOut_44_2 = -1 + ((nk) this).field_O;
                                  stackIn_46_0 = stackOut_44_0;
                                  stackIn_46_1 = stackOut_44_1;
                                  stackIn_46_2 = stackOut_44_2;
                                  break L7;
                                }
                              }
                              this.a(stackIn_46_1, stackIn_46_2);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            if ((param1 ^ -1) == -98) {
                              if (((nk) this).field_O < ((nk) this).field_q.length()) {
                                L8: {
                                  stackOut_36_0 = this;
                                  stackOut_36_1 = -31523;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (!lk.field_g[82]) {
                                    stackOut_38_0 = this;
                                    stackOut_38_1 = stackIn_38_1;
                                    stackOut_38_2 = 1 + ((nk) this).field_O;
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    stackIn_39_2 = stackOut_38_2;
                                    break L8;
                                  } else {
                                    stackOut_37_0 = this;
                                    stackOut_37_1 = stackIn_37_1;
                                    stackOut_37_2 = this.e((byte) -88);
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_39_1 = stackOut_37_1;
                                    stackIn_39_2 = stackOut_37_2;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_39_1, stackIn_39_2);
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              if ((param1 ^ -1) != -103) {
                                if (103 != param1) {
                                  if (84 != param1) {
                                    L9: {
                                      if (!lk.field_g[82]) {
                                        break L9;
                                      } else {
                                        if (param1 != -66) {
                                          break L9;
                                        } else {
                                          this.m(103);
                                          return true;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!lk.field_g[82]) {
                                        break L10;
                                      } else {
                                        if (-67 != param1) {
                                          break L10;
                                        } else {
                                          this.j(-73);
                                          return true;
                                        }
                                      }
                                    }
                                    if (lk.field_g[82]) {
                                      if (67 == param1) {
                                        this.b(true);
                                        return true;
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    this.l(93);
                                    return true;
                                  }
                                } else {
                                  this.a(-31523, ((nk) this).field_q.length());
                                  return true;
                                }
                              } else {
                                this.a(-31523, 0);
                                return true;
                              }
                            }
                          }
                        } else {
                          ((nk) this).o(1);
                          return true;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    private final void j(int param0) {
        try {
            String var2 = null;
            var2 = this.g((byte) -126);
            if (param0 <= -37) {
              if (var2.length() > 0) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              ((nk) this).field_I = false;
              if (var2.length() <= 0) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int var4 = 0;
        L0: {
          if (param1 == null) {
            param1 = "";
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 == 1471) {
          L1: {
            ((nk) this).field_q = param1;
            var4 = param1.length();
            if (((nk) this).field_N == -1) {
              break L1;
            } else {
              if (((nk) this).field_N >= var4) {
                break L1;
              } else {
                ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_N);
                ((nk) this).field_L = ((nk) this).field_q.length();
                ((nk) this).field_O = ((nk) this).field_q.length();
                if (!param0) {
                  ((nk) this).f((byte) 19);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          ((nk) this).field_L = ((nk) this).field_q.length();
          ((nk) this).field_O = ((nk) this).field_q.length();
          if (!param0) {
            ((nk) this).f((byte) 19);
            return;
          } else {
            return;
          }
        } else {
          ((nk) this).o(114);
          ((nk) this).field_q = param1;
          var4 = param1.length();
          if (((nk) this).field_N != -1) {
            if (((nk) this).field_N < var4) {
              ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_N);
              ((nk) this).field_L = ((nk) this).field_q.length();
              ((nk) this).field_O = ((nk) this).field_q.length();
              if (!param0) {
                ((nk) this).f((byte) 19);
                return;
              } else {
                return;
              }
            } else {
              ((nk) this).field_L = ((nk) this).field_q.length();
              ((nk) this).field_O = ((nk) this).field_q.length();
              if (!param0) {
                ((nk) this).f((byte) 19);
                return;
              } else {
                return;
              }
            }
          } else {
            ((nk) this).field_L = ((nk) this).field_q.length();
            ((nk) this).field_O = ((nk) this).field_q.length();
            if (!param0) {
              ((nk) this).f((byte) 19);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void o(int param0) {
        ((nk) this).field_O = 0;
        ((nk) this).field_q = "";
        ((nk) this).field_L = 0;
        ((nk) this).f((byte) 105);
        if (param0 != 1) {
            this.b(true);
        }
    }

    public static void n(int param0) {
        field_M = null;
        field_J = null;
        if (param0 != 3875) {
            return;
        }
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Create a free account to";
    }
}
