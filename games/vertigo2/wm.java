/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wm extends mo {
    static jn field_k;
    static int[] field_j;

    wm() {
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 47) {
          var2 = param0;
          if (var2 == 32) {
            return '_';
          }
          if (160 == var2) {
            return '_';
          }
          if (var2 != 95 &&
            var2 != 45) {
            if (var2 == 91) {
              return param0;
            }
            if (var2 == 93) {
              return param0;
            }
            if (var2 == 35) {
              return param0;
            }
            if (var2 != 224 &&
              var2 != 225 &&
              226 != var2 &&
              228 != var2 &&
              227 != var2 &&
              192 != var2 &&
              var2 != 193 &&
              194 != var2 &&
              var2 != 196 &&
              195 != var2) {
              if (var2 != 232 &&
                233 != var2 &&
                var2 != 234 &&
                var2 != 235 &&
                200 != var2 &&
                201 != var2 &&
                var2 != 202 &&
                var2 != 203) {
                if (var2 != 237 &&
                  238 != var2 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    245 != var2 &&
                    var2 != 210 &&
                    var2 != 211 &&
                    var2 != 212 &&
                    var2 != 214 &&
                    var2 != 213) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      var2 != 251 &&
                      var2 != 252 &&
                      var2 != 217 &&
                      var2 != 218) {
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
                      if (255 == var2) {
                        return 'y';
                      }
                      if (var2 == 376) {
                        return 'y';
                      }
                      if (241 == var2) {
                        return 'n';
                      }
                      if (var2 == 209) {
                        return 'n';
                      }
                      if (var2 != 223) {
                        return Character.toLowerCase(param0);
                      }
                      return 'b';
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
          return '_';
        }
        field_k = (jn) null;
        var2Lifetime1 = param0;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (160 != var2Lifetime1 &&
          var2Lifetime1 != 95 &&
          var2Lifetime1 != 45) {
          if (var2Lifetime1 != 91 &&
            var2Lifetime1 != 93 &&
            var2Lifetime1 != 35) {
            if (var2Lifetime1 != 224 &&
              var2Lifetime1 != 225 &&
              226 != var2Lifetime1 &&
              228 != var2Lifetime1 &&
              227 != var2Lifetime1 &&
              192 != var2Lifetime1 &&
              var2Lifetime1 != 193 &&
              194 != var2Lifetime1 &&
              var2Lifetime1 != 196 &&
              195 != var2Lifetime1) {
              if (var2Lifetime1 != 232) {
                if (233 == var2Lifetime1) {
                  return 'e';
                }
                if (var2Lifetime1 != 234 &&
                  var2Lifetime1 != 235 &&
                  200 != var2Lifetime1) {
                  if (201 == var2Lifetime1) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 202) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 203) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 237) {
                    return 'i';
                  }
                  if (238 == var2Lifetime1) {
                    return 'i';
                  }
                  if (var2Lifetime1 != 239 &&
                    var2Lifetime1 != 205 &&
                    var2Lifetime1 != 206 &&
                    var2Lifetime1 != 207) {
                    if (var2Lifetime1 != 242) {
                      if (var2Lifetime1 == 243) {
                        return 'o';
                      }
                      if (var2Lifetime1 != 244 &&
                        var2Lifetime1 != 246 &&
                        245 != var2Lifetime1 &&
                        var2Lifetime1 != 210) {
                        if (var2Lifetime1 == 211) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 212 &&
                          var2Lifetime1 != 214 &&
                          var2Lifetime1 != 213) {
                          if (var2Lifetime1 == 249) {
                            return 'u';
                          }
                          if (var2Lifetime1 == 250) {
                            return 'u';
                          }
                          if (var2Lifetime1 != 251) {
                            if (var2Lifetime1 == 252) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 217) {
                              return 'u';
                            }
                            if (var2Lifetime1 != 218) {
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
                              if (255 == var2Lifetime1) {
                                return 'y';
                              }
                              if (var2Lifetime1 == 376) {
                                return 'y';
                              }
                              if (241 == var2Lifetime1) {
                                return 'n';
                              }
                              if (var2Lifetime1 == 209) {
                                return 'n';
                              }
                              if (var2Lifetime1 != 223) {
                                return Character.toLowerCase(param0);
                              }
                              return 'b';
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
        return '_';
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 < 80) {
          wm.a(' ', (byte) 92);
          field_j = null;
          return;
        }
        field_j = null;
    }

    static {
        field_j = new int[128];
    }
}
