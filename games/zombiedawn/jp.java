/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static int[] field_f;
    private int field_e;
    int field_h;
    private int field_b;
    static o field_c;
    static String field_i;
    private int field_k;
    static boolean field_m;
    static String[] field_g;
    static int field_a;
    boolean field_j;
    private int field_l;
    int field_d;

    final void a(byte param0, int param1, int param2) {
        if (param1 >= this.field_h) {
          throw new IllegalArgumentException();
        }
        if (this.field_h <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_b = 0;
        this.field_e = 0;
        if (ci.field_d == 0) {
          if (this.field_l != 0 &&
            kc.field_R != 0) {
            if (this.field_k <= 0) {
              this.field_k = rg.field_H;
            }
            this.field_k = this.field_k - 1;
          }
          if (ci.field_d == 0 &&
            kc.field_R == 0) {
            this.field_l = 0;
            if (param0 > -10) {
              field_g = (String[]) null;
            }
            if (0 == this.field_l) {
              if (!this.field_j &&
                !ll.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_j) {
                  this.field_d = -1;
                }
              } else {
                if (this.field_d != param1) {
                  this.field_d = param1;
                  this.field_j = true;
                } else {
                  this.field_d = param1;
                  this.field_j = true;
                }
              }
            }
            return;
          }
          if (param0 > -10) {
            field_g = (String[]) null;
            if (0 == this.field_l) {
              if (!this.field_j &&
                !ll.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_j) {
                  this.field_d = -1;
                }
              } else {
                if (this.field_d != param1) {
                  this.field_d = param1;
                  this.field_j = true;
                } else {
                  this.field_d = param1;
                  this.field_j = true;
                }
              }
            }
            return;
          }
          if (0 != this.field_l) {
            return;
          }
          if (this.field_j) {
            if (0 > param1) {
              if (!this.field_j) {
                return;
              }
              this.field_d = -1;
              return;
            }
            if (this.field_d != param1) {
            }
            this.field_d = param1;
            this.field_j = true;
            return;
          }
          if (!ll.field_a) {
            return;
          }
          if (0 > param1) {
            if (this.field_j) {
              this.field_d = -1;
            }
          } else {
            if (this.field_d != param1) {
            }
            this.field_d = param1;
            this.field_j = true;
          }
          return;
        }
        this.field_e = ci.field_d;
        this.field_d = param2;
        this.field_j = true;
        this.field_l = ci.field_d;
        this.field_k = di.field_M;
        if (this.field_l == 0) {
          if (ci.field_d == 0 &&
            kc.field_R == 0) {
            this.field_l = 0;
            if (param0 > -10) {
              field_g = (String[]) null;
            }
            if (0 == this.field_l) {
              if (!this.field_j &&
                !ll.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_j) {
                  this.field_d = -1;
                }
              } else {
                if (this.field_d != param1) {
                  this.field_d = param1;
                  this.field_j = true;
                } else {
                  this.field_d = param1;
                  this.field_j = true;
                }
              }
            }
            return;
          }
          if (param0 > -10) {
            field_g = (String[]) null;
            if (0 == this.field_l) {
              if (!this.field_j &&
                !ll.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_j) {
                  this.field_d = -1;
                }
              } else {
                if (this.field_d != param1) {
                  this.field_d = param1;
                  this.field_j = true;
                } else {
                  this.field_d = param1;
                  this.field_j = true;
                }
              }
            }
            return;
          }
          if (0 != this.field_l) {
            return;
          }
          if (this.field_j) {
            if (0 > param1) {
              if (!this.field_j) {
                return;
              }
              this.field_d = -1;
              return;
            }
            if (this.field_d != param1) {
            }
            this.field_d = param1;
            this.field_j = true;
            return;
          }
          if (!ll.field_a) {
            return;
          }
          if (0 > param1) {
            if (this.field_j) {
              this.field_d = -1;
            }
          } else {
            if (this.field_d != param1) {
            }
            this.field_d = param1;
            this.field_j = true;
          }
          return;
        }
        if (kc.field_R != 0) {
          if (this.field_k <= 0) {
            this.field_k = rg.field_H;
          }
          this.field_k = this.field_k - 1;
        }
        if (ci.field_d != 0) {
          if (param0 > -10) {
            field_g = (String[]) null;
            if (0 != this.field_l) {
              return;
            }
            if (!this.field_j &&
              !ll.field_a) {
              return;
            }
          } else {
            if (0 != this.field_l) {
              return;
            }
            if (!this.field_j &&
              !ll.field_a) {
              return;
            }
          }
          if (0 > param1) {
            if (!this.field_j) {
              return;
            }
            this.field_d = -1;
            return;
          }
          if (this.field_d != param1) {
          }
          this.field_d = param1;
          this.field_j = true;
          return;
        }
        if (kc.field_R == 0) {
          this.field_l = 0;
          if (param0 > -10) {
            field_g = (String[]) null;
          }
          if (0 == this.field_l) {
            if (!this.field_j &&
              !ll.field_a) {
              return;
            }
            if (0 > param1) {
              if (this.field_j) {
                this.field_d = -1;
              }
            } else {
              if (this.field_d != param1) {
                this.field_d = param1;
                this.field_j = true;
              } else {
                this.field_d = param1;
                this.field_j = true;
              }
            }
          }
          return;
        }
        if (param0 > -10) {
          field_g = (String[]) null;
          if (0 == this.field_l) {
            if (!this.field_j &&
              !ll.field_a) {
              return;
            }
            if (0 <= param1) {
              if (this.field_d != param1) {
                this.field_d = param1;
                this.field_j = true;
                return;
              }
              this.field_d = param1;
              this.field_j = true;
              return;
            }
            if (!this.field_j) {
              return;
            }
            this.field_d = -1;
          }
          return;
        }
        if (0 == this.field_l) {
          if (this.field_j) {
            if (0 <= param1) {
              if (this.field_d != param1) {
              }
              this.field_d = param1;
              this.field_j = true;
              return;
            }
            if (!this.field_j) {
              return;
            }
            this.field_d = -1;
          } else {
            if (ll.field_a) {
              if (0 > param1) {
                if (!this.field_j) {
                  return;
                }
                this.field_d = -1;
                return;
              }
              if (this.field_d != param1) {
              }
              this.field_d = param1;
              this.field_j = true;
              return;
            }
          }
        }
    }

    final void a(boolean param0, byte param1, int param2, int param3) {
        if (param1 > -68) {
          return;
        }
        this.field_l = 0;
        this.field_j = param0 ? true : false;
        if (!this.field_j) {
          this.field_d = param3;
          return;
        }
        this.field_d = param2;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, String param2, String param3, int param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_42_0 = null;
          java.net.URL stackIn_44_0 = null;
          RuntimeException stackIn_47_0 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          StringBuilder stackIn_53_1 = null;
          String stackIn_54_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = ZombieDawn.field_J;
          try {
            if (param0 != 97) {
              field_c = (o) null;
            }
            var5 = param1.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param4 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', 1 + var6);
                if (0 <= var7_intLifetime1) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime2 >= 0) {
                  if (param3 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime3 >= 0) {
                  if (param2 == null) {
                    var6 = var7_intLifetime3;
                    continue;
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                  continue;
                }
              }
              break;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param4 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param4));
            }
            if (param3 != null &&
              param3.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param3);
            }
            if (param2 != null &&
              param2.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param2);
            }
            if (var6 < var5.length()) {
              discarded$7 = var7.append(var5.substring(var6, var5.length()));
            } else {
              discarded$8 = var7.append('/');
            }
            try {
              stackIn_42_0 = new java.net.URL(param1, var7.toString());
              return stackIn_42_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_44_0 = (java.net.URL) (param1);
              return stackIn_44_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("jp.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
            if (param2 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
            if (param3 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void g(int param0) {
        int var2 = -82 / ((param0 + 60) / 51);
        this.field_e = 0;
        this.field_b = 0;
        if (this.field_l != 0) {
          return;
        }
        this.field_b = kg.field_i;
    }

    final boolean b(int param0) {
        if (param0 < -6) {
          return 0 != this.field_l ? true : false;
        }
        this.field_b = -16;
        return 0 != this.field_l ? true : false;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_l = 0;
        this.field_j = param1 ? true : false;
        if (this.field_j) {
          this.field_d = param0;
          if (param2 != -20258) {
            this.g(49);
            return;
          }
          return;
        }
        if (param2 == -20258) {
          return;
        }
        this.g(49);
    }

    final boolean c(int param0) {
        if (param0 != -97) {
          return false;
        }
        return this.field_b == 96 ? true : false;
    }

    final boolean e(int param0) {
        if (param0 == -98) {
          return this.field_b == 97 ? true : false;
        }
        this.b(42, -37);
        return this.field_b == 97 ? true : false;
    }

    final void a(int param0) {
        this.field_e = 0;
        this.field_b = 0;
        if (param0 != 21657) {
          return;
        }
        if (0 == this.field_l) {
          if (kg.field_i != 98) {
            if (this.field_l == 0) {
              this.field_b = kg.field_i;
            }
            if (this.field_l != 0) {
              return;
            }
            if (kg.field_i != 99) {
              return;
            }
            this.field_d = this.field_d + 1;
            this.field_j = false;
            if (this.field_h > this.field_d) {
              return;
            }
            this.field_d = 0;
            return;
          }
          if (0 >= this.field_d) {
            this.field_d = this.field_h;
          }
          this.field_d = this.field_d - 1;
          this.field_j = false;
        }
        if (this.field_l == 0) {
          this.field_b = kg.field_i;
        }
        if (this.field_l != 0) {
          return;
        }
        if (kg.field_i != 99) {
          return;
        }
        this.field_d = this.field_d + 1;
        this.field_j = false;
        if (this.field_h > this.field_d) {
          return;
        }
        this.field_d = 0;
    }

    final static void a(byte param0) {
        int var1 = -48 / ((param0 - 16) / 50);
        if (null != kk.field_i) {
          kk.field_i.h((byte) 74);
        }
        ni.field_c = new fh();
        bm.field_d.b(20, ni.field_c);
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (this.field_l != 0) {
          var3 = -31 / ((-12 - param1) / 56);
          return;
        }
        this.field_d = param0;
        this.field_j = false;
        var3Lifetime1 = -31 / ((-12 - param1) / 56);
    }

    final static void b(byte param0) {
        rl.c(9);
        if (param0 != -50) {
          field_a = -13;
          og.b(-126, 4);
          return;
        }
        og.b(-126, 4);
    }

    final boolean b(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_b == 102 ? true : false;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
          field_i = null;
          field_c = null;
          field_g = null;
          return;
        }
        field_a = 85;
        field_i = null;
        field_c = null;
        field_g = null;
    }

    final boolean d(int param0) {
        if (param0 >= -119) {
          this.field_h = -98;
          if (this.field_e != 0) {
            return true;
          }
          if (this.field_b != 84) {
            return this.field_b == 83 ? true : false;
          }
          return true;
        }
        if (this.field_e != 0) {
          return true;
        }
        if (this.field_b == 84) {
          return true;
        }
        if (this.field_b != 83) {
          return false;
        }
        return true;
    }

    final static fn a(byte param0, int param1) {
        tm var2 = new tm(param1);
        var2.field_j.e(-1);
        if (param0 > 123) {
          kn.field_L.a(0, var2);
          return var2.field_j;
        }
        field_a = -55;
        kn.field_L.a(0, var2);
        return var2.field_j;
    }

    final boolean f(int param0) {
        if (param0 == -104) {
          return this.field_b == 103 ? true : false;
        }
        field_m = false;
        return this.field_b == 103 ? true : false;
    }

    final void a(int param0, int param1) {
        this.field_e = 0;
        this.field_b = 0;
        if (0 != this.field_l) {
          if (param1 == ~this.field_l) {
            this.field_b = kg.field_i;
            if (0 == this.field_l &&
              kg.field_i == 97) {
              this.field_d = this.field_d + 1;
              this.field_j = false;
              if (this.field_h <= this.field_d) {
                this.field_d = 0;
              }
            }
            if (this.field_l == 0) {
              if (kg.field_i != 98 &&
                99 != kg.field_i) {
                return;
              }
              if (0 > this.field_d) {
                this.field_d = param0;
              }
              this.field_j = false;
            }
            return;
          }
          if (0 == this.field_l) {
            if (kg.field_i != 97) {
              if (this.field_l == 0) {
                if (kg.field_i != 98 &&
                  99 != kg.field_i) {
                  return;
                }
                if (0 > this.field_d) {
                  this.field_d = param0;
                }
                this.field_j = false;
              }
              return;
            }
            this.field_d = this.field_d + 1;
            this.field_j = false;
            if (this.field_h <= this.field_d) {
              this.field_d = 0;
              if (this.field_l == 0) {
                if (kg.field_i != 98 &&
                  99 != kg.field_i) {
                  return;
                }
                if (0 > this.field_d) {
                  this.field_d = param0;
                }
                this.field_j = false;
              }
              return;
            }
          }
        } else {
          if (kg.field_i == 96) {
            if (this.field_d <= 0) {
              this.field_d = this.field_h;
              this.field_d = this.field_d - 1;
              this.field_j = false;
              if (param1 == ~this.field_l) {
                this.field_b = kg.field_i;
              }
              if (0 == this.field_l &&
                kg.field_i == 97) {
                this.field_d = this.field_d + 1;
                this.field_j = false;
                if (this.field_h <= this.field_d) {
                  this.field_d = 0;
                }
              }
              if (this.field_l != 0) {
                return;
              }
              if (kg.field_i != 98 &&
                99 != kg.field_i) {
                return;
              }
              if (0 > this.field_d) {
                this.field_d = param0;
              }
              this.field_j = false;
              return;
            }
            this.field_d = this.field_d - 1;
            this.field_j = false;
            if (param1 != ~this.field_l) {
              if (0 == this.field_l &&
                kg.field_i == 97) {
                this.field_d = this.field_d + 1;
                this.field_j = false;
                if (this.field_h <= this.field_d) {
                  this.field_d = 0;
                }
              }
              if (this.field_l == 0) {
                if (kg.field_i != 98 &&
                  99 != kg.field_i) {
                  return;
                }
                if (0 > this.field_d) {
                  this.field_d = param0;
                }
                this.field_j = false;
              }
              return;
            }
            this.field_b = kg.field_i;
            if (0 == this.field_l &&
              kg.field_i == 97) {
              this.field_d = this.field_d + 1;
              this.field_j = false;
              if (this.field_h <= this.field_d) {
                this.field_d = 0;
              }
            }
            if (this.field_l == 0) {
              if (kg.field_i != 98 &&
                99 != kg.field_i) {
                return;
              }
              if (0 > this.field_d) {
                this.field_d = param0;
              }
              this.field_j = false;
            }
            return;
          }
          if (param1 != ~this.field_l) {
            if (0 == this.field_l &&
              kg.field_i == 97) {
              this.field_d = this.field_d + 1;
              this.field_j = false;
              if (this.field_h <= this.field_d) {
                this.field_d = 0;
              }
            }
            if (this.field_l == 0) {
              if (kg.field_i != 98 &&
                99 != kg.field_i) {
                return;
              }
              if (0 > this.field_d) {
                this.field_d = param0;
              }
              this.field_j = false;
            }
            return;
          }
          this.field_b = kg.field_i;
          if (0 == this.field_l) {
            if (kg.field_i != 97) {
              if (this.field_l == 0) {
                if (kg.field_i != 98 &&
                  99 != kg.field_i) {
                  return;
                }
                if (0 > this.field_d) {
                  this.field_d = param0;
                }
                this.field_j = false;
              }
              return;
            }
            this.field_d = this.field_d + 1;
            this.field_j = false;
            if (this.field_h <= this.field_d) {
              this.field_d = 0;
            }
          }
        }
        if (this.field_l != 0) {
          return;
        }
        if (kg.field_i != 98 &&
          99 != kg.field_i) {
          return;
        }
        if (0 > this.field_d) {
          this.field_d = param0;
        }
        this.field_j = false;
    }

    jp(int param0) {
        this.field_j = false;
        this.field_d = 0;
        this.field_h = param0;
    }

    static {
        field_f = new int[128];
        field_i = "SCORE: <%0>";
        field_g = new String[]{"Ooops. It looks like there are no more humans left with the keycards you need. You'd better press 'ESC' to go to the menu and choose 'Retry'. Now.", "Uh-oh. Now you've done it. You've allowed the human you needed to get killed! Gah. Press 'ESC' to go to the menu and choose 'Retry'.", "Zombies can't use keycards. Come on, you knew that. Press 'ESC' to go to the menu and choose 'Retry'."};
        field_m = false;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static fn $cfr$intArgs$a$c44adeabe1a9(int param0, int param1) {
        tm var2 = new tm(param1);
        var2.field_j.e(-1);
        if (param0 > 123) {
          kn.field_L.a(0, var2);
          return var2.field_j;
        }
        field_a = -55;
        kn.field_L.a(0, var2);
        return var2.field_j;
    }
}
