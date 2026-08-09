/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    private int[] field_a;
    private int field_c;
    private boolean field_i;
    private int field_h;
    static o[] field_b;
    static int field_g;
    static o field_d;
    static long field_e;
    static o field_f;

    public static void a(int param0) {
        if (param0 != 1) {
          field_g = 47;
          field_f = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final void c(int param0, int param1) {
        int var3 = -67 % ((-45 - param0) / 43);
        this.a(1 + this.field_h, (byte) 61, param1);
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    var3 = this.field_a.length;
                    if (param1 < -98) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return -103;
                }
                case 2: {
                    if (var3 <= param0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return var3;
                }
                case 4: {
                    stackIn_6_0 = this.field_i;
                    stackIn_5_0 = stackIn_6_0;
                    if (var4 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return stackIn_5_0 ? 1 : 0;
                }
                case 6: {
                    if (!stackIn_6_0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = 1;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var3 = var3 * this.field_c;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var3 = var3 + this.field_c;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1) {
        if ((param1 ^ -1) <= -1) {
          if (param1 <= this.field_h) {
            L0: {
              if (this.field_h != param1) {
                fk.a(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_h);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_h = this.field_h - 1;
            if (param0) {
              return;
            } else {
              this.b(-55);
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private of() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, byte param1, int param2) {
        L0: {
          if (param0 > this.field_h) {
            this.field_h = param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.field_a.length > param0) {
          if (param1 != 61) {
            field_f = (o) null;
            this.field_a[param0] = param2;
            return;
          } else {
            this.field_a[param0] = param2;
            return;
          }
        } else {
          this.b(param0, 0);
          if (param1 == 61) {
            this.field_a[param0] = param2;
            return;
          } else {
            field_f = (o) null;
            this.field_a[param0] = param2;
            return;
          }
        }
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.a(param0, -113)];
        int[] var3 = var4;
        fk.a(this.field_a, param1, var4, 0, this.field_a.length);
        this.field_a = var4;
    }

    final int a(byte param0, int param1) {
        if (this.field_h >= param1) {
          if (param0 != 43) {
            this.field_h = 68;
            return this.field_a[param1];
          } else {
            return this.field_a[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int b(int param0) {
        if (param0 <= 74) {
            this.a((byte) -24, -1);
            return this.field_h - -1;
        }
        return this.field_h - -1;
    }

    static {
        field_g = 0;
    }
}
