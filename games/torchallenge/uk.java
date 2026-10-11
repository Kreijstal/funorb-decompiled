/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk extends ic {
    private int field_F;
    private int field_M;
    private boolean field_R;
    static int field_L;
    private int field_S;
    private boolean field_T;
    static vi field_I;
    private int field_P;
    static String field_Q;
    static int field_G;
    static int[] field_U;
    static int field_H;
    static String field_K;
    static int field_J;
    static ka field_N;

    final void a(ee param0, int param1, byte param2, int param3) {
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_A instanceof ng) ||
            ((ng) (this.field_A)).field_F) &&
            this.field_z == 1) {
            var5_int = -this.field_P + kc.field_u - param1;
            var6 = -this.field_F + ph.field_d - param3;
            if (var5_int != this.field_m ||
              this.field_i != var6) {
              this.field_i = var6;
              this.field_m = var5_int;
              if (this.field_k instanceof hj) {
                ((hj) (this.field_k)).a(this, param3, param1, 3091);
              }
            }
          } else {
            if (this.field_T) {
              if (this.field_m != this.field_S) {
                var5_int = -this.field_m + this.field_S;
                stackIn_16_1 = this.field_m;
                if (Math.abs(var5_int) > 2) {
                  stackIn_17_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_17_2 = -1;
                  } else {
                    stackIn_17_2 = 1;
                  }
                }
                this.field_m = stackIn_16_1 + stackIn_17_2;
              }
              if (this.field_i != this.field_M) {
                var5_int = this.field_M - this.field_i;
                stackIn_21_1 = this.field_i;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_24_2 = -1;
                  } else {
                    stackIn_24_2 = 1;
                  }
                } else {
                  stackIn_24_2 = var5_int >> 1;
                }
                this.field_i = stackIn_21_1 + stackIn_24_2;
              }
            }
          }
          super.a(param0, param1, (byte) -121, param3);
          if (param2 > -97) {
            field_U = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("uk.U(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param1 == -111) {
          var2 = param0;
          if (var2 == 32) {
            return '_';
          }
          if (160 != var2) {
            if (var2 == 95) {
              return '_';
            }
            if (var2 != 45) {
              if (var2 == 91) {
                return param0;
              }
              if (var2 != 93 &&
                var2 != 35) {
                if (var2 == 224) {
                  return 'a';
                }
                if (var2 != 225 &&
                  var2 != 226 &&
                  var2 != 228 &&
                  227 != var2 &&
                  var2 != 192 &&
                  193 != var2 &&
                  var2 != 194 &&
                  196 != var2 &&
                  195 != var2) {
                  if (232 != var2 &&
                    233 != var2 &&
                    var2 != 234 &&
                    235 != var2 &&
                    var2 != 200 &&
                    var2 != 201 &&
                    var2 != 202 &&
                    var2 != 203) {
                    if (237 != var2 &&
                      var2 != 238 &&
                      var2 != 239 &&
                      var2 != 205 &&
                      var2 != 206 &&
                      var2 != 207) {
                      if (var2 != 242 &&
                        243 != var2 &&
                        var2 != 244 &&
                        var2 != 246 &&
                        245 != var2) {
                        if (var2 == 210) {
                          return 'o';
                        }
                        if (var2 == 211) {
                          return 'o';
                        }
                        if (var2 != 212 &&
                          var2 != 214 &&
                          var2 != 213) {
                          if (var2 != 249 &&
                            var2 != 250 &&
                            var2 != 251) {
                            if (var2 == 252) {
                              return 'u';
                            }
                            if (217 != var2 &&
                              218 != var2 &&
                              var2 != 219 &&
                              var2 != 220) {
                              if (var2 == 231) {
                                return 'c';
                              }
                              if (var2 == 199) {
                                return 'c';
                              }
                              if (255 == var2) {
                                return 'y';
                              }
                              if (var2 == 376) {
                                return 'y';
                              }
                              if (var2 == 241) {
                                return 'n';
                              }
                              if (var2 == 209) {
                                return 'n';
                              }
                              if (223 != var2) {
                                return Character.toLowerCase(param0);
                              }
                              return 'b';
                            }
                          }
                          return 'u';
                        }
                      }
                      return 'o';
                    }
                    return 'i';
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
        field_U = (int[]) null;
        var2Lifetime1 = param0;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (160 != var2Lifetime1 &&
          var2Lifetime1 != 95 &&
          var2Lifetime1 != 45) {
          if (var2Lifetime1 == 91) {
            return param0;
          }
          if (var2Lifetime1 == 93) {
            return param0;
          }
          if (var2Lifetime1 == 35) {
            return param0;
          }
          if (var2Lifetime1 != 224 &&
            var2Lifetime1 != 225) {
            if (var2Lifetime1 == 226) {
              return 'a';
            }
            if (var2Lifetime1 == 228) {
              return 'a';
            }
            if (227 != var2Lifetime1) {
              if (var2Lifetime1 == 192) {
                return 'a';
              }
              if (193 == var2Lifetime1) {
                return 'a';
              }
              if (var2Lifetime1 == 194) {
                return 'a';
              }
              if (196 == var2Lifetime1) {
                return 'a';
              }
              if (195 != var2Lifetime1) {
                if (232 == var2Lifetime1) {
                  return 'e';
                }
                if (233 != var2Lifetime1 &&
                  var2Lifetime1 != 234 &&
                  235 != var2Lifetime1 &&
                  var2Lifetime1 != 200 &&
                  var2Lifetime1 != 201 &&
                  var2Lifetime1 != 202) {
                  if (var2Lifetime1 == 203) {
                    return 'e';
                  }
                  if (237 != var2Lifetime1) {
                    if (var2Lifetime1 == 238) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 239) {
                      return 'i';
                    }
                    if (var2Lifetime1 != 205 &&
                      var2Lifetime1 != 206 &&
                      var2Lifetime1 != 207) {
                      if (var2Lifetime1 != 242 &&
                        243 != var2Lifetime1 &&
                        var2Lifetime1 != 244 &&
                        var2Lifetime1 != 246 &&
                        245 != var2Lifetime1) {
                        if (var2Lifetime1 == 210) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 211) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 212 &&
                          var2Lifetime1 != 214 &&
                          var2Lifetime1 != 213) {
                          if (var2Lifetime1 != 249 &&
                            var2Lifetime1 != 250 &&
                            var2Lifetime1 != 251) {
                            if (var2Lifetime1 == 252) {
                              return 'u';
                            }
                            if (217 != var2Lifetime1 &&
                              218 != var2Lifetime1 &&
                              var2Lifetime1 != 219 &&
                              var2Lifetime1 != 220) {
                              if (var2Lifetime1 == 231) {
                                return 'c';
                              }
                              if (var2Lifetime1 == 199) {
                                return 'c';
                              }
                              if (255 == var2Lifetime1) {
                                return 'y';
                              }
                              if (var2Lifetime1 == 376) {
                                return 'y';
                              }
                              if (var2Lifetime1 == 241) {
                                return 'n';
                              }
                              if (var2Lifetime1 == 209) {
                                return 'n';
                              }
                              if (223 != var2Lifetime1) {
                                return Character.toLowerCase(param0);
                              }
                              return 'b';
                            }
                          }
                          return 'u';
                        }
                      }
                      return 'o';
                    }
                  }
                  return 'i';
                }
                return 'e';
              }
            }
          }
          return 'a';
        }
        return '_';
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_R) {
            return true;
          }
          if (!this.a(param0, param1, param3, -29991, param4)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          if (param5 == 1) {
            this.field_P = param1 - this.field_m - param4;
            this.field_F = -this.field_i + param0 - param3;
            gl.field_b = this;
          }
          this.field_z = param5;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("uk.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_Q = null;
        field_I = null;
        field_U = null;
        field_K = null;
        if (param0 != 50) {
          return;
        }
        field_N = null;
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        ee var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, -127, param2)) {
            this.a(param2, 20, param0, param1);
            this.a((byte) 98, param2, param0, param1);
            discarded$64 = param2.append(" revert=").append(this.field_T);
            if (this.field_S != 2147483647 &&
              2147483647 != this.field_M) {
              discarded$65 = param2.append(" to ").append(this.field_S).append(',').append(this.field_M);
            }
          }
          if (!param3) {
            var6 = (ee) null;
            this.a(-98, (byte) -61, (ee) null, -95, 42, 108);
          }
          stackIn_8_0 = (StringBuilder) (param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("uk.W(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        try {
          int var7_int = 56 % ((param1 + 29) / 39);
          super.a(param0, (byte) -127, param2, param3, param4, param5);
          this.field_z = 0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "uk.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ka[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param5 != null &&
            param4 > 0) {
            var6_int = param5[0].field_q;
            var7 = param5[2].field_q;
            var8 = param5[param1].field_q;
            param5[0].c(param2, param3, param0);
            param5[2].c(param2 + (param4 - var7), param3, param0);
            qg.a(bk.field_s);
            qg.a(var6_int + param2, param3, param4 + param2 - var7, param3 + param5[1].field_v);
            var9 = var6_int + param2;
            var10 = -var7 + param2 + param4;
            for (param2 = var9; param2 < var10; param2 = param2 + var8) {
              param5[1].c(param2, param3, param0);
            }
            qg.b(bk.field_s);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("uk.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0) {
        super.a(103);
        this.field_A.a((byte) 117, 0, this.field_l, this.field_p, 0);
        this.field_S = this.field_m;
        this.field_M = this.field_i;
        int var2 = 48 % ((param0 + 45) / 48);
    }

    private uk(int param0, int param1, int param2, int param3, j param4, gg param5, ee param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_S = 2147483647;
        try {
          this.field_A = param6;
          this.field_R = param8 ? true : false;
          this.field_T = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "uk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_I = new vi();
        field_Q = "Go Back";
        field_J = 0;
        field_U = new int[]{5, 10, 15, 20, 25, -2};
        field_N = null;
        field_K = "Waiting for graphics";
    }
}
