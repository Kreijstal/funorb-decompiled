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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != this.field_sb) {
            this.field_sb.a(true);
          }
          if (param1 != null) {
            param1.a(param1.field_k, this.field_mb + 6, param1.field_v, 6, param0 ^ -55);
            this.field_sb = new dm(param1);
          } else {
            this.field_sb = new dm();
          }
          this.c(-126, this.field_sb);
          this.field_V = null;
          if (param0 != 12) {
            this.field_rb = (db) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qk.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    qk(h param0, qm param1, int param2, int param3, int param4) {
        super(param0, param1.field_v + 12, 12 + param2 + param1.field_k);
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
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 19) {
          this.a((byte) 113);
        }
        if (null != this.field_rb) {
          if (this.field_rb == hc.field_i) {
            fieldTemp$1 = this.field_jb + 1;
            this.field_jb = this.field_jb + 1;
            if (fieldTemp$1 == this.field_kb) {
              this.field_rb = hc.field_h;
              this.b(this.field_V.field_v + 12, 116, this.field_nb, this.field_V.field_k + 12 + this.field_mb);
              this.field_jb = 0;
              this.field_sb.field_K = 0;
            } else {
              this.field_sb.field_K = 256 - (this.field_jb << 8) / this.field_kb;
            }
          } else {
            if (mj.field_u == this.field_rb) {
              fieldTemp$2 = this.field_jb + 1;
              this.field_jb = this.field_jb + 1;
              if (this.field_ob == fieldTemp$2) {
                this.field_sb.field_K = 256;
                this.field_rb = null;
              } else {
                this.field_sb.field_K = (this.field_jb << 8) / this.field_ob;
              }
            }
          }
        }
        return super.a((byte) 57);
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -123, param2, param3)) {
            return true;
          }
          if (null != this.field_sb) {
            if (param3 == 98) {
              this.field_sb.a(0, param0);
            }
            if (param3 == 99) {
              this.field_sb.a(0, param0);
            }
          }
          if (param1 < -120) {
            return false;
          }
          field_lb = (qb[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qk.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
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
        if (this.field_rb != null) {
          if (this.field_rb != mj.field_u) {
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
        qm var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_V = param1;
          if (this.field_rb != hc.field_h) {
            if (hc.field_i != this.field_rb) {
              this.field_jb = 0;
              this.field_rb = hc.field_i;
            }
          } else {
            this.b(this.field_V.field_v + 12, 117, this.field_nb, this.field_mb + (12 + this.field_V.field_k));
            this.field_jb = 0;
          }
          if (param0 != -92) {
            var4 = (qm) null;
            this.d(106, (qm) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_qb = "This option cannot be combined with the current settings for:  ";
        field_pb = "(1 player wants to join)";
    }
}
