/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends za {
    static String field_i;
    jaclib.memory.heap.NativeHeap field_h;

    public static void b(int param0) {
        if (param0 != -197) {
          return;
        }
        field_i = null;
    }

    final void b(byte param0) {
        this.field_h.a();
        if (param0 < 83) {
          cp.b(126);
        }
    }

    cp(int param0) {
        this.field_h = new jaclib.memory.heap.NativeHeap(param0);
    }

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 0) {
          var2 = param1;
          if (var2 == 32) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 != 95 &&
            45 != var2) {
            if (var2 == 91) {
              return param1;
            }
            if (var2 != 93 &&
              35 != var2) {
              if (var2 != 224) {
                if (var2 == 225) {
                  return 'a';
                }
                if (var2 != 226 &&
                  var2 != 228 &&
                  var2 != 227 &&
                  192 != var2 &&
                  var2 != 193 &&
                  var2 != 194 &&
                  var2 != 196 &&
                  195 != var2) {
                  if (232 != var2 &&
                    var2 != 233 &&
                    var2 != 234 &&
                    var2 != 235 &&
                    var2 != 200 &&
                    var2 != 201 &&
                    202 != var2 &&
                    var2 != 203) {
                    if (var2 != 237 &&
                      var2 != 238 &&
                      var2 != 239 &&
                      var2 != 205 &&
                      var2 != 206 &&
                      207 != var2) {
                      if (242 != var2 &&
                        var2 != 243 &&
                        var2 != 244 &&
                        246 != var2 &&
                        245 != var2 &&
                        var2 != 210 &&
                        var2 != 211 &&
                        var2 != 212 &&
                        var2 != 214 &&
                        var2 != 213) {
                        if (var2 != 249 &&
                          250 != var2 &&
                          251 != var2 &&
                          var2 != 252 &&
                          var2 != 217 &&
                          var2 != 218) {
                          if (var2 == 219) {
                            return 'u';
                          }
                          if (220 == var2) {
                            return 'u';
                          }
                          if (231 == var2) {
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
                          if (var2 != 223) {
                            return Character.toLowerCase(param1);
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
              }
              return 'a';
            }
            return param1;
          }
          return '_';
        }
        cp.b(64);
        var2Lifetime1 = param1;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          45 != var2Lifetime1) {
          if (var2Lifetime1 != 91 &&
            var2Lifetime1 != 93 &&
            35 != var2Lifetime1) {
            if (var2Lifetime1 != 224 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              var2Lifetime1 != 227 &&
              192 != var2Lifetime1 &&
              var2Lifetime1 != 193 &&
              var2Lifetime1 != 194) {
              if (var2Lifetime1 == 196) {
                return 'a';
              }
              if (195 != var2Lifetime1) {
                if (232 != var2Lifetime1) {
                  if (var2Lifetime1 == 233) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 234) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 235) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 200) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 201) {
                    return 'e';
                  }
                  if (202 != var2Lifetime1 &&
                    var2Lifetime1 != 203) {
                    if (var2Lifetime1 != 237 &&
                      var2Lifetime1 != 238) {
                      if (var2Lifetime1 == 239) {
                        return 'i';
                      }
                      if (var2Lifetime1 != 205 &&
                        var2Lifetime1 != 206 &&
                        207 != var2Lifetime1) {
                        if (242 == var2Lifetime1) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 243) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 244) {
                          return 'o';
                        }
                        if (246 != var2Lifetime1 &&
                          245 != var2Lifetime1 &&
                          var2Lifetime1 != 210) {
                          if (var2Lifetime1 == 211) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 212 &&
                            var2Lifetime1 != 214 &&
                            var2Lifetime1 != 213) {
                            if (var2Lifetime1 != 249) {
                              if (250 == var2Lifetime1) {
                                return 'u';
                              }
                              if (251 != var2Lifetime1 &&
                                var2Lifetime1 != 252 &&
                                var2Lifetime1 != 217 &&
                                var2Lifetime1 != 218) {
                                if (var2Lifetime1 == 219) {
                                  return 'u';
                                }
                                if (220 == var2Lifetime1) {
                                  return 'u';
                                }
                                if (231 == var2Lifetime1) {
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
                                if (var2Lifetime1 != 223) {
                                  return Character.toLowerCase(param1);
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

    static {
        field_i = "Decline invitation to <%0>'s game";
    }
}
