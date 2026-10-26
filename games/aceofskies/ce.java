/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends ab implements dr, dn {
    static pt field_t;
    private bm field_x;
    private boolean field_B;
    private mi field_D;
    static int field_u;
    private mi field_z;
    private boolean field_C;
    private bm field_v;
    private mi field_w;
    private String field_y;
    private boolean field_E;
    static int field_A;

    final void a(byte param0, int param1, int param2, int param3) {
        if (this.field_y != null) {
          qo.field_b.a(this.field_y, 20 + param3 + this.field_p, 15 + param2 + this.field_h, this.field_q - 40, this.field_n, 16777215, -1, 1, 0, qo.field_b.field_I);
        }
        if (null != this.field_w) {
          vp.b(param3 + 10, param2 + 134, -20 + this.field_q, 4210752);
        }
        if (param0 <= 64) {
          return;
        }
        super.a((byte) 77, param1, param2, param3);
    }

    final static float a(float param0, int param1) {
        if (param1 > -55) {
          field_u = -54;
        }
        return param0 * (param0 * param0) * (param0 * (-15.0f + param0 * 6.0f) + 10.0f);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(-20, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.b(param3, -101);
            return stackIn_6_0;
          }
          if (param1 == 99) {
            stackIn_10_0 = this.a(80, param3);
            return stackIn_10_0;
          }
          var5_int = -87 % ((param0 + 53) / 33);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ce.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        bm var3 = null;
        String var4 = null;
        try {
          var3 = this.field_v;
          var4 = param0;
          var3.a(-20975, var4, false);
          if (param1 < 43) {
            bm var5 = (bm) null;
            this.b((bm) null, 39);
          }
          this.field_x.f((byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ce.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(int param0) {
        this.field_v.f((byte) -2);
        this.field_x.f((byte) -2);
        if (param0 != 310) {
          this.field_x = (bm) null;
        }
    }

    final String d(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (null == this.field_v.field_f) {
          return "";
        }
        return this.field_v.field_f;
    }

    final static void a(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        uc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        ga var6_ref_ga = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        CipherPacketBuffer var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 116) {
            field_A = -61;
          }
          var28 = IntKeyLookup.field_c;
          var2 = var28.readUnsignedByte(-85);
          if (var2 == 0) {
            var3 = var28.readUnsignedShort((byte) 0);
            var4 = (uc) (nh.field_g.first(268435455));
            while (var4 != null) {
              if (var3 != var4.field_n) {
                var4 = (uc) (nh.field_g.next((byte) 103));
                continue;
              }
              break;
            }
            if (var4 == null) {
              te.b(true);
              return;
            }
            var5 = var28.readUnsignedByte(param0 - 167);
            if (var5 != 0) {
              var6 = var4.field_j;
              pe.field_b[0].field_f = null;
              var7 = var4.field_m;
              pe.field_b[0].field_e = fj.field_a;
              pe.field_b[0].field_g = false;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                pe.field_b[var8_int].field_e = var28.h(-17883);
                pe.field_b[var8_int].field_g = false;
                if (var28.readUnsignedByte(-47) != 1) {
                  pe.field_b[var8_int].field_f = null;
                } else {
                  pe.field_b[var8_int].field_f = var28.h(param0 ^ -17839);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_e = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_f = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_h = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.readUnsignedByte(-119);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var28.readUnsignedByte(param0 ^ 69);
                  var21 = pe.field_b[var20].field_e;
                  var22 = var28.readLong((byte) -32);
                  var24 = var28.position;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = pe.field_b[var20].field_f;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.readInt((byte) 124);
                    }
                  }
                  if (var21 != null &&
                    fd.a(var21, (byte) -6)) {
                    var8[1][var13] = fj.field_a;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var28.position = var24;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.readInt((byte) 114);
                    }
                  }
                  if (var6 > var14 &&
                    !pe.field_b[var20].field_g) {
                    pe.field_b[var20].field_g = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = pe.field_b[var20].field_f;
                    var10[2][var14] = var22;
                    var14++;
                    var28.position = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.readInt((byte) 113);
                    }
                  }
                }
              }
            }
            var4.field_i = true;
            var4.unlink(param0 ^ -16);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.readUnsignedShort((byte) 0);
            var4_long = var28.readLong((byte) 64);
            var6_ref_ga = (ga) (tq.field_d.first(268435455));
            while (var6_ref_ga != null) {
              if (var6_ref_ga.field_m != var3Lifetime1) {
                var6_ref_ga = (ga) (tq.field_d.next((byte) 103));
                continue;
              }
              break;
            }
            if (var6_ref_ga == null) {
              te.b(true);
              return;
            }
            var6_ref_ga.field_j = var4_long;
            var6_ref_ga.unlink(-127);
            return;
          }
          v.a("HS1: " + CipherPacketBuffer.k((byte) 65), (byte) -52, (Throwable) null);
          te.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "ce.JA(" + param0 + ')');
        }
    }

    public final void b(bm param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_v) {
            this.field_x.a((ea) (this), (byte) -42);
          }
          if (this.field_x == param0) {
            this.d((byte) -85);
          }
          if (param1 != -40) {
            this.field_D = (mi) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ce.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 != -3) {
          return false;
        }
        return nl.field_s;
    }

    private final void d(byte param0) {
        if (fh.e(31574) ||
          !(this.field_v.field_f.length() <= 0) &&
          !(0 >= this.field_x.field_f.length())) {
          s.a(this.field_x.field_f, false, this.field_v.field_f);
        }
        if (param0 > -59) {
          this.d((byte) -4);
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != this.field_D) {
            if (param1 != this.field_w) {
              if (this.field_z != param1) {
                var6_int = 122 % ((param4 + 27) / 61);
                return;
              }
              if (!this.field_C) {
                if (this.field_E) {
                  pj.b((byte) -75);
                } else {
                  PacketBuffer.i(-112);
                }
              } else {
                ArchiveIndex.b(17);
              }
            } else {
              cu.c((byte) 104);
            }
          } else {
            this.d((byte) -84);
          }
          var6_intLifetime1 = 122 % ((param4 + 27) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ce.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(bm param0, int param1) {
        try {
          if (param1 != -6525) {
            String var4 = (String) null;
            this.a((String) null, 56);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ce.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ce(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ir) null);
        bc dupTemp$0 = null;
        bc dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        mi stackIn_18_1 = null;
        mi stackIn_18_2 = null;
        mi stackIn_19_1 = null;
        mi stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb var6 = null;
        RuntimeException var6_ref = null;
        hc var7 = null;
        String var8 = null;
        gu var9 = null;
        bc var12 = null;
        bc var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_E = stackIn_4_1;
          this.field_y = param1;
          stackIn_7_1 = (param3);
          this.field_B = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_C = stackIn_10_1;
          if (this.field_C && (this.field_B ||
            this.field_E)) {
            throw new IllegalStateException();
          }
          this.field_v = (bm) ((Object) new kk(param0, (no) (this), 100));
          this.field_x = (bm) ((Object) new kk("", (no) (this), 20));
          if (!this.field_C) {
            this.field_D = new mi(ms.field_a, (no) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_E) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = Bullet.field_j;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = nu.field_a;
            }
            this.field_z = new mi(stackIn_19_3, (no) null);
            if (this.field_B) {
              this.field_w = new mi(SteeringMode.field_b, (no) (this));
            }
          } else {
            this.field_D = new mi(hg.field_z, (no) null);
            this.field_z = new mi(mb.field_s, (no) null);
            this.field_v.field_u = false;
          }
          this.field_v.field_e = (ir) ((Object) new sl(10000536));
          this.field_x.field_e = (ir) ((Object) new ul(10000536));
          var6 = new qb();
          this.field_D.field_e = (ir) ((Object) var6);
          if (null != this.field_z) {
            this.field_z.field_e = (ir) ((Object) var6);
          }
          this.field_v.field_k = ae.field_g;
          if (null != this.field_w) {
            this.field_w.field_e = (ir) ((Object) var6);
          }
          if (this.field_w != null) {
            this.field_w.field_k = cl.field_db;
          }
          if (this.field_C) {
            this.field_z.field_k = gq.field_d;
          } else {
            if (this.field_E) {
              this.field_z.field_k = td.field_c;
              this.field_z.field_e = (ir) ((Object) new wg());
            } else {
              this.field_z.field_e = (ir) ((Object) new wg());
            }
          }
          this.field_h = 15;
          var7 = qo.field_b;
          if (null != this.field_y) {
            this.field_h = this.field_h + (5 + var7.a(this.field_y, this.field_q - 40, var7.field_I));
          }
          var8 = kk.field_J;
          var9 = lc.a(17123, bm.m(125));
          if (ef.field_k != var9) {
            if (lp.field_f == var9) {
              var8 = io.field_e;
            }
          } else {
            var8 = hu.field_b;
          }
          dupTemp$0 = new bc(10, this.field_h, -20 + this.field_q, 25, this.field_v, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(dupTemp$0, 1);
          this.field_h = this.field_h + (((ea) ((Object) var12)).field_n + 5);
          dupTemp$1 = new bc(10, this.field_h, -20 + this.field_q, 25, this.field_x, false, 80, 3, var7, 16777215, vj.field_b);
          var13 = dupTemp$1;
          this.a(dupTemp$1, 1);
          this.field_D.field_o = (no) (this);
          this.field_h = this.field_h + (5 + ((ea) ((Object) var13)).field_n);
          if (null != this.field_w) {
            this.field_w.field_o = (no) (this);
          }
          if (null != this.field_z) {
            this.field_z.field_o = (no) (this);
          }
          if (this.field_w != null) {
            this.field_D.a(30, 85, this.field_h, -95 + this.field_q, (byte) 126);
            this.field_h = this.field_h + 60;
          } else {
            this.field_D.a(30, 8, this.field_h, -6 + (this.field_q - 10), (byte) 126);
            this.field_h = this.field_h + 35;
          }
          if (null != this.field_w) {
            this.field_w.a(30, 8, this.field_h, this.field_q - 6 - 10, (byte) 126);
            this.field_h = this.field_h + 35;
          }
          if (this.field_z != null) {
            if (!this.field_C &&
              !this.field_E) {
              this.field_z.a(20, 8, this.field_h, 40, (byte) 126);
              this.field_h = this.field_h + 25;
            } else {
              this.field_z.a(30, 8, this.field_h, this.field_q - 6 - 10, (byte) 127);
              this.field_h = this.field_h + 35;
            }
          }
          this.a(this.field_h + 3, 0, 0, this.field_q, (byte) 126);
          this.a(this.field_D, 1);
          if (this.field_w != null) {
            this.a(this.field_w, 1);
          }
          if (null != this.field_z) {
            this.a(this.field_z, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ce.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static ll[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -29003) {
          field_t = (pt) null;
        }
        return qk.a(3, 1, param3, param4, 1, 1, param1, -128, param0);
    }

    public static void i(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 35) / 61);
    }

    static {
        field_t = new pt();
    }
}
