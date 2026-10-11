/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static volatile long field_g;
    private boolean field_b;
    static fn field_f;
    private float field_i;
    private int field_h;
    private int field_a;
    static int field_d;
    static int field_e;
    static vn[][] field_j;
    private int field_c;

    final void a(byte param0) {
        if (param0 == 29) {
          this.field_b = true;
          kh.a(59, false);
          return;
        }
        this.c(19);
        this.field_b = true;
        kh.a(59, false);
    }

    final void c(int param0) {
        this.field_b = false;
        kh.a(param0, false);
    }

    final void b(int param0) {
        if ((float)param0 == this.field_i) {
          return;
        }
        this.field_i = this.field_i + 0.5f;
        if (5.0f < this.field_i) {
          this.field_i = -1.0f;
          if (this.field_a > 25) {
            this.field_a = this.field_a - 25;
            return;
          }
          return;
        }
        if (this.field_a <= 25) {
          return;
        }
        this.field_a = this.field_a - 25;
    }

    final void a(byte param0, wk param1) {
        vn[] stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 6) {
            field_j = (vn[][]) null;
          }
          if (this.field_i >= 0.0f) {
            stackIn_6_0 = lb.field_eb;
            if (!this.field_b) {
              stackIn_7_1 = (int)this.field_i;
            } else {
              stackIn_7_1 = 6;
            }
            ((vn) (Object) stackIn_6_0[stackIn_7_1]).e(param1.a(this.field_h, (byte) -72) - 12, param1.a(this.field_c, 0) - 12, this.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_j = (vn[][]) null;
        if (param0 != 97) {
          field_f = (fn) null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 >= 48) {
          this.field_a = 256;
          this.field_h = param1;
          this.field_c = param2;
          this.field_i = 0.0f;
          return;
        }
        field_g = 75L;
        this.field_a = 256;
        this.field_h = param1;
        this.field_c = param2;
        this.field_i = 0.0f;
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ZombieDawn.field_J;
        if (param0 < -98) {
          var2 = param1;
          if (32 != var2 &&
            var2 != 160 &&
            var2 != 95 &&
            45 != var2) {
            if (var2 == 91) {
              return param1;
            }
            if (var2 == 93) {
              return param1;
            }
            if (var2 == 35) {
              return param1;
            }
            if (var2 != 224 &&
              var2 != 225) {
              if (var2 == 226) {
                return 'a';
              }
              if (var2 == 228) {
                return 'a';
              }
              if (var2 != 227 &&
                var2 != 192 &&
                193 != var2 &&
                var2 != 194 &&
                var2 != 196 &&
                var2 != 195) {
                if (var2 != 232 &&
                  var2 != 233 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  var2 != 200 &&
                  var2 != 201 &&
                  202 != var2 &&
                  var2 != 203) {
                  if (var2 != 237 &&
                    var2 != 238 &&
                    239 != var2 &&
                    var2 != 205 &&
                    206 != var2 &&
                    var2 != 207) {
                    if (var2 != 242 &&
                      var2 != 243 &&
                      var2 != 244 &&
                      246 != var2 &&
                      var2 != 245 &&
                      var2 != 210 &&
                      var2 != 211 &&
                      212 != var2 &&
                      var2 != 214 &&
                      var2 != 213) {
                      if (var2 != 249) {
                        if (var2 == 250) {
                          return 'u';
                        }
                        if (var2 == 251) {
                          return 'u';
                        }
                        if (var2 != 252) {
                          if (var2 == 217) {
                            return 'u';
                          }
                          if (var2 == 218) {
                            return 'u';
                          }
                          if (var2 != 219) {
                            if (220 == var2) {
                              return 'u';
                            }
                            if (var2 != 231 &&
                              199 != var2) {
                              if (var2 != 255 &&
                                376 != var2) {
                                if (var2 == 241) {
                                  return 'n';
                                }
                                if (var2 == 209) {
                                  return 'n';
                                }
                                if (var2 == 223) {
                                  return 'b';
                                }
                                return Character.toLowerCase(param1);
                              }
                              return 'y';
                            }
                            return 'c';
                          }
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
            return 'a';
          }
          return '_';
        }
        qj.a(-122, 'ﾛ');
        var2Lifetime1 = param1;
        if (32 != var2Lifetime1 &&
          var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          45 != var2Lifetime1) {
          if (var2Lifetime1 == 91) {
            return param1;
          }
          if (var2Lifetime1 != 93 &&
            var2Lifetime1 != 35) {
            if (var2Lifetime1 != 224 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              var2Lifetime1 != 227 &&
              var2Lifetime1 != 192 &&
              193 != var2Lifetime1 &&
              var2Lifetime1 != 194 &&
              var2Lifetime1 != 196 &&
              var2Lifetime1 != 195) {
              if (var2Lifetime1 == 232) {
                return 'e';
              }
              if (var2Lifetime1 != 233 &&
                var2Lifetime1 != 234) {
                if (var2Lifetime1 == 235) {
                  return 'e';
                }
                if (var2Lifetime1 != 200 &&
                  var2Lifetime1 != 201 &&
                  202 != var2Lifetime1 &&
                  var2Lifetime1 != 203) {
                  if (var2Lifetime1 == 237) {
                    return 'i';
                  }
                  if (var2Lifetime1 == 238) {
                    return 'i';
                  }
                  if (239 == var2Lifetime1) {
                    return 'i';
                  }
                  if (var2Lifetime1 == 205) {
                    return 'i';
                  }
                  if (206 == var2Lifetime1) {
                    return 'i';
                  }
                  if (var2Lifetime1 == 207) {
                    return 'i';
                  }
                  if (var2Lifetime1 != 242 &&
                    var2Lifetime1 != 243) {
                    if (var2Lifetime1 == 244) {
                      return 'o';
                    }
                    if (246 == var2Lifetime1) {
                      return 'o';
                    }
                    if (var2Lifetime1 != 245 &&
                      var2Lifetime1 != 210 &&
                      var2Lifetime1 != 211 &&
                      212 != var2Lifetime1) {
                      if (var2Lifetime1 == 214) {
                        return 'o';
                      }
                      if (var2Lifetime1 != 213) {
                        if (var2Lifetime1 == 249) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 250) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 251) {
                          return 'u';
                        }
                        if (var2Lifetime1 != 252) {
                          if (var2Lifetime1 == 217) {
                            return 'u';
                          }
                          if (var2Lifetime1 == 218) {
                            return 'u';
                          }
                          if (var2Lifetime1 != 219) {
                            if (220 == var2Lifetime1) {
                              return 'u';
                            }
                            if (var2Lifetime1 != 231 &&
                              199 != var2Lifetime1) {
                              if (var2Lifetime1 != 255 &&
                                376 != var2Lifetime1) {
                                if (var2Lifetime1 == 241) {
                                  return 'n';
                                }
                                if (var2Lifetime1 == 209) {
                                  return 'n';
                                }
                                if (var2Lifetime1 == 223) {
                                  return 'b';
                                }
                                return Character.toLowerCase(param1);
                              }
                              return 'y';
                            }
                            return 'c';
                          }
                        }
                        return 'u';
                      }
                    }
                  }
                  return 'o';
                }
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        return '_';
    }

    qj() {
        this.field_i = -1.0f;
        this.field_h = 0;
        this.field_b = false;
        this.field_c = 0;
    }

    static {
        field_g = 0L;
        field_f = null;
        field_d = 640;
        field_j = new vn[10][];
    }
}
