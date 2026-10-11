/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eo {
    static String field_a;
    static String field_b;

    final static String a(byte param0) {
        if (param0 != 46) {
          eo.b((byte) -64);
          if (un.field_u) {
            return null;
          }
          if (ei.field_j < ef.field_d) {
            return null;
          }
          if (ei.field_j < ef.field_d + qf.field_l) {
            return on.field_b;
          }
          return null;
        }
        if (un.field_u) {
          return null;
        }
        if (ei.field_j < ef.field_d) {
          return null;
        }
        if (ei.field_j < ef.field_d + qf.field_l) {
          return on.field_b;
        }
        return null;
    }

    abstract int a(byte param0, long param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, boolean param7, int param8, int param9) {
        if (!param5) {
          eo.a(-21, '7');
          if (!param7) {
            qi.a(param4, param6, param8, param0, param2, 73, param3, param1, param9);
            return;
          }
          fc.a(param9, param3, param6, param1, true, 29788, false, param8, param4, param0, param2, false);
          return;
        }
        if (!param7) {
          qi.a(param4, param6, param8, param0, param2, 73, param3, param1, param9);
          return;
        }
        fc.a(param9, param3, param6, param1, true, 29788, false, param8, param4, param0, param2, false);
    }

    abstract long c(byte param0);

    final static void a(int param0, boolean param1) {
        ed[] var3;
        ed[] var4;
        ed[] var5;
        ed[] var6;
        ed[] var3Lifetime1;
        ed[] var4Lifetime1;
        ed[] var5Lifetime1;
        ed[] var6Lifetime1;
        if (param0 != 24) {
          eo.a((byte) 53);
          if (null != ma.field_a) {
            pc.field_d = 16777215;
            gd.field_X = 7899280;
            lh.field_e = 12110032;
            var6 = (ed[]) null;
            var5 = (ed[]) null;
            sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, fh.field_g, 240, param1);
          } else {
            gd.field_X = 6340704;
            lh.field_e = 10551200;
            pc.field_d = 16777215;
            var4 = (ed[]) null;
            var3 = (ed[]) null;
            sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, fh.field_g, 300, param1);
          }
          mj.field_d = 0;
          gi.a((byte) -71);
          return;
        }
        if (null != ma.field_a) {
          pc.field_d = 16777215;
          gd.field_X = 7899280;
          lh.field_e = 12110032;
          var6Lifetime1 = (ed[]) null;
          var5Lifetime1 = (ed[]) null;
          sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, fh.field_g, 240, param1);
          mj.field_d = 0;
          gi.a((byte) -71);
          return;
        }
        gd.field_X = 6340704;
        lh.field_e = 10551200;
        pc.field_d = 16777215;
        var4Lifetime1 = (ed[]) null;
        var3Lifetime1 = (ed[]) null;
        sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, fh.field_g, 300, param1);
        mj.field_d = 0;
        gi.a((byte) -71);
        return;
    }

    final static void a(ed param0, byte param1) {
        try {
          hf.a(-123);
          if (param1 >= -3) {
            ed var3 = (ed) null;
            eo.a((ed) null, (byte) -40);
          }
          em.a(param0.field_B, param0.field_A, param0.field_z);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "eo.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -72) {
          field_b = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        long var4Lifetime1;
        if (param1 >= 34) {
          var4 = this.c((byte) 96);
          if (var4 > 0L) {
            en.a((byte) -86, var4);
          }
          return this.a((byte) -95, param0);
        }
        field_a = (String) null;
        var4Lifetime1 = this.c((byte) 96);
        if (var4Lifetime1 > 0L) {
          en.a((byte) -86, var4Lifetime1);
        }
        return this.a((byte) -95, param0);
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = EscapeVector.field_A;
        if (param0 == 227) {
          var2 = param1;
          if (var2 == 32) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 != 95 &&
            45 != var2) {
            if (var2 != 91 &&
              93 != var2) {
              if (var2 == 35) {
                return param1;
              }
              if (224 != var2) {
                if (var2 == 225) {
                  return 'a';
                }
                if (var2 != 226 &&
                  var2 != 228 &&
                  227 != var2 &&
                  var2 != 192 &&
                  var2 != 193 &&
                  var2 != 194 &&
                  var2 != 196 &&
                  var2 != 195) {
                  if (var2 != 232 &&
                    var2 != 233 &&
                    var2 != 234 &&
                    var2 != 235 &&
                    200 != var2 &&
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
                        var2 != 243 &&
                        var2 != 244 &&
                        var2 != 246 &&
                        var2 != 245 &&
                        var2 != 210 &&
                        var2 != 211 &&
                        var2 != 212 &&
                        var2 != 214 &&
                        var2 != 213) {
                        if (var2 != 249 &&
                          var2 != 250 &&
                          var2 != 251 &&
                          var2 != 252) {
                          if (217 == var2) {
                            return 'u';
                          }
                          if (var2 != 218) {
                            if (var2 == 219) {
                              return 'u';
                            }
                            if (var2 == 220) {
                              return 'u';
                            }
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
                            if (var2 != 241 &&
                              var2 != 209) {
                              if (223 == var2) {
                                return 'b';
                              }
                              return Character.toLowerCase(param1);
                            }
                            return 'n';
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
          return '_';
        }
        eo.b((byte) -68);
        var2Lifetime1 = param1;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          45 != var2Lifetime1) {
          if (var2Lifetime1 != 91 &&
            93 != var2Lifetime1 &&
            var2Lifetime1 != 35) {
            if (224 != var2Lifetime1 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              227 != var2Lifetime1 &&
              var2Lifetime1 != 192 &&
              var2Lifetime1 != 193 &&
              var2Lifetime1 != 194 &&
              var2Lifetime1 != 196 &&
              var2Lifetime1 != 195) {
              if (var2Lifetime1 != 232 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234 &&
                var2Lifetime1 != 235 &&
                200 != var2Lifetime1 &&
                var2Lifetime1 != 201 &&
                var2Lifetime1 != 202 &&
                var2Lifetime1 != 203) {
                if (237 == var2Lifetime1) {
                  return 'i';
                }
                if (var2Lifetime1 != 238 &&
                  var2Lifetime1 != 239) {
                  if (var2Lifetime1 == 205) {
                    return 'i';
                  }
                  if (var2Lifetime1 != 206 &&
                    var2Lifetime1 != 207) {
                    if (var2Lifetime1 == 242) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 243) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 244) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 246) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 245) {
                      return 'o';
                    }
                    if (var2Lifetime1 != 210 &&
                      var2Lifetime1 != 211) {
                      if (var2Lifetime1 == 212) {
                        return 'o';
                      }
                      if (var2Lifetime1 != 214 &&
                        var2Lifetime1 != 213) {
                        if (var2Lifetime1 == 249) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 250) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 251) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 252) {
                          return 'u';
                        }
                        if (217 == var2Lifetime1) {
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
                        if (var2Lifetime1 != 241 &&
                          var2Lifetime1 != 209) {
                          if (223 == var2Lifetime1) {
                            return 'b';
                          }
                          return Character.toLowerCase(param1);
                        }
                        return 'n';
                      }
                    }
                    return 'o';
                  }
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        return '_';
    }

    abstract void a(int param0);

    static {
        field_b = "Watch Introduction";
        field_a = "Please check if address is correct";
    }
}
