/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private String field_c;
    private boolean field_e;
    static String field_a;
    static oi field_j;
    static rc field_i;
    private boolean field_f;
    static int field_g;
    static int field_h;
    static String field_b;
    static int field_d;

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 110) {
            var4 = (String) null;
            sf.a(false, 17, (String) null);
          }
          if (!param0) {
            stackIn_6_0 = le.field_j.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = uf.field_c.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        String var4;
        int var2Lifetime1;
        var3 = wizardrun.field_H;
        if (param0 == -1514) {
          var2 = param1;
          if (32 != var2) {
            if (var2 == 160) {
              return '_';
            }
            if (var2 == 95) {
              return '_';
            }
            if (var2 != 45) {
              if (var2 == 91) {
                return param1;
              }
              if (var2 == 93) {
                return param1;
              }
              if (var2 == 35) {
                return param1;
              }
              if (224 != var2 &&
                var2 != 225 &&
                var2 != 226 &&
                var2 != 228 &&
                var2 != 227 &&
                var2 != 192 &&
                193 != var2 &&
                var2 != 194 &&
                var2 != 196 &&
                195 != var2) {
                if (var2 != 232 &&
                  var2 != 233 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  var2 != 200 &&
                  201 != var2 &&
                  var2 != 202 &&
                  203 != var2) {
                  if (var2 != 237 &&
                    var2 != 238 &&
                    239 != var2 &&
                    var2 != 205 &&
                    var2 != 206 &&
                    var2 != 207) {
                    if (var2 != 242 &&
                      var2 != 243 &&
                      244 != var2 &&
                      var2 != 246 &&
                      var2 != 245 &&
                      var2 != 210 &&
                      var2 != 211 &&
                      var2 != 212 &&
                      var2 != 214 &&
                      213 != var2) {
                      if (249 != var2 &&
                        250 != var2 &&
                        var2 != 251) {
                        if (var2 == 252) {
                          return 'u';
                        }
                        if (var2 == 217) {
                          return 'u';
                        }
                        if (218 == var2) {
                          return 'u';
                        }
                        if (219 != var2) {
                          if (var2 == 220) {
                            return 'u';
                          }
                          if (var2 != 231 &&
                            var2 != 199) {
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
                            if (var2 != 223) {
                              return Character.toLowerCase(param1);
                            }
                            return 'b';
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
          }
          return '_';
        }
        var4 = (String) null;
        sf.a(true, -67, (String) null);
        var2Lifetime1 = param1;
        if (32 != var2Lifetime1) {
          if (var2Lifetime1 == 160) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
            var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
              var2Lifetime1 != 93 &&
              var2Lifetime1 != 35) {
              if (224 != var2Lifetime1 &&
                var2Lifetime1 != 225 &&
                var2Lifetime1 != 226 &&
                var2Lifetime1 != 228 &&
                var2Lifetime1 != 227 &&
                var2Lifetime1 != 192 &&
                193 != var2Lifetime1 &&
                var2Lifetime1 != 194 &&
                var2Lifetime1 != 196 &&
                195 != var2Lifetime1) {
                if (var2Lifetime1 != 232 &&
                  var2Lifetime1 != 233 &&
                  var2Lifetime1 != 234) {
                  if (var2Lifetime1 == 235) {
                    return 'e';
                  }
                  if (var2Lifetime1 != 200 &&
                    201 != var2Lifetime1 &&
                    var2Lifetime1 != 202) {
                    if (203 == var2Lifetime1) {
                      return 'e';
                    }
                    if (var2Lifetime1 != 237 &&
                      var2Lifetime1 != 238 &&
                      239 != var2Lifetime1) {
                      if (var2Lifetime1 == 205) {
                        return 'i';
                      }
                      if (var2Lifetime1 == 206) {
                        return 'i';
                      }
                      if (var2Lifetime1 != 207) {
                        if (var2Lifetime1 != 242) {
                          if (var2Lifetime1 == 243) {
                            return 'o';
                          }
                          if (244 == var2Lifetime1) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 246) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 245) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 210) {
                            if (var2Lifetime1 == 211) {
                              return 'o';
                            }
                            if (var2Lifetime1 == 212) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 214) {
                              if (213 == var2Lifetime1) {
                                return 'o';
                              }
                              if (249 != var2Lifetime1) {
                                if (250 == var2Lifetime1) {
                                  return 'u';
                                }
                                if (var2Lifetime1 != 251) {
                                  if (var2Lifetime1 == 252) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 == 217) {
                                    return 'u';
                                  }
                                  if (218 == var2Lifetime1) {
                                    return 'u';
                                  }
                                  if (219 != var2Lifetime1) {
                                    if (var2Lifetime1 == 220) {
                                      return 'u';
                                    }
                                    if (var2Lifetime1 != 231 &&
                                      var2Lifetime1 != 199) {
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
                                      if (var2Lifetime1 != 223) {
                                        return Character.toLowerCase(param1);
                                      }
                                      return 'b';
                                    }
                                    return 'c';
                                  }
                                }
                              }
                              return 'u';
                            }
                          }
                        }
                        return 'o';
                      }
                    }
                    return 'i';
                  }
                }
                return 'e';
              }
              return 'a';
            }
            return param1;
          }
        }
        return '_';
    }

    final String b(byte param0) {
        if (param0 != 8) {
          this.field_c = (String) null;
          return this.field_c;
        }
        return this.field_c;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          this.b(-43);
          return this.field_f;
        }
        return this.field_f;
    }

    final void a(boolean param0, int param1) {
        this.field_f = true;
        this.field_e = param0 ? true : false;
        if (param1 <= 26) {
          field_h = 79;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_j = null;
        if (param0 <= 122) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    sf(String param0) {
        this.field_e = false;
        this.field_f = false;
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        jc.a((byte) 43, 4);
        if (param0 != -89) {
          field_j = (oi) null;
        }
    }

    final boolean b(int param0) {
        if (param0 != 25843) {
          this.a(false, -18);
          return this.field_e;
        }
        return this.field_e;
    }

    static {
        field_j = new oi();
        field_i = new rc();
    }
}
