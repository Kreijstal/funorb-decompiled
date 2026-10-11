/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iv {
    static ak[] field_g;
    static int field_i;
    private int field_c;
    private int field_k;
    private bq[] field_d;
    static int[] field_l;
    static long field_f;
    private int field_j;
    static Random field_b;
    private ch field_e;
    private fr field_h;
    static du field_a;

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 241) {
          var2 = param1;
          if (var2 == 32) {
            return '_';
          }
          if (160 == var2) {
            return '_';
          }
          if (95 == var2) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (91 == var2) {
            return param1;
          }
          if (var2 != 93 &&
            var2 != 35) {
            if (224 != var2 &&
              225 != var2 &&
              226 != var2 &&
              228 != var2 &&
              var2 != 227 &&
              var2 != 192 &&
              193 != var2 &&
              194 != var2 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                203 != var2) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  206 != var2 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    243 != var2 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    210 != var2 &&
                    var2 != 211 &&
                    var2 != 212 &&
                    214 != var2 &&
                    var2 != 213) {
                    if (var2 != 249 &&
                      250 != var2) {
                      if (var2 == 251) {
                        return 'u';
                      }
                      if (252 == var2) {
                        return 'u';
                      }
                      if (var2 != 217) {
                        if (var2 == 218) {
                          return 'u';
                        }
                        if (var2 == 219) {
                          return 'u';
                        }
                        if (var2 == 220) {
                          return 'u';
                        }
                        if (231 != var2 &&
                          var2 != 199) {
                          if (255 != var2 &&
                            var2 != 376) {
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
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        field_f = 31L;
        var2Lifetime1 = param1;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (160 != var2Lifetime1 &&
          95 != var2Lifetime1 &&
          var2Lifetime1 != 45) {
          if (91 != var2Lifetime1 &&
            var2Lifetime1 != 93 &&
            var2Lifetime1 != 35) {
            if (224 != var2Lifetime1 &&
              225 != var2Lifetime1 &&
              226 != var2Lifetime1 &&
              228 != var2Lifetime1 &&
              var2Lifetime1 != 227 &&
              var2Lifetime1 != 192 &&
              193 != var2Lifetime1 &&
              194 != var2Lifetime1 &&
              var2Lifetime1 != 196 &&
              var2Lifetime1 != 195) {
              if (var2Lifetime1 != 232 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234) {
                if (var2Lifetime1 == 235) {
                  return 'e';
                }
                if (var2Lifetime1 != 200 &&
                  var2Lifetime1 != 201) {
                  if (var2Lifetime1 == 202) {
                    return 'e';
                  }
                  if (203 != var2Lifetime1) {
                    if (var2Lifetime1 != 237) {
                      if (var2Lifetime1 == 238) {
                        return 'i';
                      }
                      if (var2Lifetime1 == 239) {
                        return 'i';
                      }
                      if (var2Lifetime1 == 205) {
                        return 'i';
                      }
                      if (206 != var2Lifetime1) {
                        if (var2Lifetime1 == 207) {
                          return 'i';
                        }
                        if (var2Lifetime1 == 242) {
                          return 'o';
                        }
                        if (243 != var2Lifetime1 &&
                          var2Lifetime1 != 244 &&
                          var2Lifetime1 != 246 &&
                          var2Lifetime1 != 245) {
                          if (210 == var2Lifetime1) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 211) {
                            if (var2Lifetime1 == 212) {
                              return 'o';
                            }
                            if (214 != var2Lifetime1) {
                              if (var2Lifetime1 == 213) {
                                return 'o';
                              }
                              if (var2Lifetime1 == 249) {
                                return 'u';
                              }
                              if (250 == var2Lifetime1) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 251) {
                                return 'u';
                              }
                              if (252 == var2Lifetime1) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 217) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 218) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 219) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 220) {
                                return 'u';
                              }
                              if (231 != var2Lifetime1 &&
                                var2Lifetime1 != 199) {
                                if (255 != var2Lifetime1 &&
                                  var2Lifetime1 != 376) {
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
                        }
                        return 'o';
                      }
                    }
                    return 'i';
                  }
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

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 255) {
          return;
        }
        field_g = null;
        field_l = null;
    }

    final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5) {
        param0 = param0 & this.field_h.s(123);
        if (!param0) {
          if (4 == param5) {
            if (param5 == 4) {
              param1 = param3;
            }
            param5 = 2;
            if (param5 != 0 &&
              param4) {
              param5 = param5 | -2147483648;
            }
            if (this.field_k != param5) {
              if (this.field_k != 0) {
                this.field_d[this.field_k & 2147483647].b(-127);
              }
              if (param5 != 0) {
                this.field_d[2147483647 & param5].a((byte) 88, param4);
                this.field_d[param5 & 2147483647].a(-61, param4);
                this.field_d[2147483647 & param5].a((byte) 68, param3, param1);
              }
              this.field_j = param3;
              this.field_k = param5;
              this.field_c = param1;
            } else {
              if (this.field_k == 0) {
                if (param2 > 123) {
                  return;
                }
                this.field_e = (ch) null;
                return;
              }
              this.field_d[2147483647 & this.field_k].a(-65, param4);
              if (param3 != this.field_j) {
                this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
                this.field_c = param1;
                this.field_j = param3;
              } else {
                if (this.field_c != param1) {
                  this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
                  this.field_c = param1;
                  this.field_j = param3;
                }
              }
            }
            if (param2 <= 123) {
              this.field_e = (ch) null;
            }
            return;
          }
          if (8 == param5) {
            if (param5 == 4) {
              param1 = param3;
            }
            param5 = 2;
            if (param5 != 0 &&
              param4) {
              param5 = param5 | -2147483648;
            }
            if (this.field_k != param5) {
              if (this.field_k != 0) {
                this.field_d[this.field_k & 2147483647].b(-127);
              }
              if (param5 != 0) {
                this.field_d[2147483647 & param5].a((byte) 88, param4);
                this.field_d[param5 & 2147483647].a(-61, param4);
                this.field_d[2147483647 & param5].a((byte) 68, param3, param1);
              }
              this.field_j = param3;
              this.field_k = param5;
              this.field_c = param1;
            } else {
              if (this.field_k == 0) {
                if (param2 > 123) {
                  return;
                }
                this.field_e = (ch) null;
                return;
              }
              this.field_d[2147483647 & this.field_k].a(-65, param4);
              if (param3 != this.field_j) {
                this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
                this.field_c = param1;
                this.field_j = param3;
              } else {
                if (this.field_c != param1) {
                  this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
                  this.field_c = param1;
                  this.field_j = param3;
                }
              }
            }
            if (param2 <= 123) {
              this.field_e = (ch) null;
            }
            return;
          }
          if (9 != param5) {
            if (param5 != 0 &&
              param4) {
              param5 = param5 | -2147483648;
            }
            if (this.field_k == param5) {
              if (this.field_k != 0) {
                this.field_d[2147483647 & this.field_k].a(-65, param4);
                if (param3 != this.field_j) {
                  this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
                  this.field_c = param1;
                  this.field_j = param3;
                } else {
                  if (this.field_c != param1) {
                    this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
                    this.field_c = param1;
                    this.field_j = param3;
                    if (param2 <= 123) {
                      this.field_e = (ch) null;
                    }
                    return;
                  }
                }
              }
            } else {
              if (this.field_k != 0) {
                this.field_d[this.field_k & 2147483647].b(-127);
              }
              if (param5 != 0) {
                this.field_d[2147483647 & param5].a((byte) 88, param4);
                this.field_d[param5 & 2147483647].a(-61, param4);
                this.field_d[2147483647 & param5].a((byte) 68, param3, param1);
              }
              this.field_j = param3;
              this.field_k = param5;
              this.field_c = param1;
            }
            if (param2 > 123) {
              return;
            }
            this.field_e = (ch) null;
            return;
          }
          if (param5 == 4) {
            param1 = param3;
          }
          param5 = 2;
        }
        if (param5 != 0 &&
          param4) {
          param5 = param5 | -2147483648;
        }
        if (this.field_k != param5) {
          if (this.field_k != 0) {
            this.field_d[this.field_k & 2147483647].b(-127);
          }
          if (param5 != 0) {
            this.field_d[2147483647 & param5].a((byte) 88, param4);
            this.field_d[param5 & 2147483647].a(-61, param4);
            this.field_d[2147483647 & param5].a((byte) 68, param3, param1);
          }
          this.field_j = param3;
          this.field_k = param5;
          this.field_c = param1;
        } else {
          if (this.field_k != 0) {
            this.field_d[2147483647 & this.field_k].a(-65, param4);
            if (param3 != this.field_j) {
              this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
              this.field_c = param1;
              this.field_j = param3;
            } else {
              if (this.field_c != param1) {
                this.field_d[2147483647 & this.field_k].a((byte) 87, param3, param1);
                this.field_c = param1;
                this.field_j = param3;
              }
            }
          }
        }
        if (param2 > 123) {
          return;
        }
        this.field_e = (ch) null;
    }

    final boolean a(int param0, byte param1, ht param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k == 0) {
            return false;
          }
          this.field_d[2147483647 & this.field_k].a((byte) 35, param0, param2);
          var4_int = -112 % ((-12 - param1) / 57);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("iv.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1) {
        if (param1 == 71) {
          return this.field_d[param0].b((byte) -65);
        }
        this.field_c = -91;
        return this.field_d[param0].b((byte) -65);
    }

    iv(fr param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = 0;
        this.field_k = 0;
        this.field_j = 0;
        try {
          this.field_h = param0;
          this.field_e = new ch(param0);
          this.field_d = new bq[10];
          this.field_d[1] = (bq) ((Object) new wt(param0));
          this.field_d[2] = (bq) ((Object) new es(param0, this.field_e));
          this.field_d[4] = (bq) ((Object) new gi(param0, this.field_e));
          this.field_d[5] = (bq) ((Object) new kj(param0, this.field_e));
          this.field_d[6] = (bq) ((Object) new ra(param0));
          this.field_d[7] = (bq) ((Object) new au(param0));
          this.field_d[3] = (bq) ((Object) new ga(param0));
          this.field_d[8] = (bq) ((Object) new lv(param0, this.field_e));
          this.field_d[9] = (bq) ((Object) new gr(param0, this.field_e));
          if (!this.field_d[8].b((byte) -126)) {
            this.field_d[8] = this.field_d[4];
          }
          if (!this.field_d[9].b((byte) -82)) {
            this.field_d[9] = this.field_d[8];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("iv.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_i = 1;
        field_g = new ak[13];
        field_b = new Random(2L);
    }
}
