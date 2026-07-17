/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends sj {
    private boolean field_sb;
    private String field_jb;
    private uc field_ub;
    private String field_ib;
    static rj field_ob;
    static String field_mb;
    static String field_rb;
    static String field_nb;
    static int field_kb;
    static String field_lb;
    static String field_qb;
    private boolean field_pb;
    static volatile int field_tb;

    final static int c(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == 2113632) {
                break L1;
              } else {
                field_tb = -43;
                break L1;
              }
            }
            var4 = en.field_c;
            L2: while (true) {
              if (uc.field_K.length <= var3_int) {
                stackOut_15_0 = -1;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  var5 = dd.field_A[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + gb.field_a;
                    var3_int++;
                    break L3;
                  } else {
                    var6 = rb.a((byte) 120, true, uc.field_K[var3_int]);
                    var7 = -(var6 >> 1) + tm.field_e;
                    var4 = var4 + lc.field_j;
                    if (!ec.a(var4, (i.field_o << 1) + cd.field_e, param2, (an.field_w << 1) + var6, -an.field_w + var7, param0, param1 + -2113557)) {
                      var4 = var4 + (cd.field_e + (lc.field_j + (i.field_o << 1)));
                      var3_int++;
                      break L3;
                    } else {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "wi.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_16_0;
    }

    public static void i(byte param0) {
        if (param0 > -44) {
          field_rb = null;
          field_lb = null;
          field_mb = null;
          field_rb = null;
          field_qb = null;
          field_ob = null;
          field_nb = null;
          return;
        } else {
          field_lb = null;
          field_mb = null;
          field_rb = null;
          field_qb = null;
          field_ob = null;
          field_nb = null;
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        hc.field_f.c(((wi) this).field_jb, param1 + (((wi) this).field_x >> 1), param0 - -103, 16777215, -1);
        if (!(null == ((wi) this).field_ib)) {
            gf.b(20 + param1, 120 + (param0 - 7), 260, 8421504);
            int discarded$0 = hc.field_f.a(((wi) this).field_ib, param1 + 20, param0 + 128, 260, 100, 16777215, -1, 1, 0, hc.field_f.field_H);
        }
    }

    final void j(byte param0) {
        if (param0 != -115) {
          wi.i((byte) 54);
          ((wi) this).field_pb = true;
          ((wi) this).field_ub.field_R = false;
          return;
        } else {
          ((wi) this).field_pb = true;
          ((wi) this).field_ub.field_R = false;
          return;
        }
    }

    wi(ji param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((wi) this).field_ib = param1;
            if (((wi) this).field_ib != null) {
                var3_int = hc.field_f.a(((wi) this).field_ib, 260, hc.field_f.field_H);
                ((wi) this).b(120, 150 + var3_int, 300);
            }
            ((wi) this).field_ub = new uc(13, 50, 274, 30, 15, 2113632, 4210752);
            ((wi) this).field_pb = false;
            ((wi) this).field_sb = false;
            ((wi) this).field_ub.field_R = true;
            ((wi) this).b((byte) -84, (lm) (Object) ((wi) this).field_ub);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, String param1, float param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((wi) this).field_sb) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_6_0 == stackIn_6_1) {
                break L3;
              } else {
                L4: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (!param0) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L4;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L4;
                  }
                }
                ((wi) this).field_sb = stackIn_10_1 != 0;
                if (((wi) this).field_sb) {
                  ((wi) this).field_ub.b(4210752, (byte) 94, 8405024);
                  ((wi) this).field_ub.field_R = true;
                  break L3;
                } else {
                  ((wi) this).field_ub.b(4210752, (byte) 94, 2113632);
                  if (!((wi) this).field_pb) {
                    break L3;
                  } else {
                    ((wi) this).field_ub.field_R = false;
                    break L3;
                  }
                }
              }
            }
            ((wi) this).field_jb = param1;
            ((wi) this).field_ub.field_S = (int)(param2 / 100.0f * 65536.0f);
            var5_int = 95 % ((0 - param3) / 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("wi.G(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = "Entrance";
        field_nb = "Ability used";
        field_rb = "Giant Snake";
        field_lb = "A humanoid construct made of stone; its one instruction is to crush the bodies of any raiders that cross its path.<br><br>This monster requires 2 successful strikes from the same raider to defeat.";
        field_qb = "You successfully stole <%0> gold!";
        field_tb = -1;
    }
}
