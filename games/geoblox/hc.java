/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends dj implements nl {
    static int field_T;
    private int field_S;
    static int field_R;
    static String field_U;
    static byte[] field_K;
    private dg field_Q;

    final String c(byte param0) {
        if (param0 != 69) {
            this.c((byte) -87);
            if (!this.field_l) {
                return null;
            }
            if (null != this.field_j) {
                oe.a(ue.field_e, (byte) -84, qa.field_a + this.field_r - this.field_S);
                return this.field_j;
            }
            return null;
        }
        if (!this.field_l) {
            return null;
        }
        if (null != this.field_j) {
            oe.a(ue.field_e, (byte) -84, qa.field_a + this.field_r - this.field_S);
            return this.field_j;
        }
        return null;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 80) {
            field_R = -109;
          }
          stackIn_3_0 = bi.a(false, param1, (byte) -121);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hc.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        if (param0) {
            return;
        }
        try {
            super.a(param0, param1, param2, param3);
            this.field_S = -this.field_v + (qa.field_a - param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hc.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    hc(String param0, bb param1, int param2) {
        super(param0, param1, param2);
    }

    public final dg a(byte param0) {
        if (param0 > -97) {
            field_U = (String) null;
            return this.field_Q;
        }
        return this.field_Q;
    }

    final static char a(char param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == -227) {
          var2 = param0;
          if (32 == var2) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 == 95) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (var2 == 91) {
            return param0;
          }
          if (93 != var2 &&
              35 != var2) {
            if (var2 != 224 &&
                var2 != 225 &&
                var2 != 226 &&
                var2 != 228 &&
                var2 != 227 &&
                var2 != 192 &&
                var2 != 193 &&
                var2 != 194 &&
                var2 != 196 &&
                var2 != 195) {
              if (var2 != 232 &&
                  var2 != 233 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  var2 != 200 &&
                  var2 != 201 &&
                  var2 != 202 &&
                  var2 != 203) {
                if (var2 != 237 &&
                    var2 != 238 &&
                    239 != var2 &&
                    var2 != 205 &&
                    var2 != 206 &&
                    var2 != 207) {
                  if (var2 != 242 &&
                      243 != var2 &&
                      var2 != 244 &&
                      var2 != 246 &&
                      var2 != 245 &&
                      var2 != 210 &&
                      var2 != 211 &&
                      var2 != 212 &&
                      var2 != 214 &&
                      var2 != 213) {
                    if (249 != var2 &&
                        250 != var2 &&
                        var2 != 251 &&
                        var2 != 252 &&
                        var2 != 217) {
                      if (218 == var2) {
                        return 'u';
                      }
                      if (var2 == 219) {
                        return 'u';
                      }
                      if (var2 != 220) {
                        if (var2 == 231) {
                          return 'c';
                        }
                        if (var2 == 199) {
                          return 'c';
                        }
                        if (var2 == 255) {
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
            return 'a';
          }
          return param0;
        }
        hc.k(82);
        var2Lifetime1 = param0;
        if (32 != var2Lifetime1) {
          if (var2Lifetime1 == 160) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
              var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
                93 != var2Lifetime1 &&
                35 != var2Lifetime1) {
              if (var2Lifetime1 != 224 &&
                  var2Lifetime1 != 225 &&
                  var2Lifetime1 != 226 &&
                  var2Lifetime1 != 228 &&
                  var2Lifetime1 != 227 &&
                  var2Lifetime1 != 192 &&
                  var2Lifetime1 != 193 &&
                  var2Lifetime1 != 194 &&
                  var2Lifetime1 != 196 &&
                  var2Lifetime1 != 195) {
                if (var2Lifetime1 != 232 &&
                    var2Lifetime1 != 233 &&
                    var2Lifetime1 != 234 &&
                    var2Lifetime1 != 235 &&
                    var2Lifetime1 != 200 &&
                    var2Lifetime1 != 201 &&
                    var2Lifetime1 != 202) {
                  if (var2Lifetime1 == 203) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 237) {
                    return 'i';
                  }
                  if (var2Lifetime1 == 238) {
                    return 'i';
                  }
                  if (239 == var2Lifetime1) {
                    return 'i';
                  }
                  if (var2Lifetime1 != 205 &&
                      var2Lifetime1 != 206 &&
                      var2Lifetime1 != 207) {
                    if (var2Lifetime1 != 242) {
                      if (243 == var2Lifetime1) {
                        return 'o';
                      }
                      if (var2Lifetime1 == 244) {
                        return 'o';
                      }
                      if (var2Lifetime1 != 246 &&
                          var2Lifetime1 != 245) {
                        if (var2Lifetime1 == 210) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 211) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 212 &&
                            var2Lifetime1 != 214 &&
                            var2Lifetime1 != 213) {
                          if (249 != var2Lifetime1) {
                            if (250 == var2Lifetime1) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 251) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 252) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 217) {
                              return 'u';
                            }
                            if (218 == var2Lifetime1) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 219) {
                              return 'u';
                            }
                            if (var2Lifetime1 != 220) {
                              if (var2Lifetime1 == 231) {
                                return 'c';
                              }
                              if (var2Lifetime1 == 199) {
                                return 'c';
                              }
                              if (var2Lifetime1 == 255) {
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
                return 'e';
              }
              return 'a';
            }
            return param0;
          }
        }
        return '_';
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          field_T = -8;
        }
        if (pg.field_c == null) {
          return;
        }
        var1 = pg.field_c;
        synchronized (var1) {
          pg.field_c = null;
        }
    }

    final void a(byte param0, dg param1) {
        try {
            this.field_Q = param1;
            int var3_int = 48 % ((param0 - 34) / 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hc.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(byte param0) {
        super.g((byte) -66);
        if (this.field_Q != null) {
            this.field_Q.b(-28133);
            if (param0 > -16) {
                this.field_S = -4;
                return;
            }
            return;
        }
        if (param0 <= -16) {
            return;
        }
        this.field_S = -4;
    }

    public static void k(int param0) {
        field_U = null;
        field_K = null;
        if (param0 != -243) {
            field_T = -90;
        }
    }

    static {
        field_U = "Go Back";
    }
}
