/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static long field_k;
    static ir[] field_d;
    private int field_c;
    private int field_b;
    int field_h;
    int field_e;
    private boolean field_g;
    static String field_j;
    private int field_i;
    private int field_f;
    boolean field_a;
    static int field_l;

    public static void g(int param0) {
        field_j = null;
        int var1 = 98 / ((param0 + 72) / 33);
        field_d = null;
    }

    final void a(int param0, byte param1) {
        if (this.field_f == 0) {
          this.field_g = false;
          this.field_h = param0;
          this.field_a = true;
          if (param1 != 1) {
            this.f(107);
            return;
          }
          return;
        }
        if (param1 == 1) {
          return;
        }
        this.f(107);
    }

    final void a(boolean param0) {
        this.field_b = 0;
        this.field_a = param0 ? true : false;
        this.field_c = 0;
        if (this.field_f == 0) {
          this.field_c = qi.field_a;
        }
    }

    final static void a(byte param0) {
        int var1 = 11 / ((42 - param0) / 35);
    }

    final boolean c(byte param0) {
        if (param0 >= 77) {
          return this.field_f != 0 ? true : false;
        }
        this.c((byte) -114);
        return this.field_f != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        if (this.field_e <= param1) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.field_e) {
          throw new IllegalArgumentException();
        }
        this.field_c = 0;
        this.field_a = false;
        this.field_b = 0;
        var4 = -36 % ((17 - param2) / 35);
        if (0 != ne.field_s) {
          this.field_f = ne.field_s;
          this.field_i = lc.field_V;
          this.field_g = true;
          this.field_b = ne.field_s;
          this.field_h = param0;
        }
        if (this.field_f == 0) {
          if (ne.field_s == 0 &&
            0 == cd.field_b) {
            this.field_f = 0;
            if (this.field_f == 0) {
              if (!this.field_g &&
                !re.field_c) {
                return;
              }
              if (param1 < 0) {
                if (this.field_g) {
                  this.field_h = -1;
                }
              } else {
                if (this.field_h == param1) {
                  this.field_g = true;
                  this.field_h = param1;
                } else {
                  this.field_a = true;
                  this.field_g = true;
                  this.field_h = param1;
                }
              }
            }
            return;
          }
          if (this.field_f != 0) {
            return;
          }
          if (!this.field_g &&
            !re.field_c) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_g) {
              return;
            }
            this.field_h = -1;
            return;
          }
          if (this.field_h != param1) {
            this.field_a = true;
          }
          this.field_g = true;
          this.field_h = param1;
          return;
        }
        if (cd.field_b == 0) {
          if (ne.field_s == 0 &&
            0 == cd.field_b) {
            this.field_f = 0;
            if (this.field_f == 0) {
              if (!this.field_g &&
                !re.field_c) {
                return;
              }
              if (param1 < 0) {
                if (this.field_g) {
                  this.field_h = -1;
                }
              } else {
                if (this.field_h == param1) {
                  this.field_g = true;
                  this.field_h = param1;
                } else {
                  this.field_a = true;
                  this.field_g = true;
                  this.field_h = param1;
                }
              }
            }
            return;
          }
          if (this.field_f != 0) {
            return;
          }
          if (!this.field_g &&
            !re.field_c) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_g) {
              return;
            }
            this.field_h = -1;
            return;
          }
          if (this.field_h != param1) {
            this.field_a = true;
          }
          this.field_g = true;
          this.field_h = param1;
          return;
        }
        if (this.field_i > 0) {
          this.field_i = this.field_i - 1;
          if (ne.field_s == 0 &&
            0 == cd.field_b) {
            this.field_f = 0;
          }
          if (this.field_f != 0) {
            return;
          }
          if (!this.field_g &&
            !re.field_c) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_g) {
              return;
            }
            this.field_h = -1;
            return;
          }
          if (this.field_h != param1) {
            this.field_a = true;
          }
          this.field_g = true;
          this.field_h = param1;
          return;
        }
        this.field_i = kh.field_oc;
        this.field_i = this.field_i - 1;
        if (ne.field_s != 0) {
          if (this.field_f != 0) {
            return;
          }
          if (!this.field_g &&
            !re.field_c) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_g) {
              return;
            }
            this.field_h = -1;
            return;
          }
          if (this.field_h != param1) {
            this.field_a = true;
            this.field_g = true;
            this.field_h = param1;
            return;
          }
          this.field_g = true;
          this.field_h = param1;
          return;
        }
        if (0 != cd.field_b) {
          if (this.field_f != 0) {
            return;
          }
          if (!this.field_g &&
            !re.field_c) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_g) {
              return;
            }
            this.field_h = -1;
            return;
          }
          if (this.field_h != param1) {
            this.field_a = true;
            this.field_g = true;
            this.field_h = param1;
            return;
          }
          this.field_g = true;
          this.field_h = param1;
          return;
        }
        this.field_f = 0;
        if (this.field_f != 0) {
          return;
        }
        if (!this.field_g &&
          !re.field_c) {
          return;
        }
        if (param1 < 0) {
          if (!this.field_g) {
            return;
          }
          this.field_h = -1;
          return;
        }
        if (this.field_h != param1) {
          this.field_a = true;
          this.field_g = true;
          this.field_h = param1;
          return;
        }
        this.field_g = true;
        this.field_h = param1;
        return;
    }

    final static void h(int param0) {
        if (hb.field_a > 0) {
          hb.field_a = hb.field_a - 1;
          if (hb.field_a <= 0) {
            if (0 < uf.field_z) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-42, uf.field_z);
            }
            if (nj.field_b > 0) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
            }
            if (param0 != -13953) {
              ia.g(67);
            }
            return;
          }
          qi.a((byte) -80);
          if (0 >= uf.field_z) {
            if (nj.field_b > 0) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
            }
            if (param0 != -13953) {
              ia.g(67);
            }
            return;
          }
          fr.$cfr$intArgs$a$e9dea5688aa5(-42, uf.field_z);
          if (nj.field_b > 0) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
          }
          if (param0 == -13953) {
            return;
          }
          ia.g(67);
          return;
        }
        if (0 < uf.field_z) {
          uf.field_z = uf.field_z - 1;
          if (hb.field_a > 0) {
            qi.a((byte) -80);
          }
          if (0 < uf.field_z) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-42, uf.field_z);
          }
          if (nj.field_b > 0) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
          }
          if (param0 == -13953) {
            return;
          }
          ia.g(67);
          return;
        }
        if (nj.field_b <= 0) {
          if (hb.field_a > 0) {
            qi.a((byte) -80);
          }
          if (0 < uf.field_z) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-42, uf.field_z);
          }
        } else {
          nj.field_b = nj.field_b - 1;
          if (hb.field_a > 0) {
            qi.a((byte) -80);
            if (0 < uf.field_z) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-42, uf.field_z);
            }
          } else {
            if (0 >= uf.field_z) {
              if (nj.field_b > 0) {
                fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
              }
              if (param0 == -13953) {
                return;
              }
              ia.g(67);
              return;
            }
            fr.$cfr$intArgs$a$e9dea5688aa5(-42, uf.field_z);
          }
        }
        if (nj.field_b > 0) {
          fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
        }
        if (param0 != -13953) {
          ia.g(67);
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        vh var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 24552) {
            var3 = (vh) null;
            ia.a(false, (vh) null);
          }
          stackIn_5_0 = (null != hl.a(param0, param1 ^ 24553));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ia.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 == -1) {
          return null != oq.field_z ? true : false;
        }
        field_l = 96;
        return null != oq.field_z ? true : false;
    }

    final boolean f(int param0) {
        if (param0 == -20421) {
          return this.field_c == 96 ? true : false;
        }
        this.field_a = true;
        return this.field_c == 96 ? true : false;
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        this.field_g = param0 ? true : false;
        if (param3) {
          this.field_f = 0;
          if (!this.field_g) {
            this.field_h = param1;
          } else {
            this.field_h = param2;
          }
          return;
        }
    }

    final void e(int param0) {
        this.field_b = 0;
        this.field_a = false;
        this.field_c = 0;
        if (this.field_f != 0) {
          if (this.field_f == 0 &&
            98 == qi.field_a) {
            if (this.field_h <= 0) {
              this.field_h = this.field_e;
            }
            this.field_a = true;
            this.field_g = false;
            this.field_h = this.field_h - 1;
          }
        } else {
          this.field_c = qi.field_a;
          if (this.field_f != 0) {
            if (param0 != -15525) {
              return;
            }
            if (this.field_f != 0) {
              return;
            }
            if (qi.field_a != 99) {
              return;
            }
            this.field_h = this.field_h + 1;
            this.field_g = false;
            if (this.field_e <= this.field_h) {
              this.field_h = 0;
            }
            this.field_a = true;
            return;
          }
          if (98 == qi.field_a) {
            if (this.field_h <= 0) {
              this.field_h = this.field_e;
            }
            this.field_a = true;
            this.field_g = false;
            this.field_h = this.field_h - 1;
          }
        }
        if (param0 != -15525) {
          return;
        }
        if (this.field_f == 0 &&
          qi.field_a == 99) {
          this.field_h = this.field_h + 1;
          this.field_g = false;
          if (this.field_e <= this.field_h) {
            this.field_h = 0;
          }
          this.field_a = true;
        }
    }

    final static void a(boolean param0, vh param1) {
        try {
          param1.field_N = 16777215;
          param1.field_Fb = 1;
          param1.field_I = (lr) ((Object) sa.field_h);
          param1.field_F = rm.field_g;
          param1.field_X = null;
          if (!param0) {
            field_d = (ir[]) null;
          }
          param1.field_cb = 1;
          param1.field_Gb = null;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ia.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 == 103) {
          return 103 == this.field_c ? true : false;
        }
        this.a(false, 98, 79, false);
        return 103 == this.field_c ? true : false;
    }

    final boolean c(int param0) {
        if (param0 == -1) {
          return 97 == this.field_c ? true : false;
        }
        ia.g(19);
        return 97 == this.field_c ? true : false;
    }

    final boolean b(byte param0) {
        if (param0 < 49) {
          return false;
        }
        if (this.field_b != 0) {
          return true;
        }
        if (this.field_c == 84) {
          return true;
        }
        if (this.field_c != 83) {
          return false;
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        this.field_b = 0;
        this.field_c = 0;
        this.field_a = false;
        if (this.field_f != 0) {
          if (this.field_f == 0) {
            this.field_c = qi.field_a;
          }
          if (!param0) {
            return;
          }
          if (this.field_f == 0 &&
            97 == qi.field_a) {
            this.field_h = this.field_h + 1;
            if (this.field_e <= this.field_h) {
              this.field_h = 0;
            }
            this.field_a = true;
            this.field_g = false;
          }
          if (0 != this.field_f) {
            return;
          }
          if (qi.field_a == 98) {
            this.field_g = false;
            this.field_a = true;
            if (this.field_h >= 0) {
              return;
            }
            this.field_h = param1;
            return;
          }
          if (qi.field_a != 99) {
            return;
          }
          this.field_g = false;
          this.field_a = true;
          if (this.field_h < 0) {
            this.field_h = param1;
          }
          return;
        }
        if (qi.field_a != 96) {
          if (this.field_f == 0) {
            this.field_c = qi.field_a;
          }
          if (!param0) {
            return;
          }
          if (this.field_f == 0 &&
            97 == qi.field_a) {
            this.field_h = this.field_h + 1;
            if (this.field_e <= this.field_h) {
              this.field_h = 0;
            }
            this.field_a = true;
            this.field_g = false;
          }
          if (0 != this.field_f) {
            return;
          }
          if (qi.field_a == 98) {
            this.field_g = false;
            this.field_a = true;
            if (this.field_h >= 0) {
              return;
            }
            this.field_h = param1;
            return;
          }
          if (qi.field_a != 99) {
            return;
          }
          this.field_g = false;
          this.field_a = true;
          if (this.field_h < 0) {
            this.field_h = param1;
          }
          return;
        }
        if (this.field_h <= 0) {
          this.field_h = this.field_e;
        }
        this.field_h = this.field_h - 1;
        this.field_g = false;
        this.field_a = true;
        if (this.field_f == 0) {
          this.field_c = qi.field_a;
        }
        if (!param0) {
          return;
        }
        if (this.field_f == 0 &&
          97 == qi.field_a) {
          this.field_h = this.field_h + 1;
          if (this.field_e <= this.field_h) {
            this.field_h = 0;
          }
          this.field_a = true;
          this.field_g = false;
        }
        if (0 == this.field_f) {
          if (qi.field_a == 98) {
            this.field_g = false;
            this.field_a = true;
            if (this.field_h >= 0) {
              return;
            }
            this.field_h = param1;
          } else {
            if (qi.field_a == 99) {
              this.field_g = false;
              this.field_a = true;
              if (this.field_h < 0) {
                this.field_h = param1;
              }
              return;
            }
          }
        }
    }

    final boolean d(int param0) {
        if (param0 >= 19) {
          return this.field_c == 102 ? true : false;
        }
        ia.b(-55);
        return this.field_c == 102 ? true : false;
    }

    ia(int param0) {
        this.field_g = false;
        this.field_h = 0;
        this.field_e = param0;
    }

    static {
        field_j = "Offer rematch";
        field_l = -1;
    }
}
