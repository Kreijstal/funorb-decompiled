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
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int var2;
        int var3;
        int var4;
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
                      stackIn_33_0 = 1;
                      break L0;
                    }
                  }
                }
              }
              stackIn_33_0 = 0;
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
                      stackIn_27_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_27_0 = 0;
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
                    stackIn_18_0 = 0;
                    break L4;
                  } else {
                    stackIn_18_0 = 1;
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
                    stackIn_8_0 = 0;
                    break L5;
                  } else {
                    stackIn_8_0 = 1;
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
        if (param0 >= -41) {
          return -17;
        } else {
          L0: {
            if (this.field_G) {
              if (this.field_L.l(-87) != this) {
                stackIn_6_0 = 0;
                break L0;
              } else {
                stackIn_6_0 = 256;
                break L0;
              }
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    final static String a(String param0, String[] param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_21_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_38_0 = 0;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        boolean stackOut_25_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackIn_3_0 = var6_int ^ -1;
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
                  stackIn_7_0 = 2 + var6_int;
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
                        stackIn_6_0 = var5;

                        stackIn_6_1 = var3_int;

                        if (var11 != 0) {
                          stackIn_7_0 = stackIn_6_0 + stackIn_6_1;
                          continue L5;
                        } else {
                          L8: {
                            if (stackIn_6_0 >= stackIn_6_1) {
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
                  stackIn_21_0 = var8 ^ -1;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (stackIn_21_0 > -1) {
                          break L12;
                        } else {
                          stackIn_38_0 = var8 - -2;

                          if (var11 != 0) {
                            break L11;
                          } else {
                            var5 = stackIn_38_0;
                            L13: while (true) {
                              L14: {
                                if (var5 >= var3_int) {
                                  break L14;
                                } else {
                                  stackOut_25_0 = em.a((byte) -71, param0.charAt(var5));
                                  stackIn_21_0 = stackOut_25_0 ? 1 : 0;
                                  stackIn_26_0 = stackOut_25_0;
                                  if (var11 != 0) {
                                    continue L10;
                                  } else {
                                    if (!stackIn_26_0) {
                                      break L14;
                                    } else {
                                      var5++;
                                      if (var11 == 0) {
                                        continue L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                              L15: {
                                var9 = param0.substring(var8 - -2, var5);
                                if (ii.a(12969, (CharSequence) ((Object) var9))) {
                                  break L15;
                                } else {
                                  if (var11 == 0) {
                                    continue L9;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (var5 >= var3_int) {
                                  break L16;
                                } else {
                                  if (62 == param0.charAt(var5)) {
                                    var5++;
                                    var10 = pl.a((CharSequence) ((Object) var9), -9816);
                                    discarded$0 = var6.append(param0.substring(var7, var8));
                                    var7 = var5;
                                    discarded$1 = var6.append(param1[var10]);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (var11 == 0) {
                                continue L9;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      stackIn_38_0 = param2 ? 1 : 0;
                      break L11;
                    }
                    L17: {
                      if (stackIn_38_0 == 1) {
                        break L17;
                      } else {
                        field_J = (la) null;
                        break L17;
                      }
                    }
                    discarded$2 = var6.append(param0.substring(var7));
                    stackIn_41_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("db.QA(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L18;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L19;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L19;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_45_0), stackIn_48_2 + ',' + param2 + ')');
        }
        return stackIn_41_0;
    }

    final qa i(int param0) {
        qa var2;
        String[] var3;
        if (param0 == -257) {
          var2 = super.i(param0 + 0);
          if (var2 != null) {
            return var2;
          } else {
            return (qa) (this);
          }
        } else {
          var3 = (String[]) null;
          db.a((String) null, (String[]) null, false);
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if ((param2 ^ -1) < -1) {
              if (mc.a(param2, (byte) -124)) {
                stackIn_6_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param2 >> 829956704);
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
                        stackIn_13_0 = gk.a(param2, true, var4);
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("db.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
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
