/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class db extends gj {
    boolean field_G;
    static int field_H;
    static dd field_I;
    static String field_F;
    static la field_J;
    private f field_L;
    private int field_K;

    final void a(int param0, byte param1, int param2) {
        this.a(-param2 + ll.field_m >> -1911694975, param2, -param0 + ca.field_Q >> -425982111, param0, 80);
        if (param1 <= -126) {
          return;
        } else {
          field_J = (la) null;
          return;
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var2 = -3 / ((param0 - 38) / 49);
        var3 = this.e((byte) -48);
        var4 = -this.field_K + var3;
        if (var4 <= 0) {
          if (-1 < (var4 ^ -1)) {
            L0: {
              L1: {
                this.field_K = this.field_K + (-15 + var4) / 16;
                if (-1 != (this.field_K ^ -1)) {
                  break L1;
                } else {
                  if (var3 != 0) {
                    break L1;
                  } else {
                    if (this.field_G) {
                      break L1;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L0;
                    }
                  }
                }
              }
              stackOut_32_0 = 0;
              stackIn_33_0 = stackOut_32_0;
              break L0;
            }
            return stackIn_33_0 != 0;
          } else {
            L2: {
              L3: {
                if (-1 != (this.field_K ^ -1)) {
                  break L3;
                } else {
                  if (var3 != 0) {
                    break L3;
                  } else {
                    if (this.field_G) {
                      break L3;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L2;
            }
            return stackIn_27_0 != 0;
          }
        } else {
          this.field_K = this.field_K + (var4 - -8 - 1) / 8;
          if (-1 < (var4 ^ -1)) {
            this.field_K = this.field_K + (-15 + var4) / 16;
            if (-1 == (this.field_K ^ -1)) {
              if (var3 != 0) {
                return false;
              } else {
                L4: {
                  if (this.field_G) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                return stackIn_18_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (-1 == (this.field_K ^ -1)) {
              if (var3 != 0) {
                return false;
              } else {
                L5: {
                  if (this.field_G) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L5;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L5;
                  }
                }
                return stackIn_8_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    db(f param0, int param1, int param2) {
        super(-param1 + ll.field_m >> 1303335553, -param2 + ca.field_Q >> -28928223, param1, param2, (ch) null);
        try {
            this.field_L = param0;
            this.field_G = false;
            this.field_K = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (-1 != (this.field_K ^ -1)) {
          if (-257 >= (this.field_K ^ -1)) {
            if (param3 != 0) {
              return;
            } else {
              this.b(param0 + this.field_z, param1 + this.field_y, 17344);
              super.b(param0, param1, true, param3);
              return;
            }
          } else {
            if (null != ok.field_y) {
              if (this.field_u <= ok.field_y.field_w) {
                if (ok.field_y.field_t < this.field_j) {
                  ok.field_y = new dd(this.field_u, this.field_j);
                  r.a(ok.field_y, 45);
                  gb.c();
                  this.b(0, 0, 17344);
                  super.b(-param0 + -this.field_z, -param1 - this.field_y, param2, param3);
                  ia.a(-62);
                  ok.field_y.c(this.field_y + param1, this.field_z + param0, this.field_K);
                  return;
                } else {
                  r.a(ok.field_y, 45);
                  gb.c();
                  this.b(0, 0, 17344);
                  super.b(-param0 + -this.field_z, -param1 - this.field_y, param2, param3);
                  ia.a(-62);
                  ok.field_y.c(this.field_y + param1, this.field_z + param0, this.field_K);
                  return;
                }
              } else {
                ok.field_y = new dd(this.field_u, this.field_j);
                r.a(ok.field_y, 45);
                gb.c();
                this.b(0, 0, 17344);
                super.b(-param0 + -this.field_z, -param1 - this.field_y, param2, param3);
                ia.a(-62);
                ok.field_y.c(this.field_y + param1, this.field_z + param0, this.field_K);
                return;
              }
            } else {
              ok.field_y = new dd(this.field_u, this.field_j);
              r.a(ok.field_y, 45);
              gb.c();
              this.b(0, 0, 17344);
              super.b(-param0 + -this.field_z, -param1 - this.field_y, param2, param3);
              ia.a(-62);
              ok.field_y.c(this.field_y + param1, this.field_z + param0, this.field_K);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean j(int param0) {
        this.field_K = this.e((byte) -122);
        if (param0 > 70) {
          if (-1 == (this.field_K ^ -1)) {
            if (this.field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_L = (f) null;
          if (-1 == (this.field_K ^ -1)) {
            if (this.field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    abstract void b(int param0, int param1, int param2);

    private final int e(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -41) {
          return -17;
        } else {
          L0: {
            if (this.field_G) {
              if (this.field_L.l(-87) != this) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    final static String a(String param0, String[] param1, boolean param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_38_0 = 0;
        String stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_37_0 = false;
        int stackOut_22_0 = 0;
        boolean stackOut_25_0 = false;
        String stackOut_40_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackOut_2_0 = var6_int ^ -1;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= -1) {
                      break L4;
                    } else {
                      if (var11 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_5_0 = 2 + var6_int;
                  stackIn_7_0 = stackOut_5_0;
                  L5: while (true) {
                    var5 = stackIn_7_0;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          stackOut_9_0 = em.a((byte) -108, param0.charAt(var5));
                          stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var11 != 0) {
                            continue L2;
                          } else {
                            if (!stackIn_10_0) {
                              break L7;
                            } else {
                              var5++;
                              if (var11 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      var7_ref_String = param0.substring(var6_int - -2, var5);
                      if (!ii.a(12969, (CharSequence) ((Object) var7_ref_String))) {
                        continue L1;
                      } else {
                        stackOut_14_0 = var5;
                        stackOut_14_1 = var3_int;
                        stackIn_6_0 = stackOut_14_0;
                        stackIn_6_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var11 != 0) {
                          stackOut_6_0 = stackIn_6_0 + stackIn_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          continue L5;
                        } else {
                          L8: {
                            if (stackIn_15_0 >= stackIn_15_1) {
                              break L8;
                            } else {
                              if (62 != param0.charAt(var5)) {
                                break L8;
                              } else {
                                var5++;
                                var8 = pl.a((CharSequence) ((Object) var7_ref_String), -9816);
                                var4 = var4 + (param1[var8].length() + (var6_int + -var5));
                                break L8;
                              }
                            }
                          }
                          if (var11 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L9: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  stackOut_20_0 = var8 ^ -1;
                  stackIn_21_0 = stackOut_20_0;
                  L10: while (true) {
                    L11: {
                      if (stackIn_21_0 > -1) {
                        stackOut_37_0 = param2;
                        stackIn_38_0 = stackOut_37_0 ? 1 : 0;
                        break L11;
                      } else {
                        stackOut_22_0 = var8 - -2;
                        stackIn_38_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (var11 != 0) {
                          break L11;
                        } else {
                          var5 = stackIn_23_0;
                          L12: while (true) {
                            L13: {
                              if (var5 >= var3_int) {
                                break L13;
                              } else {
                                stackOut_25_0 = em.a((byte) -71, param0.charAt(var5));
                                stackIn_21_0 = stackOut_25_0 ? 1 : 0;
                                stackIn_26_0 = stackOut_25_0;
                                if (var11 != 0) {
                                  continue L10;
                                } else {
                                  if (!stackIn_26_0) {
                                    break L13;
                                  } else {
                                    var5++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                            var9 = param0.substring(var8 - -2, var5);
                            if (ii.a(12969, (CharSequence) ((Object) var9))) {
                              L14: {
                                if (var5 >= var3_int) {
                                  break L14;
                                } else {
                                  if (62 == param0.charAt(var5)) {
                                    var5++;
                                    var10 = pl.a((CharSequence) ((Object) var9), -9816);
                                    discarded$3 = var6.append(param0.substring(var7, var8));
                                    var7 = var5;
                                    discarded$4 = var6.append(param1[var10]);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              continue L9;
                            } else {
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (stackIn_38_0 == 1) {
                        break L15;
                      } else {
                        field_J = (la) null;
                        break L15;
                      }
                    }
                    discarded$5 = var6.append(param0.substring(var7));
                    stackOut_40_0 = var6.toString();
                    stackIn_41_0 = stackOut_40_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var3);
            stackOut_42_1 = new StringBuilder().append("db.QA(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L16;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L16;
            }
          }
          L17: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L17;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param2 + ')');
        }
        return stackIn_41_0;
    }

    final qa i(int param0) {
        String discarded$2 = null;
        qa var2 = null;
        String[] var3 = null;
        if (param0 == -257) {
          var2 = super.i(param0 + 0);
          if (var2 != null) {
            return var2;
          } else {
            return (qa) (this);
          }
        } else {
          var3 = (String[]) null;
          discarded$2 = db.a((String) null, (String[]) null, false);
          var2 = super.i(param0 + 0);
          if (var2 != null) {
            return var2;
          } else {
            return (qa) (this);
          }
        }
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if ((param2 ^ -1) < -1) {
              if (mc.a(param2, (byte) -124)) {
                stackOut_5_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param2 >> 829956704);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  var3_int = -2147483648 + -(int)(4294967296L % (long)param2);
                  if (param0 == -115) {
                    break L1;
                  } else {
                    field_F = (String) null;
                    break L1;
                  }
                }
                L2: while (true) {
                  var4 = param1.nextInt();
                  L3: while (true) {
                    if (var4 >= var3_int) {
                      continue L2;
                    } else {
                      if (var5 != 0) {
                        continue L3;
                      } else {
                        stackOut_12_0 = gk.a(param2, true, var4);
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("db.RA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_13_0;
        }
    }

    public static void k(int param0) {
        field_F = null;
        field_J = null;
        if (param0 != 0) {
            field_I = (dd) null;
            field_I = null;
            return;
        }
        field_I = null;
    }

    static {
        field_H = 0;
        field_F = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
