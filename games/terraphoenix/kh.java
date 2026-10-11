/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kh extends gb {
    static String field_O;
    static String field_L;
    private int field_G;
    static String field_K;
    static String field_I;
    private d field_N;
    static String field_M;
    static String[] field_H;
    static String[] field_F;
    boolean field_J;

    abstract void a(int param0, int param1, byte param2);

    kh(d param0, int param1, int param2) {
        super(-param1 + vk.field_c >> 1, -param2 + be.field_v >> 1, param1, param2, (cj) null);
        try {
          this.field_J = false;
          this.field_G = 0;
          this.field_N = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_G == 0) {
          return;
        }
        if (this.field_G >= 256) {
          if (0 == param2) {
            this.a(this.field_w + param0, param3 + this.field_u, (byte) 82);
            super.a(param0, -124, param2, param3);
            return;
          }
          return;
        }
        if (hf.field_y == null) {
          hf.field_y = new ci(this.field_p, this.field_n);
          if (param1 <= -106) {
            il.a(1, hf.field_y);
            l.a();
            this.a(0, 0, (byte) 82);
            super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
            ij.a(false);
            hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
            return;
          }
          this.field_G = 14;
          il.a(1, hf.field_y);
          l.a();
          this.a(0, 0, (byte) 82);
          super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
          ij.a(false);
          hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
          return;
        }
        if (this.field_p > hf.field_y.field_r) {
          hf.field_y = new ci(this.field_p, this.field_n);
          if (param1 <= -106) {
            il.a(1, hf.field_y);
            l.a();
            this.a(0, 0, (byte) 82);
            super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
            ij.a(false);
            hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
            return;
          }
          this.field_G = 14;
          il.a(1, hf.field_y);
          l.a();
          this.a(0, 0, (byte) 82);
          super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
          ij.a(false);
          hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
          return;
        }
        if (this.field_n > hf.field_y.field_t) {
          hf.field_y = new ci(this.field_p, this.field_n);
          if (param1 <= -106) {
            il.a(1, hf.field_y);
            l.a();
            this.a(0, 0, (byte) 82);
            super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
            ij.a(false);
            hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
            return;
          }
          this.field_G = 14;
          il.a(1, hf.field_y);
          l.a();
          this.a(0, 0, (byte) 82);
          super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
          ij.a(false);
          hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
          return;
        }
        if (param1 <= -106) {
          il.a(1, hf.field_y);
          l.a();
          this.a(0, 0, (byte) 82);
          super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
          ij.a(false);
          hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
          return;
        }
        this.field_G = 14;
        il.a(1, hf.field_y);
        l.a();
        this.a(0, 0, (byte) 82);
        super.a(-param0 - this.field_w, -127, param2, -param3 - this.field_u);
        ij.a(false);
        hf.field_y.a(param0 + this.field_w, param3 + this.field_u, this.field_G);
    }

    private final int h(int param0) {
        if (param0 == 0) {
          return !this.field_J ? 0 : this.field_N.c(true) != this ? 0 : 256;
        }
        this.field_N = (d) null;
        return !this.field_J ? 0 : this.field_N.c(true) != this ? 0 : 256;
    }

    boolean i(int param0) {
        this.field_G = this.h(0);
        int var2 = 17 / ((param0 + 2) / 63);
        if (0 != this.field_G) {
          return false;
        }
        if (!this.field_J) {
          return true;
        }
        return false;
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Terraphoenix.field_V;
        if (param1 < -125) {
          var2 = param0;
          if (var2 != 32 &&
            160 != var2) {
            if (var2 == 95) {
              return '_';
            }
            if (var2 != 45) {
              if (var2 != 91 &&
                93 != var2 &&
                var2 != 35) {
                if (var2 == 224) {
                  return 'a';
                }
                if (var2 != 225) {
                  if (var2 == 226) {
                    return 'a';
                  }
                  if (var2 != 228 &&
                    var2 != 227) {
                    if (var2 == 192) {
                      return 'a';
                    }
                    if (var2 != 193 &&
                      var2 != 194 &&
                      196 != var2 &&
                      var2 != 195) {
                      if (var2 != 232 &&
                        233 != var2 &&
                        var2 != 234 &&
                        var2 != 235 &&
                        var2 != 200 &&
                        201 != var2 &&
                        var2 != 202 &&
                        203 != var2) {
                        if (237 != var2 &&
                          238 != var2 &&
                          var2 != 239 &&
                          var2 != 205 &&
                          var2 != 206 &&
                          var2 != 207) {
                          if (242 != var2 &&
                            243 != var2 &&
                            var2 != 244 &&
                            var2 != 246 &&
                            245 != var2 &&
                            var2 != 210 &&
                            var2 != 211 &&
                            var2 != 212 &&
                            var2 != 214 &&
                            var2 != 213) {
                            if (var2 != 249 &&
                              250 != var2 &&
                              var2 != 251 &&
                              var2 != 252) {
                              if (217 == var2) {
                                return 'u';
                              }
                              if (var2 != 218 &&
                                var2 != 219 &&
                                var2 != 220) {
                                if (231 == var2) {
                                  return 'c';
                                }
                                if (var2 == 199) {
                                  return 'c';
                                }
                                if (var2 == 255) {
                                  return 'y';
                                }
                                if (376 == var2) {
                                  return 'y';
                                }
                                if (var2 == 241) {
                                  return 'n';
                                }
                                if (209 == var2) {
                                  return 'n';
                                }
                                if (var2 == 223) {
                                  return 'b';
                                }
                                return Character.toLowerCase(param0);
                              }
                            }
                            return 'u';
                          }
                          return 'o';
                        }
                        return 'i';
                      }
                      return 'e';
                    }
                  }
                }
                return 'a';
              }
              return param0;
            }
          }
          return '_';
        }
        kh.a('￥', (byte) -127);
        var2Lifetime1 = param0;
        if (var2Lifetime1 != 32 &&
          160 != var2Lifetime1) {
          if (var2Lifetime1 == 95) {
            return '_';
          }
          if (var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
              93 != var2Lifetime1 &&
              var2Lifetime1 != 35) {
              if (var2Lifetime1 != 224 &&
                var2Lifetime1 != 225 &&
                var2Lifetime1 != 226 &&
                var2Lifetime1 != 228 &&
                var2Lifetime1 != 227 &&
                var2Lifetime1 != 192 &&
                var2Lifetime1 != 193 &&
                var2Lifetime1 != 194 &&
                196 != var2Lifetime1 &&
                var2Lifetime1 != 195) {
                if (var2Lifetime1 != 232 &&
                  233 != var2Lifetime1) {
                  if (var2Lifetime1 == 234) {
                    return 'e';
                  }
                  if (var2Lifetime1 != 235) {
                    if (var2Lifetime1 == 200) {
                      return 'e';
                    }
                    if (201 == var2Lifetime1) {
                      return 'e';
                    }
                    if (var2Lifetime1 == 202) {
                      return 'e';
                    }
                    if (203 == var2Lifetime1) {
                      return 'e';
                    }
                    if (237 == var2Lifetime1) {
                      return 'i';
                    }
                    if (238 != var2Lifetime1 &&
                      var2Lifetime1 != 239 &&
                      var2Lifetime1 != 205 &&
                      var2Lifetime1 != 206) {
                      if (var2Lifetime1 == 207) {
                        return 'i';
                      }
                      if (242 == var2Lifetime1) {
                        return 'o';
                      }
                      if (243 != var2Lifetime1 &&
                        var2Lifetime1 != 244 &&
                        var2Lifetime1 != 246) {
                        if (245 == var2Lifetime1) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 210) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 211 &&
                          var2Lifetime1 != 212) {
                          if (var2Lifetime1 == 214) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 213) {
                            if (var2Lifetime1 != 249 &&
                              250 != var2Lifetime1 &&
                              var2Lifetime1 != 251) {
                              if (var2Lifetime1 == 252) {
                                return 'u';
                              }
                              if (217 == var2Lifetime1) {
                                return 'u';
                              }
                              if (var2Lifetime1 != 218 &&
                                var2Lifetime1 != 219 &&
                                var2Lifetime1 != 220) {
                                if (231 == var2Lifetime1) {
                                  return 'c';
                                }
                                if (var2Lifetime1 == 199) {
                                  return 'c';
                                }
                                if (var2Lifetime1 == 255) {
                                  return 'y';
                                }
                                if (376 == var2Lifetime1) {
                                  return 'y';
                                }
                                if (var2Lifetime1 == 241) {
                                  return 'n';
                                }
                                if (209 == var2Lifetime1) {
                                  return 'n';
                                }
                                if (var2Lifetime1 == 223) {
                                  return 'b';
                                }
                                return Character.toLowerCase(param0);
                              }
                            }
                            return 'u';
                          }
                        }
                      }
                      return 'o';
                    }
                    return 'i';
                  }
                }
                return 'e';
              }
              return 'a';
            }
            return param0;
          }
        }
        return '_';
    }

    final gl e(byte param0) {
        gl var2 = super.e(param0);
        if (var2 != null) {
          return var2;
        }
        return (gl) (this);
    }

    boolean f(byte param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_41_0 = false;
        int var2;
        int var3;
        int var3Lifetime1;
        var2 = this.h(0);
        if (param0 != -121) {
          this.field_N = (d) null;
          var3 = -this.field_G + var2;
          if (0 >= var3) {
            if (var3 < 0) {
              this.field_G = this.field_G + (-16 + (var3 + 1)) / 16;
            }
            if (this.field_G != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_20_0 = !(this.field_J);
            return stackIn_20_0;
          }
          this.field_G = this.field_G + (var3 + 7) / 8;
          if (var3 < 0) {
            this.field_G = this.field_G + (-16 + (var3 + 1)) / 16;
          }
          stackIn_10_0 = (this.field_G == 0) && (var2 == 0) && (!this.field_J);
          return stackIn_10_0;
        }
        var3Lifetime1 = -this.field_G + var2;
        if (0 >= var3Lifetime1) {
          if (var3Lifetime1 < 0) {
            this.field_G = this.field_G + (-16 + (var3Lifetime1 + 1)) / 16;
          }
          stackIn_32_0 = (this.field_G == 0) && (var2 == 0) && (!this.field_J);
          return stackIn_32_0;
        }
        this.field_G = this.field_G + (var3Lifetime1 + 7) / 8;
        if (var3Lifetime1 < 0) {
          this.field_G = this.field_G + (-16 + (var3Lifetime1 + 1)) / 16;
        }
        stackIn_41_0 = (this.field_G == 0) && (var2 == 0) && (!this.field_J);
        return stackIn_41_0;
    }

    public static void a(int param0) {
        field_H = null;
        field_L = null;
        if (param0 == -195) {
          field_F = null;
          field_I = null;
          field_O = null;
          field_M = null;
          field_K = null;
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        this.a(be.field_v - param1 >> 1, (byte) 80, param2, vk.field_c - param2 >> 1, param1);
        if (param0 != 98) {
          this.a(-2, -19, (byte) -5);
        }
    }

    static {
        field_O = "PMGG-2";
        field_I = "Quit";
        field_K = "Fire TQ: ";
        field_L = "Mission ";
        field_F = new String[16];
        field_H = new String[]{"Combat Jacket", "Combat Armour", "Battle Armour", "Shielded Armour"};
        field_M = "Passwords must be between 5 and 20 characters long";
    }
}
