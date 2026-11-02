/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    static Sprite field_b;
    static int[] field_d;
    private IntrusiveNode field_a;
    private IntrusiveDeque field_e;
    static Archive field_c;

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        IntrusiveNode stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_e.sentinel.previous;
          }
          if (this.field_e.sentinel == var3) {
            this.field_a = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          this.field_a = var3.previous;
          var4 = 33 % ((-64 - param0) / 34);
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("vp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_a;
        if (var2 == this.field_e.sentinel) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.previous;
        if (param0 == 2) {
          return var2;
        }
        field_d = (int[]) null;
        return var2;
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 4) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.a(23, (IntrusiveNode) null);
          var2 = this.field_e.sentinel.next;
          if (this.field_e.sentinel == var2) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_e.sentinel.next;
        if (this.field_e.sentinel == var2Lifetime1) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode a(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_e.sentinel.next;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_e.sentinel) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_a = var3.next;
          if (param1 != 3) {
            this.field_a = (IntrusiveNode) null;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vp.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode d(int param0) {
        IntrusiveNode var2 = this.field_e.sentinel.previous;
        if (var2 == this.field_e.sentinel) {
          this.field_a = null;
          return null;
        }
        if (param0 == 4) {
          this.field_a = var2.previous;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final static int a(byte param0, int param1) {
        int var2 = -36 / ((28 - param0) / 47);
        return oj.field_O[param1].length;
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "vp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -91) {
          return;
        }
        field_d = null;
    }

    final static boolean a(int param0, int param1) {
        boolean stackIn_12_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_48_0 = false;
        boolean stackIn_59_0 = false;
        boolean stackIn_68_0 = false;
        boolean stackIn_83_0 = false;
        boolean stackIn_92_0 = false;
        if (param0 == 18055) {
          boolean decompiledFrameRemainder1 = true;
          if (param1 < 0 &&
            param1 != -4 &&
            param1 != -5 &&
            param1 != -2 &&
            param1 != -3) {
            if (-7 == param1) {
              if (param1 != 1 &&
                2 != param1 &&
                22 != param1 &&
                param1 != 3) {
                if (4 == param1) {
                  return true;
                }
                stackIn_83_0 = false;
              } else {
                stackIn_83_0 = true;
              }
              return stackIn_83_0;
            }
          } else {
            if (param1 != 1 &&
              2 != param1 &&
              22 != param1 &&
              param1 != 3) {
              if (4 == param1) {
                return true;
              }
              stackIn_92_0 = false;
              decompiledFrameRemainder1 = false;
            }
          }
          if (decompiledFrameRemainder1) {
            stackIn_92_0 = true;
          }
          return stackIn_92_0;
        }
        IntrusiveDequeCursor.a(72);
        if (param1 >= 0) {
          if (param1 == 1) {
            return true;
          }
          if (2 == param1) {
            return true;
          }
          if (22 != param1 &&
            param1 != 3) {
            if (4 == param1) {
              return true;
            }
            stackIn_12_0 = false;
          } else {
            stackIn_12_0 = true;
          }
          return stackIn_12_0;
        }
        if (param1 == -4) {
          if (param1 == 1) {
            return true;
          }
          if (2 == param1) {
            return true;
          }
          if (22 == param1) {
            return true;
          }
          if (param1 == 3) {
            return true;
          }
          if (4 != param1) {
            return false;
          }
          return true;
        }
        if (param1 == -5) {
          if (param1 == 1) {
            return true;
          }
          if (2 == param1) {
            return true;
          }
          if (22 != param1 &&
            param1 != 3) {
            if (4 == param1) {
              return true;
            }
            stackIn_38_0 = false;
          } else {
            stackIn_38_0 = true;
          }
          return stackIn_38_0;
        }
        if (param1 == -2) {
          if (param1 != 1 &&
            2 != param1 &&
            22 != param1 &&
            param1 != 3) {
            if (4 == param1) {
              return true;
            }
            stackIn_48_0 = false;
          } else {
            stackIn_48_0 = true;
          }
          return stackIn_48_0;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 == -3) {
          if (param1 != 1 &&
            2 != param1 &&
            22 != param1 &&
            param1 != 3) {
            if (4 == param1) {
              return true;
            }
            stackIn_68_0 = false;
            decompiledFrameRemainder0 = false;
          }
        } else {
          if (-7 == param1) {
            if (param1 != 1 &&
              2 != param1 &&
              22 != param1 &&
              param1 != 3) {
              if (4 == param1) {
                return true;
              }
              stackIn_59_0 = false;
            } else {
              stackIn_59_0 = true;
            }
            return stackIn_59_0;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_68_0 = true;
        }
        return stackIn_68_0;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_a;
        if (this.field_e.sentinel == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.next;
        if (param0 >= 13) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    static {
    }
}
