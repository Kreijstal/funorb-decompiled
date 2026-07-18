/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qk extends ob {
    private int field_kb;
    private dm field_sb;
    static String field_qb;
    private int field_jb;
    private qm field_V;
    private int field_nb;
    private int field_mb;
    private int field_ob;
    private db field_rb;
    static qb[] field_lb;
    static String field_pb;

    final static boolean k(byte param0) {
        if (param0 < 57) {
            field_qb = null;
        }
        return qf.field_a == wi.field_f.field_Bb ? true : false;
    }

    private final void d(int param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (null != ((qk) this).field_sb) {
                ((qk) this).field_sb.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                param1.a(param1.field_k, ((qk) this).field_mb + 6, param1.field_v, 6, param0 ^ -55);
                ((qk) this).field_sb = new dm(param1);
                break L2;
              } else {
                ((qk) this).field_sb = new dm();
                break L2;
              }
            }
            L3: {
              ((qk) this).c(-126, (qm) (Object) ((qk) this).field_sb);
              ((qk) this).field_V = null;
              if (param0 == 12) {
                break L3;
              } else {
                ((qk) this).field_rb = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("qk.S(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    qk(h param0, qm param1, int param2, int param3, int param4) {
        super(param0, param1.field_v + 12, 12 + param2 - -param1.field_k);
        try {
            ((qk) this).field_mb = param2;
            ((qk) this).field_nb = param4;
            ((qk) this).field_ob = param3;
            ((qk) this).field_kb = param3;
            this.d(12, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(byte param0) {
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 >= 19) {
            break L0;
          } else {
            boolean discarded$20 = ((qk) this).a((byte) 113);
            break L0;
          }
        }
        L1: {
          if (null != ((qk) this).field_rb) {
            if (((qk) this).field_rb == hc.field_i) {
              int fieldTemp$21 = ((qk) this).field_jb + 1;
              ((qk) this).field_jb = ((qk) this).field_jb + 1;
              if (fieldTemp$21 == ((qk) this).field_kb) {
                ((qk) this).field_rb = hc.field_h;
                ((qk) this).b(((qk) this).field_V.field_v + 12, 116, ((qk) this).field_nb, ((qk) this).field_V.field_k + 12 + ((qk) this).field_mb);
                ((qk) this).field_jb = 0;
                ((qk) this).field_sb.field_K = 0;
                break L1;
              } else {
                ((qk) this).field_sb.field_K = 256 - (((qk) this).field_jb << 8) / ((qk) this).field_kb;
                break L1;
              }
            } else {
              if (mj.field_u == ((qk) this).field_rb) {
                int fieldTemp$22 = ((qk) this).field_jb + 1;
                ((qk) this).field_jb = ((qk) this).field_jb + 1;
                if (((qk) this).field_ob == fieldTemp$22) {
                  ((qk) this).field_sb.field_K = 256;
                  ((qk) this).field_rb = null;
                  break L1;
                } else {
                  ((qk) this).field_sb.field_K = (((qk) this).field_jb << 8) / ((qk) this).field_ob;
                  break L1;
                }
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        return super.a((byte) 57);
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, (byte) -123, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (null != ((qk) this).field_sb) {
                L1: {
                  if (param3 == 98) {
                    boolean discarded$4 = ((qk) this).field_sb.a(0, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param3 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((qk) this).field_sb.a(0, param0);
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("qk.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + -122 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void e(boolean param0) {
        if (((qk) this).field_rb == hc.field_i) {
            return;
        }
        ((qk) this).field_rb = mj.field_u;
        if (param0) {
            ((qk) this).field_kb = 82;
        }
        ((qk) this).field_jb = 0;
        this.d(12, ((qk) this).field_V);
        ((qk) this).field_V = null;
        ((qk) this).field_sb.field_K = 0;
    }

    final void a(int param0) {
        if (param0 < 89) {
            Object var3 = null;
            ((qk) this).a((byte) -74, (qm) null);
        }
        if (!(((qk) this).field_rb == null)) {
            if (!(((qk) this).field_rb == mj.field_u)) {
                ((qk) this).a(((qk) this).field_V.field_v + 12, 0, ((qk) this).field_V.field_k + (((qk) this).field_mb + 12));
                this.d(12, ((qk) this).field_V);
            }
            ((qk) this).field_rb = null;
            ((qk) this).field_sb.field_K = 256;
        }
        super.a(126);
    }

    public static void g() {
        field_lb = null;
        field_qb = null;
        field_pb = null;
    }

    final boolean g(byte param0) {
        if (param0 != 45) {
            ((qk) this).field_ob = -74;
        }
        ((qk) this).a(127);
        return super.g((byte) 45);
    }

    void a(byte param0, qm param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((qk) this).field_V = param1;
              if (((qk) this).field_rb != hc.field_h) {
                if (hc.field_i != ((qk) this).field_rb) {
                  ((qk) this).field_jb = 0;
                  ((qk) this).field_rb = hc.field_i;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((qk) this).b(((qk) this).field_V.field_v + 12, 117, ((qk) this).field_nb, ((qk) this).field_mb + (12 + ((qk) this).field_V.field_k));
                ((qk) this).field_jb = 0;
                break L1;
              }
            }
            L2: {
              if (param0 == -92) {
                break L2;
              } else {
                var4 = null;
                this.d(106, (qm) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("qk.K(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "This option cannot be combined with the current settings for:  ";
        field_pb = "(1 player wants to join)";
    }
}
