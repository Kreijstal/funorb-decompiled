/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int field_b;
    static String field_a;
    IntrusiveNode sentinel;
    private IntrusiveNode field_c;

    final IntrusiveNode removeLast(byte param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (param0 >= -108) {
          return (IntrusiveNode) null;
        }
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(20);
        return var2;
    }

    final static void c(int param0) {
        if (param0 != -2290) {
          IntrusiveDeque.a(false);
        }
        if (ob.field_b != null) {
          ob.field_b.a(true);
          ob.field_b = null;
        }
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = this.field_c;
        if (var2 == this.sentinel) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.next;
        int var3 = 68 / ((13 - param0) / 33);
        return var2;
    }

    final IntrusiveNode removeFirst(byte param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          return null;
        }
        if (param0 >= -7) {
          this.sentinel = (IntrusiveNode) null;
        }
        var2.unlink(20);
        return var2;
    }

    final boolean isEmpty(int param0) {
        if (param0 != 0) {
          this.clear((byte) -106);
        }
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final static void a(Sprite param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        Sprite var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = stellarshard.field_B;
        try {
          if (ti.field_e > param2) {
            param6 = param6 - (-param2 + ti.field_e);
            param2 = ti.field_e;
          }
          if (param5 < ti.field_f) {
            param3 = param3 - (ti.field_f - param5);
            param5 = ti.field_f;
          }
          if (ti.field_c < param2 + param6) {
            param6 = ti.field_c - param2;
          }
          if (ti.field_l < param5 + param3) {
            param3 = ti.field_l - param5;
          }
          if (param6 > 0 &&
            param3 > 0) {
            var21 = param0.a();
            if (!param7) {
              return;
            }
            var30 = ti.field_a;
            var10 = ti.field_i;
            var11 = ti.field_b;
            var29 = new int[4];
            ti.a(var29);
            param0.e();
            ti.a(var29[0], var29[1], var29[2], var29[3]);
            var13 = param2 + param5 * param0.field_v;
            var14 = param0.field_v - param6;
            var25 = var21.field_z;
            var22 = var25;
            var15 = var22;
            for (var16 = param5; param3 + param5 > var16; var16++) {
              for (var17 = param2; var17 < param2 + param6; var17++) {
                var18 = var25[var13];
                if (0 != var18) {
                  if (var17 > 0 &&
                    var15[var13 - 1] == 0) {
                    ti.e(var17, var16, param4, param1);
                  } else {
                    if (0 < var16 &&
                      var15[var13 - param0.field_v] == 0) {
                      ti.e(var17, var16, param4, param1);
                    } else {
                      if (param0.field_v - 1 > var17 &&
                        0 == var15[var13 + 1]) {
                        ti.e(var17, var16, param4, param1);
                      } else {
                        if (var16 < param0.field_y - 1 &&
                          var15[var13 + param0.field_v] == 0) {
                          ti.e(var17, var16, param4, param1);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.e(-param0.field_t, -param0.field_s);
            ti.a(var30, var10, var11);
            ti.b(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_43_0 = var8;
          stackIn_43_1 = new StringBuilder().append("oj.I(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        try {
          if (param0 != -1) {
            field_b = -120;
          }
          if (param1.previous != null) {
            param1.unlink(20);
          }
          param1.next = this.sentinel.next;
          param1.previous = this.sentinel;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "oj.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
    }

    final void clear(byte param0) {
        IntrusiveNode var2;
        int var3;
        IntrusiveNode var4;
        var3 = stellarshard.field_B;
        while (true) {
          var2 = this.sentinel.next;
          if (this.sentinel != var2) {
            var2.unlink(20);
            continue;
          }
          break;
        }
        if (param0 != -8) {
          var4 = (IntrusiveNode) null;
          this.addFirst(95, (IntrusiveNode) null);
        }
        this.field_c = null;
        return;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        try {
          if (param0 >= -39) {
            this.sentinel = (IntrusiveNode) null;
          }
          if (null != param1.previous) {
            param1.unlink(20);
          }
          param1.previous = this.sentinel.previous;
          param1.next = this.sentinel;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "oj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.next;
        if (param0 > -74) {
          this.b((byte) -32);
        }
        return var2;
    }

    static {
        field_b = 20;
        field_a = "Log in";
    }
}
