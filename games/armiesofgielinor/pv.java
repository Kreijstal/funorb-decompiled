/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pv {
    static int field_b;
    static String field_d;
    static boolean field_c;
    static RgbSprite field_e;
    static AnimationSequence[][] field_a;

    final static char foldAccountNameCharacter(int obfuscationGuard, char character) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard > 114) {
          var2 = character;
          if (var2 != 32) {
            if (var2 == 160) {
              return '_';
            }
            if (var2 == 95) {
              return '_';
            }
            if (var2 != 45) {
              if (var2 != 91 &&
                93 != var2) {
                if (var2 == 35) {
                  return character;
                }
                if (var2 != 224) {
                  if (var2 == 225) {
                    return 'a';
                  }
                  if (var2 != 226 &&
                    var2 != 228 &&
                    227 != var2 &&
                    192 != var2 &&
                    193 != var2 &&
                    194 != var2 &&
                    var2 != 196 &&
                    195 != var2) {
                    if (var2 != 232 &&
                      var2 != 233 &&
                      234 != var2 &&
                      var2 != 235 &&
                      var2 != 200 &&
                      var2 != 201 &&
                      var2 != 202 &&
                      var2 != 203) {
                      if (237 != var2 &&
                        var2 != 238 &&
                        var2 != 239 &&
                        var2 != 205 &&
                        var2 != 206 &&
                        207 != var2) {
                        if (242 != var2 &&
                          var2 != 243 &&
                          var2 != 244 &&
                          var2 != 246 &&
                          var2 != 245 &&
                          var2 != 210 &&
                          var2 != 211 &&
                          212 != var2) {
                          if (214 == var2) {
                            return 'o';
                          }
                          if (213 != var2) {
                            if (var2 != 249 &&
                              var2 != 250 &&
                              var2 != 251) {
                              if (252 == var2) {
                                return 'u';
                              }
                              if (var2 != 217 &&
                                218 != var2) {
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
                                  if (var2 != 255 &&
                                    var2 != 376) {
                                    if (var2 == 241) {
                                      return 'n';
                                    }
                                    if (var2 == 209) {
                                      return 'n';
                                    }
                                    if (var2 != 223) {
                                      return Character.toLowerCase(character);
                                    }
                                    return 'b';
                                  }
                                  return 'y';
                                }
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
                }
                return 'a';
              }
              return character;
            }
          }
          return '_';
        }
        field_b = 59;
        var2Lifetime1 = character;
        if (var2Lifetime1 != 32) {
          if (var2Lifetime1 == 160) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
            var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
              93 != var2Lifetime1 &&
              var2Lifetime1 != 35) {
              if (var2Lifetime1 != 224 &&
                var2Lifetime1 != 225 &&
                var2Lifetime1 != 226) {
                if (var2Lifetime1 == 228) {
                  return 'a';
                }
                if (227 != var2Lifetime1 &&
                  192 != var2Lifetime1 &&
                  193 != var2Lifetime1) {
                  if (194 == var2Lifetime1) {
                    return 'a';
                  }
                  if (var2Lifetime1 != 196) {
                    if (195 == var2Lifetime1) {
                      return 'a';
                    }
                    if (var2Lifetime1 == 232) {
                      return 'e';
                    }
                    if (var2Lifetime1 != 233) {
                      if (234 == var2Lifetime1) {
                        return 'e';
                      }
                      if (var2Lifetime1 != 235 &&
                        var2Lifetime1 != 200) {
                        if (var2Lifetime1 == 201) {
                          return 'e';
                        }
                        if (var2Lifetime1 != 202) {
                          if (var2Lifetime1 == 203) {
                            return 'e';
                          }
                          if (237 != var2Lifetime1 &&
                            var2Lifetime1 != 238 &&
                            var2Lifetime1 != 239) {
                            if (var2Lifetime1 == 205) {
                              return 'i';
                            }
                            if (var2Lifetime1 != 206 &&
                              207 != var2Lifetime1) {
                              if (242 == var2Lifetime1) {
                                return 'o';
                              }
                              if (var2Lifetime1 != 243 &&
                                var2Lifetime1 != 244) {
                                if (var2Lifetime1 == 246) {
                                  return 'o';
                                }
                                if (var2Lifetime1 != 245) {
                                  if (var2Lifetime1 == 210) {
                                    return 'o';
                                  }
                                  if (var2Lifetime1 != 211) {
                                    if (212 == var2Lifetime1) {
                                      return 'o';
                                    }
                                    if (214 == var2Lifetime1) {
                                      return 'o';
                                    }
                                    if (213 != var2Lifetime1) {
                                      if (var2Lifetime1 != 249 &&
                                        var2Lifetime1 != 250 &&
                                        var2Lifetime1 != 251) {
                                        if (252 == var2Lifetime1) {
                                          return 'u';
                                        }
                                        if (var2Lifetime1 != 217 &&
                                          218 != var2Lifetime1) {
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
                                            if (var2Lifetime1 != 255 &&
                                              var2Lifetime1 != 376) {
                                              if (var2Lifetime1 == 241) {
                                                return 'n';
                                              }
                                              if (var2Lifetime1 == 209) {
                                                return 'n';
                                              }
                                              if (var2Lifetime1 != 223) {
                                                return Character.toLowerCase(character);
                                              }
                                              return 'b';
                                            }
                                            return 'y';
                                          }
                                        }
                                      }
                                      return 'u';
                                    }
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
                }
              }
              return 'a';
            }
            return character;
          }
        }
        return '_';
    }

    final static IndexedSprite a(String param0, String param1, ResourceArchive param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.getGroupId(param0, 124);
          var5 = param2.getFileId((byte) 121, var4_int, param1);
          if (param3 == 24914) {
            stackIn_4_0 = ls.a(var5, param2, var4_int, -80);
            return stackIn_4_0;
          }
          stackIn_2_0 = (IndexedSprite) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pv.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 == 213) {
          field_d = null;
          field_a = (AnimationSequence[][]) null;
          return;
        }
        field_d = (String) null;
        field_d = null;
        field_a = (AnimationSequence[][]) null;
    }

    static {
        field_d = "Back to Map";
        field_e = new RgbSprite(64, 64);
        field_a = new AnimationSequence[6][];
    }
}
