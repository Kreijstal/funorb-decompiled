/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hf extends hl {
    private int field_F;
    private long field_M;
    static int field_I;
    private int field_N;
    private int field_L;
    private long field_O;
    private int field_K;
    static qk field_H;
    private boolean field_J;
    private boolean field_G;

    void k(int param0) {
        if (param0 != 64) {
            this.b(true);
        }
        if (!(!(((hf) this).field_k instanceof pi))) {
            ((pi) (Object) ((hf) this).field_k).a((hf) this, 12891);
        }
    }

    private final void b(boolean param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                  this.f((byte) -56);
                  this.a(var2, (byte) 127);
                  if (!param0) {
                    break L1;
                  } else {
                    this.b(true);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int[] param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        var15 = Main.field_T;
        var11 = -param1;
        L0: while (true) {
          if (0 <= var11) {
            L1: {
              if (param10 >= 124) {
                break L1;
              } else {
                var16 = null;
                String discarded$123 = hf.a((CharSequence) null, (byte) 65);
                break L1;
              }
            }
            return;
          } else {
            var12 = -param8;
            L2: while (true) {
              if (-1 >= (var12 ^ -1)) {
                param6 = param6 + param7;
                param5 = param5 + param0;
                var11++;
                continue L0;
              } else {
                int incrementValue$124 = param5;
                param5++;
                param3 = param4[incrementValue$124] & 255;
                if (param3 == 0) {
                  param6++;
                  var12++;
                  continue L2;
                } else {
                  var13 = param9[param6];
                  var14 = 256 + -param3;
                  int incrementValue$125 = param6;
                  param6++;
                  param9[incrementValue$125] = bc.a(-16711936, bc.a(param2, 16711935) * param3 - -(bc.a(16711935, var13) * var14)) - -bc.a(var14 * bc.a(var13, 65280) + param3 * bc.a(param2, 65280), 16711680) >> -1261866520;
                  var12++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (!(((hf) this).field_K == -1)) {
            var3 = ((hf) this).field_K + -((hf) this).field_r.length();
            if (0 <= var3) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((hf) this).field_N != ((hf) this).field_r.length()) {
            ((hf) this).field_r = ((hf) this).field_r.substring(0, ((hf) this).field_N) + param0 + ((hf) this).field_r.substring(((hf) this).field_N, ((hf) this).field_r.length());
        } else {
            ((hf) this).field_r = ((hf) this).field_r + param0;
        }
        ((hf) this).field_N = ((hf) this).field_N + param0.length();
        if (param1 != 127) {
            return;
        }
        ((hf) this).field_F = ((hf) this).field_N;
        ((hf) this).k(param1 ^ 63);
    }

    final void n(int param0) {
        ((hf) this).field_N = 0;
        int var2 = -99 / ((-22 - param0) / 40);
        ((hf) this).field_F = 0;
        ((hf) this).field_r = "";
        ((hf) this).k(64);
    }

    hf(String param0, pl param1, int param2) {
        super(param0, param1);
        ((hf) this).field_O = 0L;
        ((hf) this).field_L = -1;
        ((hf) this).field_G = false;
        ((hf) this).field_v = pj.field_a.field_r;
        ((hf) this).field_K = param2;
        ((hf) this).a(param0, -18845, true);
        ((hf) this).field_J = true;
        ((hf) this).field_M = id.a(39);
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (param3 >= -14) {
            Object var10 = null;
            boolean discarded$0 = ((hf) this).a('k', (byte) 63, -72, (lk) null);
        }
        if (super.a(param0, param1, param2, -83, param4, param5, param6)) {
            if (!(((hf) this).field_v instanceof ne)) {
                return false;
            }
            var8_int = ((ne) (Object) ((hf) this).field_v).a(eg.field_b, param1, -10989, param0, (lk) this, ij.field_e);
            this.a(-1 != var8_int ? var8_int : 0, 72);
            var8 = id.a(117);
            ((hf) this).field_G = 250L > var8 - ((hf) this).field_O ? true : false;
            if (((hf) this).field_G) {
                ((hf) this).field_F = this.m(-1);
                ((hf) this).field_N = this.j(-98);
                if (0 < ((hf) this).field_N) {
                    if (((hf) this).field_r.charAt(((hf) this).field_N - 1) == 32) {
                        ((hf) this).field_N = ((hf) this).field_N - 1;
                    }
                }
                ((hf) this).field_L = ((hf) this).field_N;
            }
            ((hf) this).field_O = var8;
            return true;
        }
        return false;
    }

    final void a(String param0, int param1, boolean param2) {
        if (!(param0 != null)) {
            param0 = "";
        }
        ((hf) this).field_r = param0;
        int var4 = param0.length();
        if (param1 != -18845) {
            ((hf) this).field_L = -96;
        }
        if ((((hf) this).field_K ^ -1) != 0) {
            if (!(var4 <= ((hf) this).field_K)) {
                ((hf) this).field_r = ((hf) this).field_r.substring(0, ((hf) this).field_K);
            }
        }
        int dupTemp$0 = ((hf) this).field_r.length();
        ((hf) this).field_F = dupTemp$0;
        ((hf) this).field_N = dupTemp$0;
        if (!(param2)) {
            ((hf) this).k(64);
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ((hf) this).field_M = id.a(93);
        if (param0 == 60) {
          return false;
        } else {
          if (param0 != 62) {
            L0: {
              if (param0 < 32) {
                break L0;
              } else {
                if (param0 <= 126) {
                  L1: {
                    if ((((hf) this).field_N ^ -1) == (((hf) this).field_F ^ -1)) {
                      break L1;
                    } else {
                      this.f((byte) -56);
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (-1 == ((hf) this).field_K) {
                        break L3;
                      } else {
                        if (((hf) this).field_r.length() >= ((hf) this).field_K) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if ((((hf) this).field_N ^ -1) > (((hf) this).field_r.length() ^ -1)) {
                        ((hf) this).field_r = ((hf) this).field_r.substring(0, ((hf) this).field_N) + param0 + ((hf) this).field_r.substring(((hf) this).field_N, ((hf) this).field_r.length());
                        ((hf) this).field_N = ((hf) this).field_N + 1;
                        ((hf) this).field_F = ((hf) this).field_N;
                        break L4;
                      } else {
                        ((hf) this).field_r = ((hf) this).field_r + param0;
                        int dupTemp$1 = ((hf) this).field_r.length();
                        ((hf) this).field_N = dupTemp$1;
                        ((hf) this).field_F = dupTemp$1;
                        break L4;
                      }
                    }
                    ((hf) this).k(64);
                    break L2;
                  }
                  return true;
                } else {
                  break L0;
                }
              }
            }
            L5: {
              if (-86 == (param2 ^ -1)) {
                if (((hf) this).field_N == ((hf) this).field_F) {
                  if (-1 <= (((hf) this).field_N ^ -1)) {
                    break L5;
                  } else {
                    ((hf) this).field_F = -1 + ((hf) this).field_N;
                    this.f((byte) -56);
                    return true;
                  }
                } else {
                  this.f((byte) -56);
                  return true;
                }
              } else {
                if (param2 == 101) {
                  if (((hf) this).field_F == ((hf) this).field_N) {
                    if (((hf) this).field_N >= ((hf) this).field_r.length()) {
                      break L5;
                    } else {
                      ((hf) this).field_F = 1 + ((hf) this).field_N;
                      this.f((byte) -56);
                      return true;
                    }
                  } else {
                    this.f((byte) -56);
                    return true;
                  }
                } else {
                  if ((param2 ^ -1) != -14) {
                    if (-97 != (param2 ^ -1)) {
                      if (-98 == (param2 ^ -1)) {
                        if ((((hf) this).field_N ^ -1) <= (((hf) this).field_r.length() ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            stackOut_35_0 = this;
                            stackIn_37_0 = stackOut_35_0;
                            stackIn_36_0 = stackOut_35_0;
                            if (ge.field_c[82]) {
                              stackOut_37_0 = this;
                              stackOut_37_1 = this.j(-117);
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              break L6;
                            } else {
                              stackOut_36_0 = this;
                              stackOut_36_1 = 1 + ((hf) this).field_N;
                              stackIn_38_0 = stackOut_36_0;
                              stackIn_38_1 = stackOut_36_1;
                              break L6;
                            }
                          }
                          this.a(stackIn_38_1, 80);
                          return true;
                        }
                      } else {
                        if (param2 != 102) {
                          if (-104 == (param2 ^ -1)) {
                            this.a(((hf) this).field_r.length(), 72);
                            return true;
                          } else {
                            if ((param2 ^ -1) == -85) {
                              this.i(17091);
                              return true;
                            } else {
                              L7: {
                                if (!ge.field_c[82]) {
                                  break L7;
                                } else {
                                  if (-66 == (param2 ^ -1)) {
                                    this.l(11514);
                                    return true;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (!ge.field_c[82]) {
                                  break L8;
                                } else {
                                  if ((param2 ^ -1) != -67) {
                                    break L8;
                                  } else {
                                    this.a(true);
                                    return true;
                                  }
                                }
                              }
                              if (!ge.field_c[82]) {
                                break L5;
                              } else {
                                if (param2 != 67) {
                                  break L5;
                                } else {
                                  this.b(false);
                                  return true;
                                }
                              }
                            }
                          }
                        } else {
                          this.a(0, 104);
                          return true;
                        }
                      }
                    } else {
                      if (-1 <= (((hf) this).field_N ^ -1)) {
                        break L5;
                      } else {
                        L9: {
                          stackOut_13_0 = this;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (ge.field_c[82]) {
                            stackOut_15_0 = this;
                            stackOut_15_1 = this.m(-1);
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L9;
                          } else {
                            stackOut_14_0 = this;
                            stackOut_14_1 = -1 + ((hf) this).field_N;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            break L9;
                          }
                        }
                        this.a(stackIn_16_1, 104);
                        return true;
                      }
                    }
                  } else {
                    ((hf) this).n(121);
                    return true;
                  }
                }
              }
            }
            L10: {
              if (param1 < -99) {
                break L10;
              } else {
                ((hf) this).field_O = 77L;
                break L10;
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    private final void a(int param0, int param1) {
        ((hf) this).field_N = param0;
        if (!ge.field_c[81]) {
            ((hf) this).field_F = ((hf) this).field_N;
        }
        if (param1 <= 68) {
            this.a(-21, -53);
        }
    }

    private final void a(boolean param0) {
        String var2 = this.h(121);
        if (!param0) {
            ((hf) this).a(93, -60, 36, -119);
        }
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h(88)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, lk param2, int param3) {
        ne var7 = null;
        int var6 = 0;
        if (param3 != 3) {
            ((hf) this).field_L = -18;
        }
        super.a(param0, param1, param2, param3 + 0);
        this.e((byte) -120);
        if (!((((hf) this).field_x ^ -1) != -2)) {
            if (!(!(((hf) this).field_v instanceof ne))) {
                var7 = (ne) (Object) ((hf) this).field_v;
                var6 = var7.a(eg.field_b, param0, -10989, param1, (lk) this, ij.field_e);
                if (-1 != var6) {
                    if (((hf) this).field_G) {
                        if (((hf) this).field_L > var6) {
                            if (((hf) this).field_F < var6) {
                                var6 = ((hf) this).field_L;
                            }
                        }
                    }
                    ((hf) this).field_N = var6;
                }
            }
            ((hf) this).field_M = id.a(57);
        }
    }

    final static String a(CharSequence param0, byte param1) {
        if (param1 != 36) {
            return null;
        }
        return ha.a(param0, param1 ^ -30737, false);
    }

    private final int m(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Main.field_T;
        if (-1 != (((hf) this).field_N ^ -1)) {
          var2 = ((hf) this).field_N + param0;
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (((hf) this).field_r.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        } else {
          return ((hf) this).field_N;
        }
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        if (param0 < -96) {
          var2 = ((hf) this).field_r.length();
          if (var2 == ((hf) this).field_N) {
            return ((hf) this).field_N;
          } else {
            var3 = ((hf) this).field_N + 1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (((hf) this).field_r.charAt(var3 + -1) == 32) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          }
        } else {
          return -15;
        }
    }

    private final String h(int param0) {
        int var2 = -69 / ((param0 - 13) / 38);
        int var3 = ((hf) this).field_F >= ((hf) this).field_N ? ((hf) this).field_N : ((hf) this).field_F;
        int var4 = ((hf) this).field_F < ((hf) this).field_N ? ((hf) this).field_N : ((hf) this).field_F;
        return ((hf) this).field_r.substring(var3, var4);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ne var8 = null;
        long var6 = 0L;
        if (null != ((hf) this).field_v) {
            if (!(0 != param3)) {
                ((hf) this).field_v.a(param0, (lk) this, 11447, param1, ((hf) this).field_B);
                if (!(!(((hf) this).field_v instanceof ne))) {
                    var8 = (ne) (Object) ((hf) this).field_v;
                    if (!(((hf) this).field_F == ((hf) this).field_N)) {
                        var8.a((lk) this, (byte) 67, param1, param0, ((hf) this).field_N, ((hf) this).field_F);
                    }
                    var6 = id.a(62);
                    if (((-((hf) this).field_M + var6) % 1000L ^ -1L) > -501L) {
                        var8.a(param0, ((hf) this).field_N, param1, (byte) 55, (lk) this);
                    }
                }
            }
        }
        if (param2 != -1) {
            field_I = 9;
        }
    }

    private final void e(byte param0) {
        mj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        var8 = Main.field_T;
        if (((hf) this).field_J) {
          if (!(((hf) this).field_v instanceof ne)) {
            return;
          } else {
            if (param0 <= -74) {
              var9 = (ne) (Object) ((hf) this).field_v;
              var3 = var9.a((byte) -96, (lk) this);
              var4 = var3.b((byte) -5);
              var5 = var9.a((lk) this, 0);
              var6 = var9.a(-1) >> -573259903;
              if (var5 - var6 <= var4) {
                L0: {
                  var7 = ((hf) this).field_l + var3.a(true, ((hf) this).field_N);
                  if (var7 > var5 + -var6) {
                    ((hf) this).field_l = -var7 + (-var6 + var5) + ((hf) this).field_l;
                    break L0;
                  } else {
                    if (var7 >= var6) {
                      break L0;
                    } else {
                      ((hf) this).field_l = var6 + -var7 + ((hf) this).field_l;
                      break L0;
                    }
                  }
                }
                L1: {
                  if (-1 <= (((hf) this).field_l ^ -1)) {
                    if (-var5 - -var6 <= ((hf) this).field_l) {
                      break L1;
                    } else {
                      ((hf) this).field_l = var6 + -var5;
                      break L1;
                    }
                  } else {
                    ((hf) this).field_l = 0;
                    break L1;
                  }
                }
                return;
              } else {
                ((hf) this).field_l = 0;
                ((hf) this).field_m = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ((hf) this).field_m = 0;
          ((hf) this).field_l = 0;
          return;
        }
    }

    private final void i(int param0) {
        if (param0 != 17091) {
            return;
        }
        if (((hf) this).field_k instanceof pi) {
            ((pi) (Object) ((hf) this).field_k).a(-1, (hf) this);
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -56) {
            ((hf) this).field_O = 28L;
        }
        if (((hf) this).field_F != ((hf) this).field_N) {
            var2 = ((hf) this).field_F < ((hf) this).field_N ? ((hf) this).field_F : ((hf) this).field_N;
            var3 = ((hf) this).field_N > ((hf) this).field_F ? ((hf) this).field_N : ((hf) this).field_F;
            ((hf) this).field_F = var2;
            ((hf) this).field_N = var2;
            ((hf) this).field_r = ((hf) this).field_r.substring(0, var2) + ((hf) this).field_r.substring(var3, ((hf) this).field_r.length());
            ((hf) this).k(param0 ^ -120);
        }
    }

    private final void l(int param0) {
        if (param0 != 11514) {
            return;
        }
        this.a(true);
        this.f((byte) -56);
    }

    public static void o(int param0) {
        field_H = null;
        if (param0 != -31141) {
            Object var2 = null;
            String discarded$0 = hf.a((CharSequence) null, (byte) 102);
        }
    }

    static {
    }
}
