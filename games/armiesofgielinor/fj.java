/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    int field_f;
    int field_n;
    static String field_a;
    private int field_s;
    static ClientUiComponent field_d;
    private int field_r;
    boolean field_h;
    private int field_o;
    private int field_p;
    static String field_u;
    private ok field_k;
    private int field_e;
    private int field_j;
    private float field_v;
    static String[] field_q;
    private int field_t;
    static String field_w;
    private int field_i;
    private int field_m;
    private int field_x;
    static boolean field_c;
    private int field_l;
    private int field_g;
    private int field_b;

    final void a(int param0, int param1, int param2) {
        this.field_f = param0;
        this.field_n = param1;
        if (param2 == -8717) {
          return;
        }
        this.c((byte) -71);
    }

    final static void a(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param1.previous != null) {
            param1.unlink(-105);
          }
          param1.previous = param2.previous;
          if (param0 != -123) {
            field_a = (String) null;
          }
          param1.next = param2;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fj.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_g = param0;
        this.field_m = param1;
        if (param2 == -30514) {
          return;
        }
        this.field_o = 12;
    }

    final static void a(java.awt.Frame param0, hd param1, int param2) {
        wo var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != -2) {
            return;
          }
          while (true) {
            var3 = param1.a((byte) -68, param0);
            while (var3.field_g == 0) {
              nu.a(10L, 0);
            }
            if (var3.field_g != 1) {
              nu.a(100L, 0);
              continue;
            }
            break;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("fj.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    fj(ok param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final boolean c(int param0, int param1, int param2) {
        if (param1 != 122) {
          return false;
        }
        if (param0 < this.field_l) {
          return false;
        }
        if (this.field_r < param0) {
          return false;
        }
        if (param2 < this.field_i) {
          return false;
        }
        if (param2 > this.field_x) {
          return false;
        }
        if (this.field_v == 0.0f) {
          return true;
        }
        if (Math.round(this.field_v * (float)param2) != param0) {
          return false;
        }
        return true;
    }

    final boolean a(byte param0) {
        if (param0 != 103) {
          this.a(-97);
          if (this.field_o > hq.field_f) {
            return false;
          }
          if (df.field_M > 0) {
            return true;
          }
          return false;
        }
        if (this.field_o > hq.field_f) {
          return false;
        }
        if (df.field_M > 0) {
          return true;
        }
        return false;
    }

    final void b(int param0) {
        this.field_k.a(this.field_j, -32263, this.field_e);
        if (param0 >= 114) {
          return;
        }
        this.field_j = -64;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          if (param1 != 35) {
            IntrusiveNode var3 = (IntrusiveNode) null;
            fj.$cfr$intArgs$a$f94c566f195c(-121, (IntrusiveNode) null, (IntrusiveNode) null);
          }
          param0.removeKeyListener(QuickChatCategory.field_w);
          param0.removeFocusListener(QuickChatCategory.field_w);
          us.field_c = -1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 <= 38) {
          field_w = (String) null;
          if (df.field_M <= 0) {
            return false;
          }
          if (this.field_o > hq.field_f) {
            return true;
          }
          return false;
        }
        if (df.field_M <= 0) {
          return false;
        }
        if (this.field_o > hq.field_f) {
          return true;
        }
        return false;
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        if (null != FixedQuaternion.field_a) {
          return;
        }
        if (df.field_M <= 0) {
          this.field_h = false;
        }
        if (this.field_h) {
          fieldTemp$0 = this.field_p - 1;
          this.field_p = this.field_p - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_p = this.field_b;
          if (this.field_o > hq.field_f) {
            this.field_h = false;
          } else {
            if (param0 != 0) {
              this.field_e = 67;
            }
            this.c((byte) 56);
          }
          return;
        }
        if (bn.field_b < this.field_m) {
          DualNodeIterator.field_b = (this.field_m - bn.field_b) / 2;
        } else {
          if (this.field_m > 0) {
            DualNodeIterator.field_b = 0;
          }
        }
        if (bn.field_b == this.field_t &&
          dt.field_a == this.field_s) {
          return;
        }
        this.field_k.a(this.field_s, -32263, this.field_t);
    }

    final rd c(int param0) {
        rd var2 = null;
        rd var2Lifetime1;
        this.field_j = dt.field_a;
        if (param0 != -1) {
          fj.b((byte) -86);
          this.field_e = bn.field_b;
          this.field_k.a(this.field_n, param0 ^ 32262, this.field_f);
          tq.field_a = false;
          var2 = dj.a(this.field_f, 0, IntPair.field_m, -71, 0, this.field_n);
          if (var2 == null) {
            this.b(124);
            return var2;
          }
          return var2;
        }
        this.field_e = bn.field_b;
        this.field_k.a(this.field_n, param0 ^ 32262, this.field_f);
        tq.field_a = false;
        var2Lifetime1 = dj.a(this.field_f, 0, IntPair.field_m, -71, 0, this.field_n);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.b(124);
        return var2Lifetime1;
    }

    public static void b(byte param0) {
        int var1 = -107 / ((57 - param0) / 47);
        field_q = null;
        field_a = null;
        field_w = null;
        field_d = null;
        field_u = null;
    }

    private final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = this.field_m;
        if (param0 == 56) {
          var3 = this.field_g;
          if (!this.a((byte) 103)) {
            this.field_h = false;
            return;
          }
          if (var2 <= this.field_r) {
            if (var2 < this.field_l) {
              var2 = this.field_l;
            }
          } else {
            var2 = this.field_r;
          }
          if (var3 > this.field_x) {
            var3 = this.field_x;
            if (0.0f < this.field_v) {
              var4 = (int)(this.field_v * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_v);
              } else {
                if (var4 < var2) {
                  var2 = var4;
                }
              }
            }
          } else {
            if (this.field_i > var3) {
              var3 = this.field_i;
            }
            if (0.0f < this.field_v) {
              var4 = (int)(this.field_v * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_v);
              } else {
                if (var4 < var2) {
                  var2 = var4;
                }
              }
            }
          }
          if (bn.field_b != var2) {
            this.field_k.a(var3, -32263, var2);
          } else {
            if (dt.field_a != var3) {
              this.field_k.a(var3, -32263, var2);
            }
          }
          if (this.field_m <= 0) {
            return;
          }
          DualNodeIterator.field_b = (-bn.field_b + this.field_m) / 2;
          return;
        }
        this.field_n = 17;
        var3Lifetime1 = this.field_g;
        if (!this.a((byte) 103)) {
          this.field_h = false;
          return;
        }
        if (var2 <= this.field_r) {
          if (var2 < this.field_l) {
            var2 = this.field_l;
          }
        } else {
          var2 = this.field_r;
        }
        if (var3Lifetime1 > this.field_x) {
          var3Lifetime1 = this.field_x;
          if (0.0f < this.field_v) {
            var4Lifetime1 = (int)(this.field_v * (float)var3Lifetime1 + 0.5f);
            if (var2 < var4Lifetime1) {
              var3Lifetime1 = (int)((float)var2 / this.field_v);
            } else {
              if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
              }
            }
          }
          if (bn.field_b != var2 ||
            dt.field_a != var3Lifetime1) {
            this.field_k.a(var3Lifetime1, -32263, var2);
          }
          if (this.field_m <= 0) {
            return;
          }
          DualNodeIterator.field_b = (-bn.field_b + this.field_m) / 2;
          return;
        }
        if (this.field_i > var3Lifetime1) {
          var3Lifetime1 = this.field_i;
        }
        if (!(0.0f < this.field_v)) {
          if (bn.field_b != var2) {
            this.field_k.a(var3Lifetime1, -32263, var2);
          } else {
            if (dt.field_a != var3Lifetime1) {
              this.field_k.a(var3Lifetime1, -32263, var2);
            }
          }
          if (this.field_m <= 0) {
            return;
          }
          DualNodeIterator.field_b = (-bn.field_b + this.field_m) / 2;
          return;
        }
        var4Lifetime2 = (int)(this.field_v * (float)var3Lifetime1 + 0.5f);
        if (var2 < var4Lifetime2) {
          var3Lifetime1 = (int)((float)var2 / this.field_v);
        } else {
          if (var4Lifetime2 < var2) {
            var2 = var4Lifetime2;
          }
        }
        if (bn.field_b != var2) {
          this.field_k.a(var3Lifetime1, -32263, var2);
        } else {
          if (dt.field_a != var3Lifetime1) {
            this.field_k.a(var3Lifetime1, -32263, var2);
          }
        }
        if (this.field_m <= 0) {
          return;
        }
        DualNodeIterator.field_b = (-bn.field_b + this.field_m) / 2;
        return;
    }

    private fj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ok param8) {
        try {
          this.field_v = 0.0f;
          this.field_k = param8;
          this.field_t = param4;
          this.field_x = param3;
          this.field_r = param2;
          this.field_s = param5;
          this.field_l = param0;
          this.field_b = param7;
          this.field_i = param1;
          this.field_f = 640;
          this.field_n = 480;
          this.field_h = false;
          this.field_o = param6;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Back";
        field_w = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
        field_q = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_u = "Spells of great power to cause harm to your enemies.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$f94c566f195c(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param1.previous != null) {
            param1.unlink(-105);
          }
          param1.previous = param2.previous;
          if (param0 != -123) {
            field_a = (String) null;
          }
          param1.next = param2;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fj.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
