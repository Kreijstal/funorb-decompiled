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
            field_qb = (String) null;
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
              if (null != this.field_sb) {
                this.field_sb.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                param1.a(param1.field_k, this.field_mb + 6, param1.field_v, 6, param0 ^ -55);
                this.field_sb = new dm(param1);
                break L2;
              } else {
                this.field_sb = new dm();
                break L2;
              }
            }
            L3: {
              this.c(-126, this.field_sb);
              this.field_V = null;
              if (param0 == 12) {
                break L3;
              } else {
                this.field_rb = (db) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("qk.S(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    qk(h param0, qm param1, int param2, int param3, int param4) {
        super(param0, param1.field_v + 12, 12 + param2 - -param1.field_k);
        try {
            this.field_mb = param2;
            this.field_nb = param4;
            this.field_ob = param3;
            this.field_kb = param3;
            this.d(12, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(byte param0) {
        boolean discarded$20 = false;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 >= 19) {
            break L0;
          } else {
            discarded$20 = this.a((byte) 113);
            break L0;
          }
        }
        L1: {
          if (null != this.field_rb) {
            if (this.field_rb == hc.field_i) {
              fieldTemp$21 = this.field_jb + 1;
              this.field_jb = this.field_jb + 1;
              if (fieldTemp$21 == this.field_kb) {
                this.field_rb = hc.field_h;
                this.b(this.field_V.field_v + 12, 116, this.field_nb, this.field_V.field_k + 12 + this.field_mb);
                this.field_jb = 0;
                this.field_sb.field_K = 0;
                break L1;
              } else {
                this.field_sb.field_K = 256 - (this.field_jb << 740201736) / this.field_kb;
                break L1;
              }
            } else {
              if (mj.field_u == this.field_rb) {
                fieldTemp$22 = this.field_jb + 1;
                this.field_jb = this.field_jb + 1;
                if (this.field_ob == fieldTemp$22) {
                  this.field_sb.field_K = 256;
                  this.field_rb = null;
                  break L1;
                } else {
                  this.field_sb.field_K = (this.field_jb << -1935303192) / this.field_ob;
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
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (super.a(param0, (byte) -123, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null != this.field_sb) {
                  L2: {
                    if ((param3 ^ -1) == -99) {
                      discarded$4 = this.field_sb.a(0, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param3 != 99) {
                    break L1;
                  } else {
                    discarded$5 = this.field_sb.a(0, param0);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (param1 < -120) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_lb = (qb[]) null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("qk.N(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final void e(boolean param0) {
        if (this.field_rb == hc.field_i) {
            return;
        }
        this.field_rb = mj.field_u;
        if (param0) {
            this.field_kb = 82;
        }
        this.field_jb = 0;
        this.d(12, this.field_V);
        this.field_V = null;
        this.field_sb.field_K = 0;
    }

    final void a(int param0) {
        if (param0 < 89) {
            qm var3 = (qm) null;
            this.a((byte) -74, (qm) null);
        }
        if (!(this.field_rb == null)) {
            if (!(this.field_rb == mj.field_u)) {
                this.a(this.field_V.field_v + 12, 0, this.field_V.field_k + (this.field_mb + 12));
                this.d(12, this.field_V);
            }
            this.field_rb = null;
            this.field_sb.field_K = 256;
        }
        super.a(126);
    }

    public static void g(int param0) {
        field_lb = null;
        field_qb = null;
        field_pb = null;
        if (param0 != 0) {
            field_qb = (String) null;
        }
    }

    final boolean g(byte param0) {
        if (param0 != 45) {
            this.field_ob = -74;
        }
        this.a(127);
        return super.g((byte) 45);
    }

    void a(byte param0, qm param1) {
        RuntimeException var3 = null;
        qm var4 = null;
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
              this.field_V = param1;
              if (this.field_rb != hc.field_h) {
                if (hc.field_i != this.field_rb) {
                  this.field_jb = 0;
                  this.field_rb = hc.field_i;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.b(this.field_V.field_v + 12, 117, this.field_nb, this.field_mb + (12 + this.field_V.field_k));
                this.field_jb = 0;
                break L1;
              }
            }
            L2: {
              if (param0 == -92) {
                break L2;
              } else {
                var4 = (qm) null;
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("qk.K(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_qb = "This option cannot be combined with the current settings for:  ";
        field_pb = "(1 player wants to join)";
    }
}
