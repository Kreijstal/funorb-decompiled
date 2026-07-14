/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends lj {
    private int field_E;
    static int[] field_D;
    private boolean field_A;
    static int[] field_B;
    private int field_H;
    static oe[] field_L;
    private boolean field_J;
    static String field_I;
    private long field_K;
    private int field_F;
    private int field_M;
    private long field_C;

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((rg) this).field_F == ((rg) this).field_H) {
            break L0;
          } else {
            L1: {
              if (((rg) this).field_F >= ((rg) this).field_H) {
                stackOut_3_0 = ((rg) this).field_H;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((rg) this).field_F;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (((rg) this).field_F < ((rg) this).field_H) {
                stackOut_6_0 = ((rg) this).field_H;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((rg) this).field_F;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            ((rg) this).field_H = var2;
            ((rg) this).field_F = var2;
            ((rg) this).field_k = ((rg) this).field_k.substring(0, var2) + ((rg) this).field_k.substring(var3, ((rg) this).field_k.length());
            ((rg) this).e((byte) 71);
            break L0;
          }
        }
        if (param0 != 1) {
          ((rg) this).i(-74);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        m var8 = null;
        if (null != ((rg) this).field_q) {
          if (param2 == 0) {
            ((rg) this).field_q.a(param0, param1, ((rg) this).field_t, (byte) 107, (qg) this);
            if (((rg) this).field_q instanceof m) {
              var8 = (m) (Object) ((rg) this).field_q;
              if (((rg) this).field_H == ((rg) this).field_F) {
                var6 = lk.a(0);
                if (-501L >= ((-((rg) this).field_C + var6) % 1000L ^ -1L)) {
                  var5 = 55 % ((77 - param3) / 34);
                  return;
                } else {
                  var8.a(param0, ((rg) this).field_H, param1, (qg) this, true);
                  var5 = 55 % ((77 - param3) / 34);
                  return;
                }
              } else {
                L0: {
                  var8.a((qg) this, param1, param0, ((rg) this).field_F, (byte) -49, ((rg) this).field_H);
                  var6 = lk.a(0);
                  if (-501L < ((-((rg) this).field_C + var6) % 1000L ^ -1L)) {
                    var8.a(param0, ((rg) this).field_H, param1, (qg) this, true);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var5 = 55 % ((77 - param3) / 34);
                return;
              }
            } else {
              var5 = 55 % ((77 - param3) / 34);
              return;
            }
          } else {
            var5 = 55 % ((77 - param3) / 34);
            return;
          }
        } else {
          var5 = 55 % ((77 - param3) / 34);
          return;
        }
    }

    private final int m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = ((rg) this).field_k.length();
        if (var2 != ((rg) this).field_H) {
          if (param0 == -7638) {
            var3 = ((rg) this).field_H - -1;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (((rg) this).field_k.charAt(var3 - 1) ^ -1)) {
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
            ((rg) this).field_H = -53;
            var3 = ((rg) this).field_H - -1;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != ((rg) this).field_k.charAt(var3 - 1)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          return ((rg) this).field_H;
        }
    }

    private final void k(int param0) {
        this.d(false);
        this.o(1);
        if (param0 < 53) {
            ((rg) this).i(-12);
        }
    }

    private final void a(int param0, boolean param1) {
        if (param1) {
          L0: {
            ((rg) this).e((byte) -89);
            ((rg) this).field_H = param0;
            if (!ve.field_B[81]) {
              ((rg) this).field_F = ((rg) this).field_H;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((rg) this).field_H = param0;
            if (!ve.field_B[81]) {
              ((rg) this).field_F = ((rg) this).field_H;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(String param0, boolean param1, int param2) {
        int var4 = 0;
        L0: {
          if (param0 == null) {
            param0 = "";
            break L0;
          } else {
            break L0;
          }
        }
        ((rg) this).field_k = param0;
        var4 = param0.length();
        if ((((rg) this).field_E ^ -1) != 0) {
          if (var4 > ((rg) this).field_E) {
            L1: {
              ((rg) this).field_k = ((rg) this).field_k.substring(0, ((rg) this).field_E);
              ((rg) this).field_F = ((rg) this).field_k.length();
              ((rg) this).field_H = ((rg) this).field_k.length();
              if (!param1) {
                ((rg) this).e((byte) 108);
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 != 1) {
              ((rg) this).field_M = -100;
              return;
            } else {
              return;
            }
          } else {
            L2: {
              ((rg) this).field_F = ((rg) this).field_k.length();
              ((rg) this).field_H = ((rg) this).field_k.length();
              if (!param1) {
                ((rg) this).e((byte) 108);
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 != 1) {
              ((rg) this).field_M = -100;
              return;
            } else {
              return;
            }
          }
        } else {
          L3: {
            ((rg) this).field_F = ((rg) this).field_k.length();
            ((rg) this).field_H = ((rg) this).field_k.length();
            if (!param1) {
              ((rg) this).e((byte) 108);
              break L3;
            } else {
              break L3;
            }
          }
          if (param2 != 1) {
            ((rg) this).field_M = -100;
            return;
          } else {
            return;
          }
        }
    }

    private final void h(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 > 107) {
                  break L0;
                } else {
                  this.j(33);
                  break L0;
                }
              }
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.o(1);
              this.a(true, var2_ref);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, String param1) {
        int var3 = 0;
        L0: {
          if (((rg) this).field_E == 0) {
            break L0;
          } else {
            var3 = ((rg) this).field_E + -((rg) this).field_k.length();
            if (-1 > var3) {
              param1 = param1.substring(0, var3);
              break L0;
            } else {
              return;
            }
          }
        }
        if (((rg) this).field_H == ((rg) this).field_k.length()) {
          ((rg) this).field_k = ((rg) this).field_k + param1;
          if (!param0) {
            return;
          } else {
            ((rg) this).field_H = ((rg) this).field_H + param1.length();
            ((rg) this).field_F = ((rg) this).field_H;
            ((rg) this).e((byte) 50);
            return;
          }
        } else {
          ((rg) this).field_k = ((rg) this).field_k.substring(0, ((rg) this).field_H) + param1 + ((rg) this).field_k.substring(((rg) this).field_H, ((rg) this).field_k.length());
          if (!param0) {
            return;
          } else {
            ((rg) this).field_H = ((rg) this).field_H + param1.length();
            ((rg) this).field_F = ((rg) this).field_H;
            ((rg) this).e((byte) 50);
            return;
          }
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 < -30) {
          if (0 == ((rg) this).field_H) {
            return ((rg) this).field_H;
          } else {
            var2 = -1 + ((rg) this).field_H;
            L0: while (true) {
              if (0 < var2) {
                if (((rg) this).field_k.charAt(var2 + -1) != 32) {
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
        } else {
          var4 = null;
          ((rg) this).a((String) null, true, 10);
          if (0 == ((rg) this).field_H) {
            return ((rg) this).field_H;
          } else {
            var2 = -1 + ((rg) this).field_H;
            L1: while (true) {
              if (0 < var2) {
                if (((rg) this).field_k.charAt(var2 + -1) != 32) {
                  var2--;
                  continue L1;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        }
    }

    public static void g(byte param0) {
        if (param0 >= -40) {
          field_L = null;
          field_I = null;
          field_B = null;
          field_D = null;
          field_L = null;
          return;
        } else {
          field_I = null;
          field_B = null;
          field_D = null;
          field_L = null;
          return;
        }
    }

    rg(String param0, ma param1, int param2) {
        super(param0, param1);
        ((rg) this).field_K = 0L;
        ((rg) this).field_M = -1;
        ((rg) this).field_A = false;
        ((rg) this).field_E = param2;
        ((rg) this).field_q = vi.field_e.field_f;
        ((rg) this).a(param0, true, 1);
        ((rg) this).field_J = true;
        ((rg) this).field_C = lk.a(0);
    }

    final void i(int param0) {
        ((rg) this).field_H = 0;
        if (param0 != 81) {
            return;
        }
        ((rg) this).field_k = "";
        ((rg) this).field_F = 0;
        ((rg) this).e((byte) 107);
    }

    private final String f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= 7) {
          return null;
        } else {
          L0: {
            if (((rg) this).field_F >= ((rg) this).field_H) {
              stackOut_3_0 = ((rg) this).field_H;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((rg) this).field_F;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (((rg) this).field_H <= ((rg) this).field_F) {
              stackOut_6_0 = ((rg) this).field_F;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((rg) this).field_H;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((rg) this).field_k.substring(var2, var3);
        }
    }

    private final void h(int param0) {
        ue var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        m var9 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (!((rg) this).field_J) {
          ((rg) this).field_o = 0;
          ((rg) this).field_r = 0;
          return;
        } else {
          if (!(((rg) this).field_q instanceof m)) {
            return;
          } else {
            var9 = (m) (Object) ((rg) this).field_q;
            var3 = var9.a((qg) this, -2);
            var4 = var3.b((byte) 3);
            var5 = var9.b(param0, (qg) this);
            var6 = var9.a(true) >> 88541697;
            if (var4 < var5 + -var6) {
              ((rg) this).field_o = 0;
              ((rg) this).field_r = 0;
              return;
            } else {
              var7 = ((rg) this).field_r + var3.c(0, ((rg) this).field_H);
              if (var7 > var5 - var6) {
                ((rg) this).field_r = ((rg) this).field_r + -var6 - (-var5 - -var7);
                if (((rg) this).field_r <= 0) {
                  if (((rg) this).field_r >= -var5 + var6) {
                    return;
                  } else {
                    ((rg) this).field_r = var6 + -var5;
                    return;
                  }
                } else {
                  ((rg) this).field_r = 0;
                  return;
                }
              } else {
                if (var6 <= var7) {
                  if (((rg) this).field_r <= 0) {
                    if (((rg) this).field_r < -var5 + var6) {
                      ((rg) this).field_r = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((rg) this).field_r = 0;
                    return;
                  }
                } else {
                  ((rg) this).field_r = ((rg) this).field_r - var7 - -var6;
                  if (((rg) this).field_r <= 0) {
                    if (((rg) this).field_r >= -var5 + var6) {
                      return;
                    } else {
                      ((rg) this).field_r = var6 + -var5;
                      return;
                    }
                  } else {
                    ((rg) this).field_r = 0;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (super.b(param0, param1, param2, param3, param4, param5, param6)) {
          if (((rg) this).field_q instanceof m) {
            L0: {
              var8_int = ((m) (Object) ((rg) this).field_q).a(param6, (byte) -50, bk.field_a, param3, oa.field_j, (qg) this);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 == (var8_int ^ -1)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = var8_int;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_7_1, false);
              var8 = lk.a(param4 + 30386);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if ((-((rg) this).field_K + var8 ^ -1L) <= -251L) {
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
            ((rg) this).field_A = stackIn_10_1 != 0;
            if (((rg) this).field_A) {
              ((rg) this).field_F = this.l(-119);
              ((rg) this).field_H = this.m(-7638);
              if (0 < ((rg) this).field_H) {
                if (((rg) this).field_k.charAt(-1 + ((rg) this).field_H) == 32) {
                  ((rg) this).field_H = ((rg) this).field_H - 1;
                  ((rg) this).field_M = ((rg) this).field_H;
                  ((rg) this).field_K = var8;
                  return true;
                } else {
                  ((rg) this).field_M = ((rg) this).field_H;
                  ((rg) this).field_K = var8;
                  return true;
                }
              } else {
                ((rg) this).field_M = ((rg) this).field_H;
                ((rg) this).field_K = var8;
                return true;
              }
            } else {
              ((rg) this).field_K = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        m var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.h(0);
        if (((rg) this).field_s == 1) {
            if (((rg) this).field_q instanceof m) {
                var5 = (m) (Object) ((rg) this).field_q;
                var6 = var5.a(param0, (byte) -50, bk.field_a, param3, oa.field_j, (qg) this);
                if (0 != (var6 ^ -1)) {
                    if (((rg) this).field_A) {
                        if (var6 < ((rg) this).field_M) {
                            if (var6 > ((rg) this).field_F) {
                                var6 = ((rg) this).field_M;
                            }
                        }
                    }
                    ((rg) this).field_H = var6;
                }
            }
            ((rg) this).field_C = lk.a(0);
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_109_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        Object stackOut_108_0 = null;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ((rg) this).field_C = lk.a(0);
        if (60 != param3) {
          if (param3 != 62) {
            var5 = -98 / ((param2 - 65) / 55);
            if (param3 < 32) {
              L0: {
                if ((param0 ^ -1) == -86) {
                  if (((rg) this).field_F != ((rg) this).field_H) {
                    this.o(1);
                    return true;
                  } else {
                    if (-1 <= (((rg) this).field_H ^ -1)) {
                      break L0;
                    } else {
                      ((rg) this).field_F = -1 + ((rg) this).field_H;
                      this.o(1);
                      return true;
                    }
                  }
                } else {
                  if (param0 == 101) {
                    if (((rg) this).field_F != ((rg) this).field_H) {
                      this.o(1);
                      return true;
                    } else {
                      if (((rg) this).field_H >= ((rg) this).field_k.length()) {
                        break L0;
                      } else {
                        ((rg) this).field_F = ((rg) this).field_H + 1;
                        this.o(1);
                        return true;
                      }
                    }
                  } else {
                    if ((param0 ^ -1) != -14) {
                      if (param0 != -97) {
                        if (-98 == (param0 ^ -1)) {
                          if (((rg) this).field_H < ((rg) this).field_k.length()) {
                            L1: {
                              stackOut_108_0 = this;
                              stackIn_110_0 = stackOut_108_0;
                              stackIn_109_0 = stackOut_108_0;
                              if (ve.field_B[82]) {
                                stackOut_110_0 = this;
                                stackOut_110_1 = this.m(-7638);
                                stackIn_111_0 = stackOut_110_0;
                                stackIn_111_1 = stackOut_110_1;
                                break L1;
                              } else {
                                stackOut_109_0 = this;
                                stackOut_109_1 = 1 + ((rg) this).field_H;
                                stackIn_111_0 = stackOut_109_0;
                                stackIn_111_1 = stackOut_109_1;
                                break L1;
                              }
                            }
                            this.a(stackIn_111_1, false);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          if (param0 != 102) {
                            if (103 != param0) {
                              if (84 != param0) {
                                if (!ve.field_B[82]) {
                                  L2: {
                                    if (!ve.field_B[82]) {
                                      break L2;
                                    } else {
                                      if (-67 != (param0 ^ -1)) {
                                        break L2;
                                      } else {
                                        this.d(false);
                                        return true;
                                      }
                                    }
                                  }
                                  if (ve.field_B[82]) {
                                    if (param0 == 67) {
                                      this.h((byte) 115);
                                      return true;
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  if (65 != param0) {
                                    if (ve.field_B[82]) {
                                      if (-67 != (param0 ^ -1)) {
                                        if (ve.field_B[82]) {
                                          if (param0 == 67) {
                                            this.h((byte) 115);
                                            return true;
                                          } else {
                                            return false;
                                          }
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        this.d(false);
                                        return true;
                                      }
                                    } else {
                                      if (ve.field_B[82]) {
                                        if (param0 == 67) {
                                          this.h((byte) 115);
                                          return true;
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        return false;
                                      }
                                    }
                                  } else {
                                    this.k(62);
                                    return true;
                                  }
                                }
                              } else {
                                this.j(24349);
                                return true;
                              }
                            } else {
                              this.a(((rg) this).field_k.length(), false);
                              return true;
                            }
                          } else {
                            this.a(0, false);
                            return true;
                          }
                        }
                      } else {
                        if (-1 < ((rg) this).field_H) {
                          L3: {
                            stackOut_66_0 = this;
                            stackIn_68_0 = stackOut_66_0;
                            stackIn_67_0 = stackOut_66_0;
                            if (ve.field_B[82]) {
                              stackOut_68_0 = this;
                              stackOut_68_1 = this.l(-85);
                              stackIn_69_0 = stackOut_68_0;
                              stackIn_69_1 = stackOut_68_1;
                              break L3;
                            } else {
                              stackOut_67_0 = this;
                              stackOut_67_1 = ((rg) this).field_H + -1;
                              stackIn_69_0 = stackOut_67_0;
                              stackIn_69_1 = stackOut_67_1;
                              break L3;
                            }
                          }
                          this.a(stackIn_69_1, false);
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      ((rg) this).i(81);
                      return true;
                    }
                  }
                }
              }
              return false;
            } else {
              if (param3 <= 126) {
                L4: {
                  if (((rg) this).field_H != ((rg) this).field_F) {
                    this.o(1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((((rg) this).field_E ^ -1) == 0) {
                  if (((rg) this).field_H >= ((rg) this).field_k.length()) {
                    ((rg) this).field_k = ((rg) this).field_k + param3;
                    ((rg) this).field_H = ((rg) this).field_k.length();
                    ((rg) this).field_F = ((rg) this).field_k.length();
                    ((rg) this).e((byte) 53);
                    return true;
                  } else {
                    ((rg) this).field_k = ((rg) this).field_k.substring(0, ((rg) this).field_H) + param3 + ((rg) this).field_k.substring(((rg) this).field_H, ((rg) this).field_k.length());
                    ((rg) this).field_H = ((rg) this).field_H + 1;
                    ((rg) this).field_F = ((rg) this).field_H;
                    ((rg) this).e((byte) 53);
                    return true;
                  }
                } else {
                  if (((rg) this).field_k.length() >= ((rg) this).field_E) {
                    return true;
                  } else {
                    if (((rg) this).field_H >= ((rg) this).field_k.length()) {
                      ((rg) this).field_k = ((rg) this).field_k + param3;
                      ((rg) this).field_H = ((rg) this).field_k.length();
                      ((rg) this).field_F = ((rg) this).field_k.length();
                      ((rg) this).e((byte) 53);
                      return true;
                    } else {
                      ((rg) this).field_k = ((rg) this).field_k.substring(0, ((rg) this).field_H) + param3 + ((rg) this).field_k.substring(((rg) this).field_H, ((rg) this).field_k.length());
                      ((rg) this).field_H = ((rg) this).field_H + 1;
                      ((rg) this).field_F = ((rg) this).field_H;
                      ((rg) this).e((byte) 53);
                      return true;
                    }
                  }
                }
              } else {
                if ((param0 ^ -1) == -86) {
                  if (((rg) this).field_F == ((rg) this).field_H) {
                    if (-1 <= (((rg) this).field_H ^ -1)) {
                      return false;
                    } else {
                      ((rg) this).field_F = -1 + ((rg) this).field_H;
                      this.o(1);
                      return true;
                    }
                  } else {
                    this.o(1);
                    return true;
                  }
                } else {
                  if (param0 == 101) {
                    if (((rg) this).field_F == ((rg) this).field_H) {
                      if (((rg) this).field_H < ((rg) this).field_k.length()) {
                        ((rg) this).field_F = ((rg) this).field_H + 1;
                        this.o(1);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.o(1);
                      return true;
                    }
                  } else {
                    if ((param0 ^ -1) != -14) {
                      if (param0 != -97) {
                        L5: {
                          if (-98 == (param0 ^ -1)) {
                            if (((rg) this).field_H < ((rg) this).field_k.length()) {
                              L6: {
                                stackOut_41_0 = this;
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_42_0 = stackOut_41_0;
                                if (ve.field_B[82]) {
                                  stackOut_43_0 = this;
                                  stackOut_43_1 = this.m(-7638);
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  break L6;
                                } else {
                                  stackOut_42_0 = this;
                                  stackOut_42_1 = 1 + ((rg) this).field_H;
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_44_1 = stackOut_42_1;
                                  break L6;
                                }
                              }
                              this.a(stackIn_44_1, false);
                              return true;
                            } else {
                              break L5;
                            }
                          } else {
                            if (param0 != 102) {
                              if (103 != param0) {
                                if (84 != param0) {
                                  L7: {
                                    if (!ve.field_B[82]) {
                                      break L7;
                                    } else {
                                      if (65 != param0) {
                                        break L7;
                                      } else {
                                        this.k(62);
                                        return true;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (!ve.field_B[82]) {
                                      break L8;
                                    } else {
                                      if (-67 != (param0 ^ -1)) {
                                        break L8;
                                      } else {
                                        this.d(false);
                                        return true;
                                      }
                                    }
                                  }
                                  if (ve.field_B[82]) {
                                    if (param0 == 67) {
                                      this.h((byte) 115);
                                      return true;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  this.j(24349);
                                  return true;
                                }
                              } else {
                                this.a(((rg) this).field_k.length(), false);
                                return true;
                              }
                            } else {
                              this.a(0, false);
                              return true;
                            }
                          }
                        }
                        return false;
                      } else {
                        if (-1 < ((rg) this).field_H) {
                          L9: {
                            stackOut_14_0 = this;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (ve.field_B[82]) {
                              stackOut_16_0 = this;
                              stackOut_16_1 = this.l(-85);
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L9;
                            } else {
                              stackOut_15_0 = this;
                              stackOut_15_1 = ((rg) this).field_H + -1;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_17_1 = stackOut_15_1;
                              break L9;
                            }
                          }
                          this.a(stackIn_17_1, false);
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      ((rg) this).i(81);
                      return true;
                    }
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void e(byte param0) {
        L0: {
          if (((rg) this).field_m instanceof fb) {
            ((fb) (Object) ((rg) this).field_m).a((rg) this, -122);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 43) {
          int discarded$2 = this.l(-86);
          return;
        } else {
          return;
        }
    }

    final static void n(int param0) {
        ub.field_d = false;
        int discarded$4 = nf.field_l.d((byte) 29);
        if (param0 < 66) {
            rg.n(74);
        }
    }

    private final void j(int param0) {
        L0: {
          if (((rg) this).field_m instanceof fb) {
            ((fb) (Object) ((rg) this).field_m).a(1330, (rg) this);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 24349) {
          ((rg) this).e((byte) 99);
          return;
        } else {
          return;
        }
    }

    private final void d(boolean param0) {
        try {
            String var2 = null;
            if (param0) {
              L0: {
                this.h((byte) 92);
                var2 = this.f((byte) 77);
                if (-1 > (var2.length() ^ -1)) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.f((byte) 9)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var2 = this.f((byte) 77);
                if (-1 > (var2.length() ^ -1)) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.f((byte) 9)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[]{200, 300, 300, 500, 300, 500, 200, 500, 500, 1000, 300, 300, 200, 300, 300, 300};
        field_I = "Email (Login):";
    }
}
