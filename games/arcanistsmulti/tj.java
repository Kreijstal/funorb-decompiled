/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tl {
    static lg field_t;
    static String field_y;
    private byte[] field_E;
    private int field_i;
    static qb[] field_A;
    private di field_n;
    private byte[] field_w;
    private int field_q;
    static int field_C;
    private pa field_s;
    static int[] field_u;
    private int field_v;
    static kc field_o;
    private be field_D;
    private be field_F;
    private jk field_k;
    private ve field_x;
    private lk field_B;
    private vn field_h;
    private int field_p;
    private vn field_m;
    private boolean field_l;
    private boolean field_j;
    private boolean field_z;
    private long field_r;

    final static fe a(int param0, int param1) {
        fe var2 = null;
        RuntimeException var2_ref = null;
        fe stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new fe();
          if (param1 != -21402) {
            tj.b(68);
          }
          i.field_e.b(var2, -1);
          gb.a(param0, true);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "tj.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null == this.field_F) {
            return;
          }
          this.field_l = true;
          if (param0 != 53) {
            this.field_x = (ve) null;
          }
          if (null == this.field_h) {
            this.field_h = new vn();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "tj.J(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        ve discarded$0 = null;
        ve discarded$1 = null;
        pg var2 = null;
        int var3 = 0;
        int var4 = 0;
        pg stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_h == null) {
            return;
          }
          if (this.d((byte) 122) == null) {
            return;
          }
          if (param0) {
            return;
          }
          var2 = this.field_m.b(12623);
          while (var2 != null) {
            var3 = (int)var2.field_e;
            if (var3 >= 0 &&
              this.field_k.field_f > var3 &&
              this.field_k.field_b[var3] != 0) {
              if (0 == this.field_E[var3]) {
                discarded$0 = this.a(1, -103, var3);
              }
              if (this.field_E[var3] == -1) {
                discarded$1 = this.a(2, 62, var3);
              }
              if (this.field_E[var3] == 1) {
                var2.a(true);
              }
            } else {
              stackIn_17_0 = var2;
              stackIn_18_1 = !(param0);
              ((pg) (Object) stackIn_17_0).a(stackIn_18_1);
            }
            var2 = this.field_m.a(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "tj.P(" + param0 + ')');
        }
    }

    final static String a(int param0, String[] param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        StringBuilder var14 = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = param2.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6 = param2.indexOf("<%", var5);
            if (var6 >= 0) {
              stackIn_6_0 = var6 + 2;
              for (var5 = stackIn_6_0; var3_int > var5; var5++) {
                if (e.a(30, param2.charAt(var5))) {
                  continue;
                }
                break;
              }
              var13 = param2.substring(var6 + 2, var5);
              var7 = var13;
              if (!fi.a((CharSequence) ((Object) var7), 10)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param2.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = dc.a((CharSequence) ((Object) var13), 126);
              var4 = var4 + (param1[var8].length() - var5 + var6);
              continue;
            }
            break;
          }
          var6Lifetime1 = -96 % ((param0 - 51) / 62);
          var14 = new StringBuilder(var4);
          var8Lifetime1 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var9 = param2.indexOf("<%", var5Lifetime1);
            if (var9 < 0) {
              discarded$0 = var14.append(param2.substring(var8Lifetime1));
              stackIn_31_0 = var14.toString();
              return stackIn_31_0;
            }
            for (var5Lifetime1 = var9 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (e.a(30, param2.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var10 = param2.substring(2 + var9, var5Lifetime1);
            if (!fi.a((CharSequence) ((Object) var10), 10)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param2.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var11 = dc.a((CharSequence) ((Object) var10), 127);
            discarded$1 = var14.append(param2.substring(var8Lifetime1, var9));
            var8Lifetime1 = var5Lifetime1;
            discarded$2 = var14.append(param1[var11]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("tj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_0 = stackIn_35_0;
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param2 == null) {
            stackIn_40_0 = stackIn_39_0;
            stackIn_40_2 = "null";
          } else {
            stackIn_40_0 = stackIn_35_0;
            stackIn_40_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -69) {
            tj.a(118, 80);
          }
          stackIn_3_0 = gn.field_e.a(param0, "", -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("tj.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        try {
          sc.a(false, false, param0);
          if (param1 >= -93) {
            field_t = (lg) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tj.R(" + param0 + ',' + param1 + ')');
        }
    }

    final void f(byte param0) {
        ve discarded$3 = null;
        ve discarded$2 = null;
        ve discarded$1 = null;
        ve discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        ve var2_ref = null;
        RuntimeException var2_ref2 = null;
        pg var3 = null;
        int var4 = 0;
        int var5 = 0;
        pg var6 = null;
        pg var7 = null;
        pg var3Lifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        var2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_h) {
            if (null == this.d((byte) 119)) {
              return;
            }
            if (this.field_j) {
              var2_int = 1;
              var3 = this.field_h.b(12623);
              while (var3 != null) {
                var4 = (int)var3.field_e;
                if (this.field_E[var4] == 0) {
                  discarded$3 = this.a(1, 96, var4);
                }
                if (this.field_E[var4] != 0) {
                  var3.a(true);
                } else {
                  var2_int = 0;
                }
                var3 = this.field_h.a(0);
              }
              while (this.field_p < this.field_k.field_b.length) {
                if (this.field_k.field_b[this.field_p] == 0) {
                  this.field_p = this.field_p + 1;
                  continue;
                }
                if (250 > this.field_s.field_d) {
                  if (this.field_E[this.field_p] == 0) {
                    discarded$2 = this.a(1, 85, this.field_p);
                  }
                  if (0 == this.field_E[this.field_p]) {
                    var6 = new pg();
                    var6.field_e = (long)this.field_p;
                    this.field_h.b(var6, -1);
                    var2_int = 0;
                  }
                  this.field_p = this.field_p + 1;
                  continue;
                }
                var2_int = 0;
                break;
              }
              if ((var2_int != 0)) {
                this.field_p = 0;
                this.field_j = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_l) {
                var2_intLifetime1 = 1;
                var3Lifetime1 = this.field_h.b(12623);
                while (var3Lifetime1 != null) {
                  var4Lifetime1 = (int)var3Lifetime1.field_e;
                  if (1 != this.field_E[var4Lifetime1]) {
                    discarded$1 = this.a(2, -114, var4Lifetime1);
                  }
                  if (this.field_E[var4Lifetime1] != 1) {
                    var2_intLifetime1 = 0;
                  } else {
                    var3Lifetime1.a(true);
                  }
                  var3Lifetime1 = this.field_h.a(0);
                }
                while (this.field_k.field_b.length > this.field_p) {
                  if (this.field_k.field_b[this.field_p] == 0) {
                    this.field_p = this.field_p + 1;
                    continue;
                  }
                  if (!this.field_B.b(-21)) {
                    if (1 != this.field_E[this.field_p]) {
                      discarded$0 = this.a(2, 61, this.field_p);
                    }
                    if (this.field_E[this.field_p] != 1) {
                      var7 = new pg();
                      var7.field_e = (long)this.field_p;
                      this.field_h.b(var7, -1);
                      var2_intLifetime1 = 0;
                    }
                    this.field_p = this.field_p + 1;
                    continue;
                  }
                  var2_intLifetime1 = 0;
                  break;
                }
                if ((var2_intLifetime1 != 0)) {
                  this.field_p = 0;
                  this.field_l = false;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_h = null;
              }
            }
          }
          if (this.field_z &&
            this.field_r <= qj.b(-26572)) {
            var2_ref = (ve) (this.field_n.a(10));
            while (var2_ref != null) {
              if (!var2_ref.field_p) {
                if (!var2_ref.field_n) {
                  var2_ref.field_n = true;
                } else {
                  if (!var2_ref.field_q) {
                    throw new RuntimeException();
                  }
                  var2_ref.a(true);
                }
              }
              var2_ref = (ve) (this.field_n.c(-87));
            }
            this.field_r = qj.b(-26572) + 1000L;
          }
          if (param0 < 54) {
            this.a(15, (byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref2), "tj.O(" + param0 + ')');
        }
    }

    final jk d(byte param0) {
        jk stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        jk stackIn_18_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_50_0 = null;
        jk stackIn_54_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (null != this.field_k) {
            stackIn_5_0 = this.field_k;
            return stackIn_5_0;
          }
          if (this.field_x == null) {
            if (this.field_B.c((byte) -66)) {
              stackIn_11_0 = null;
              return (jk) (stackIn_11_0);
            }
            this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
          }
          if (this.field_x.field_p) {
            stackIn_15_0 = null;
            return (jk) (stackIn_15_0);
          }
          var7 = this.field_x.c(-42);
          var6 = var7;
          var5 = var6;
          var2 = var5;
          if (param0 <= 74) {
            stackIn_18_0 = (jk) null;
            return stackIn_18_0;
          }
          if (this.field_x instanceof ea) {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_k = new jk(var7, this.field_q, this.field_w);
              if (this.field_v != this.field_k.field_g) {
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              this.field_k = null;
              if (this.field_B.c((byte) 52)) {
                this.field_x = null;
              } else {
                this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
              }
              stackIn_50_0 = null;
              return (jk) (stackIn_50_0);
            }
          } else {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_k = new jk(var7, this.field_q, this.field_w);
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_B.a((byte) 0);
              this.field_k = null;
              if (this.field_B.c((byte) -71)) {
                this.field_x = null;
              } else {
                this.field_x = (ve) ((Object) this.field_B.a(this.field_i, true, 255, (byte) -80, (byte) 0));
              }
              stackIn_31_0 = null;
              return (jk) (stackIn_31_0);
            }
            if (null != this.field_D) {
              this.field_s.a(this.field_i, 93, var7, this.field_D);
            }
          }
          this.field_x = null;
          if (this.field_F != null) {
            this.field_E = new byte[this.field_k.field_f];
          }
          stackIn_54_0 = this.field_k;
          return stackIn_54_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "tj.D(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        try {
          rk.field_O = null;
          if (param0 < 62) {
            field_C = -45;
          }
          qn.field_ob = null;
          mj.field_p = -1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tj.I(" + param0 + ')');
        }
    }

    private final ve a(int param0, int param1, int param2) {
        Object stackIn_38_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_75_0 = null;
        Object stackIn_106_0 = null;
        Object stackIn_115_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        int var7_int = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ve var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var13 = (ve) (this.field_n.a((long)param2, -77));
          var4 = var13;
          if (var13 != null &&
            param0 == 0 &&
            !var13.field_q &&
            var13.field_p) {
            var13.a(true);
            var4 = null;
          }
          if (var4 == null) {
            if (0 != param0) {
              if (param0 != 1) {
                if (param0 != 2) {
                  throw new RuntimeException();
                }
                if (null == this.field_F) {
                  throw new RuntimeException();
                }
                if (this.field_E[param2] != -1) {
                  throw new RuntimeException();
                }
                if (this.field_B.b(-21)) {
                  return null;
                }
                var4 = this.field_B.a(param2, false, this.field_i, (byte) -80, (byte) 2);
              } else {
                if (null == this.field_F) {
                  throw new RuntimeException();
                }
                var4 = this.field_s.a(param2, true, this.field_F);
              }
            } else {
              if (this.field_F != null &&
                this.field_E[param2] != -1) {
                var4 = this.field_s.a(this.field_F, param2, -6833);
              } else {
                if (this.field_B.c((byte) -91)) {
                  return null;
                }
                var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
              }
            }
            this.field_n.a((pg) (var4), true, (long)param2);
          }
          if (((ve) (var4)).field_p) {
            stackIn_38_0 = null;
            return (ve) (stackIn_38_0);
          }
          var6 = 103 / ((param1 + 54) / 43);
          var19 = ((ve) (var4)).c(-74);
          var14 = var19;
          var5 = var14;
          if (var4 instanceof ea) {
            try {
              if (var5 != null &&
                var19.length > 2) {
                co.field_g.reset();
                co.field_g.update(var5, 0, var19.length - 2);
                var7_int = (int)co.field_g.getValue();
                if (var7_int != this.field_k.field_h[param2]) {
                  throw new RuntimeException();
                }
                if (this.field_k.field_k != null &&
                  null != this.field_k.field_k[param2]) {
                  var31 = this.field_k.field_k[param2];
                  var30 = nn.a(-2 + var19.length, (byte) -93, var19, 0);
                  var12 = 0;
                  var10 = var12;
                  while (64 > var12) {
                    if (var30[var12] != var31[var12]) {
                      throw new RuntimeException();
                    }
                    var12++;
                  }
                }
                var8 = ((var5[var19.length - 2] & 255) << 8) + (255 & var5[-1 + var19.length]);
                if (var8 != (this.field_k.field_y[param2] & 65535)) {
                  throw new RuntimeException();
                }
                if (this.field_E[param2] != 1) {
                  if (this.field_E[param2] != 0) {
                  }
                  this.field_E[param2] = (byte) 1;
                }
                if (!((ve) (var4)).field_q) {
                  ((ve) (var4)).a(true);
                }
                stackIn_106_0 = var4;
                return (ve) (stackIn_106_0);
              }
              throw new RuntimeException();
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = (Exception) (Object) decompiledCaughtException;
              this.field_E[param2] = (byte)-1;
              ((ve) (var4)).a(true);
              if (((ve) (var4)).field_q &&
                !this.field_B.c((byte) 67)) {
                var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
                this.field_n.a((pg) (var4), true, (long)param2);
              }
              stackIn_115_0 = null;
              return (ve) (stackIn_115_0);
            }
          }
          try {
            if (var5 != null &&
              var19.length > 2) {
              co.field_g.reset();
              co.field_g.update(var5, 0, -2 + var19.length);
              var7_int = (int)co.field_g.getValue();
              if (this.field_k.field_h[param2] != var7_int) {
                throw new RuntimeException();
              }
              if (this.field_k.field_k != null &&
                this.field_k.field_k[param2] != null) {
                var29 = this.field_k.field_k[param2];
                var28 = nn.a(var19.length - 2, (byte) -93, var19, 0);
                for (var10 = 0; var10 < 64; var10++) {
                  if (var28[var10] != var29[var10]) {
                    throw new RuntimeException();
                  }
                }
              }
              this.field_B.field_i = 0;
              this.field_B.field_o = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            this.field_B.a((byte) 0);
            ((ve) (var4)).a(true);
            if (!((ve) (var4)).field_q) {
              return null;
            }
            if (!this.field_B.c((byte) 16)) {
              var4 = this.field_B.a(param2, true, this.field_i, (byte) -80, (byte) 2);
              this.field_n.a((pg) (var4), true, (long)param2);
            }
            stackIn_67_0 = null;
            return (ve) (stackIn_67_0);
          }
          var5[var19.length - 2] = (byte)(this.field_k.field_y[param2] >>> 8);
          var5[-1 + var19.length] = (byte)this.field_k.field_y[param2];
          if (this.field_F != null) {
            this.field_s.a(param2, 115, var19, this.field_F);
            if (this.field_E[param2] != 1) {
              this.field_E[param2] = (byte) 1;
            }
          }
          if (!((ve) (var4)).field_q) {
            ((ve) (var4)).a(true);
          }
          stackIn_75_0 = var4;
          return (ve) (stackIn_75_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) (var4), "tj.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final byte[] a(int param0, boolean param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.a(0, 55, param0);
          if (var3 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var4 = var3.c(-108);
          var3.a(param1);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "tj.F(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        try {
          field_A = null;
          field_u = null;
          field_o = null;
          if (param0 < 65) {
            tj.a(true, (byte) -36);
          }
          field_t = null;
          field_y = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tj.N(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (ve) (this.field_n.a((long)param0, -43));
          if (param1 < 119) {
            this.f((byte) -99);
          }
          if (var3 == null) {
            return 0;
          }
          stackIn_6_0 = var3.e((byte) -121);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "tj.G(" + param0 + ',' + param1 + ')');
        }
    }

    tj(int param0, be param1, be param2, lk param3, pa param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_n = new di(16);
        this.field_p = 0;
        this.field_m = new vn();
        this.field_r = 0L;
        try {
          this.field_F = param1;
          this.field_i = param0;
          if (this.field_F != null) {
            this.field_j = true;
            this.field_h = new vn();
          } else {
            this.field_j = false;
          }
          stackIn_7_1 = (param8);
          this.field_z = stackIn_7_1;
          this.field_D = param2;
          this.field_v = param7;
          this.field_s = param4;
          this.field_w = param6;
          this.field_q = param5;
          this.field_B = param3;
          if (this.field_D != null) {
            this.field_x = (ve) ((Object) this.field_s.a(this.field_D, this.field_i, -6833));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_13_0 = var10;
          stackIn_13_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_13_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_13_0;
            stackIn_18_2 = "{...}";
          }
          stackIn_21_0 = stackIn_18_0;
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_22_0 = stackIn_21_0;
            stackIn_22_2 = "null";
          } else {
            stackIn_22_0 = stackIn_18_0;
            stackIn_22_2 = "{...}";
          }
          stackIn_25_0 = stackIn_22_0;
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_26_0 = stackIn_25_0;
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = stackIn_22_0;
            stackIn_26_2 = "{...}";
          }
          stackIn_29_0 = stackIn_26_0;
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_0 = stackIn_29_0;
            stackIn_30_2 = "null";
          } else {
            stackIn_30_0 = stackIn_26_0;
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_y = "<%0> is offering a rematch.";
        field_C = 9;
    }
}
