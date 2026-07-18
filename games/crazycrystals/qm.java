/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends jb {
    int field_s;
    String field_t;
    wo field_i;
    static int field_n;
    static int[] field_q;
    tb field_p;
    int field_j;
    String field_o;
    int field_f;
    int field_r;
    bi field_l;
    boolean field_m;
    int field_h;
    int field_g;
    int field_k;

    final void a(byte param0, int param1, int param2) {
        int var5_int = 0;
        int var7 = CrazyCrystals.field_B;
        int var4 = ((qm) this).c((byte) 38);
        for (var5_int = 0; var4 >= var5_int; var5_int++) {
            ((qm) this).a(param2, (byte) -77, param1, var5_int);
        }
        String var5 = mc.a((byte) 6);
        if (!(var5 == null)) {
            pi.field_j.a(var5, 3370, ni.field_b, rf.field_G);
        }
        int var6 = 8 % ((param0 - 66) / 48);
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == 1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              boolean discarded$2 = ((qm) this).a(-81, 38, true, -102, 61);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("qm.FB(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        try {
            ((qm) this).field_s = param5;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "qm.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    String a(byte param0) {
        if (param0 < -23) {
          if (!((qm) this).field_m) {
            return null;
          } else {
            return ((qm) this).field_t;
          }
        } else {
          ((qm) this).field_f = 96;
          if (!((qm) this).field_m) {
            return null;
          } else {
            return ((qm) this).field_t;
          }
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((qm) this).a(bm.field_h, param3, false, param2, qh.field_i) ? 1 : 0;
              var6 = 125 % ((-50 - param1) / 59);
              if ((((qm) this).field_m ? 1 : 0) != var5_int) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (var5_int == 0) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((qm) this).field_m = stackIn_5_1 != 0;
                if (((qm) this).field_l == null) {
                  break L1;
                } else {
                  if (!(((qm) this).field_l instanceof t)) {
                    break L1;
                  } else {
                    ((t) (Object) ((qm) this).field_l).a(var5_int != 0, -2095, (qm) this);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("qm.N(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((qm) this).field_r).append(",").append(((qm) this).field_j).append(" ").append(((qm) this).field_g).append("x").append(((qm) this).field_f);
              if (((qm) this).field_o == null) {
                break L1;
              } else {
                StringBuilder discarded$9 = param2.append(" text=\"").append(((qm) this).field_o).append('"');
                break L1;
              }
            }
            L2: {
              if (!((qm) this).field_m) {
                break L2;
              } else {
                StringBuilder discarded$10 = param2.append(" mouseover");
                break L2;
              }
            }
            if (param1 >= 119) {
              L3: {
                if (((qm) this).e(-111)) {
                  StringBuilder discarded$11 = param2.append(" focused");
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((qm) this).field_i != null) {
                  StringBuilder discarded$12 = param2.append(" renderer=");
                  if (!(((qm) this).field_i instanceof qm)) {
                    StringBuilder discarded$13 = param2.append((Object) (Object) ((qm) this).field_i);
                    break L4;
                  } else {
                    param2 = ((qm) this).a(param0 + 1, -86, param3, param2);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (null != ((qm) this).field_l) {
                  StringBuilder discarded$14 = param2.append(" listener=");
                  if (!(((qm) this).field_l instanceof qm)) {
                    StringBuilder discarded$15 = param2.append((Object) (Object) ((qm) this).field_l);
                    break L5;
                  } else {
                    param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("qm.QB(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final static jm d(int param0) {
        try {
            Throwable var1 = null;
            jm stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            jm stackOut_0_0 = null;
            try {
              L0: {
                stackOut_0_0 = (jm) Class.forName("sf").newInstance();
                stackIn_1_0 = stackOut_0_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return ((qm) this).a(0, -115, new Hashtable(), new StringBuilder()).toString();
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!((qm) this).a(0, param0, param3, param2)) {
                break L1;
              } else {
                ((qm) this).a(param0, (byte) 123, param3, param2);
                break L1;
              }
            }
            L2: {
              if (param1 <= -85) {
                break L2;
              } else {
                ((qm) this).field_k = 84;
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param3;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("qm.MA(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -52) {
          field_q = null;
          ((qm) this).field_j = param2;
          ((qm) this).field_g = param3;
          ((qm) this).field_f = param0;
          ((qm) this).field_r = param1;
          return;
        } else {
          ((qm) this).field_j = param2;
          ((qm) this).field_g = param3;
          ((qm) this).field_f = param0;
          ((qm) this).field_r = param1;
          return;
        }
    }

    void b(byte param0) {
        if (param0 > -84) {
            ((qm) this).field_k = 97;
        }
    }

    final boolean a(int param0, boolean param1, char param2) {
        int var4 = 0;
        if (!((qm) this).e(-121)) {
          var4 = param0;
          if (var4 != 80) {
            if (param1) {
              String discarded$4 = ((qm) this).a((byte) -42);
              return false;
            } else {
              return false;
            }
          } else {
            return ((qm) this).a(true, (qm) this);
          }
        } else {
          if (!((qm) this).a(param0, 19279, (qm) this, param2)) {
            var4 = param0;
            if (var4 != 80) {
              if (!param1) {
                return false;
              } else {
                String discarded$5 = ((qm) this).a((byte) -42);
                return false;
              }
            } else {
              return ((qm) this).a(true, (qm) this);
            }
          } else {
            return true;
          }
        }
    }

    public static void g(int param0) {
        field_q = null;
    }

    void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (((qm) this).field_i != null) {
              ((qm) this).field_i.a(param0, false, param2, (qm) this, true);
              break L0;
            } else {
              if (param1 <= -12) {
                return;
              } else {
                ((qm) this).field_h = -114;
                return;
              }
            }
          }
        }
        if (param1 > -12) {
          ((qm) this).field_h = -114;
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        oj var6 = null;
        int var7 = 0;
        L0: {
          var7 = CrazyCrystals.field_B;
          ((qm) this).a((qm) this, -125, param0, param3);
          var5 = ((qm) this).e(-111) ? 1 : 0;
          if (!param2) {
            if (var5 == 0) {
              break L0;
            } else {
              if (pj.field_v != 0) {
                ((qm) this).b((byte) -110);
                break L0;
              } else {
                qk.field_D = gg.field_c;
                if (!param1) {
                  ia.a((byte) -47, ((qm) this).a((byte) -54));
                  return param2;
                } else {
                  return true;
                }
              }
            }
          } else {
            L1: {
              if (of.field_H == 0) {
                break L1;
              } else {
                if (var5 != 0) {
                  boolean discarded$1 = ((qm) this).a(1, bm.field_h, (qm) this, qh.field_i, param0, param3, of.field_H);
                  break L1;
                } else {
                  if (pj.field_v != 0) {
                    if (!((qm) this).a(param3, dp.field_h, (qm) this, false, param0, pj.field_v, to.field_a)) {
                      if (var5 != 0) {
                        L2: {
                          ((qm) this).b((byte) -118);
                          if (gg.field_c != 0) {
                            break L2;
                          } else {
                            if (qk.field_D != 0) {
                              L3: {
                                ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                                var6 = ok.field_e;
                                if (var6 == null) {
                                  break L3;
                                } else {
                                  L4: {
                                    if (var6.field_l instanceof sk) {
                                      ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  ok.field_e = null;
                                  break L3;
                                }
                              }
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                        qk.field_D = gg.field_c;
                        if (!param1) {
                          ia.a((byte) -47, ((qm) this).a((byte) -54));
                          return param2;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          if (gg.field_c != 0) {
                            break L5;
                          } else {
                            if (qk.field_D != 0) {
                              L6: {
                                ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                                var6 = ok.field_e;
                                if (var6 == null) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (var6.field_l instanceof sk) {
                                      ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  ok.field_e = null;
                                  break L6;
                                }
                              }
                              break L5;
                            } else {
                              qk.field_D = gg.field_c;
                              if (!param1) {
                                ia.a((byte) -47, ((qm) this).a((byte) -54));
                                return param2;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        qk.field_D = gg.field_c;
                        if (!param1) {
                          ia.a((byte) -47, ((qm) this).a((byte) -54));
                          return param2;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      param2 = false;
                      if (gg.field_c == 0) {
                        if (qk.field_D != 0) {
                          L8: {
                            ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                            var6 = ok.field_e;
                            if (var6 == null) {
                              break L8;
                            } else {
                              L9: {
                                if (var6.field_l instanceof sk) {
                                  ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ok.field_e = null;
                              break L8;
                            }
                          }
                          qk.field_D = gg.field_c;
                          if (!param1) {
                            ia.a((byte) -47, ((qm) this).a((byte) -54));
                            return param2;
                          } else {
                            return true;
                          }
                        } else {
                          qk.field_D = gg.field_c;
                          if (!param1) {
                            ia.a((byte) -47, ((qm) this).a((byte) -54));
                            return param2;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        qk.field_D = gg.field_c;
                        if (!param1) {
                          ia.a((byte) -47, ((qm) this).a((byte) -54));
                          return param2;
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    L10: {
                      if (gg.field_c != 0) {
                        break L10;
                      } else {
                        if (qk.field_D != 0) {
                          L11: {
                            ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                            var6 = ok.field_e;
                            if (var6 == null) {
                              break L11;
                            } else {
                              L12: {
                                if (var6.field_l instanceof sk) {
                                  ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              ok.field_e = null;
                              break L11;
                            }
                          }
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    qk.field_D = gg.field_c;
                    if (!param1) {
                      ia.a((byte) -47, ((qm) this).a((byte) -54));
                      return param2;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            if (pj.field_v != 0) {
              if (!((qm) this).a(param3, dp.field_h, (qm) this, false, param0, pj.field_v, to.field_a)) {
                if (var5 == 0) {
                  if (gg.field_c != 0) {
                    break L0;
                  } else {
                    if (qk.field_D != 0) {
                      L13: {
                        ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                        var6 = ok.field_e;
                        if (var6 == null) {
                          break L13;
                        } else {
                          L14: {
                            if (var6.field_l instanceof sk) {
                              ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          ok.field_e = null;
                          break L13;
                        }
                      }
                      break L0;
                    } else {
                      qk.field_D = gg.field_c;
                      if (!param1) {
                        ia.a((byte) -47, ((qm) this).a((byte) -54));
                        return param2;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  L15: {
                    ((qm) this).b((byte) -118);
                    if (gg.field_c != 0) {
                      break L15;
                    } else {
                      if (qk.field_D != 0) {
                        L16: {
                          ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                          var6 = ok.field_e;
                          if (var6 == null) {
                            break L16;
                          } else {
                            L17: {
                              if (var6.field_l instanceof sk) {
                                ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            ok.field_e = null;
                            break L16;
                          }
                        }
                        break L15;
                      } else {
                        qk.field_D = gg.field_c;
                        if (!param1) {
                          ia.a((byte) -47, ((qm) this).a((byte) -54));
                          return param2;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  qk.field_D = gg.field_c;
                  if (!param1) {
                    ia.a((byte) -47, ((qm) this).a((byte) -54));
                    return param2;
                  } else {
                    return true;
                  }
                }
              } else {
                param2 = false;
                if (gg.field_c == 0) {
                  if (qk.field_D != 0) {
                    L18: {
                      ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                      var6 = ok.field_e;
                      if (var6 == null) {
                        break L18;
                      } else {
                        L19: {
                          if (var6.field_l instanceof sk) {
                            ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        ok.field_e = null;
                        break L18;
                      }
                    }
                    qk.field_D = gg.field_c;
                    if (!param1) {
                      ia.a((byte) -47, ((qm) this).a((byte) -54));
                      return param2;
                    } else {
                      return true;
                    }
                  } else {
                    qk.field_D = gg.field_c;
                    if (!param1) {
                      ia.a((byte) -47, ((qm) this).a((byte) -54));
                      return param2;
                    } else {
                      return true;
                    }
                  }
                } else {
                  qk.field_D = gg.field_c;
                  if (!param1) {
                    ia.a((byte) -47, ((qm) this).a((byte) -54));
                    return param2;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              if (gg.field_c == 0) {
                if (qk.field_D != 0) {
                  L20: {
                    ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                    var6 = ok.field_e;
                    if (var6 == null) {
                      break L20;
                    } else {
                      L21: {
                        if (var6.field_l instanceof sk) {
                          ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      ok.field_e = null;
                      break L20;
                    }
                  }
                  qk.field_D = gg.field_c;
                  if (!param1) {
                    ia.a((byte) -47, ((qm) this).a((byte) -54));
                    return param2;
                  } else {
                    return true;
                  }
                } else {
                  qk.field_D = gg.field_c;
                  if (!param1) {
                    ia.a((byte) -47, ((qm) this).a((byte) -54));
                    return param2;
                  } else {
                    return true;
                  }
                }
              } else {
                qk.field_D = gg.field_c;
                if (!param1) {
                  ia.a((byte) -47, ((qm) this).a((byte) -54));
                  return param2;
                } else {
                  return true;
                }
              }
            }
          }
        }
        qk.field_D = gg.field_c;
        if (!param1) {
          ia.a((byte) -47, ((qm) this).a((byte) -54));
          return param2;
        } else {
          return true;
        }
    }

    final void f(int param0) {
        ((qm) this).a(((qm) this).field_f, ((qm) this).field_r, ((qm) this).field_j, ((qm) this).field_g, (byte) -52);
        if (param0 > -27) {
            boolean discarded$0 = ((qm) this).e(-107);
        }
    }

    boolean e(int param0) {
        if (param0 >= -107) {
            return true;
        }
        return false;
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (!((qm) this).a(param1, param0, param3, param4, param6)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((qm) this).field_s = param5;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("qm.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("qm.P(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 19279) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("qm.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_4_0 != 0;
    }

    int c(byte param0) {
        if (param0 < 30) {
            StringBuilder discarded$0 = ((qm) this).a(-13, -26, (Hashtable) null, (StringBuilder) null);
            return 0;
        }
        return 0;
    }

    qm(String param0, bi param1) {
        this(param0, pi.field_j.field_n, param1);
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          if (param1 + ((qm) this).field_r <= param4) {
            if (((qm) this).field_j + param3 <= param0) {
              if (param1 - (-((qm) this).field_r - ((qm) this).field_g) > param4) {
                if (param3 - -((qm) this).field_j - -((qm) this).field_f <= param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              if (param3.containsKey(this)) {
                StringBuilder discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                Object discarded$5 = param3.put(this, this);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("qm.IB(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    protected qm() {
        ((qm) this).field_h = 0;
        ((qm) this).field_k = 0;
    }

    qm(String param0, wo param1, bi param2) {
        RuntimeException runtimeException = null;
        fi var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((qm) this).field_h = 0;
        ((qm) this).field_k = 0;
        try {
          L0: {
            L1: {
              ((qm) this).field_l = param2;
              ((qm) this).field_o = param0;
              ((qm) this).field_i = param1;
              if (!(((qm) this).field_i instanceof fi)) {
                break L1;
              } else {
                var4 = (fi) (Object) ((qm) this).field_i;
                ((qm) this).field_g = var4.b((qm) this, -12817);
                ((qm) this).field_f = var4.c((qm) this, -1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("qm.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static int a(rh param0, int param1, rh param2) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_0_0 = ai.a(param2, false, (String) null, 0, param0, (byte) 84, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("qm.HB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(100).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    qm(int param0, int param1, int param2, int param3, wo param4, bi param5) {
        ((qm) this).field_h = 0;
        ((qm) this).field_k = 0;
        try {
            ((qm) this).field_g = param2;
            ((qm) this).field_i = param4;
            ((qm) this).field_r = param0;
            ((qm) this).field_l = param5;
            ((qm) this).field_f = param3;
            ((qm) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[8192];
    }
}
