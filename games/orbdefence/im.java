/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static int[] field_a;
    static String field_b;
    ca field_d;
    private ca field_c;

    final ca a(byte param0) {
        ca var2 = null;
        int var3 = 0;
        var2 = this.field_d.field_c;
        if (this.field_d == var2) {
          return null;
        } else {
          var3 = -80 / ((param0 - -14) / 34);
          var2.b(57);
          return var2;
        }
    }

    final ca d(int param0) {
        ca var2 = null;
        var2 = this.field_c;
        if (this.field_d == var2) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_e;
          if (param0 != 853) {
            field_b = (String) null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final ca b(byte param0) {
        ca var2 = null;
        int var3 = 0;
        var2 = this.field_d.field_e;
        if (var2 == this.field_d) {
          this.field_c = null;
          return null;
        } else {
          var3 = -122 / ((58 - param0) / 56);
          this.field_c = var2.field_e;
          return var2;
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -3088) {
          L0: {
            field_a = (int[]) null;
            if (this.field_d.field_e != this.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_d.field_e != this.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final ca d(byte param0) {
        ca var2 = null;
        var2 = this.field_d.field_c;
        if (var2 != this.field_d) {
          this.field_c = var2.field_c;
          if (param0 != -122) {
            this.field_c = (ca) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    final void a(int param0, ca param1) {
        if (null != param1.field_c) {
            param1.b(57);
        }
        if (param0 >= -68) {
            return;
        }
        try {
            param1.field_c = this.field_d.field_c;
            param1.field_e = this.field_d;
            param1.field_c.field_e = param1;
            param1.field_e.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "im.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        var6 = new char[param1];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (var4 < param1) {
            var6[var4] = param0;
            var4++;
            if (var5 == 0) {
              continue L0;
            } else {
              return new String(var6);
            }
          } else {
            var4 = 70 / ((0 - param2) / 53);
            return new String(var6);
          }
        }
    }

    final int c(byte param0) {
        int var2 = 0;
        ca var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        var2 = 0;
        var3 = this.field_d.field_e;
        if (param0 == 52) {
          L0: while (true) {
            L1: {
              if (this.field_d == var3) {
                break L1;
              } else {
                var2++;
                var3 = var3.field_e;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          this.field_d = (ca) null;
          L2: while (true) {
            L3: {
              if (this.field_d == var3) {
                break L3;
              } else {
                var2++;
                var3 = var3.field_e;
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return var2;
          }
        }
    }

    public static void a(int param0) {
        String discarded$0 = null;
        if (param0 != 9) {
            discarded$0 = im.a('O', 32, 30);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final ca b(int param0) {
        ca discarded$9 = null;
        ca var2 = this.field_c;
        if (param0 != 10708) {
            discarded$9 = this.a((byte) 52);
            if (!(var2 != this.field_d)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_c;
            return var2;
        }
        if (!(var2 != this.field_d)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_c;
        return var2;
    }

    public im() {
        this.field_d = new ca();
        this.field_d.field_e = this.field_d;
        this.field_d.field_c = this.field_d;
    }

    final void a(ca param0, int param1) {
        if (param0.field_c != null) {
            param0.b(57);
        }
        if (param1 != 9) {
            return;
        }
        try {
            param0.field_e = this.field_d.field_e;
            param0.field_c = this.field_d;
            param0.field_c.field_e = param0;
            param0.field_e.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "im.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        ca discarded$1 = null;
        ca var2 = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        L0: while (true) {
          var2 = this.field_d.field_e;
          if (var2 == this.field_d) {
            if (param0) {
              discarded$1 = this.d(79);
              this.field_c = null;
              return;
            } else {
              this.field_c = null;
              return;
            }
          } else {
            var2.b(57);
            if (var3 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final ca e(int param0) {
        ca var2 = null;
        if (param0 == 0) {
          var2 = this.field_d.field_e;
          if (this.field_d == var2) {
            return null;
          } else {
            var2.b(param0 ^ 57);
            return var2;
          }
        } else {
          this.field_c = (ca) null;
          var2 = this.field_d.field_e;
          if (this.field_d == var2) {
            return null;
          } else {
            var2.b(param0 ^ 57);
            return var2;
          }
        }
    }

    static {
        field_b = "Names cannot contain consecutive spaces";
        field_a = new int[9];
    }
}
