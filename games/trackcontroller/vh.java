/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vh extends gb {
    int field_o;
    static String field_p;
    static volatile boolean field_q;

    final static void h(int param0) {
        bk.field_J = null;
        jf.field_i = null;
        ue.field_c = null;
        mh.field_i = false;
        el.field_O = null;
        if (param0 != -2532) {
          String var2 = (String) null;
          vh.a((String) null, 32, (String) null);
          return;
        }
    }

    public static void g(int param0) {
        field_p = null;
        if (param0 == 32) {
          return;
        }
        field_p = (String) null;
    }

    final static long a(byte param0, CharSequence param1) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          var2_long = 0L;
          if (param0 >= -79) {
            field_p = (String) null;
          }
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 + var6 - 65);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + var6 + 1);
            } else {
              if (var6 >= 48 &&
                57 >= var6) {
                var2_long = var2_long + (long)(27 + var6 - 48);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("vh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static char a(boolean param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = TrackController.field_F ? 1 : 0;
        if (param0) {
          var2 = param1;
          if (var2 == 32) {
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
          if (var2 != 91 &&
            93 != var2 &&
            var2 != 35) {
            if (224 != var2 &&
              225 != var2 &&
              var2 != 226 &&
              var2 != 228 &&
              227 != var2 &&
              var2 != 192 &&
              193 != var2 &&
              var2 != 194) {
              if (var2 == 196) {
                return 'a';
              }
              if (var2 != 195) {
                if (var2 != 232 &&
                  var2 != 233 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  var2 != 200 &&
                  201 != var2 &&
                  202 != var2 &&
                  var2 != 203) {
                  if (var2 != 237 &&
                    var2 != 238 &&
                    var2 != 239 &&
                    var2 != 205 &&
                    206 != var2 &&
                    var2 != 207) {
                    if (242 != var2 &&
                      var2 != 243 &&
                      244 != var2 &&
                      var2 != 246 &&
                      var2 != 245 &&
                      var2 != 210 &&
                      var2 != 211 &&
                      var2 != 212 &&
                      var2 != 214) {
                      if (213 == var2) {
                        return 'o';
                      }
                      if (var2 != 249 &&
                        250 != var2 &&
                        var2 != 251 &&
                        var2 != 252) {
                        if (var2 == 217) {
                          return 'u';
                        }
                        if (218 != var2) {
                          if (var2 == 219) {
                            return 'u';
                          }
                          if (220 != var2) {
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
                            return Character.toLowerCase(param1);
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
          return param1;
        }
        field_q = false;
        var2Lifetime1 = param1;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          var2Lifetime1 != 45) {
          if (var2Lifetime1 != 91 &&
            93 != var2Lifetime1 &&
            var2Lifetime1 != 35) {
            if (224 != var2Lifetime1 &&
              225 != var2Lifetime1 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              227 != var2Lifetime1 &&
              var2Lifetime1 != 192 &&
              193 != var2Lifetime1 &&
              var2Lifetime1 != 194 &&
              var2Lifetime1 != 196 &&
              var2Lifetime1 != 195) {
              if (var2Lifetime1 != 232 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234) {
                if (var2Lifetime1 == 235) {
                  return 'e';
                }
                if (var2Lifetime1 == 200) {
                  return 'e';
                }
                if (201 == var2Lifetime1) {
                  return 'e';
                }
                if (202 != var2Lifetime1) {
                  if (var2Lifetime1 == 203) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 237) {
                    return 'i';
                  }
                  if (var2Lifetime1 != 238) {
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
                      if (242 != var2Lifetime1) {
                        if (var2Lifetime1 == 243) {
                          return 'o';
                        }
                        if (244 != var2Lifetime1) {
                          if (var2Lifetime1 == 246) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 245) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 210 &&
                            var2Lifetime1 != 211 &&
                            var2Lifetime1 != 212) {
                            if (var2Lifetime1 == 214) {
                              return 'o';
                            }
                            if (213 == var2Lifetime1) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 249 &&
                              250 != var2Lifetime1 &&
                              var2Lifetime1 != 251 &&
                              var2Lifetime1 != 252) {
                              if (var2Lifetime1 == 217) {
                                return 'u';
                              }
                              if (218 != var2Lifetime1) {
                                if (var2Lifetime1 == 219) {
                                  return 'u';
                                }
                                if (220 != var2Lifetime1) {
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
                                  return Character.toLowerCase(param1);
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
        return '_';
    }

    vh(int param0) {
        this.field_o = param0;
    }

    final static kk a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 == 98) {
          return fh.a(param4, param0, param2, false, param3, -122);
        }
        field_q = true;
        return fh.a(param4, param0, param2, false, param3, -122);
    }

    final static void a(String param0, int param1, String param2) {
        try {
          nf.a(false, param2, param0, (byte) -105);
          if (param1 != 224) {
            field_q = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "vh.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean f(int param0);

    abstract Object a(byte param0);

    static {
        field_q = true;
    }
}
