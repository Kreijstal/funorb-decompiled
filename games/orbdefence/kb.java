/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb extends ca {
    private int field_A;
    private pd field_E;
    int field_C;
    private int field_t;
    private int[] field_i;
    private int field_j;
    int field_F;
    int field_l;
    private int field_B;
    private double field_u;
    private ok[] field_r;
    static int field_m;
    int field_g;
    private int field_n;
    private int field_x;
    private boolean field_z;
    kb field_s;
    private int field_D;
    lb field_p;
    private int field_q;
    private int field_v;
    private int field_o;
    private int field_k;
    private f field_f;
    int field_w;
    int field_h;
    private int field_y;

    final void b(int param0, int param1, int param2) {
        int stackIn_36_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6_intLifetime1;
        int var6_intLifetime2;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          this.field_g = param2;
          this.field_h = param1;
          var4_int = 10;
          var5 = 2;
          if (this.field_C == 1) {
            var4_int = 8 + 2 * this.field_F;
            var5 = 2;
          }
          if (this.field_C == 4) {
            var4_int = 30;
            var5 = 5;
          }
          if (this.field_C == 2) {
            var4_int = 20;
            if (this.field_F == 3) {
              var4_int = 25;
            }
            if (4 == this.field_F) {
              var4_int = 30;
            }
            var5 = 5;
          }
          if (this.field_C == 3) {
            var4_int = 6;
            var5 = 2;
          }
          if (this.field_C == 5) {
            var5 = 2;
            var4_int = 6;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted0 = true;
          this.field_i = new int[(1 + 2 * var4_int) * (2 * var4_int + 1) - (var5 * 2 - 1) * ((var5 - 1) * 2 + 1)];
          this.field_l = var4_int;
          this.field_D = param0;
          if (this.field_C != 0 &&
            3 != this.field_C) {
            if (this.field_C == 1 ||
              2 == this.field_C ||
              this.field_C == 5) {
              var6_int = this.field_g;
              var7 = this.field_h;
              this.field_g = var6_int;
              while (true) {
                stackIn_36_0 = this.field_g;
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_36_0 < var6_int + 1) {
                  stackIn_52_1 = var7;
                  decompiledFrameRemainder0 = (var9 == 0);
                  if (decompiledFrameRemainder0) {
                    this.field_h = stackIn_52_1;
                    while (this.field_h < var7 + 1) {
                      stackIn_36_0 = -var4_int;
                      var8 = stackIn_36_0;
                      while (var8 < var4_int) {
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, -var4_int + this.field_g, var8 + this.field_h);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, var8 + this.field_g, var4_int + this.field_h);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, var4_int + this.field_g, this.field_h - var8);
                        this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - var8, this.field_h - var4_int);
                        var8++;
                      }
                      this.field_h = this.field_h + 1;
                    }
                    this.field_g = this.field_g + 1;
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.field_g = var6_int;
                  stackIn_52_1 = var7;
                }
                this.field_h = stackIn_52_1;
                if (var9 == 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (decompiledFrameRemainder1 = (this.field_C == 4))) {
              this.field_g = this.field_g + 1;
              var4_int++;
              this.field_h = this.field_h + 1;
              var6_intLifetime2 = -var4_int;
              while (true) {
                if (var4_int > var6_intLifetime2) {
                  this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, -var4_int + this.field_g, var6_intLifetime2 + this.field_h);
                  this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, var6_intLifetime2 + this.field_g, this.field_h + var4_int);
                  this.field_D = this.a(-7, var5, var4_int, this.field_D, var4_int + this.field_g, -var6_intLifetime2 + this.field_h);
                  this.field_D = this.a(-7, var5, var4_int, this.field_D, -var6_intLifetime2 + this.field_g, -var4_int + this.field_h);
                  var6_intLifetime2++;
                  if (var9 == 0) {
                    continue;
                  }
                } else {
                  this.field_h = this.field_h - 1;
                  var4_int--;
                  this.field_g = this.field_g - 1;
                }
                break;
              }
              decompiledFrameRemainder1 = (var9 != 0);
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameCompleted0)) {
            var6_intLifetime1 = -var4_int;
            while (var6_intLifetime1 < var4_int) {
              this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, -var4_int + this.field_g, this.field_h + var6_intLifetime1);
              this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g + var6_intLifetime1, var4_int + this.field_h);
              this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g + var4_int, this.field_h - var6_intLifetime1);
              if (var9 != 0) {
                break;
              }
              this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - var6_intLifetime1, -var4_int + this.field_h);
              var6_intLifetime1++;
            }
          }
          var6 = this.field_i;
          this.field_i = new int[this.field_D];
          var7 = 0;
          do {
            if (var7 >= this.field_D) {
              this.field_w = this.field_g + this.field_f.field_f.field_c * this.field_h;
              break;
            }
            this.field_i[var7] = var6[var7];
            var7++;
          } while (var9 == 0);
          if (5 == this.field_C) {
            this.field_y = 0;
            this.field_k = 0;
            this.field_B = 0;
            this.field_r = new ok[(1 + this.field_F) * 25 + 1];
            var7 = 0;
            while (var7 < this.field_r.length) {
              this.field_r[var7] = new ok();
              var7++;
              if (var9 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var4), "kb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 27) {
            stackIn_2_0 = -2;
            return stackIn_2_0;
          }
          if (this.field_k == this.field_B) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          if (this.field_k < this.field_B) {
            stackIn_10_0 = this.field_B - this.field_k;
            return stackIn_10_0;
          }
          stackIn_8_0 = this.field_B - this.field_k + this.field_r.length;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.A(" + param0 + ')');
        }
    }

    private final boolean a(int param0, float param1, int param2, int param3, float param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = -102 % ((-37 - param2) / 56);
          var6_int = (this.field_B + 1) % this.field_r.length;
          if (~this.field_k == ~var6_int) {
            return false;
          }
          this.field_r[this.field_B].field_e = param1;
          this.field_r[this.field_B].field_d = param4;
          this.field_r[this.field_B].field_b = param0;
          this.field_r[this.field_B].field_g = param3;
          this.field_r[this.field_B].field_c = this.field_y + 60;
          this.field_B = var6_int;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var6), "kb.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(mg param0, boolean param1) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3_int = 0;
          int var4 = 0;
          int var5 = 0;
          int stackIn_18_0 = 0;
          int stackIn_18_1 = 0;
          RuntimeException stackIn_33_0 = null;
          StringBuilder stackIn_33_1 = null;
          String stackIn_34_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          var5 = OrbDefence.field_D ? 1 : 0;
          try {
            var2 = new byte[24];
            if (param1) {
              field_m = -86;
            }
            if (null != s.field_y) {
              try {
                s.field_y.a(0L, -1);
                s.field_y.a(var2, 4);
                var3_int = 0;
                L5: while (true) {
                  if (var3_int < 24) {
                    stackIn_18_0 = -1;
                    stackIn_18_1 = ~var2[var3_int];
                    if (var5 != 0) {
                      break L5;
                    }
                    if (stackIn_18_0 == stackIn_18_1 ||
                      var5 != 0) {
                      var3_int++;
                      continue;
                    }
                  }
                  stackIn_18_0 = -25;
                  stackIn_18_1 = ~var3_int;
                  break;
                }
                if (stackIn_18_0 >= stackIn_18_1) {
                  throw new IOException();
                }
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                boolean decompiledFrameCompleted0 = true;
                exception = (Exception) (Object) decompiledCaughtException;
                var4 = 0;
                while (var4 < 24) {
                  var2[var4] = (byte) -1;
                  var4++;
                  if (var5 != 0) {
                    decompiledRegionSelector0 = 1;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  decompiledRegionSelector0 = 0;
                }
              }
              if (decompiledRegionSelector0 != 0) {
                return;
              }
            }
            param0.a(0, 24, (byte) -11, var2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_33_0 = runtimeException;
            stackIn_33_1 = new StringBuilder().append("kb.D(");
            if (param0 == null) {
              stackIn_34_2 = "null";
            } else {
              stackIn_34_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            ld.field_e = param2;
            try {
              var3 = param0.getParameter("cookieprefix");
              var4 = param0.getParameter("cookiehost");
              if (param1) {
                return;
              }
              var5 = var3 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              if (param2.length() != 0) {
                var5 = var5 + "; Expires=" + dh.a(-15591, ji.b(-78) + 94608000000L) + "; Max-Age=" + 94608000L;
                if (OrbDefence.field_D) {
                  var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
              } else {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              gm.a((byte) -17, "document.cookie=\"" + var5 + "\"", param0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            g.a(1, param0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("kb.B(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, pd param1, int param2) {
        int dupTemp$0 = 0;
        int stackIn_89_0 = 0;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb var9 = null;
        int var10 = 0;
        int stackIn_89_0Lifetime1;
        int var6Lifetime1;
        int var6Lifetime1Lifetime1;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          if (-param1.field_h + param1.field_o <= 0) {
            this.field_f.field_h.a(-74, new me((double)param1.field_u, (double)param1.field_z, 1));
            return;
          }
          if (null != this.field_p) {
            nh.field_b = nh.field_b + param0;
            this.field_p.field_d = this.field_p.field_d + param0;
          }
          param1.field_h = param1.field_h + param0;
          var4_int = 79 % ((param2 + 47) / 56);
          if (null == param1.field_p) {
            var5 = this.field_g - param1.field_u;
            var6 = -param1.field_z + this.field_h;
            if (var6 * var6 + var5 * var5 < 100) {
              param1.field_B = 0;
              param1.field_p = this;
            }
          }
          if (-param1.field_h + param1.field_o <= 0) {
            boolean decompiledSharedTail0 = !(param1.field_n);
            if (!decompiledSharedTail0) {
              ea.a(53, mh.field_a[54], (int)(96.0 * param1.field_v));
              decompiledSharedTail0 = (var10 != 0);
            }
            if (decompiledSharedTail0) {
              ea.a(11, mh.field_a[(int)(Math.random() * 5.0) + 49], (int)(96.0 * param1.field_v));
            }
            param1.field_h = param1.field_h - param1.field_o;
            param1.field_o = 0;
            if (this.field_F == 4) {
              if (this.field_C == 0) {
                this.field_f.field_t = this.field_f.field_t + 1;
                if (this.field_f.field_t == 99) {
                  f.a(9, 246, (byte) -25);
                }
              }
              if (this.field_C == 1) {
                this.field_f.field_l = this.field_f.field_l + 1;
                if (this.field_f.field_l == 99) {
                  f.a(10, 245, (byte) -25);
                }
              }
              if (this.field_C == 2) {
                this.field_f.field_u = this.field_f.field_u + 1;
                if (this.field_f.field_u == 99) {
                  f.a(11, 244, (byte) -25);
                }
              }
              if (this.field_C == 4) {
                this.field_f.field_p = this.field_f.field_p + 1;
                if (this.field_f.field_p == 99) {
                  f.a(12, 243, (byte) -25);
                }
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (null != this.field_p) {
              this.field_p.field_d = this.field_p.field_d + he.field_p[param1.field_y];
              nh.field_b = nh.field_b + he.field_p[param1.field_y];
              var5 = he.field_p[param1.field_y];
              if (param1.field_n) {
                var5 = var5 + he.field_p[param1.field_y] * 99;
              }
              var6Lifetime1 = 0;
              while (var6Lifetime1 < var5) {
                this.field_f.field_b.a(-91, new oj(param1.field_u, param1.field_z, this.field_p, var6Lifetime1));
                var6Lifetime1++;
                if (var10 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted1) {
              this.field_f.field_h.a(-99, new me((double)param1.field_u, (double)param1.field_z, 1));
            }
            boolean decompiledFrameCompleted0 = true;
            if (!(this.field_f.field_x <= 11) ||
              !(this.field_f.field_m < 4)) {
              this.field_f.field_f.field_g[param1.field_u + this.field_f.field_f.field_c * param1.field_z] = this.field_f.field_f.field_g[param1.field_u + this.field_f.field_f.field_c * param1.field_z] + 5;
              var5 = 0;
              while (this.field_D > var5) {
                dupTemp$0 = this.field_i[var5];
                this.field_f.field_f.field_v[dupTemp$0] = this.field_f.field_f.field_v[dupTemp$0] + 1;
                var5++;
                if (var10 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (param1.field_y != 5 &&
                !param1.field_n) {
                return;
              }
              var5 = 3;
            }
            if (param1.field_n) {
              var5 = 5;
              if (5 == param1.field_y) {
                var5 = 10;
              }
            }
            var6Lifetime1Lifetime1 = param1.field_u - var5;
            while (true) {
              stackIn_89_0 = param1.field_u + var5;
              if (stackIn_89_0 < var6Lifetime1Lifetime1) {
                return;
              }
              if (var10 != 0) {
                return;
              }
              var7 = param1.field_z - var5;
              while (var7 <= (var5 + param1.field_z)) {
                stackIn_89_0Lifetime1 = var6Lifetime1Lifetime1;
                if (stackIn_89_0Lifetime1 >= 0 &&
                  this.field_f.field_f.field_c > var6Lifetime1Lifetime1 &&
                  0 <= var7 &&
                  this.field_f.field_f.field_t > var7) {
                  this.field_f.field_h.a(-107, new me((double)param1.field_u, (double)param1.field_z, 0.05 * (double)(var6Lifetime1Lifetime1 - param1.field_u), 0.05 * (double)(-param1.field_z + var7), 1));
                  var8 = this.field_f.field_f.field_c * var7 + var6Lifetime1Lifetime1;
                  if (this.field_f.field_f.field_o[var8] == 7) {
                    var9 = this.field_f.a(var8, -66);
                    var9.d(9);
                  }
                }
                var7++;
              }
              var6Lifetime1Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_114_0 = var4;
          stackIn_114_1 = new StringBuilder().append("kb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_115_2 = "null";
          } else {
            stackIn_115_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_114_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 > -36) {
            this.d(-12);
          }
          var4_int = -param0 + 320;
          var5 = -param2 + 240;
          var6 = this.field_k;
          while (this.field_B != var6) {
            var7 = var4_int + (int)((float)ol.field_e * this.field_r[var6].field_e);
            var8 = (int)(this.field_r[var6].field_d * (float)ol.field_e) + var5;
            var9 = var4_int + this.field_r[var6].field_b * ol.field_e;
            var10 = var5 + ol.field_e * this.field_r[var6].field_g;
            var11 = (-this.field_y + this.field_r[var6].field_c) * 4;
            ul.f(var7 - 1, var8, -1 + var9, var10, 11176191, var11);
            ul.f(var7 + 1, var8, 1 + var9, var10, 11176191, var11);
            ul.f(var7, -1 + var8, var9, -1 + var10, 11176191, var11);
            ul.f(var7, 1 + var8, var9, 1 + var10, 11176191, var11);
            ul.f(var7, var8, var9, var10, 16777215, var11);
            var6 = (1 + var6) % this.field_r.length;
            if (var12 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var4), "kb.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        pd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 12) {
            return;
          }
          this.field_y = this.field_y + 1;
          L1: while (true) {
            if (this.field_B != this.field_k) {
              stackIn_13_0 = ~this.field_y;
              stackIn_13_1 = ~this.field_r[this.field_k].field_c;
              if (var8 != 0) {
                break L1;
              }
              if (stackIn_13_0 < stackIn_13_1) {
                this.field_k = (this.field_k + 1) % this.field_r.length;
                continue;
              }
            }
            stackIn_13_0 = ~this.field_k;
            stackIn_13_1 = ~this.field_B;
            break;
          }
          if (stackIn_13_0 != stackIn_13_1) {
            var2_int = this.field_y + 59;
            var3 = this.field_B;
            do {
              var3--;
              if (0 > var3) {
                var3 = -1 + this.field_r.length;
              }
              if (~this.field_r[var3].field_c != ~var2_int) {
                return;
              }
              var4 = (pd) (this.field_f.field_r.b((byte) 117));
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (null == var4))) {
                stackIn_58_0 = -1;
                stackIn_58_1 = ~var4.field_f;
                if (var8 == 0) {
                  if (stackIn_58_0 == stackIn_58_1 &&
                    var4.field_m <= 0) {
                    var5 = this.field_r[var3].field_b - var4.field_u;
                    var6 = this.field_r[var3].field_g - var4.field_z;
                    if (Math.abs(var5) < 4 &&
                      Math.abs(var6) < 4 &&
                      this.a(var4.field_u, (float)this.field_r[var3].field_b, 71, var4.field_z, (float)this.field_r[var3].field_g)) {
                      var4.field_f = 60;
                      if (var4.field_y != 7) {
                        var7 = 5;
                        if (this.field_F == 1) {
                          var7 = 10;
                        } else if (this.field_F == 2) {
                          var7 = 20;
                        } else if (3 == this.field_F) {
                          var7 = 40;
                        } else {
                          if (this.field_F == 4) {
                            var7 = 80;
                          }
                        }
                        this.a(var7, var4, 44);
                      } else {
                        var4.field_f = 120;
                      }
                    }
                  }
                  var4 = (pd) (this.field_f.field_r.d(param0 ^ 857));
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_58_0 = ~this.field_k;
                stackIn_58_1 = ~var3;
              }
            } while (stackIn_58_0 != stackIn_58_1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.G(" + param0 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        double var3_double = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = -this.field_o + this.field_q;
          if (32768 < var2_int) {
            var2_int = var2_int - 65536;
          }
          if (-32768 > var2_int) {
            var2_int = var2_int + 65536;
          }
          if (this.field_C == 5) {
            this.field_o = this.field_o + (-(5 * this.field_t) + 2500);
            if (var7 != 0) {
              this.field_o = this.field_o + var2_int / 10;
            }
          } else {
            this.field_o = this.field_o + var2_int / 10;
          }
          if (this.field_o > 32768) {
            this.field_o = this.field_o - 65536;
          }
          if (-32768 > this.field_o) {
            this.field_o = this.field_o + 65536;
          }
          if (this.field_C == 1 ||
            2 == this.field_C ||
            this.field_C == 4) {
            this.field_o = this.field_q;
          }
          if (param0 <= 120) {
            return;
          }
          if (this.field_z) {
            if (this.field_C == 0) {
              this.field_A = this.field_E.field_z;
              this.field_x = this.field_E.field_u;
              if (this.field_t > 5 &&
                this.field_t < 25) {
                var3 = Math.abs(-this.field_x + this.field_g) + Math.abs(-this.field_A + this.field_h);
                if (var3 > 20) {
                  var3 = 20;
                }
                if (var3 < 1) {
                  var3 = 1;
                }
                if (this.field_t < 5 + var3) {
                  this.field_f.field_h.a(-114, new me((double)this.field_x + (-5.0 + (double)this.field_t) * (double)(this.field_g - this.field_x) / (double)var3, (double)(-this.field_A + this.field_h) * ((double)this.field_t - 5.0) / (double)var3 + (double)this.field_A, 6));
                }
              }
            }
            if (this.field_C == 3 &&
              this.field_t > -45 + this.field_n &&
              this.field_n > this.field_t) {
              var3Lifetime1 = Math.abs(this.field_g - this.field_x) + Math.abs(-this.field_A + this.field_h);
              if (var3Lifetime1 > 40) {
                var3Lifetime1 = 40;
              }
              if (var3Lifetime1 < 1) {
                var3Lifetime1 = 1;
              }
              if (-45 + (this.field_n + var3Lifetime1) > this.field_t) {
                this.field_f.field_h.a(-90, new me((double)this.field_x + (double)(-this.field_x + this.field_g) * ((double)this.field_t - ((double)this.field_n - 45.0)) / (double)var3Lifetime1, (double)this.field_A + (double)(-this.field_A + this.field_h) * (45.0 - (double)this.field_n + (double)this.field_t) / (double)var3Lifetime1, 8));
              }
            }
            if (2 == this.field_C) {
              if (this.field_t == 50) {
                var3_double = 0.0;
                while (6.283185307179586 > var3_double) {
                  this.field_f.field_h.a(-82, new me((double)this.field_x + Math.random() - 0.5, (double)this.field_A + Math.random() - 0.5, 0.05 * Math.sin(var3_double), Math.cos(var3_double) * 0.05, 1));
                  var3_double = var3_double + 0.8;
                  if (var7 != 0) {
                    return;
                  }
                }
              }
              if (this.field_t > 50 &&
                this.field_t < 100) {
                var3Lifetime2 = (Math.abs(-this.field_x + this.field_g) + Math.abs(-this.field_A + this.field_h)) * 5;
                if (var3Lifetime2 > 50) {
                  var3Lifetime2 = 50;
                }
                if (var3Lifetime2 < 1) {
                  var3Lifetime2 = 1;
                }
                if (this.field_t < (var3Lifetime2 + 50)) {
                  var4 = var3Lifetime2 / 2;
                  var5 = this.field_t - (var4 + 50);
                  var6 = (int)(0.5 * Math.sqrt((double)(-(var5 * var5) + var4 * var4)));
                  this.field_f.field_h.a(-119, new me((double)this.field_x + (double)(-this.field_x + this.field_g) * ((double)this.field_t - 50.0) / (double)var3Lifetime2, (double)(-var6) + ((double)(-this.field_A + this.field_h) * ((double)this.field_t - 50.0) / (double)var3Lifetime2 + (double)this.field_A), 4));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.H(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hj var7_ref_hj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var6Lifetime1Lifetime1;
        int var6Lifetime2Lifetime1;
        int var6Lifetime2Lifetime2;
        int var6Lifetime2Lifetime3;
        int var6Lifetime2Lifetime4;
        int var6Lifetime2Lifetime5;
        int var6Lifetime2Lifetime6;
        int var7Lifetime2Lifetime1;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          if (-1 == this.field_C) {
            return;
          }
          if (param2 != -8) {
            this.b((byte) -4);
          }
          boolean decompiledFrameRemainder1 = true;
          var4_int = 320 - param0 + this.field_g * ol.field_e;
          var5 = 240 + (-param1 + this.field_h * ol.field_e);
          this.field_u = 320.0 / (double)(320 + Math.abs(-320 + var4_int));
          if (this.field_z) {
            var6 = 320 + (ol.field_e * this.field_x - param0);
            var7 = 240 - param1 + ol.field_e * this.field_A;
            var10 = this.field_C;
            if (var10 == 1 &&
              var15 == 0) {
              if (!(this.field_t <= (this.field_n - 20))) {
                var10 = ol.field_e / 2 + var4_int;
                var11 = -8 + (var5 + ol.field_e / 2);
                ul.f(var6 - 1, var7, -1 + var10, var11, 11176191, -(10 * (this.field_n - this.field_t)) + 200);
                ul.f(var6 + 1, var7, 1 + var10, var11, 11176191, -(10 * (-this.field_t + this.field_n)) + 200);
                ul.f(var6, -1 + var7, var10, var11 - 1, 11176191, 200 - (-this.field_t + this.field_n) * 10);
                ul.f(var6, 1 + var7, var10, 1 + var11, 11176191, 200 - 10 * (-this.field_t + this.field_n));
                ul.f(var6, var7, var10, var11, 16777215, 200 - 10 * (this.field_n - this.field_t));
              }
              decompiledFrameRemainder1 = false;
            } else {
              decompiledFrameRemainder1 = (var10 == 4);
            }
            if (decompiledFrameRemainder1) {
              var9 = -12 + (ol.field_e + var5);
              var8 = var4_int + ol.field_e;
              boolean decompiledSharedTail0 = (!(5 >= this.field_t) ||
                this.field_E == null ||
                !(-this.field_E.field_h + this.field_E.field_o > 0));
              if (!decompiledSharedTail0) {
                ul.f(var6 - 1, var7, var8 - 1, var9, 16776960, 200 - (-this.field_t + this.field_n) * 10);
                ul.f(1 + var6, var7, var8 + 1, var9, 16776960, -((-this.field_t + this.field_n) * 10) + 200);
                ul.f(var6, -1 + var7, var8, -1 + var9, 16776960, 200 - (this.field_n - this.field_t) * 10);
                ul.f(var6, var7 + 1, var8, 1 + var9, 16776960, 200 - (this.field_n - this.field_t) * 10);
                ul.f(var6, var7, var8, var9, 16777215, 200 - (-this.field_t + this.field_n) * 10);
                decompiledSharedTail0 = (var15 != 0);
              }
              if ((decompiledSharedTail0) && (50 >= this.field_t &&
                this.field_E != null &&
                this.field_E.field_o - this.field_E.field_h > 0)) {
                this.field_x = this.field_E.field_u;
                this.field_A = this.field_E.field_z;
                ul.f(-1 + var6, var7, -1 + var8, var9, 16776960, 250 - 5 * this.field_t);
                ul.f(var6 + 1, var7, 1 + var8, var9, 16776960, 250 - this.field_t * 5);
                ul.f(var6, var7 - 1, var8, var9 - 1, 16776960, 5 * (-this.field_t + 50));
                ul.f(var6, 1 + var7, var8, var9 + 1, 16776960, (-this.field_t + 50) * 5);
                ul.f(var6, var7, var8, var9, 16777215, 5 * (50 - this.field_t));
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_C != 0) {
            if (this.field_C == 1) {
              var5 = var5 + ol.field_e / 2;
              var4_int = var4_int + ol.field_e / 2;
              hf.field_g[this.field_C * 7 + 0].a(var4_int, -5 + var5, 0, 1950);
              var6Lifetime1 = 32;
              if (this.field_F == 0) {
                var6Lifetime1 = 24;
              }
              if (this.field_F == 1) {
                var6Lifetime1 = 24;
              }
              if (this.field_F == 2) {
                var6Lifetime1 = 24;
              }
              if (3 == this.field_F) {
                var6Lifetime1 = 24;
              }
              if (this.field_F == 4) {
                var6Lifetime1 = 24;
              }
              hf.field_g[this.field_C * 7 + this.field_F + 2].a(528, var6Lifetime1 << 4, var4_int << 4, var5 - 8 << 4, 32768 + this.field_o, 1950);
              hf.field_g[1 + 7 * this.field_C].a(var4_int, var5 - 5, 0, 1950);
              decompiledFrameRemainder0 = (var15 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (2 == this.field_C) {
                var4_int = var4_int + ol.field_e / 2;
                var5 = var5 + ol.field_e / 2;
                hf.field_g[0 + 7 * this.field_C].a(var4_int, var5 - 5, 0, 1950);
                var6Lifetime1 = 32;
                if (this.field_F == 0) {
                  var6Lifetime1 = 24;
                }
                if (this.field_F == 1) {
                  var6Lifetime1 = 24;
                }
                if (this.field_F == 2) {
                  var6Lifetime1 = 24;
                }
                if (this.field_F == 3) {
                  var6Lifetime1 = 24;
                }
                if (this.field_F == 4) {
                  var6Lifetime1 = 24;
                }
                hf.field_g[this.field_F + (2 + 7 * this.field_C)].a(528, var6Lifetime1 << 4, var4_int << 4, var5 - 12 << 4, this.field_o + 32768, 1950);
                hf.field_g[7 * this.field_C + 1].a(var4_int, -8 + var5, 0, 1950);
                decompiledFrameRemainder0 = (var15 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.field_C != 5) {
                  if (this.field_C == 6) {
                    hf.field_g[7 * this.field_C + 0].a(var4_int, var5 - 5, 0, 1300);
                    decompiledFrameRemainder0 = (this.field_s != null);
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameRemainder0 = (this.field_s.field_C != -1))) {
                      var6Lifetime1 = var4_int;
                      var7Lifetime1 = -10 + var5;
                      var8Lifetime1 = 320 + this.field_s.field_g * ol.field_e - param0;
                      var9Lifetime1 = -10 + (-param1 + (this.field_s.field_h * ol.field_e + 240));
                      var10Lifetime1 = 200 * this.field_j / 100;
                      if (this.field_s.field_t > -10) {
                        var10Lifetime1 = 20 * -this.field_s.field_t;
                        var11Lifetime1 = var6Lifetime1 - var8Lifetime1;
                        var12 = var7Lifetime1 - var9Lifetime1;
                        if (var11Lifetime1 == 0) {
                          if (var12 != 0) {
                            var7Lifetime1 = var9Lifetime1 + var12 * -this.field_s.field_t / 10;
                            if (var15 != 0) {
                              var6Lifetime1 = var8Lifetime1 + -this.field_s.field_t * var11Lifetime1 / 10;
                            }
                          }
                        } else {
                          var6Lifetime1 = var8Lifetime1 + -this.field_s.field_t * var11Lifetime1 / 10;
                        }
                      }
                      var11Lifetime1 = 11176191;
                      ul.f(var6Lifetime1 - 1, var7Lifetime1, -1 + var8Lifetime1, var9Lifetime1, var11Lifetime1, var10Lifetime1);
                      var12Lifetime2 = 16777215;
                      ul.f(var6Lifetime1 + 1, var7Lifetime1, var8Lifetime1 + 1, var9Lifetime1, var11Lifetime1, var10Lifetime1);
                      ul.f(var6Lifetime1, -1 + var7Lifetime1, var8Lifetime1, -1 + var9Lifetime1, var11Lifetime1, var10Lifetime1);
                      ul.f(var6Lifetime1, var7Lifetime1 + 1, var8Lifetime1, var9Lifetime1 + 1, var11Lifetime1, var10Lifetime1);
                      ul.f(var6Lifetime1, var7Lifetime1, var8Lifetime1, var9Lifetime1, var12Lifetime2, var10Lifetime1);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.field_C == 3) {
                      hf.field_g[7 * this.field_C + 0].a(var4_int, -5 + var5, 0, 1300);
                      var6Lifetime1 = 32;
                      if (0 == this.field_F) {
                        var6Lifetime1 = 24;
                      }
                      if (this.field_F == 1) {
                        var6Lifetime1 = 24;
                      }
                      if (this.field_F == 2) {
                        var6Lifetime1 = 24;
                      }
                      if (this.field_F == 3) {
                        var6Lifetime1 = 24;
                      }
                      if (this.field_F == 4) {
                        var6Lifetime1 = 24;
                      }
                      hf.field_g[7 * this.field_C + (this.field_F + 2)].a(528, var6Lifetime1 << 4, var4_int << 4, -12 + var5 << 4, this.field_o + 32768, 1800);
                      hf.field_g[1 + 7 * this.field_C].a(var4_int, var5 - 10, 0, 1300);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameRemainder0 = (4 == this.field_C))) {
                      var4_int = var4_int + ol.field_e;
                      var5 = var5 + ol.field_e;
                      hf.field_g[0 + this.field_C * 7].a(var4_int, var5 - 5, 0, 2600);
                      var6Lifetime1 = 32;
                      if (this.field_F == 0) {
                        var6Lifetime1 = 16;
                      }
                      if (1 == this.field_F) {
                        var6Lifetime1 = 16;
                      }
                      if (this.field_F == 2) {
                        var6Lifetime1 = 16;
                      }
                      if (this.field_F == 3) {
                        var6Lifetime1 = 16;
                      }
                      if (4 == this.field_F) {
                        var6Lifetime1 = 16;
                      }
                      hf.field_g[7 * this.field_C + (this.field_F + 2)].a(528, var6Lifetime1 << 4, var4_int << 4, var5 - 12 << 4, 32768 + this.field_o, 2600);
                      hf.field_g[this.field_C * 7 + 1].a(var4_int, var5 - 8, 0, 2600);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var4_int = var4_int + ol.field_e / 2;
                  var5 = var5 + ol.field_e / 2;
                  var6Lifetime1 = 1950;
                  hf.field_g[7 * this.field_C + 0].a(var4_int, -5 + var5, 0, var6Lifetime1);
                  var7_ref_hj = hf.field_g[2 + this.field_F + this.field_C * 7];
                  var7_ref_hj.a(var7_ref_hj.field_s << 3, var7_ref_hj.field_t << 3, var4_int << 4, -12 + var5 << 4, 32768 + this.field_o, var6Lifetime1);
                  hf.field_g[this.field_C * 7 + 1].a(var4_int, var5 - 8, 0, var6Lifetime1);
                  if (this.field_t <= 5) {
                    var8Lifetime1Lifetime1 = this.field_f.field_i % 9000;
                    var9Lifetime1Lifetime1 = var6Lifetime1 * hf.field_g[7 * this.field_C].field_o >> 12;
                    var10Lifetime1Lifetime1 = hf.field_g[this.field_C * 7].field_k * var6Lifetime1 >> 12;
                    var11Lifetime1Lifetime1 = (this.field_g * this.field_g + var8Lifetime1Lifetime1) % var9Lifetime1Lifetime1 + var4_int - (var9Lifetime1Lifetime1 >> 1);
                    var12Lifetime1 = (this.field_h * this.field_g + var8Lifetime1Lifetime1) % var10Lifetime1Lifetime1 + var5 - (var10Lifetime1Lifetime1 >> 1);
                    var13 = -(var9Lifetime1Lifetime1 >> 1) - (-var4_int - (var8Lifetime1Lifetime1 * var8Lifetime1Lifetime1 + this.field_g) % var9Lifetime1Lifetime1);
                    var14 = var8Lifetime1Lifetime1 * var8Lifetime1Lifetime1 % var10Lifetime1Lifetime1 + var5 - (var10Lifetime1Lifetime1 >> 1);
                    ul.f(var11Lifetime1Lifetime1, var12Lifetime1, var13, var14, 16777215, 200);
                  }
                  decompiledFrameRemainder0 = (var15 != 0);
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            hf.field_g[0 + this.field_C * 7].a(var4_int, var5 - 5, 0, 1300);
            var6Lifetime1Lifetime1 = 32;
            if (this.field_F == 0) {
              var6Lifetime1Lifetime1 = 32;
            }
            if (this.field_F == 1) {
              var6Lifetime1Lifetime1 = 32;
            }
            if (this.field_F == 2) {
              var6Lifetime1Lifetime1 = 24;
            }
            if (this.field_F == 3) {
              var6Lifetime1Lifetime1 = 24;
            }
            if (this.field_F == 4) {
              var6Lifetime1Lifetime1 = 24;
            }
            hf.field_g[7 * this.field_C + (2 + this.field_F)].a(528, var6Lifetime1Lifetime1 << 4, var4_int << 4, var5 - 8 << 4, 32768 + this.field_o, 1300);
            hf.field_g[1 + 7 * this.field_C].a(var4_int, -6 + var5, 0, 1300);
          }
          if (null != this.field_p) {
            var6Lifetime2 = 0;
            if (this.field_p.field_i == 0) {
              var6Lifetime2Lifetime1 = 16711680;
            }
            if (this.field_p.field_i == 1) {
              var6Lifetime2Lifetime2 = 65280;
            }
            if (this.field_p.field_i == 2) {
              var6Lifetime2Lifetime3 = 255;
            }
            if (3 == this.field_p.field_i) {
              var6Lifetime2Lifetime4 = 16776960;
            }
            var5 -= 15;
            if (this.field_F > 0) {
              var6Lifetime2Lifetime5 = 16777215;
              if (1 == this.field_F) {
                var6Lifetime2Lifetime5 = 255;
              }
              if (this.field_F == 2) {
                var6Lifetime2Lifetime5 = 8913151;
              }
              if (this.field_F == 3) {
                var6Lifetime2Lifetime5 = 16746751;
              }
              if (this.field_F == 4) {
                var6Lifetime2Lifetime5 = 16777215;
              }
              var7Lifetime2 = 4;
              ul.i(var4_int, var5, var7Lifetime2, var6Lifetime2Lifetime5, 128);
              if (ol.field_e >> 2 > 2) {
                ul.i(var4_int, var5, -1 + var7Lifetime2, var6Lifetime2Lifetime5, 128);
              }
              if (ol.field_e >> 2 > 3) {
                ul.i(var4_int, var5, -2 + var7Lifetime2, var6Lifetime2Lifetime5, 128);
              }
              ul.g(var4_int, var5, var7Lifetime2, 0);
            }
            if (this.field_F < 4 &&
              ui.field_a[this.field_C][this.field_F + 1] <= this.field_f.field_e[0].b(true) &&
              this.field_F < jk.field_j[this.field_C]) {
              var7Lifetime2Lifetime1 = 64 + (int)(Math.sin((double)ji.b(param2 ^ 91) * 0.01 + (double)this.field_g + (double)this.field_h) * 48.0);
              var6Lifetime2Lifetime6 = 16777215;
              ul.a(var4_int << 4, var5 << 4, var7Lifetime2Lifetime1, 255, ki.field_f);
            }
            var5 += 15;
          }
          if (this.field_v < 50 &&
            this.field_t <= 2) {
            var6Lifetime3 = 16776960;
            if ((this.field_h & 1) <= 0) {
              var4_int++;
              if (var15 != 0) {
                var4_int--;
              }
            } else {
              var4_int--;
            }
            if (this.field_v <= 0) {
              var6Lifetime3 = 16711680;
            }
            ul.h(-1 + var4_int, -5 + var5, 4, 11, 0);
            ul.h(var4_int, var5 - 4, 2, 4, var6Lifetime3);
            ul.h(var4_int, var5 + 3, 2, 2, var6Lifetime3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var4), "kb.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        int stackIn_21_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_42_0 = 0;
        kb stackIn_62_0 = null;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        Object stackIn_236_0 = null;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        int stackIn_374_0 = 0;
        int stackIn_374_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_35_0;
        kb stackOut_61_0;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        pd var3_ref_pd = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5 = 0;
        pd var5_ref_pd = null;
        int var6 = 0;
        km var6_ref_km = null;
        int var7 = 0;
        kb var8_ref_kb = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pd var3_ref_pdLifetime1;
        pd var5_ref_pdLifetime1;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 89) {
            this.a(59, (byte) -37, 78);
          }
          boolean decompiledSharedTail1 = (null != this.field_p);
          if (!decompiledSharedTail1) {
            this.field_v = 200;
            decompiledSharedTail1 = (var10 != 0);
          }
          if (decompiledSharedTail1) {
            var2_int = this.field_p.field_j - this.field_g;
            var3 = -this.field_h + this.field_p.field_c;
            if (var2_int * var2_int + var3 * var3 <= 100) {
              this.field_v = 200;
            }
          }
          L3: {
            this.field_v = 200;
            if (6 == this.field_C &&
              null != this.field_s) {
              stackIn_21_0 = (this.field_j <= 0) ? 0 : 1;
              var2_int = stackIn_21_0;
              var3 = 0;
              var4 = this.field_s.field_w;
              var5 = 1;
              if (this.field_g <= this.field_s.field_g) {
                if (this.field_h < this.field_s.field_h) {
                  var5 = this.field_f.field_f.field_c;
                  if ((var10 != 0) &&
                    (!(this.field_s.field_h >= this.field_h))) {
                    var5 = -this.field_f.field_f.field_c;
                    var5 = -1;
                  }
                } else {
                  if (!(this.field_s.field_h >= this.field_h)) {
                    var5 = -this.field_f.field_f.field_c;
                    if (var10 != 0) {
                      var5 = -1;
                    }
                  }
                }
              } else {
                var5 = -1;
              }
              var6 = this.field_w;
              while (true) {
                if (~var6 != ~var4) {
                  this.field_f.field_f.field_e[var6] = var2_int != 0;
                  stackOut_35_0 = this.field_f.field_f.field_m[var6];
                  stackIn_42_0 = stackOut_35_0 ? 1 : 0;
                  stackIn_36_0 = stackOut_35_0;
                  if (var10 == 0) {
                    if (stackIn_36_0) {
                      var3++;
                    }
                    var6 = var6 + var5;
                    continue;
                  }
                } else {
                  stackIn_42_0 = ~var3;
                }
                if (stackIn_42_0 >= -1) {
                  if (this.field_j >= 100) {
                    break;
                  }
                  this.field_j = this.field_j + 1;
                  if (var10 == 0) {
                    break;
                  }
                }
                this.field_j = this.field_j - var3;
                if (this.field_j > 0) {
                  break;
                }
                var6 = this.field_w;
                do {
                  if (var4 == var6) {
                    this.field_f.a(3, this.field_g, (byte) -38, this.field_h);
                    ea.a(113, mh.field_a[59], (int)(96.0 * this.field_u));
                    this.d(9);
                    this.field_C = -1;
                    break;
                  }
                  this.field_f.field_f.field_e[var6] = false;
                  var6 = var6 + var5;
                } while (var10 == 0);
                var6_ref_km = new km(this.field_f.field_o);
                var7 = 0;
                var8_ref_kb = (kb) (var6_ref_km.d(27935));
                while (var8_ref_kb != null) {
                  stackOut_61_0 = var8_ref_kb;
                  stackIn_236_0 = stackOut_61_0;
                  stackIn_62_0 = stackOut_61_0;
                  if (var10 != 0) {
                    break L3;
                  }
                  if (stackIn_62_0 != this &&
                    var8_ref_kb.field_s == this.field_s) {
                    var7 = 1;
                  } else {
                    var8_ref_kb = (kb) (var6_ref_km.b(true));
                    continue;
                  }
                  break;
                }
                if (var7 != 0) {
                  break;
                }
                this.field_f.a(3, this.field_s.field_g, (byte) -38, this.field_s.field_h);
                this.field_s.d(9);
                this.field_s.field_C = -1;
                break;
              }
            }
            boolean decompiledFrameCompleted3 = true;
            if (this.field_z) {
              if (this.field_C == 0 &&
                this.field_t == 5) {
                var2_int = 5;
                if (this.field_F >= 1) {
                  var2_int = 10;
                }
                if (3 <= this.field_F) {
                  var2_int = 20;
                }
                if (this.field_E != null &&
                  this.field_E.field_y != 4) {
                  var2_int = var2_int - this.field_F;
                }
                this.a(var2_int, this.field_E, 79);
              }
              boolean decompiledFrameCompleted6 = true;
              if (3 == this.field_C &&
                this.field_t == this.field_n - 45) {
                this.field_f.field_h.a(-109, new me((double)this.field_x, (double)this.field_A, 9));
                var2_int = 2 + this.field_F;
                var3 = this.field_F * 2 + 2;
                var4_ref_pd = (pd) (this.field_f.field_r.b((byte) -15));
                while (var4_ref_pd != null) {
                  var5 = -var4_ref_pd.field_u + this.field_x;
                  var6 = this.field_A - var4_ref_pd.field_z;
                  stackIn_119_0 = -1;
                  stackIn_119_1 = ~(var4_ref_pd.field_o - var4_ref_pd.field_h);
                  if (var10 != 0) {
                    decompiledFrameCompleted6 = false;
                    break;
                  }
                  if (stackIn_119_0 > stackIn_119_1 &&
                    var2_int >= Math.abs(var5) &&
                    Math.abs(var6) <= var2_int) {
                    this.a(var3, var4_ref_pd, 45);
                    if (50 * (this.field_F + 1) > var4_ref_pd.field_i) {
                      var4_ref_pd.field_i = 50 * (this.field_F + 1);
                    }
                  }
                  var4_ref_pd = (pd) (this.field_f.field_r.d(853));
                }
              }
              if (decompiledFrameCompleted6) {
                stackIn_119_0 = 1;
                stackIn_119_1 = this.field_C;
              }
              boolean decompiledFrameCompleted4 = true;
              if (stackIn_119_0 == stackIn_119_1) {
                boolean decompiledFrameCompleted5 = true;
                if (this.field_n - 7 == this.field_t) {
                  var2_int = 2;
                  var3 = 1;
                  var4 = 0;
                  var5_ref_pd = (pd) (this.field_f.field_r.b((byte) -82));
                  while (var5_ref_pd != null) {
                    var6 = this.field_A - var5_ref_pd.field_z;
                    var7 = -var5_ref_pd.field_u + this.field_x;
                    stackIn_154_0 = 7;
                    stackIn_154_1 = var5_ref_pd.field_y;
                    if (var10 != 0) {
                      decompiledFrameCompleted5 = false;
                      break;
                    }
                    if (stackIn_154_0 != stackIn_154_1 &&
                      var4 < 10 &&
                      var5_ref_pd.field_o - var5_ref_pd.field_h > 0 &&
                      var2_int >= Math.abs(var6) &&
                      var2_int >= Math.abs(var7)) {
                      var8 = var5_ref_pd.field_t;
                      var9 = 0;
                      while (var9 < this.field_D) {
                        stackIn_154_0 = ~this.field_i[var9];
                        stackIn_154_1 = ~var8;
                        if (stackIn_154_0 == stackIn_154_1) {
                          this.a(var3, var5_ref_pd, param0 ^ 127);
                          this.field_f.field_h.a(-69, new me((double)this.field_x, (double)this.field_A, 0.1 * ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)this.field_x), ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)this.field_A) * 0.1, 7));
                          var4++;
                        }
                        var9++;
                      }
                    }
                    var5_ref_pd = (pd) (this.field_f.field_r.d(853));
                  }
                }
                if (decompiledFrameCompleted5) {
                  stackIn_154_0 = ~this.field_t;
                  stackIn_154_1 = ~(this.field_n - 15);
                }
                if (stackIn_154_0 == stackIn_154_1) {
                  var2_int = 4;
                  var3 = 1;
                  var4 = 0;
                  var5_ref_pdLifetime1 = (pd) (this.field_f.field_r.b((byte) -12));
                  while (null != var5_ref_pdLifetime1) {
                    var6 = -var5_ref_pdLifetime1.field_z + this.field_A;
                    var7 = -var5_ref_pdLifetime1.field_u + this.field_x;
                    stackIn_185_0 = -8;
                    stackIn_185_1 = ~var5_ref_pdLifetime1.field_y;
                    if (var10 != 0) {
                      decompiledFrameCompleted4 = false;
                      break;
                    }
                    if (stackIn_185_0 != stackIn_185_1 &&
                      var4 < 6 &&
                      -var5_ref_pdLifetime1.field_h + var5_ref_pdLifetime1.field_o > 0 &&
                      var2_int >= Math.abs(var6) &&
                      var2_int >= Math.abs(var7)) {
                      var8 = var5_ref_pdLifetime1.field_t;
                      var9 = 0;
                      while (var9 < this.field_D) {
                        stackIn_185_0 = var8;
                        stackIn_185_1 = this.field_i[var9];
                        if (stackIn_185_0 == stackIn_185_1) {
                          this.a(var3, var5_ref_pdLifetime1, 73);
                          this.field_f.field_h.a(param0 - 163, new me((double)this.field_x, (double)this.field_A, ((double)var5_ref_pdLifetime1.field_u + Math.random() - 0.5 - (double)this.field_x) * 0.1, 0.1 * ((double)var5_ref_pdLifetime1.field_z + Math.random() - 0.5 - (double)this.field_A), 7));
                          var4++;
                        }
                        var9++;
                      }
                    }
                    var5_ref_pdLifetime1 = (pd) (this.field_f.field_r.d(853));
                  }
                }
              }
              if (decompiledFrameCompleted4) {
                stackIn_185_0 = ~this.field_C;
                stackIn_185_1 = -3;
              }
              if (stackIn_185_0 == stackIn_185_1 &&
                this.field_t == 50) {
                this.field_v = this.field_v - 4;
                var2_int = 2;
                var3 = 30;
                if (this.field_F >= 1) {
                  var3 = 44;
                  var2_int = 2;
                }
                if (this.field_F >= 2) {
                  var2_int = 3;
                  var3 = 60;
                }
                if (this.field_F >= 3) {
                  var3 = 74;
                  var2_int = 3;
                }
                if (this.field_F >= 4) {
                  var3 = 90;
                  var2_int = 4;
                }
                var4_ref_pd = (pd) (this.field_f.field_r.b((byte) 119));
                while (var4_ref_pd != null) {
                  var5 = -var4_ref_pd.field_z + this.field_A;
                  var6 = -var4_ref_pd.field_u + this.field_x;
                  stackIn_232_0 = -8;
                  stackIn_232_1 = ~var4_ref_pd.field_y;
                  if (var10 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (stackIn_232_0 != stackIn_232_1 &&
                    4 != var4_ref_pd.field_y &&
                    var4_ref_pd.field_o - var4_ref_pd.field_h > 0 &&
                    var2_int >= Math.abs(var5) &&
                    var2_int >= Math.abs(var6)) {
                    var7 = var4_ref_pd.field_t;
                    var8 = 0;
                    while (var8 < this.field_D) {
                      stackIn_232_0 = ~var7;
                      stackIn_232_1 = ~this.field_i[var8];
                      if (stackIn_232_0 == stackIn_232_1) {
                        this.a(var3, var4_ref_pd, param0 - 29);
                      }
                      var8++;
                    }
                  }
                  var4_ref_pd = (pd) (this.field_f.field_r.d(853));
                }
              }
            }
            if (decompiledFrameCompleted3) {
              stackIn_232_0 = ~this.field_C;
              stackIn_232_1 = -6;
            }
            if (stackIn_232_0 == stackIn_232_1) {
              this.b((byte) 12);
            }
            stackIn_236_0 = this;
          }
          this.field_t = this.field_t - 1;
          if (0 >= this.field_t &&
            6 != this.field_C) {
            this.field_z = false;
            if (this.field_v <= 0) {
              this.field_t = 5;
              if (var10 == 0) {
                return;
              }
            }
            boolean decompiledFrameRemainder7 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted2 = true;
            this.field_t = 5;
            var2 = null;
            if (4 != this.field_C) {
              var3 = 10000;
              var4_ref_pd = (pd) (this.field_f.field_r.b((byte) 124));
              while (var4_ref_pd != null) {
                var5 = this.field_h - var4_ref_pd.field_z;
                var6 = this.field_g - var4_ref_pd.field_u;
                stackIn_373_0 = 7;
                stackIn_373_1 = var4_ref_pd.field_y;
                if (var10 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if ((stackIn_373_0 != stackIn_373_1 ||
                  2 != this.field_C) && (4 != var4_ref_pd.field_y ||
                  0 == this.field_C ||
                  this.field_C == 3 ||
                  this.field_C == 1 ||
                  5 == this.field_C) && (3 == this.field_C ||
                  this.field_C == 5 ||
                  9 != var4_ref_pd.field_y ||
                  var4_ref_pd.field_E != 0) && (-var4_ref_pd.field_h + var4_ref_pd.field_o > 0 &&
                  Math.abs(var5) <= this.field_l &&
                  Math.abs(var6) <= this.field_l)) {
                  var7 = var4_ref_pd.field_t;
                  var8 = 0;
                  while (this.field_D > var8) {
                    stackIn_373_0 = ~var7;
                    stackIn_373_1 = ~this.field_i[var8];
                    if (stackIn_373_0 == stackIn_373_1) {
                      var9 = var5 * var5 + var6 * var6;
                      if (var3 > var9) {
                        var2 = var4_ref_pd;
                        var3 = var9;
                      }
                    }
                    var8++;
                  }
                }
                var4_ref_pd = (pd) (this.field_f.field_r.d(param0 ^ 780));
              }
            } else {
              var3_ref_pd = this.field_E;
              var4 = -10000;
              if (var3_ref_pd != null &&
                0 < -var3_ref_pd.field_h + var3_ref_pd.field_o) {
                var5 = this.field_h - var3_ref_pd.field_z;
                var6 = this.field_g - var3_ref_pd.field_u;
                if ((var3_ref_pd.field_y != 9 ||
                  0 != var3_ref_pd.field_E) && (-var3_ref_pd.field_h + var3_ref_pd.field_o > 0 &&
                  Math.abs(var5) <= this.field_l &&
                  Math.abs(var6) <= this.field_l)) {
                  var7 = var3_ref_pd.field_t;
                  var8 = 0;
                  while (var8 < this.field_D) {
                    stackIn_374_0 = this.field_i[var8];
                    stackIn_374_1 = var7;
                    if (var10 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (stackIn_374_0 == stackIn_374_1) {
                      var2 = var3_ref_pd;
                    }
                    var8++;
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (null == var2)) {
                var3_ref_pdLifetime1 = (pd) (this.field_f.field_r.b((byte) 127));
                while (var3_ref_pdLifetime1 != null) {
                  var5 = this.field_h - var3_ref_pdLifetime1.field_z;
                  var6 = -var3_ref_pdLifetime1.field_u + this.field_g;
                  stackIn_374_0 = var3_ref_pdLifetime1.field_y;
                  stackIn_374_1 = 4;
                  if (var10 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_374_0 != stackIn_374_1 && (var3_ref_pdLifetime1.field_y != 9 ||
                    var3_ref_pdLifetime1.field_E != 0) && (-var3_ref_pdLifetime1.field_h + var3_ref_pdLifetime1.field_o > 0 &&
                    Math.abs(var5) <= this.field_l &&
                    Math.abs(var6) <= this.field_l)) {
                    var7 = var3_ref_pdLifetime1.field_t;
                    var8 = 0;
                    while (this.field_D > var8) {
                      stackIn_374_0 = ~var7;
                      stackIn_374_1 = ~this.field_i[var8];
                      if (stackIn_374_0 == stackIn_374_1) {
                        var9 = Math.abs(var5) + (Math.abs(var6) - Math.abs(var5) * Math.abs(var6));
                        if (var9 > var4) {
                          var2 = var3_ref_pdLifetime1;
                          var4 = var9;
                        }
                      }
                      var8++;
                    }
                  }
                  var3_ref_pdLifetime1 = (pd) (this.field_f.field_r.d(853));
                }
              }
            }
            if (((decompiledFrameCompleted2) && (decompiledFrameCompleted1) && (decompiledFrameCompleted0)) &&
              (decompiledFrameRemainder7 = (var2 != null))) {
              stackIn_373_0 = 5 + this.field_C * 5;
              stackIn_373_1 = this.field_F;
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              var4 = stackIn_373_0 + stackIn_373_1;
              stackIn_374_0 = ~this.field_C;
              stackIn_374_1 = -6;
            }
            if (decompiledFrameRemainder7) {
              if (stackIn_374_0 == stackIn_374_1) {
                var4 = 58;
              }
              boolean decompiledFrameRemainder6 = true;
              boolean decompiledFrameRemainder5 = true;
              boolean decompiledFrameRemainder4 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              ea.a(46, mh.field_a[var4], (int)(this.field_u * 96.0));
              this.field_v = this.field_v - 1;
              this.field_z = true;
              this.field_q = (int)(Math.atan2((double)(this.field_g - ((pd) (var2)).field_u), (double)(-((pd) (var2)).field_z + this.field_h)) * 65536.0 / 6.283185307179586);
              var5 = this.field_C;
              if ((var5 != 0) &&
                (decompiledFrameRemainder1 = (var5 != 1)) &&
                (decompiledFrameRemainder2 = (2 != var5)) &&
                (decompiledFrameRemainder3 = (var5 != 4 ||
                var10 != 0)) &&
                (decompiledFrameRemainder4 = (3 != var5 ||
                var10 != 0)) &&
                (decompiledFrameRemainder6 = (5 == var5))) {
                decompiledFrameRemainder5 = (var10 != 0);
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                this.field_t = 50;
                if (this.field_F == 1) {
                  this.field_t = 50;
                }
                if (this.field_F == 2) {
                  this.field_t = 25;
                }
                if (3 == this.field_F) {
                  this.field_t = 40;
                }
                this.field_A = ((pd) (var2)).field_z;
                if (4 == this.field_F) {
                  this.field_t = 25;
                }
                this.field_E = (pd) (var2);
                this.field_x = ((pd) (var2)).field_u;
                decompiledFrameRemainder6 = (var10 != 0);
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2)) {
                var3 = 10;
                this.field_t = 100;
                if (this.field_F == 1) {
                  this.field_t = 80;
                }
                if (this.field_F == 2) {
                  this.field_t = 60;
                }
                if (3 == this.field_F) {
                  this.field_t = 40;
                }
                this.field_x = ((pd) (var2)).field_u;
                if (this.field_F == 4) {
                  this.field_t = 20;
                }
                this.field_E = (pd) (var2);
                this.field_A = ((pd) (var2)).field_z;
                this.a(var3, (pd) (var2), param0 ^ 71);
                this.field_f.field_h.a(-122, new me((double)this.field_x, (double)this.field_A, 7));
                decompiledFrameRemainder6 = (var10 != 0);
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3)) {
                this.field_t = 100;
                this.field_A = ((pd) (var2)).field_z;
                this.field_x = ((pd) (var2)).field_u;
                decompiledFrameRemainder6 = (var10 != 0);
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4)) {
                var3 = 20;
                this.field_t = 5 - this.field_F;
                this.field_x = ((pd) (var2)).field_u;
                this.field_A = ((pd) (var2)).field_z;
                if (this.field_E == var2) {
                  this.a(var3, (pd) (var2), -117);
                  decompiledFrameRemainder6 = (var10 != 0);
                }
                if (decompiledFrameRemainder6) {
                  this.field_t = 100;
                  this.field_E = (pd) (var2);
                  decompiledFrameRemainder6 = (var10 != 0);
                }
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5)) {
                this.field_t = 100;
                if (this.field_F == 1) {
                  this.field_t = 90;
                }
                if (2 == this.field_F) {
                  this.field_t = 80;
                }
                if (this.field_F == 3) {
                  this.field_t = 70;
                }
                if (this.field_F == 4) {
                  this.field_t = 60;
                }
                this.field_x = ((pd) (var2)).field_u;
                this.field_A = ((pd) (var2)).field_z;
                decompiledFrameRemainder6 = (var10 != 0);
              }
              if (decompiledFrameRemainder6) {
                boolean decompiledFrameRemainder0 = true;
                this.field_t = 500;
                this.field_A = ((pd) (var2)).field_z;
                this.field_x = ((pd) (var2)).field_u;
                var3 = 5;
                if (this.field_F != 1) {
                  if (this.field_F == 2) {
                    var3 = 20;
                    decompiledFrameRemainder0 = (var10 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (3 != this.field_F) {
                      if (this.field_F == 4) {
                        var3 = 80;
                        if (var10 != 0) {
                          var3 = 40;
                          var3 = 10;
                        }
                      }
                    } else {
                      var3 = 40;
                      if (var10 != 0) {
                        var3 = 10;
                      }
                    }
                  }
                } else {
                  var3 = 10;
                }
                this.field_y = 0;
                discarded$0 = this.a(this.field_x, (float)this.field_g + 0.5f, 38, this.field_A, (float)(-2 + this.field_h));
                boolean decompiledSharedTail0 = (((pd) (var2)).field_y != 7);
                if (!decompiledSharedTail0) {
                  ((pd) (var2)).field_f = 120;
                  decompiledSharedTail0 = (var10 != 0);
                }
                if (decompiledSharedTail0) {
                  ((pd) (var2)).field_f = 60;
                  this.a(var3, (pd) (var2), param0 + 27);
                }
              }
              this.field_n = this.field_t;
              if (var10 == 0) {
                return;
              }
            }
            this.field_t = 5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (var2), "kb.J(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_28_0Lifetime1;
        int stackIn_28_1Lifetime1;
        var16 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != -7) {
            stackIn_3_0 = -87;
            return stackIn_3_0;
          }
          var7_int = -this.field_g + param4;
          var8 = param5 - this.field_h;
          var11 = 5;
          if (1 == this.field_f.field_m ||
            this.field_f.field_m == 2) {
            var11 = 1;
          }
          var12 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          L2: while (!(decompiledNaturalLoopExit0 = (param2 < var12))) {
            var10 = this.field_h + var12 * var8 / param2;
            var9 = var7_int * var12 / param2 + this.field_g;
            stackOut_13_0 = this.field_f.field_f.a(var9, true, var10);
            stackIn_52_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var16 == 0) {
              if (!stackIn_14_0) {
                var13 = var9 + this.field_f.field_f.field_c * var10;
                var14 = 1;
                var15 = 0;
                while (var15 < param3) {
                  stackIn_28_0 = ~this.field_i[var15];
                  stackIn_28_1 = ~var13;
                  if (stackIn_28_0 == stackIn_28_1) {
                    var14 = 0;
                  } else {
                    var15++;
                    continue;
                  }
                  break;
                }
                stackIn_28_0Lifetime1 = (var10 - this.field_h) * (var10 - this.field_h) + (-this.field_g + var9) * (-this.field_g + var9);
                stackIn_28_1Lifetime1 = param2 * param2;
                if (stackIn_28_0Lifetime1 > stackIn_28_1Lifetime1) {
                  var14 = 0;
                }
                if (var14 != 0 &&
                  param1 <= var12 &&
                  var9 > var11 &&
                  this.field_f.field_f.field_o[var9 + this.field_f.field_f.field_c * var10] != 6 &&
                  this.field_f.field_f.field_o[this.field_f.field_f.field_c * var10 + var9] != 10) {
                  this.field_i[param3] = var13;
                  param3++;
                }
                var12++;
                continue L2;
              }
              stackIn_49_0 = param3;
              return stackIn_49_0;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_52_0 = param3;
          }
          return stackIn_52_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var7), "kb.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(int param0) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 1) {
            this.field_r = (ok[]) null;
          }
          if (null != this.field_s) {
            boolean decompiledFrameRemainder0 = true;
            var2_int = this.field_s.field_w;
            var3 = 1;
            if (this.field_g > this.field_s.field_g) {
              var3 = -1;
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = !(this.field_h < this.field_s.field_h);
              if (!decompiledSharedTail0) {
                var3 = this.field_f.field_f.field_c;
                decompiledSharedTail0 = (var5 != 0);
              }
              if ((decompiledSharedTail0) &&
                (this.field_s.field_h < this.field_h)) {
                var3 = -this.field_f.field_f.field_c;
              }
            }
            var4 = this.field_w;
            while (var2_int != var4) {
              this.field_f.field_f.field_e[var4] = false;
              var4 = var4 + var3;
              if (var5 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.L(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 9) {
            this.field_j = -82;
          }
          if (this.field_C != -1) {
            var2_int = oj.a((byte) 47, this.field_C);
            var3 = this.field_g;
            while (true) {
              if ((var2_int + this.field_g) <= var3) {
                return;
              }
              if (var5 != 0) {
                return;
              }
              var4 = this.field_h;
              while (this.field_h + var2_int > var4) {
                this.field_f.field_f.field_o[var3 + var4 * this.field_f.field_f.field_c] = 9;
                var4++;
              }
              var3++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.M(" + param0 + ')');
        }
    }

    kb(int param0, int param1, int param2, int param3, lb param4, f param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_n = 0;
        try {
          this.field_z = false;
          this.field_C = param2;
          this.field_p = param4;
          this.field_v = 200;
          this.field_t = 0;
          this.field_f = param5;
          this.field_F = param3;
          this.b(0, param1, param0);
          if (this.field_D > 0) {
            this.field_q = (int)(Math.atan2((double)(this.field_g - this.field_i[0] % this.field_f.field_f.field_c), (double)(-(this.field_i[0] / this.field_f.field_f.field_c) + this.field_h)) * 65536.0 / 6.283185307179586);
          }
          this.field_o = this.field_q;
          if (6 == this.field_C) {
            this.field_j = 100;
          }
          this.field_E = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_12_0 = var7;
          stackIn_12_1 = new StringBuilder().append("kb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
