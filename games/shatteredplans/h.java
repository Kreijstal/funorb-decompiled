/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends tn {
    static qr field_v;
    private int[] field_D;
    private gh field_E;
    static String[] field_w;
    private int field_l;
    static String[] field_x;
    private int field_y;
    private int field_n;
    ga field_r;
    static boolean field_q;
    private gh field_z;
    private gh field_o;
    ga field_u;
    static int[] field_t;
    private int[] field_p;
    private int field_B;
    private ga field_m;
    static int[] field_s;
    static bi field_F;
    private boolean field_A;
    private boolean field_C;

    final boolean a(gh param0, byte param1) {
        ga var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -23) {
            var4 = (ga) null;
            this.a((ga) null, (byte) 55, (ga) null);
          }
          stackIn_7_0 = (param0 == this.field_z) || (this.field_E == param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("h.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_v = null;
        field_s = null;
        field_F = null;
        field_w = null;
        if (param0 != -1) {
          h.d(22);
        }
        field_x = null;
        field_t = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_35_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_B <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_C) {
            if (this.field_l > 0 &&
              !this.field_u.h(5309)) {
              this.field_C = false;
              this.field_l = -this.field_l;
              this.field_z = null;
            } else {
              if (this.field_l < 0 &&
                !this.field_r.h(5309)) {
                this.field_E = null;
                this.field_C = false;
                this.field_l = -this.field_l;
              }
            }
          }
          var4_int = (this.field_n >> 12) * this.field_B / 256;
          var5 = this.field_B - var4_int;
          if (this.field_l != 0) {
            this.field_n = this.field_n + this.field_l * param2;
            if (this.field_n < 1048576) {
              if (this.field_n <= 0) {
                this.field_n = 0;
                if (!this.field_C) {
                  this.field_l = 0;
                  if (!this.field_A) {
                    if (this.field_z != null) {
                      this.field_u.e(15);
                    }
                    this.field_z = null;
                  }
                }
              }
            } else {
              this.field_n = 1048576;
              if (!this.field_C) {
                this.field_l = 0;
                if (!this.field_A) {
                  if (null != this.field_E) {
                    this.field_r.e(15);
                  }
                  this.field_E = null;
                }
              }
            }
          }
          if (ap.field_h) {
            stackIn_35_0 = param2 << 1;
          } else {
            stackIn_35_0 = param2;
          }
          var6 = stackIn_35_0;
          if (this.field_y < 256 && (null != this.field_z ||
            null != this.field_E)) {
            if (256 != var4_int) {
              if (var5 != 256) {
                if (this.field_D != null &&
                  this.field_D.length >= var6) {
                  ps.a(this.field_D, 0, var6);
                  ps.a(this.field_p, 0, var6);
                } else {
                  this.field_p = new int[var6];
                  this.field_D = new int[var6];
                }
                this.field_u.b(this.field_D, 0, param2);
                this.field_r.b(this.field_p, 0, param2);
                if (!ap.field_h) {
                  stackIn_50_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_50_0 = localTemp$0;
                }
                var7 = stackIn_50_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_p[var8] * var5 + this.field_D[var8] * var4_int >> 8);
                }
              } else {
                this.field_r.b(param0, param1, param2);
              }
            } else {
              this.field_u.b(param0, param1, param2);
            }
          }
          if (this.field_o != null) {
            if (this.field_y == 0) {
              return;
            }
            if (null != this.field_D &&
              this.field_D.length >= var6) {
              ps.a(this.field_D, 0, var6);
            } else {
              this.field_p = new int[var6];
              this.field_D = new int[var6];
            }
            this.field_m.b(this.field_D, 0, param2);
            if (ap.field_h) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_64_0 = localTemp$1;
            } else {
              stackIn_64_0 = param1;
            }
            var7Lifetime1 = stackIn_64_0;
            var8Lifetime1 = this.field_y * this.field_B / 256;
            var9 = -var8Lifetime1 + this.field_B;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var7Lifetime1 + var10] = var8Lifetime1 * this.field_D[var10] + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_70_0 = var4;
          stackIn_70_1 = new StringBuilder().append("h.G(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_n > 0) {
          if (this.field_z != null) {
            this.field_u.a(param0);
            if (this.field_n >= 1048576) {
              if ((!(this.field_y <= 0)) &&
                ((this.field_o != null))) {
                this.field_m.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_E == null) {
                if ((!(this.field_y <= 0)) &&
                  ((this.field_o != null))) {
                  this.field_m.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_r.a(param0);
              }
            }
          } else {
            if (this.field_n >= 1048576) {
              if ((!(this.field_y <= 0)) &&
                ((this.field_o != null))) {
                this.field_m.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_E == null) {
                if ((!(this.field_y <= 0)) &&
                  ((this.field_o != null))) {
                  this.field_m.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_r.a(param0);
              }
            }
          }
        } else {
          if (this.field_n >= 1048576) {
            if ((!(this.field_y <= 0)) &&
              ((this.field_o != null))) {
              this.field_m.a(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_E == null) {
              if ((!(this.field_y <= 0)) &&
                ((this.field_o != null))) {
                this.field_m.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_r.a(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_y > 0 &&
          this.field_o != null)) {
          this.field_m.a(param0);
        }
        if (this.field_C) {
          if (this.field_l > 0 &&
            !this.field_u.h(5309)) {
            this.field_C = false;
            this.field_z = null;
            this.field_l = -this.field_l;
          } else {
            if (0 > this.field_l &&
              !this.field_r.h(5309)) {
              this.field_C = false;
              this.field_l = -this.field_l;
              this.field_E = null;
            }
          }
        }
        if (this.field_l != 0) {
          this.field_n = this.field_n + this.field_l * param0;
          if (1048576 > this.field_n) {
            if (this.field_n <= 0) {
              this.field_n = 0;
              if (!this.field_C) {
                this.field_l = 0;
                if (!this.field_A) {
                  if (this.field_z != null) {
                    this.field_u.e(15);
                  }
                  this.field_z = null;
                }
              }
            }
          } else {
            this.field_n = 1048576;
            if (!this.field_C) {
              this.field_l = 0;
              if (!this.field_A) {
                if (this.field_E != null) {
                  this.field_r.e(15);
                }
                this.field_E = null;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, ga param2, int param3) {
        try {
          param2.a((byte) -78, -1, param0);
          param2.c(param1, false);
          if (param3 > -93) {
            h.d(-81);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "h.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = jg.a(param1, false, var4).getFile();
              ll.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, -95);
              ll.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, -65);
              ll.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, -88);
              ll.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, -118);
              ll.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param0 ^ 81);
              if (param0 != -1) {
                field_w = (String[]) null;
              }
              ll.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, -104);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("h.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final tn d() {
        return null;
    }

    private final void a(ga param0, byte param1, ga param2) {
        this.field_u = param0;
        if (param1 != 17) {
          return;
        }
        try {
          this.field_r = param2;
          this.field_n = 1048576;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "h.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 0) {
          gh var4 = (gh) null;
          this.a((gh) null, (byte) -108);
        }
        this.field_B = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final tn b() {
        return null;
    }

    final synchronized void a(int param0, int param1, byte param2, boolean param3, int param4, gh param5) {
        boolean stackIn_20_1 = false;
        int stackIn_35_0 = 0;
        ga stackIn_42_0 = null;
        gh stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        boolean stackIn_43_3;
        ga stackIn_51_0 = null;
        gh stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        boolean stackIn_52_3;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_C &&
            param3) {
            if (this.field_l <= 0) {
              if (null != this.field_E) {
                this.field_r.e(15);
              }
              this.field_E = param5;
              if (param5 != null) {
                this.field_r.a(param5, (byte) 101, false);
                this.a(param1, param0, this.field_r, -108);
              }
            } else {
              if (null != this.field_z) {
                this.field_u.e(15);
              }
              this.field_z = param5;
              if (param5 != null) {
                this.field_u.a(param5, (byte) 101, false);
                this.a(param1, param0, this.field_u, -119);
              }
            }
            return;
          }
          stackIn_20_1 = (param3);
          this.field_C = stackIn_20_1;
          if (this.field_z == param5) {
            this.field_l = param4;
            this.a(param1, param0, this.field_u, -94);
            return;
          }
          if (param5 == this.field_E) {
            this.field_l = -param4;
            this.a(param1, param0, this.field_r, -97);
            return;
          }
          if (param2 >= -94) {
            return;
          }
          if (null != this.field_z) {
            if (null != this.field_E) {
              stackIn_35_0 = (this.field_n >= 524288) ? 0 : 1;
              var7_int = stackIn_35_0;
            } else {
              var7_int = 0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int == 0) {
            if (this.field_E != null) {
              this.field_r.e(15);
            }
            this.field_E = param5;
            if (param5 != null) {
              stackIn_51_0 = this.field_r;
              stackIn_51_1 = (gh) (param5);
              stackIn_51_2 = 101;
              stackIn_52_3 = !(param3);
              ((ga) (Object) stackIn_51_0).a(stackIn_51_1, (byte) stackIn_51_2, stackIn_52_3);
              this.a(param1, param0, this.field_r, -94);
            }
            this.field_l = -param4;
          } else {
            if (this.field_z != null) {
              this.field_u.e(15);
            }
            this.field_z = param5;
            if (param5 != null) {
              stackIn_42_0 = this.field_u;
              stackIn_42_1 = (gh) (param5);
              stackIn_42_2 = 101;
              stackIn_43_3 = !(param3);
              ((ga) (Object) stackIn_42_0).a(stackIn_42_1, (byte) stackIn_42_2, stackIn_43_3);
              this.a(param1, param0, this.field_u, -103);
            }
            this.field_l = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_57_0 = var7;
          stackIn_57_1 = new StringBuilder().append("h.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    public h() {
        this.field_y = 0;
        this.field_A = false;
        this.field_B = 256;
        ga var1 = new ga();
        this.a(var1, (byte) 17, new ga(var1));
    }

    static {
        field_w = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_x = new String[]{"Metal", "Biomass", "Energy", "Exotics"};
        field_t = new int[8192];
        field_s = new int[]{-14671840, -12566464, -10461088, -8355712, -6250336, -4144960, -2039584, -1};
    }
}
