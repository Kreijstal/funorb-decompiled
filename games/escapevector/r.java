/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class r extends hm implements ba {
    static String[] field_A;
    static int field_B;
    hm field_C;
    static boolean field_y;
    static int field_z;

    private final boolean a(hm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -812) {
              L1: {
                L2: {
                  if (null == this.field_C) {
                    break L2;
                  } else {
                    if (this.field_C.h(param1 + 812)) {
                      break L2;
                    } else {
                      if (!this.field_C.a(-4659, param0)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("r.CA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        int var7_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              var7_int = 76 / ((param5 - -39) / 45);
              if (this.field_C != null) {
                this.field_C.a(param0, param1 - -this.field_k, param2, param3 + this.field_j, param4, (byte) 117);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("r.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
    }

    private final boolean b(int param0, hm param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        hm var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -67) {
                break L1;
              } else {
                var4 = (hm) null;
                discarded$1 = this.a((hm) null, -59);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_C) {
                  break L3;
                } else {
                  if (this.field_C.h(0)) {
                    break L3;
                  } else {
                    if (!this.field_C.a(-4659, param1)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("r.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            discarded$4 = param3.append('\n');
            var5_int = 0;
            L1: while (true) {
              if (param0 < var5_int) {
                L2: {
                  if (param1 >= 61) {
                    break L2;
                  } else {
                    this.field_C = (hm) null;
                    break L2;
                  }
                }
                L3: {
                  if (this.field_C != null) {
                    this.field_C.a(0, param2, param3, 1 + param0);
                    break L3;
                  } else {
                    discarded$5 = param3.append("null");
                    break L3;
                  }
                }
                break L0;
              } else {
                discarded$6 = param3.append(' ');
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("r.FA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    void k(int param0) {
        if (param0 != -6844) {
            return;
        }
        if (!(null == this.field_C)) {
            this.field_C.i(param0 ^ -6844);
        }
    }

    r(int param0, int param1, int param2, int param3, db param4, wn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int e(int param0) {
        if (param0 != 12050) {
            hm var3 = (hm) null;
            this.a(-87, (hm) null);
        }
        return null != this.field_C ? this.field_C.e(12050) : 0;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 3) {
                break L1;
              } else {
                this.field_C = (hm) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_C) {
                  break L3;
                } else {
                  if (!this.field_C.a(this.field_j + param0, param1, (byte) 3, param3, param4 - -this.field_k, param5, param6)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("r.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(int param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -4659) {
              L1: {
                L2: {
                  if (null == this.field_C) {
                    break L2;
                  } else {
                    if (!this.field_C.a(-4659, param1)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("r.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        hm var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var6 = (hm) null;
                discarded$1 = this.b(71, (hm) null);
                break L1;
              }
            }
            L2: {
              if (!this.a(param3, param1, param2, false)) {
                break L2;
              } else {
                this.a(param1, param2, param3, 1);
                this.a(param3, (byte) 91, param1, param2);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("r.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        bd var12 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var3_int = param0.length();
              if (param1 == -63) {
                break L1;
              } else {
                var12 = (bd) null;
                r.a(-19, (bd) null, 121);
                break L1;
              }
            }
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (-1 < (var6_int ^ -1)) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L3: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (-1 < (var8 ^ -1)) {
                    discarded$0 = var6.append(param0.substring(var7));
                    stackIn_25_0 = var6.toString();
                    break L0;
                  } else {
                    var5 = var8 - -2;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if (!on.a(param0.charAt(var5), false)) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (!fk.a(false, (CharSequence) ((Object) var9))) {
                        continue L3;
                      } else {
                        if (var3_int <= var5) {
                          continue L3;
                        } else {
                          if (param0.charAt(var5) != 62) {
                            continue L3;
                          } else {
                            var5++;
                            var10 = gn.a(16777215, (CharSequence) ((Object) var9));
                            discarded$1 = var6.append(param0.substring(var7, var8));
                            discarded$2 = var6.append(param2[var10]);
                            var7 = var5;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = var6_int - -2;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!on.a(param0.charAt(var5), false)) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int - -2, var5);
                  if (!fk.a(false, (CharSequence) ((Object) var7_ref_String))) {
                    continue L2;
                  } else {
                    if (var3_int <= var5) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = gn.a(16777215, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (param2[var8].length() - (var5 - var6_int));
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("r.KA(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        return stackIn_25_0;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.k(-6844);
    }

    final boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        String[] var9 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -103) {
                break L1;
              } else {
                var9 = (String[]) null;
                r.a((String) null, -44, (String[]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_C) {
                  break L3;
                } else {
                  if (!this.field_C.h(0)) {
                    break L3;
                  } else {
                    if (!this.field_C.b(param0, param1, (byte) -115, param3, param4, param5, param6)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("r.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, hm param3) {
        String[] var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0 ^ 0, param1, param2, param3);
              if (this.field_C != null) {
                this.field_C.a(param0 + 0, this.field_j + param1, this.field_k + param2, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -14472) {
                break L2;
              } else {
                var6 = (String[]) null;
                r.a((String) null, 17, (String[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("r.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (0 == param2 && null != this.field_s) {
            this.field_s.a(param3, param0, -33, (hm) (this), true);
        }
        if (null != this.field_C) {
            this.field_C.a(param0 + this.field_j, (byte) 112, param2, param3 - -this.field_k);
        }
        if (param1 <= 85) {
            field_y = false;
        }
    }

    hm j(int param0) {
        hm var2 = this.field_C;
        if (var2 != null) {
            if (!(!var2.h(0))) {
                return var2;
            }
        }
        if (param0 == 0) {
            return null;
        }
        return (hm) null;
    }

    final static void a(int param0, bd param1, int param2) {
        int var4 = 0;
        c var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var5 = om.field_c;
              var5.a(param2, true);
              var5.field_m = var5.field_m + 1;
              var4 = var5.field_m;
              var5.f(1, -123);
              if (param1.field_j != null) {
                var5.f(param1.field_j.length, -123);
                var5.a(param1.field_j.length, (byte) 21, 0, param1.field_j);
                break L1;
              } else {
                var5.f(0, -123);
                break L1;
              }
            }
            L2: {
              var5.c(var4, -38);
              var5.field_m = var5.field_m - 4;
              param1.field_i = var5.g(-5053);
              var5.e(-80, -var4 + var5.field_m);
              if (param0 < -80) {
                break L2;
              } else {
                r.a((byte) 12);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("r.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (this.field_C != null) {
            var3 = this.field_C.d(1);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    public static void a(byte param0) {
        field_A = null;
        if (param0 != 58) {
            bd var2 = (bd) null;
            r.a(-124, (bd) null, 82);
        }
    }

    final void f(int param0) {
        if (this.field_C != null) {
            this.field_C.f(61);
        }
        if (param0 <= 46) {
            this.a(-54, (byte) 0, -102, 84);
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 0) {
                break L1;
              } else {
                this.field_C = (hm) null;
                break L1;
              }
            }
            L2: {
              if (this.field_C == null) {
                break L2;
              } else {
                if (!this.field_C.h(0)) {
                  break L2;
                } else {
                  if (!this.field_C.a(param0, param1, param2, 35)) {
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var5_int = param2;
            if (-81 == (var5_int ^ -1)) {
              L3: {
                if (ik.field_h[81]) {
                  stackIn_12_0 = this.b(-106, param0);
                  break L3;
                } else {
                  stackIn_12_0 = this.a(param0, -812);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("r.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_12_0;
        }
    }

    final boolean h(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            hm var3 = (hm) null;
            discarded$0 = this.b(-85, (hm) null);
        }
        return null != this.j(0) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13202) {
            return;
        }
        em.a(param0, param2 - -7, param3 - 1, 2, param4);
        em.a(param3 + param0, param2, 4, 16, param4);
        em.a(param3 + (param0 - -5), 7 + param2, 63 - param3, 2, param4);
    }

    static {
        field_B = 480;
        field_A = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
