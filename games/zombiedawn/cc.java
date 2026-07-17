/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc {
    static long field_a;
    private int field_j;
    static aa[] field_m;
    static boolean[] field_c;
    private int field_e;
    static int[][] field_h;
    private boolean field_d;
    private boolean field_p;
    static vn field_b;
    int field_i;
    static vn field_k;
    private int field_o;
    int field_l;
    private int field_f;
    private int field_n;
    private boolean field_g;

    final void c(int param0) {
        if (param0 != 28497) {
            return;
        }
        ((cc) this).field_o = 0;
        ((cc) this).field_n = 0;
        ((cc) this).field_p = true;
        ((cc) this).field_e = 0;
    }

    final static void d(int param0) {
        if (!(i.field_Y)) {
            throw new IllegalStateException();
        }
        de.field_i = true;
        lk.a(false, 116);
        fl.field_a = 0;
    }

    final static void a(de param0, int param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var5 = ZombieDawn.field_J;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (null != ce.field_t) {
                    try {
                      L2: {
                        ce.field_t.a(0, 0L);
                        ce.field_t.a(85, var6);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (var2[var3_int] == 0) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var3_int < 24) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= 24) {
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param0.a(var2, 24, 0, -27843);
                    break L1;
                  } else {
                    param0.a(var2, 24, 0, -27843);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("cc.E(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 10 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 <= -127) {
          L0: {
            L1: {
              if (70 >= ((cc) this).field_o) {
                break L1;
              } else {
                if (0 >= -((cc) this).field_l + param0) {
                  break L1;
                } else {
                  if (param0 - ((cc) this).field_l < 40) {
                    stackOut_7_0 = ((cc) this).field_f;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0;
        } else {
          return -94;
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = Math.abs(((cc) this).field_l - (-20 - -param0));
        if (param1) {
            return -34;
        }
        int var5 = -param2 + nh.field_P;
        int var6 = 60;
        float var7 = (float)(-(var4 * var4) - var5 * var5) + 8100.0f;
        if (0.0f < var7) {
            if (var7 > 8000.0f) {
                var7 = 8000.0f;
            }
            var6 = var6 + (int)(var7 / 8000.0f * 20.0f);
        }
        return var6;
    }

    final void b(int param0) {
        ((cc) this).field_d = false;
        if (param0 != 2) {
            ((cc) this).c(80);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_k = null;
        field_c = null;
        field_h = null;
        field_m = null;
    }

    final boolean a(boolean param0) {
        if (param0) {
            ((cc) this).field_n = -81;
        }
        return ((cc) this).field_d;
    }

    final boolean a(boolean param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((cc) this).field_e = 127;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-param1 + nh.field_P >= 80) {
              break L2;
            } else {
              if (0 >= param2 + -((cc) this).field_l) {
                break L2;
              } else {
                if (-((cc) this).field_l + param2 >= 40) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int b(byte param0) {
        if (param0 >= -94) {
            field_a = -84L;
        }
        return ((cc) this).field_f;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          int fieldTemp$1 = ((cc) this).field_j + 1;
          ((cc) this).field_j = ((cc) this).field_j + 1;
          if (50 == fieldTemp$1) {
            ((cc) this).field_j = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= 102) {
          L1: {
            if (((cc) this).field_i >= ((cc) this).field_l) {
              break L1;
            } else {
              ((cc) this).field_l = ((cc) this).field_l - 2;
              if (((cc) this).field_i > ((cc) this).field_l) {
                ((cc) this).field_l = ((cc) this).field_i;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!((cc) this).field_p) {
              if (((cc) this).field_d) {
                ((cc) this).field_o = 85;
                break L2;
              } else {
                L3: {
                  if (param1 < 390) {
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L3;
                  } else {
                    stackOut_35_0 = this.a(param2, false, param1);
                    stackIn_37_0 = stackOut_35_0;
                    break L3;
                  }
                }
                L4: {
                  var4 = stackIn_37_0;
                  if (!((cc) this).field_g) {
                    break L4;
                  } else {
                    var4 = 80;
                    break L4;
                  }
                }
                L5: {
                  if (2 < Math.abs(var4 - ((cc) this).field_o)) {
                    if (((cc) this).field_o < var4) {
                      ((cc) this).field_o = ((cc) this).field_o + 2;
                      break L5;
                    } else {
                      ((cc) this).field_o = ((cc) this).field_o - 2;
                      break L5;
                    }
                  } else {
                    ((cc) this).field_o = var4;
                    break L5;
                  }
                }
                L6: {
                  if (80 >= ((cc) this).field_o) {
                    break L6;
                  } else {
                    ((cc) this).field_o = 80;
                    break L6;
                  }
                }
                if (((cc) this).field_o < 60) {
                  ((cc) this).field_o = 60;
                  break L2;
                } else {
                  break L2;
                }
              }
            } else {
              if (0 == ((cc) this).field_n) {
                if (((cc) this).field_o < 80) {
                  ((cc) this).field_o = ((cc) this).field_o + 3;
                  break L2;
                } else {
                  ((cc) this).field_n = 1;
                  ((cc) this).field_e = 1;
                  break L2;
                }
              } else {
                if (((cc) this).field_n >= 4) {
                  if (((cc) this).field_n >= 6) {
                    if (((cc) this).field_n >= 8) {
                      if (8 == ((cc) this).field_n) {
                        L7: {
                          var4 = this.a(param2, false, param1);
                          if (!((cc) this).field_g) {
                            break L7;
                          } else {
                            var4 = 80;
                            break L7;
                          }
                        }
                        if (~((cc) this).field_o < ~var4) {
                          ((cc) this).field_o = ((cc) this).field_o - 2;
                          if (var4 > ((cc) this).field_o) {
                            ((cc) this).field_o = var4;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          ((cc) this).field_p = false;
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      ((cc) this).field_n = ((cc) this).field_n + 1;
                      break L2;
                    }
                  } else {
                    ((cc) this).field_n = ((cc) this).field_n + 1;
                    if (((cc) this).field_n == 5) {
                      ((cc) this).field_e = 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  ((cc) this).field_n = ((cc) this).field_n + 1;
                  if (((cc) this).field_n == 3) {
                    ((cc) this).field_e = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          L8: {
            if (((cc) this).field_d) {
              break L8;
            } else {
              if (80 >= ((cc) this).field_o) {
                break L8;
              } else {
                ((cc) this).field_o = 80;
                break L8;
              }
            }
          }
          L9: {
            if (((cc) this).field_p) {
              break L9;
            } else {
              if (60 > ((cc) this).field_o) {
                ((cc) this).field_o = 60;
                break L9;
              } else {
                break L9;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        ((cc) this).field_e = 2;
        ((cc) this).field_d = true;
        ((cc) this).field_p = param0 ? true : false;
    }

    final void a(byte param0) {
        int var2 = 0;
        vn var3 = null;
        int var4 = 0;
        vn stackIn_8_0 = null;
        vn stackOut_7_0 = null;
        vn stackOut_6_0 = null;
        var4 = ZombieDawn.field_J;
        if (((cc) this).field_o <= 0) {
          return;
        } else {
          L0: {
            var2 = ((cc) this).field_l;
            if (!((cc) this).field_g) {
              break L0;
            } else {
              var2 = var2 + vh.field_b;
              break L0;
            }
          }
          L1: {
            if (!((cc) this).field_g) {
              stackOut_7_0 = kb.field_i[((cc) this).field_f];
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = jb.field_a[1 + ((cc) this).field_f];
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_8_0;
            so.a(nf.field_d, var2 + -5, -((cc) this).field_o + nh.field_P + 5);
            ni.field_b[((cc) this).field_e].b(var2, nh.field_P + -((cc) this).field_o);
            if (2 == ((cc) this).field_e) {
              L3: {
                if (!((cc) this).field_d) {
                  break L3;
                } else {
                  ni.field_b[((cc) this).field_e].b(var2, -((cc) this).field_o + nh.field_P, 96 - -ae.field_c[((cc) this).field_j]);
                  break L3;
                }
              }
              L4: {
                if (!((cc) this).field_g) {
                  var3.b(8 + var2, 24 + -((cc) this).field_o + nh.field_P);
                  break L4;
                } else {
                  var3.d(var2 - -7, nh.field_P - (((cc) this).field_o + -24));
                  break L4;
                }
              }
              L5: {
                if (((cc) this).field_d) {
                  var3.b(var2 + 8, nh.field_P - ((cc) this).field_o + 24, 96 - -ae.field_c[((cc) this).field_j]);
                  break L5;
                } else {
                  break L5;
                }
              }
              ni.field_b[3].b(var2, nh.field_P + -((cc) this).field_o);
              break L2;
            } else {
              if (!((cc) this).field_g) {
                var3.e(var2 + 8, nh.field_P + -56, ((cc) this).field_o * 3);
                break L2;
              } else {
                var3.d(7 + var2, ((cc) this).field_o);
                break L2;
              }
            }
          }
          L6: {
            if (param0 >= 110) {
              break L6;
            } else {
              field_c = null;
              break L6;
            }
          }
          return;
        }
    }

    cc(int param0, int param1, boolean param2) {
        this(param0, param1);
        ((cc) this).field_g = param2 ? true : false;
    }

    private cc(int param0, int param1) {
        ((cc) this).field_d = false;
        ((cc) this).field_p = false;
        ((cc) this).field_l = param0;
        ((cc) this).field_i = ((cc) this).field_l;
        ((cc) this).field_e = 2;
        ((cc) this).field_o = 0;
        ((cc) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[][]{null, null, null, null, new int[3], new int[5], null, null, new int[3], new int[3]};
        field_k = null;
        field_c = new boolean[14];
        field_b = new vn(195, 170);
    }
}
