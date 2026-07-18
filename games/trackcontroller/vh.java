/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vh extends gb {
    int field_o;
    static String field_p;
    static volatile boolean field_q;

    final static void h() {
        bk.field_J = null;
        jf.field_i = null;
        ue.field_c = null;
        mh.field_i = false;
        el.field_O = null;
    }

    public static void g() {
        field_p = null;
    }

    final static long a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              if (param0 < -79) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            var4 = param1.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var4 <= var5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(1 + var6 - 65);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (57 < var6) {
                        break L4;
                      } else {
                        var2_long = var2_long + (long)(27 - -var6 - 48);
                        break L4;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (var2_long % 37L != 0L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_22_0 = var2_long;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("vh.I(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final static char a(boolean param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        var2 = param1;
        if (var2 != 32) {
          if (var2 != 160) {
            if (var2 != 95) {
              if (var2 != 45) {
                if (var2 != 91) {
                  if (93 != var2) {
                    if (var2 != 35) {
                      if (224 != var2) {
                        if (225 != var2) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (227 != var2) {
                                if (var2 != 192) {
                                  if (193 != var2) {
                                    if (var2 != 194) {
                                      if (var2 != 196) {
                                        if (var2 != 195) {
                                          if (var2 != 232) {
                                            if (var2 != 233) {
                                              if (var2 != 234) {
                                                if (var2 != 235) {
                                                  if (var2 != 200) {
                                                    if (201 != var2) {
                                                      if (202 == var2) {
                                                        return 'e';
                                                      } else {
                                                        if (var2 != 203) {
                                                          if (var2 != 237) {
                                                            if (var2 != 238) {
                                                              if (var2 != 239) {
                                                                if (var2 != 205) {
                                                                  if (206 != var2) {
                                                                    if (var2 != 207) {
                                                                      if (242 != var2) {
                                                                        if (var2 != 243) {
                                                                          if (244 != var2) {
                                                                            if (var2 != 246) {
                                                                              if (var2 != 245) {
                                                                                if (var2 != 210) {
                                                                                  if (var2 != 211) {
                                                                                    if (var2 == 212) {
                                                                                      return 'o';
                                                                                    } else {
                                                                                      if (var2 != 214) {
                                                                                        if (213 != var2) {
                                                                                          if (var2 != 249) {
                                                                                            if (250 != var2) {
                                                                                              if (var2 != 251) {
                                                                                                if (var2 != 252) {
                                                                                                  if (var2 != 217) {
                                                                                                    if (218 != var2) {
                                                                                                      if (var2 != 219) {
                                                                                                        if (220 != var2) {
                                                                                                          if (var2 != 231) {
                                                                                                            if (var2 == 199) {
                                                                                                              return 'c';
                                                                                                            } else {
                                                                                                              if (var2 == 255) {
                                                                                                                return 'y';
                                                                                                              } else {
                                                                                                                if (var2 != 376) {
                                                                                                                  if (var2 == 241) {
                                                                                                                    return 'n';
                                                                                                                  } else {
                                                                                                                    if (var2 != 209) {
                                                                                                                      if (var2 == 223) {
                                                                                                                        return 'b';
                                                                                                                      } else {
                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'c';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            } else {
                                                                                              return 'u';
                                                                                            }
                                                                                          } else {
                                                                                            return 'u';
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
                                                                        } else {
                                                                          return 'o';
                                                                        }
                                                                      } else {
                                                                        return 'o';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  } else {
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'i';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      }
                                                    } else {
                                                      return 'e';
                                                    }
                                                  } else {
                                                    return 'e';
                                                  }
                                                } else {
                                                  return 'e';
                                                }
                                              } else {
                                                return 'e';
                                              }
                                            } else {
                                              return 'e';
                                            }
                                          } else {
                                            return 'e';
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        return 'a';
                                      }
                                    } else {
                                      return 'a';
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return param1;
                    }
                  } else {
                    return param1;
                  }
                } else {
                  return param1;
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '_';
        }
    }

    vh(int param0) {
        ((vh) this).field_o = param0;
    }

    final static kk a(int param0, int param1, boolean param2, int param3, boolean param4) {
        return fh.a(true, param0, false, false, 1, -122);
    }

    final static void a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          int discarded$2 = -105;
          nf.a(false, param2, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("vh.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(224).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    abstract boolean f(int param0);

    abstract Object a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = true;
    }
}
