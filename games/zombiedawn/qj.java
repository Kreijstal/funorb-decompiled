/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static volatile long field_g;
    private boolean field_b;
    static fn field_f;
    private float field_i;
    private int field_h;
    private int field_a;
    static int field_d;
    static int field_e;
    static vn[][] field_j;
    private int field_c;

    final void a(byte param0) {
        if (param0 != 29) {
          ((qj) this).c(19);
          ((qj) this).field_b = true;
          fn discarded$4 = kh.a(59, false);
          return;
        } else {
          ((qj) this).field_b = true;
          fn discarded$5 = kh.a(59, false);
          return;
        }
    }

    final void c(int param0) {
        ((qj) this).field_b = false;
        fn discarded$0 = kh.a(param0, false);
    }

    final void b(int param0) {
        if ((float)param0 != ((qj) this).field_i) {
          ((qj) this).field_i = ((qj) this).field_i + 0.5f;
          if (5.0f >= ((qj) this).field_i) {
            if (((qj) this).field_a > 25) {
              ((qj) this).field_a = ((qj) this).field_a - 25;
              return;
            } else {
              return;
            }
          } else {
            ((qj) this).field_i = -1.0f;
            if (((qj) this).field_a <= 25) {
              return;
            } else {
              ((qj) this).field_a = ((qj) this).field_a - 25;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        vn[] stackIn_5_0 = null;
        vn[] stackIn_6_0 = null;
        vn[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn[] stackOut_4_0 = null;
        vn[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        vn[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            if (((qj) this).field_i >= 0.0f) {
              L2: {
                stackOut_4_0 = lb.field_eb;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!((qj) this).field_b) {
                  stackOut_6_0 = (vn[]) (Object) stackIn_6_0;
                  stackOut_6_1 = (int)((qj) this).field_i;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L2;
                } else {
                  stackOut_5_0 = (vn[]) (Object) stackIn_5_0;
                  stackOut_5_1 = 6;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L2;
                }
              }
              ((vn) (Object) stackIn_7_0[stackIn_7_1]).e(param1.a(((qj) this).field_h, (byte) -72) - 12, param1.a(((qj) this).field_c, 0) - 12, ((qj) this).field_a);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("qj.A(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_j = null;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 < 48) {
          field_g = 75L;
          ((qj) this).field_a = 256;
          ((qj) this).field_h = param1;
          ((qj) this).field_c = param2;
          ((qj) this).field_i = 0.0f;
          return;
        } else {
          ((qj) this).field_a = 256;
          ((qj) this).field_h = param1;
          ((qj) this).field_c = param2;
          ((qj) this).field_i = 0.0f;
          return;
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        var2 = param1;
        if (32 != var2) {
          if (var2 != 160) {
            if (var2 != 95) {
              if (45 != var2) {
                if (var2 != 91) {
                  if (var2 != 93) {
                    if (var2 != 35) {
                      if (var2 != 224) {
                        if (var2 != 225) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (var2 != 227) {
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
                                                    if (var2 != 201) {
                                                      if (202 != var2) {
                                                        if (var2 != 203) {
                                                          if (var2 != 237) {
                                                            if (var2 != 238) {
                                                              if (239 != var2) {
                                                                if (var2 != 205) {
                                                                  if (206 != var2) {
                                                                    if (var2 != 207) {
                                                                      if (var2 != 242) {
                                                                        if (var2 != 243) {
                                                                          if (var2 != 244) {
                                                                            if (246 != var2) {
                                                                              if (var2 != 245) {
                                                                                if (var2 != 210) {
                                                                                  if (var2 != 211) {
                                                                                    if (212 != var2) {
                                                                                      if (var2 != 214) {
                                                                                        if (var2 == 213) {
                                                                                          return 'o';
                                                                                        } else {
                                                                                          if (var2 != 249) {
                                                                                            if (var2 != 250) {
                                                                                              if (var2 != 251) {
                                                                                                if (var2 != 252) {
                                                                                                  if (var2 != 217) {
                                                                                                    if (var2 != 218) {
                                                                                                      if (var2 != 219) {
                                                                                                        if (220 != var2) {
                                                                                                          L0: {
                                                                                                            if (var2 == 231) {
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              if (199 == var2) {
                                                                                                                break L0;
                                                                                                              } else {
                                                                                                                L1: {
                                                                                                                  if (var2 == 255) {
                                                                                                                    break L1;
                                                                                                                  } else {
                                                                                                                    if (376 == var2) {
                                                                                                                      break L1;
                                                                                                                    } else {
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
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                return 'y';
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          return 'c';
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

    qj() {
        ((qj) this).field_i = -1.0f;
        ((qj) this).field_h = 0;
        ((qj) this).field_b = false;
        ((qj) this).field_c = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0L;
        field_f = null;
        field_d = 640;
        field_j = new vn[10][];
    }
}
