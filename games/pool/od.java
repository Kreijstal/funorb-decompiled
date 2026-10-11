/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_e;
    static boolean field_c;
    java.awt.Frame field_b;
    static dd field_a;
    static int field_d;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(sj param0, int param1) {
        try {
          og.a(this.field_b, param0, 24442);
          if (param1 != -1) {
            field_a = (dd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "od.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_e = true;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "od.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(int param0) {
        if (param0 != 255) {
          return;
        }
        field_a = null;
    }

    od() {
    }

    final static long a(long param0, long param1, boolean param2) {
        long var5;
        var5 = param1 * param0;
        if ((255L & var5 >> 47) == 0L) {
          var5 = var5 >> 16;
        } else {
          if (255L == (var5 >> 47 & 255L)) {
            var5 = var5 >> 16;
            if (0L > param0 &&
              param1 < 0L &&
              var5 < 0L) {
              throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
            if ((param0 > 0L &&
              param1 < 0L ||
              0L > param0 &&
              0L < param1) && var5 > 0L) {
              throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
            if (param2) {
              return 61L;
            }
            if (param0 <= 0L) {
              return var5;
            }
            if (param1 <= 0L) {
              return var5;
            }
            if (var5 < 0L) {
              throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
            return var5;
          }
          var5 = (param0 >> 8) * (param1 >> 8);
        }
        if (0L <= param0) {
          if (param0 <= 0L) {
            if (0L > param0 &&
              0L < param1 &&
              var5 > 0L) {
              throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
          } else {
            if (param1 >= 0L) {
              if (0L > param0 &&
                0L < param1 &&
                var5 > 0L) {
                throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              }
            } else {
              if (var5 > 0L) {
                throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              }
            }
          }
        } else {
          if (param1 < 0L) {
            if (var5 < 0L) {
              throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
            if ((param0 > 0L &&
              param1 < 0L ||
              0L > param0 &&
              0L < param1) && var5 > 0L) {
              throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
            if (param2) {
              return 61L;
            }
            if (param0 <= 0L) {
              return var5;
            }
            if (param1 <= 0L) {
              return var5;
            }
            if (var5 >= 0L) {
              return var5;
            }
            throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
          }
          if (param0 <= 0L) {
            if (0L > param0 &&
              0L < param1) {
              if (var5 > 0L) {
                throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              }
              if (param2) {
                return 61L;
              }
              if (param0 <= 0L) {
                return var5;
              }
              if (param1 <= 0L) {
                return var5;
              }
              if (var5 < 0L) {
                throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              }
              return var5;
            }
          } else {
            if (param1 >= 0L) {
              if (0L > param0 &&
                0L < param1 &&
                var5 > 0L) {
                throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              }
              if (param2) {
                return 61L;
              }
              if (param0 <= 0L) {
                return var5;
              }
              if (param1 <= 0L) {
                return var5;
              }
              if (var5 < 0L) {
                throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              }
              return var5;
            }
            if (var5 > 0L) {
              throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
          }
        }
        if (param2) {
          return 61L;
        }
        if (param0 <= 0L) {
          return var5;
        }
        if (param1 <= 0L) {
          return var5;
        }
        if (var5 < 0L) {
          throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
        }
        return var5;
    }

    final static void a(boolean param0) {
        if (param0) {
          tn.field_n.d(new nr(), 30);
          return;
        }
        field_c = true;
        tn.field_n.d(new nr(), 30);
    }

    static {
        field_d = -1;
    }
}
