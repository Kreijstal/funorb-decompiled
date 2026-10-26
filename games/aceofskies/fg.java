/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends ArchiveProvider {
    private un field_g;
    private ArchiveIndex field_m;
    private ph field_v;
    private int field_p;
    private byte[] field_u;
    private bl field_l;
    private dk field_z;
    private bl field_e;
    static ResourceArchive field_t;
    static IntrusiveDeque field_r;
    private int field_j;
    private ag field_y;
    private int field_w;
    private byte[] field_h;
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_o;
    private boolean field_s;
    static String[] field_f;
    static ke field_A;
    static String field_k;
    private boolean field_q;
    private int field_d;
    private long field_x;
    private boolean field_i;

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 105) {
            var4 = (String) null;
            fg.a((String) null, 109);
          }
          var2_int = param0.length;
          var3 = new byte[var2_int];
          au.a(param0, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fg.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static cl a(String param0, int param1) {
        String var2 = null;
        cl var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        cl stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (gi.field_g == null) {
            return null;
          }
          if (param1 != 17680) {
            fg.b((byte) -26);
          }
          var5 = (CharSequence) ((Object) param0);
          var2 = vu.normalizePlayerName(param1 ^ 17773, var5);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (cl) (gi.field_g.a(param1 - 17556, (long)var2.hashCode()));
          while (var3 != null) {
            var6 = (CharSequence) ((Object) var3.field_I);
            var4 = vu.normalizePlayerName(125, var6);
            if (var4 == null) {
              var4 = var3.field_I;
            }
            if (var4.equals(var2)) {
              stackIn_15_0 = var3;
              return stackIn_15_0;
            }
            var3 = (cl) (gi.field_g.a(false));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("fg.K(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 1) {
          field_k = (String) null;
        }
        ag var3 = (ag) (this.field_v.a((byte) 106, (long)param1));
        if (var3 == null) {
          return 0;
        }
        return var3.e(21513);
    }

    final void b(int param0) {
        ag discarded$0 = null;
        ag discarded$1 = null;
        IntrusiveNode var2;
        int var3;
        int var4;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (null == this.field_o) {
          return;
        }
        if (null == this.a(true)) {
          return;
        }
        if (param0 != -20254) {
          return;
        }
        var2 = this.field_n.first(param0 ^ -268415203);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 >= 0) {
            if (var3 < this.field_m.field_l) {
              if (this.field_m.field_k[var3] == 0) {
                var2.unlink(-124);
              } else {
                if (this.field_h[var3] == 0) {
                  discarded$0 = this.a((byte) -37, 1, var3);
                }
                if (this.field_h[var3] == -1) {
                  discarded$1 = this.a((byte) -37, 2, var3);
                }
                if (this.field_h[var3] == 1) {
                  var2.unlink(param0 ^ 20327);
                }
              }
            } else {
              var2.unlink(-124);
            }
          } else {
            var2.unlink(-124);
          }
          var2 = this.field_n.next((byte) 103);
        }
    }

    final byte[] a(int param0, int param1) {
        ag var3 = this.a((byte) -37, 0, param0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.a(true);
        var3.unlink(param1 ^ -128);
        if (param1 != 2) {
          return (byte[]) null;
        }
        return var4;
    }

    final static void b(boolean param0) {
        tn.a(1, param0, nh.field_b, rt.field_e);
        ae.field_f = true;
    }

    final void a(byte param0) {
        ag discarded$3 = null;
        ag discarded$2 = null;
        ag discarded$1 = null;
        ag discarded$0 = null;
        int var2_int;
        ag var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        ag var2Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder2 = true;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_o != null) {
          if (this.a(true) == null) {
            return;
          }
          if (this.field_q) {
            var2_int = 1;
            var3 = this.field_o.first(268435455);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.field_h[var4] == 0) {
                discarded$3 = this.a((byte) -37, 1, var4);
              }
              if (this.field_h[var4] == 0) {
                var2_int = 0;
              } else {
                var3.unlink(-124);
              }
              var3 = this.field_o.next((byte) 103);
            }
            while (this.field_m.field_k.length > this.field_d) {
              if (this.field_m.field_k[this.field_d] == 0) {
                this.field_d = this.field_d + 1;
                continue;
              }
              if (this.field_z.field_d < 250) {
                if (this.field_h[this.field_d] == 0) {
                  discarded$2 = this.a((byte) -37, 1, this.field_d);
                }
                if (this.field_h[this.field_d] == 0) {
                  var6 = new IntrusiveNode();
                  var6.key = (long)this.field_d;
                  var2_int = 0;
                  this.field_o.addLast(81, var6);
                }
                this.field_d = this.field_d + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_q = false;
              this.field_d = 0;
            }
            decompiledFrameRemainder2 = false;
          }
          else {
            if (this.field_s) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_o.first(268435455);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.field_h[var4Lifetime1] != 1) {
                  discarded$1 = this.a((byte) -37, 2, var4Lifetime1);
                }
                if (this.field_h[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.unlink(-123);
                }
                var3Lifetime1 = this.field_o.next((byte) 103);
              }
              scanLoop1: while (true) {
                if (this.field_d < this.field_m.field_k.length) {
                  if (0 != this.field_m.field_k[this.field_d]) {
                    if (this.field_g.a((byte) -106)) {
                      var2_intLifetime1 = 0;
                      break scanLoop1;
                    }
                    if (this.field_h[this.field_d] != 1) {
                      discarded$0 = this.a((byte) -37, 2, this.field_d);
                    }
                    if (this.field_h[this.field_d] != 1) {
                      var7 = new IntrusiveNode();
                      var7.key = (long)this.field_d;
                      var2_intLifetime1 = 0;
                      this.field_o.addLast(115, var7);
                    }
                  }
                  this.field_d = this.field_d + 1;
                  continue;
                }
                break;
              }
              if (var2_intLifetime1 != 0) {
                this.field_d = 0;
                this.field_s = false;
                decompiledFrameRemainder2 = false;
              }
              else {
                if (param0 <= 84) {
                  this.field_m = (ArchiveIndex) null;
                }
                decompiledFrameRemainder0 = (this.field_i);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(this.field_x > kh.a(-106)))) {
                  var2 = (ag) (this.field_v.a(false));
                  while (var2 != null) {
                    if (!var2.field_p) {
                      if (var2.field_t) {
                        if (!var2.field_q) {
                          throw new RuntimeException();
                        }
                        var2.unlink(-124);
                      } else {
                        var2.field_t = true;
                      }
                    }
                    var2 = (ag) (this.field_v.a(0));
                  }
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              this.field_o = null;
            }
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          if (param0 <= 84) {
            this.field_m = (ArchiveIndex) null;
          }
          decompiledFrameRemainder0 = (this.field_i);
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameRemainder0 = !(this.field_x > kh.a(-106)))) {
            var2Lifetime1 = (ag) (this.field_v.a(false));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_p) {
                if (var2Lifetime1.field_t) {
                  if (!var2Lifetime1.field_q) {
                    throw new RuntimeException();
                  }
                  var2Lifetime1.unlink(-124);
                } else {
                  var2Lifetime1.field_t = true;
                }
              }
              var2Lifetime1 = (ag) (this.field_v.a(0));
            }
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_x = 1000L + kh.a(-95);
        }

    }

    final ArchiveIndex a(boolean param0) {
        un stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_m != null) {
          return this.field_m;
        }
        if (null == this.field_y) {
          if (this.field_g.a(false)) {
            return null;
          }
          this.field_y = (ag) ((Object) this.field_g.a(255, this.field_p, -21, true, (byte) 0));
        }
        if (this.field_y.field_p) {
          return null;
        }
        var7 = this.field_y.a(param0);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_y instanceof os) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_m = new ArchiveIndex(var7, this.field_j, this.field_u);
            if (this.field_m.field_m != this.field_w) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_m = null;
            if (this.field_g.a(false)) {
              this.field_y = null;
            } else {
              this.field_y = (ag) ((Object) this.field_g.a(255, this.field_p, -21, true, (byte) 0));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_m = new ArchiveIndex(var7, this.field_j, this.field_u);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_g.c((byte) -126);
            this.field_m = null;
            stackIn_16_0 = this.field_g;
            stackIn_17_1 = !(param0);
            if (!((un) (Object) stackIn_16_0).a(stackIn_17_1)) {
              this.field_y = (ag) ((Object) this.field_g.a(255, this.field_p, -21, true, (byte) 0));
            } else {
              this.field_y = null;
            }
            return null;
          }
          if (this.field_e != null) {
            this.field_z.a(var7, this.field_e, param0, this.field_p);
          }
        }
        this.field_y = null;
        if (this.field_l != null) {
          this.field_h = new byte[this.field_m.field_l];
        }
        return this.field_m;
    }

    public static void b(byte param0) {
        field_f = null;
        field_t = null;
        field_r = null;
        field_k = null;
        if (param0 <= 72) {
          fg.b(false);
        }
        field_A = null;
    }

    private final ag a(byte param0, int param1, int param2) {
        Object stackIn_90_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ag var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        var12 = (ag) (this.field_v.a((byte) 106, (long)param2));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_q &&
          var12.field_p) {
          var12.unlink(-125);
          var4 = null;
        }
        if (var4 == null) {
          if (0 != param1) {
            if (param1 == 1) {
              if (this.field_l == null) {
                throw new RuntimeException();
              }
              var4 = this.field_z.a((byte) 95, this.field_l, param2);
            } else {
              if (2 != param1) {
                throw new RuntimeException();
              }
              if (this.field_l == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_h[param2]) {
                throw new RuntimeException();
              }
              if (this.field_g.a((byte) -114)) {
                return null;
              }
              var4 = this.field_g.a(this.field_p, param2, -21, false, (byte) 2);
            }
          } else {
            if (this.field_l != null &&
              -1 != this.field_h[param2]) {
              var4 = this.field_z.a(this.field_l, (byte) 96, param2);
            } else {
              if (this.field_g.a(false)) {
                return null;
              }
              var4 = this.field_g.a(this.field_p, param2, param0 + 16, true, (byte) 2);
            }
          }
          this.field_v.a(-41, (long)param2, (IntrusiveNode) (var4));
        }
        if (((ag) (var4)).field_p) {
          return null;
        }
        var18 = ((ag) (var4)).a(true);
        var13 = var18;
        var5 = var13;
        if (param0 != -37) {
          return (ag) null;
        }
        if (var4 instanceof os) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              aq.field_d.reset();
              aq.field_d.update(var5, 0, var18.length - 2);
              var6_int = (int)aq.field_d.getValue();
              if (var6_int != this.field_m.field_g[param2]) {
                throw new RuntimeException();
              }
              if (this.field_m.field_i != null &&
                this.field_m.field_i[param2] != null) {
                var30 = this.field_m.field_i[param2];
                var29 = qm.a(0, var18.length - 2, var18, 0);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (255 & var5[-1 + var18.length]) + ((255 & var5[-2 + var18.length]) << 8);
              if ((65535 & this.field_m.field_a[param2]) != var7) {
                throw new RuntimeException();
              }
              if (this.field_h[param2] != 1) {
                if (this.field_h[param2] == 0) {
                }
                this.field_h[param2] = (byte) 1;
              }
              if (!((ag) (var4)).field_q) {
                ((ag) (var4)).unlink(param0 - 87);
              }
              stackIn_90_0 = var4;
              return (ag) (stackIn_90_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_h[param2] = (byte)-1;
            ((ag) (var4)).unlink(-125);
            if (((ag) (var4)).field_q &&
              !this.field_g.a(false)) {
              var4 = this.field_g.a(this.field_p, param2, -21, true, (byte) 2);
              this.field_v.a(-87, (long)param2, (IntrusiveNode) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            aq.field_d.reset();
            aq.field_d.update(var5, 0, -2 + var18.length);
            var6_int = (int)aq.field_d.getValue();
            if (var6_int != this.field_m.field_g[param2]) {
              throw new RuntimeException();
            }
            if (null != this.field_m.field_i &&
              null != this.field_m.field_i[param2]) {
              var28 = this.field_m.field_i[param2];
              var27 = qm.a(param0 ^ -37, -2 + var18.length, var18, 0);
              for (var9 = 0; 64 > var9; var9++) {
                if (~var27[var9] != ~var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_g.field_j = 0;
            this.field_g.field_e = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_g.c((byte) -46);
          ((ag) (var4)).unlink(param0 - 90);
          if (((ag) (var4)).field_q &&
            !this.field_g.a(false)) {
            var4 = this.field_g.a(this.field_p, param2, -21, true, (byte) 2);
            this.field_v.a(-114, (long)param2, (IntrusiveNode) (var4));
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_m.field_a[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_m.field_a[param2];
        if (null != this.field_l) {
          this.field_z.a(var18, this.field_l, true, param2);
          if (1 != this.field_h[param2]) {
            this.field_h[param2] = (byte) 1;
          }
        }
        if (!((ag) (var4)).field_q) {
          ((ag) (var4)).unlink(-126);
        }
        return (ag) (var4);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        int var26 = 0;
        int var27 = 0;
        int incrementValue$4 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var28 = 0;
        var28 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 > 0 &&
            !mg.a(param0, (byte) 23)) {
            throw new IllegalArgumentException("");
          }
          if (param1 > 0 &&
            !mg.a(param1, (byte) 10)) {
            throw new IllegalArgumentException("");
          }
          if (param3 != 32993) {
            throw new IllegalArgumentException("");
          }
          var8_int = 0;
          stackIn_15_0 = (param1 > param0) ? param0 : param1;
          var9 = stackIn_15_0;
          var10 = param0 >> 1;
          var11 = param1 >> 1;
          var12 = param5;
          var13 = new int[var11 * var10];
          if (param4 < 35) {
            field_A = (ke) null;
          }
          while (true) {
            jaggl.OpenGL.glTexImage2Di(param2, var8_int, param7, param0, param1, 0, param3, param6, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var15 = 0;
            var24 = 0;
            var25 = var24 + param0;
            var14 = var13;
            for (var26 = 0; var11 > var26; var26++) {
              for (var27 = 0; var27 < var10; var27++) {
                var16 = var12[var24++];
                var18 = var12[var25++];
                var17 = var12[var24++];
                var22 = 255 & var16;
                var19 = var12[var25++];
                var23 = 255 & var16 >> 24;
                var21 = (65501 & var16) >> 8;
                var20 = 255 & var16 >> 16;
                var22 = var22 + (var17 & 255);
                var21 = var21 + ((65454 & var17) >> 8);
                var20 = var20 + ((16771045 & var17) >> 16);
                var23 = var23 + (255 & var17 >> 24);
                var22 = var22 + (var18 & 255);
                var23 = var23 + (255 & var18 >> 24);
                var21 = var21 + ((65350 & var18) >> 8);
                var20 = var20 + (var18 >> 16 & 255);
                var23 = var23 + (255 & var19 >> 24);
                var21 = var21 + ((var19 & 65535) >> 8);
                var20 = var20 + ((var19 & 16745210) >> 16);
                var22 = var22 + (var19 & 255);
                incrementValue$4 = var15;
                var15++;
                var13[incrementValue$4] = vo.a(vo.a(pg.a(var21, 1020) << 6, vo.a(pg.a(var20, 1020) << 14, pg.a(-16777216, var23 << 22))), pg.a(1020, var22) >> 2);
              }
              var24 = var24 + param0;
              var25 = var25 + param0;
            }
            var13 = var12;
            param1 = var11;
            param0 = var10;
            var12 = var14;
            var9 = var9 >> 1;
            var11 = var11 >> 1;
            var10 = var10 >> 1;
            var8_int++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("fg.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void c(int param0) {
        if (this.field_l == null) {
          return;
        }
        if (param0 != -2) {
          return;
        }
        this.field_s = true;
        if (null == this.field_o) {
          this.field_o = new IntrusiveDeque();
        }
    }

    fg(int param0, bl param1, bl param2, un param3, dk param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_v = new ph(16);
        this.field_d = 0;
        this.field_n = new IntrusiveDeque();
        this.field_x = 0L;
        try {
          this.field_p = param0;
          this.field_l = param1;
          if (this.field_l != null) {
            this.field_q = true;
            this.field_o = new IntrusiveDeque();
          } else {
            this.field_q = false;
          }
          this.field_g = param3;
          this.field_e = param2;
          this.field_u = param6;
          stackIn_7_1 = (param8);
          this.field_i = stackIn_7_1;
          this.field_j = param5;
          this.field_z = param4;
          this.field_w = param7;
          if (this.field_e != null) {
            this.field_y = (ag) ((Object) this.field_z.a(this.field_e, (byte) 93, this.field_p));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("fg.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_r = new IntrusiveDeque();
        field_f = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_A = new ke();
    }
}
