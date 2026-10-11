/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    private am[] field_d;
    static String field_h;
    private int field_f;
    static bd field_b;
    private am field_g;
    private am field_c;
    private int field_a;
    static int field_e;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          p var2 = (p) null;
          jm.a((int[]) null, -57, (byte) 5, (p) null);
        }
        field_h = null;
    }

    final void a(int param0, long param1, am param2) {
        am var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param2.field_f) {
            param2.b(-39);
          }
          var5 = this.field_d[(int)((long)(this.field_f - 1) & param1)];
          param2.field_g = var5;
          param2.field_f = var5.field_f;
          param2.field_f.field_g = param2;
          param2.field_c = param1;
          param2.field_g.field_f = param2;
          if (param0 > -61) {
            this.field_f = -71;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("jm.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final am b(int param0) {
        int fieldTemp$0 = 0;
        am var2;
        int var3;
        am var4;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (~this.field_a < param0 &&
          this.field_d[-1 + this.field_a] != this.field_c) {
          var2 = this.field_c;
          this.field_c = var2.field_g;
          return var2;
        }
        do {
          if (this.field_a >= this.field_f) {
            return null;
          }
          fieldTemp$0 = this.field_a;
          this.field_a = this.field_a + 1;
          var4 = this.field_d[fieldTemp$0].field_g;
          var2 = var4;
        } while (var4 == this.field_d[this.field_a - 1]);
        this.field_c = var2.field_g;
        return var2;
    }

    final am a(int param0) {
        if (param0 > -92) {
          this.b(31);
        }
        this.field_a = 0;
        return this.b(-1);
    }

    final static void a(int[] param0, int param1, byte param2, p param3) {
        int var30 = 0;
        int stackIn_39_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        Object var15 = null;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        oj var31 = null;
        int var32 = 0;
        double var33 = 0.0;
        int var35 = 0;
        double var36 = 0.0;
        double var38 = 0.0;
        int var40 = 0;
        int var41 = 0;
        double var42 = 0.0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        oj var47 = null;
        var46 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param2 > -126) {
            field_e = 96;
          }
          if (0 == param3.field_e) {
            var6 = (double)param3.field_j.field_e + param3.field_l.field_f;
            var8 = (double)param3.field_j.field_g + param3.field_l.field_a;
            var10 = 0;
            while (param3.field_e == 0) {
              param3.field_l.a(2, (byte) 94, param3.field_c);
              param3.a(8573);
              param0[param1] = 0;
              if (param0[param3.field_j.b(-4)] == 2) {
                param3.field_e = 1;
                param3.field_c = 255.0 * Math.random();
                var10 = 1;
              }
              param0[param1] = 3;
            }
            var11 = (double)param3.field_j.field_e + param3.field_l.field_f;
            var13 = param3.field_l.field_a + (double)param3.field_j.field_g;
            if (var10 != 0) {
              var13 = (double)param3.field_j.field_g + param3.field_l.field_a + 0.5;
              var11 = 0.5 + ((double)param3.field_j.field_e + param3.field_l.field_f);
            }
            var15 = null;
            var16 = (-var13 + var8) * (-var13 + var8) + (-var11 + var6) * (var6 - var11);
            for (var30 = 0; var30 < rc.field_e; var30++) {
              var31 = re.field_n[var30];
              var15 = var31;
              var15 = var31;
              var32 = var31.field_i;
              if ((0 == var30 ||
                !(var31.field_I <= 0)) && (!var31.b(6) &&
                var32 != 5 &&
                var32 != 22) && (var32 < 12 ||
                var32 >= 18)) {
                var33 = 1.0;
                var28 = var31.field_l.field_a + (double)var31.field_j.field_g;
                if (20 == var32) {
                  var33 = 0.5;
                }
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted0 = true;
                var26 = (double)var31.field_j.field_e + var31.field_l.field_f;
                var18 = -var33 + var26;
                var20 = -var33 + var28;
                var24 = var20 + 2.0 * var33;
                var22 = var18 + 2.0 * var33;
                var35 = 0;
                if (var31.field_u != null) {
                  var36 = -var6 + var11;
                  var38 = -var8 + var13;
                  var40 = -(var31.field_u.field_z >> 1) + (int)(var26 * 24.0);
                  var41 = -(var31.field_u.field_A >> 1) + (int)(24.0 * var28);
                  var42 = 0.0;
                  while (1.0 > var42) {
                    if (var35 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var44 = (int)((var6 + var42 * var36) * 24.0);
                    var45 = (int)((var8 + var42 * var38) * 24.0);
                    stackIn_39_0 = (!var31.field_u.d(var40, var41, var44, var45)) ? 0 : 1;
                    var35 = stackIn_39_0;
                    if (var35 != 0) {
                      var6 = var6 + var36 * var42;
                      var8 = var8 + var42 * var38;
                    }
                    var42 = var42 + 0.05;
                  }
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted0)) {
                  if (!fb.a(var20, (byte) 43, var24, var11, var18, var8, var22, var13, var6)) {
                    stackIn_50_0 = (fb.a(var24, (byte) 43, var20, var11, var18, var8, var22, var13, var6)) ? 1 : 0;
                  } else {
                    stackIn_50_0 = 1;
                  }
                  var35 = stackIn_50_0;
                }
                if (var35 != 0) {
                  var4_double = (-var28 + var8) * (var8 - var28) + (-var26 + var6) * (-var26 + var6);
                  if (var16 > var4_double) {
                    var15 = var31;
                    var16 = var4_double;
                  }
                }
              }
            }
            if (var15 == null) {
              var47 = (oj) null;
              nh.a((oj) null, -29966);
            } else {
              if (((oj) (var15)).a(param3.field_i, -93) &&
                ((oj) (var15)).field_i != 5 &&
                22 != ((oj) (var15)).field_i) {
                ((oj) (var15)).field_I = ((oj) (var15)).field_I - 1;
              }
              if (0 > ((oj) (var15)).field_I) {
                ((oj) (var15)).field_I = 0;
              }
              if (((oj) (var15)).field_i == 0) {
                ci.a(25, 60);
              }
              ((oj) (var15)).field_F = 255;
              param3.field_e = 1;
              param3.field_c = Math.random() * 255.0;
              param3.field_j.field_g = ((oj) (var15)).field_j.field_g;
              param3.field_j.field_e = ((oj) (var15)).field_j.field_e;
              param3.field_l.field_f = ((oj) (var15)).field_l.field_f + Math.random() - 0.5;
              param3.field_l.field_a = ((oj) (var15)).field_l.field_a + Math.random() - 0.5;
              if (((oj) (var15)).field_I <= 0) {
                param3.field_i = 3;
              }
              nh.a((oj) (var15), -29966);
              if ((((oj) (var15)).field_i == 5 ||
                ((oj) (var15)).b(6) ||
                ((oj) (var15)).field_i == 22) &&
                1 == uj.field_l) {
                eh.field_c.a(lm.field_A[11], 100, uh.field_i);
              }
            }
          }
          if (0 < param3.field_e) {
            param3.field_e = param3.field_e + 1;
          }
          if (param3.field_e > 32) {
            param3.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_87_0 = var4;
          stackIn_87_1 = new StringBuilder().append("jm.E(");
          if (param0 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          stackIn_90_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_87_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(')').toString());
        }
    }

    final am a(boolean param0, long param1) {
        am var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        am var4 = this.field_d[(int)((long)(this.field_f - 1) & param1)];
        this.field_g = var4.field_g;
        if (param0) {
          this.a(false, 79L);
        }
        while (var4 != this.field_g) {
          if (param1 == this.field_g.field_c) {
            var5 = this.field_g;
            this.field_g = this.field_g.field_g;
            return var5;
          }
          this.field_g = this.field_g.field_g;
        }
        this.field_g = null;
        return null;
    }

    final static String a(byte param0) {
        if (od.field_I == ti.field_b) {
          return fj.field_Sb;
        }
        if (!c.field_a.d((byte) -59)) {
          return c.field_a.a((byte) -34);
        }
        if (param0 != 93) {
          p var2 = (p) null;
          jm.a((int[]) null, -43, (byte) 16, (p) null);
        }
        if (ki.field_f == ti.field_b) {
          return c.field_a.a((byte) -34);
        }
        return rf.field_e;
    }

    jm(int param0) {
        int var2 = 0;
        am dupTemp$0 = null;
        am var3 = null;
        this.field_a = 0;
        this.field_f = param0;
        this.field_d = new am[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new am();
          var3 = dupTemp$0;
          this.field_d[var2] = dupTemp$0;
          var3.field_f = var3;
          var3.field_g = var3;
        }
    }

    static {
        field_e = -1;
        field_h = "Please try again in a few minutes.";
    }
}
