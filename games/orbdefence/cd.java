/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends wj {
    byte field_s;
    static int[] field_q;
    static String field_r;
    static la field_w;
    static String field_x;
    static se field_t;
    int field_v;
    mg field_u;

    public static void d(byte param0) {
        field_x = null;
        if (param0 == 61) {
          field_r = null;
          field_q = null;
          field_w = null;
          field_t = null;
          return;
        }
        field_q = (int[]) null;
        field_r = null;
        field_q = null;
        field_w = null;
        field_t = null;
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_25_0 = false;
        if (param0 != -91) {
          cd.a(7, true, -24);
          if (param1 >= 65 &&
            param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (122 < param1) {
            return false;
          }
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_25_0 = (param1 >= 97) && (122 >= param1);
        return stackIn_25_0;
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -10) {
            var4 = (CharSequence) null;
            cd.a((CharSequence) null, -84, 37);
          }
          stackIn_3_0 = af.a(true, param0, -126, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cd.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final byte[] f(int param0) {
        if (param0 != 0) {
          CharSequence var3 = (CharSequence) null;
          cd.a((CharSequence) null, 97, -111);
          if (this.field_l) {
            throw new RuntimeException();
          }
          if (-this.field_s + this.field_u.field_j.length <= this.field_u.field_i) {
            return this.field_u.field_j;
          }
          throw new RuntimeException();
        }
        if (this.field_l) {
          throw new RuntimeException();
        }
        if (-this.field_s + this.field_u.field_j.length <= this.field_u.field_i) {
          return this.field_u.field_j;
        }
        throw new RuntimeException();
    }

    final int e(int param0) {
        if (null == this.field_u) {
          return 0;
        }
        if (param0 == 100) {
          return 100 * this.field_u.field_i / (this.field_u.field_j.length - this.field_s);
        }
        return -78;
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (ji.field_b < 0) {
          return;
        }
        var3 = -135 + param0;
        var4 = param2 - 35;
        var5 = 256;
        if (ji.field_b < 75) {
          var5 = (ji.field_b << 8) / 75;
        }
        if (200 < ji.field_b) {
          var5 = (250 - ji.field_b << 8) / 50;
        }
        de.a(-121, kf.field_a);
        wi.c();
        ul.d();
        bj.j(97);
        if (var5 < 256) {
          ul.d(0, 0, ul.field_f, ul.field_l, 0, 256 - var5);
          oc.g((byte) -105);
          if (150 <= ji.field_b) {
            t.field_j.a(15 + var3, var4 + 10, var5);
          } else {
            kf.field_a.d(var3, var4);
          }
          var6 = ji.field_b - 125;
          if (param1) {
            field_w = (la) null;
          }
          if (0 < var6 &&
            var6 < 50) {
            if (20 <= var6) {
              if (var6 >= 30) {
                var7 = (12800 - 256 * var6) / 20;
                jc.field_k.e(var3, var4, var7);
              } else {
                jc.field_k.e(var3, var4, 256);
              }
            } else {
              var7 = 256 * var6 / 20;
              jc.field_k.e(var3, var4, var7);
            }
          }
        } else {
          oc.g((byte) -105);
          if (150 <= ji.field_b) {
            t.field_j.a(15 + var3, var4 + 10, var5);
            var6 = ji.field_b - 125;
            if (param1) {
              field_w = (la) null;
              if (0 < var6 &&
                var6 < 50) {
                if (20 <= var6) {
                  if (var6 >= 30) {
                    var7 = (12800 - 256 * var6) / 20;
                    jc.field_k.e(var3, var4, var7);
                  } else {
                    jc.field_k.e(var3, var4, 256);
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  jc.field_k.e(var3, var4, var7);
                }
              }
              var6 = ji.field_b - 140;
              if (var6 > 0) {
                var7 = 256;
                if (20 > var6) {
                  var7 = 256 * var6 / 20;
                }
                fd.field_a.a(var3 + 15, 10 + var4, var7 * var5 >> 8);
              }
            } else {
              if (0 >= var6) {
                var6 = ji.field_b - 140;
                if (var6 > 0) {
                  var7 = 256;
                  if (20 > var6) {
                    var7 = 256 * var6 / 20;
                  }
                  fd.field_a.a(var3 + 15, 10 + var4, var7 * var5 >> 8);
                }
              } else {
                if (var6 >= 50) {
                  var6 = ji.field_b - 140;
                  if (var6 > 0) {
                    var7 = 256;
                    if (20 > var6) {
                      var7 = 256 * var6 / 20;
                    }
                    fd.field_a.a(var3 + 15, 10 + var4, var7 * var5 >> 8);
                  }
                } else {
                  if (20 > var6) {
                    var7 = 256 * var6 / 20;
                    jc.field_k.e(var3, var4, var7);
                    var6 = ji.field_b - 140;
                    if (var6 > 0) {
                      var7 = 256;
                      if (20 > var6) {
                        var7 = 256 * var6 / 20;
                      }
                      fd.field_a.a(var3 + 15, 10 + var4, var7 * var5 >> 8);
                    }
                  } else {
                    if (var6 < 30) {
                      jc.field_k.e(var3, var4, 256);
                      var6 = ji.field_b - 140;
                      if (var6 > 0) {
                        var7 = 256;
                        if (20 > var6) {
                          var7 = 256 * var6 / 20;
                        }
                        fd.field_a.a(var3 + 15, 10 + var4, var7 * var5 >> 8);
                      }
                    } else {
                      var7 = (12800 - 256 * var6) / 20;
                      jc.field_k.e(var3, var4, var7);
                      var6 = ji.field_b - 140;
                      if (var6 > 0) {
                        var7 = 256;
                        if (20 > var6) {
                          var7 = 256 * var6 / 20;
                        }
                        fd.field_a.a(var3 + 15, 10 + var4, var7 * var5 >> 8);
                      }
                    }
                  }
                }
              }
            }
            return;
          }
          kf.field_a.d(var3, var4);
          var6 = ji.field_b - 125;
          if (param1) {
            field_w = (la) null;
            if (0 < var6 &&
              var6 < 50) {
              if (20 <= var6) {
                if (var6 >= 30) {
                  var7 = (12800 - 256 * var6) / 20;
                  jc.field_k.e(var3, var4, var7);
                } else {
                  jc.field_k.e(var3, var4, 256);
                }
              } else {
                var7 = 256 * var6 / 20;
                jc.field_k.e(var3, var4, var7);
              }
            }
          } else {
            if (0 < var6 &&
              var6 < 50) {
              if (20 > var6) {
                var7 = 256 * var6 / 20;
                jc.field_k.e(var3, var4, var7);
              } else {
                if (var6 < 30) {
                  jc.field_k.e(var3, var4, 256);
                } else {
                  var7 = (12800 - 256 * var6) / 20;
                  jc.field_k.e(var3, var4, var7);
                }
              }
            }
          }
        }
        var6Lifetime1 = ji.field_b - 140;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (20 > var6Lifetime1) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          fd.field_a.a(var3 + 15, 10 + var4, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    cd() {
    }

    static {
        field_r = "ATOMIC SHOT";
        field_x = "You have <%0> unread messages!";
        field_q = new int[8192];
    }
}
