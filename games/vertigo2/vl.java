/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_g;
    static int[][] field_e;
    static lg[][] field_a;
    static String field_b;
    String field_i;
    boolean field_m;
    static int field_k;
    static String field_h;
    static int field_c;
    static boolean[] field_j;
    String field_l;
    static String field_f;
    static String field_d;

    final static void b(int param0) {
        if (param0 != 2147483647) {
            vl.a((byte) 56);
        }
    }

    final static u a(int param0, String param1, r param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        u stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        u stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2.a((byte) 123, param1);
              if (param0 == 0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var5 = param2.a(var4_int, param3, 126);
            stackOut_2_0 = wh.a(param2, 4080, var5, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("vl.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (aj.field_f == null) {
              break L1;
            } else {
              if (param1 > aj.field_f.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          aj.field_f = new int[param1 * 2];
          break L0;
        }
        L2: {
          if (param2 == -26418) {
            break L2;
          } else {
            field_h = (String) null;
            break L2;
          }
        }
        if (on.field_e != null) {
          if (param1 > on.field_e.length) {
            L3: {
              L4: {
                on.field_e = new int[param1 * 2];
                if (li.field_g == null) {
                  break L4;
                } else {
                  if (param1 <= li.field_g.length) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              li.field_g = new int[2 * param1];
              break L3;
            }
            L5: {
              if (null == ub.field_p) {
                break L5;
              } else {
                if (param1 <= ub.field_p.length) {
                  if (null == jf.field_N) {
                    jf.field_N = new int[param1 * 2];
                    if (null == hm.field_A) {
                      L6: {
                        L7: {
                          hm.field_A = new int[param1 * 2];
                          if (null == ac.field_I) {
                            break L7;
                          } else {
                            if (param1 - -param0 > ac.field_I.length) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ac.field_I = new int[2 * (param0 + param1)];
                        break L6;
                      }
                      L8: {
                        if (null == sl.field_m) {
                          break L8;
                        } else {
                          if (param1 <= sl.field_m.length) {
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            break L8;
                          }
                        }
                      }
                      sl.field_m = new boolean[2 * param1];
                      id.field_d = -2147483648;
                      ug.field_b = -2147483648;
                      cq.field_i = 0;
                      q.field_x = 2147483647;
                      f.field_y = 2147483647;
                      return;
                    } else {
                      if (hm.field_A.length >= param1) {
                        L9: {
                          L10: {
                            if (null == ac.field_I) {
                              break L10;
                            } else {
                              if (param1 - -param0 > ac.field_I.length) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                          ac.field_I = new int[2 * (param0 + param1)];
                          break L9;
                        }
                        if (null == sl.field_m) {
                          sl.field_m = new boolean[2 * param1];
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        } else {
                          if (param1 > sl.field_m.length) {
                            sl.field_m = new boolean[2 * param1];
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          }
                        }
                      } else {
                        L11: {
                          L12: {
                            hm.field_A = new int[param1 * 2];
                            if (null == ac.field_I) {
                              break L12;
                            } else {
                              if (param1 - -param0 > ac.field_I.length) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          ac.field_I = new int[2 * (param0 + param1)];
                          break L11;
                        }
                        L13: {
                          if (null == sl.field_m) {
                            break L13;
                          } else {
                            if (param1 <= sl.field_m.length) {
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            } else {
                              break L13;
                            }
                          }
                        }
                        sl.field_m = new boolean[2 * param1];
                        id.field_d = -2147483648;
                        ug.field_b = -2147483648;
                        cq.field_i = 0;
                        q.field_x = 2147483647;
                        f.field_y = 2147483647;
                        return;
                      }
                    }
                  } else {
                    if (jf.field_N.length >= param1) {
                      if (null == hm.field_A) {
                        L14: {
                          L15: {
                            hm.field_A = new int[param1 * 2];
                            if (null == ac.field_I) {
                              break L15;
                            } else {
                              if (param1 - -param0 > ac.field_I.length) {
                                break L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                          ac.field_I = new int[2 * (param0 + param1)];
                          break L14;
                        }
                        if (null == sl.field_m) {
                          sl.field_m = new boolean[2 * param1];
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        } else {
                          if (param1 > sl.field_m.length) {
                            sl.field_m = new boolean[2 * param1];
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          }
                        }
                      } else {
                        if (hm.field_A.length >= param1) {
                          L16: {
                            L17: {
                              if (null == ac.field_I) {
                                break L17;
                              } else {
                                if (param1 - -param0 > ac.field_I.length) {
                                  break L17;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            ac.field_I = new int[2 * (param0 + param1)];
                            break L16;
                          }
                          if (null == sl.field_m) {
                            sl.field_m = new boolean[2 * param1];
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            if (param1 > sl.field_m.length) {
                              sl.field_m = new boolean[2 * param1];
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            } else {
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            }
                          }
                        } else {
                          L18: {
                            L19: {
                              hm.field_A = new int[param1 * 2];
                              if (null == ac.field_I) {
                                break L19;
                              } else {
                                if (param1 - -param0 > ac.field_I.length) {
                                  break L19;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            ac.field_I = new int[2 * (param0 + param1)];
                            break L18;
                          }
                          if (null == sl.field_m) {
                            sl.field_m = new boolean[2 * param1];
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            if (param1 > sl.field_m.length) {
                              sl.field_m = new boolean[2 * param1];
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            } else {
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L20: {
                        L21: {
                          jf.field_N = new int[param1 * 2];
                          if (null == hm.field_A) {
                            break L21;
                          } else {
                            if (hm.field_A.length >= param1) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        hm.field_A = new int[param1 * 2];
                        break L20;
                      }
                      L22: {
                        L23: {
                          if (null == ac.field_I) {
                            break L23;
                          } else {
                            if (param1 - -param0 > ac.field_I.length) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                        ac.field_I = new int[2 * (param0 + param1)];
                        break L22;
                      }
                      if (null == sl.field_m) {
                        sl.field_m = new boolean[2 * param1];
                        id.field_d = -2147483648;
                        ug.field_b = -2147483648;
                        cq.field_i = 0;
                        q.field_x = 2147483647;
                        f.field_y = 2147483647;
                        return;
                      } else {
                        if (param1 > sl.field_m.length) {
                          sl.field_m = new boolean[2 * param1];
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        } else {
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L24: {
              L25: {
                ub.field_p = new int[2 * param1];
                if (null == jf.field_N) {
                  break L25;
                } else {
                  if (jf.field_N.length >= param1) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              jf.field_N = new int[param1 * 2];
              break L24;
            }
            L26: {
              L27: {
                if (null == hm.field_A) {
                  break L27;
                } else {
                  if (hm.field_A.length >= param1) {
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
              hm.field_A = new int[param1 * 2];
              break L26;
            }
            L28: {
              L29: {
                if (null == ac.field_I) {
                  break L29;
                } else {
                  if (param1 - -param0 > ac.field_I.length) {
                    break L29;
                  } else {
                    break L28;
                  }
                }
              }
              ac.field_I = new int[2 * (param0 + param1)];
              break L28;
            }
            L30: {
              if (null == sl.field_m) {
                break L30;
              } else {
                if (param1 <= sl.field_m.length) {
                  id.field_d = -2147483648;
                  ug.field_b = -2147483648;
                  cq.field_i = 0;
                  q.field_x = 2147483647;
                  f.field_y = 2147483647;
                  return;
                } else {
                  break L30;
                }
              }
            }
            sl.field_m = new boolean[2 * param1];
            id.field_d = -2147483648;
            ug.field_b = -2147483648;
            cq.field_i = 0;
            q.field_x = 2147483647;
            f.field_y = 2147483647;
            return;
          } else {
            L31: {
              L32: {
                if (li.field_g == null) {
                  break L32;
                } else {
                  if (param1 <= li.field_g.length) {
                    break L31;
                  } else {
                    break L32;
                  }
                }
              }
              li.field_g = new int[2 * param1];
              break L31;
            }
            L33: {
              if (null == ub.field_p) {
                break L33;
              } else {
                if (param1 <= ub.field_p.length) {
                  if (null == jf.field_N) {
                    L34: {
                      L35: {
                        jf.field_N = new int[param1 * 2];
                        if (null == hm.field_A) {
                          break L35;
                        } else {
                          if (hm.field_A.length >= param1) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      hm.field_A = new int[param1 * 2];
                      break L34;
                    }
                    L36: {
                      L37: {
                        if (null == ac.field_I) {
                          break L37;
                        } else {
                          if (param1 - -param0 > ac.field_I.length) {
                            break L37;
                          } else {
                            break L36;
                          }
                        }
                      }
                      ac.field_I = new int[2 * (param0 + param1)];
                      break L36;
                    }
                    L38: {
                      if (null == sl.field_m) {
                        break L38;
                      } else {
                        if (param1 <= sl.field_m.length) {
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        } else {
                          break L38;
                        }
                      }
                    }
                    sl.field_m = new boolean[2 * param1];
                    id.field_d = -2147483648;
                    ug.field_b = -2147483648;
                    cq.field_i = 0;
                    q.field_x = 2147483647;
                    f.field_y = 2147483647;
                    return;
                  } else {
                    if (jf.field_N.length >= param1) {
                      if (null == hm.field_A) {
                        L39: {
                          L40: {
                            hm.field_A = new int[param1 * 2];
                            if (null == ac.field_I) {
                              break L40;
                            } else {
                              if (param1 - -param0 > ac.field_I.length) {
                                break L40;
                              } else {
                                break L39;
                              }
                            }
                          }
                          ac.field_I = new int[2 * (param0 + param1)];
                          break L39;
                        }
                        L41: {
                          if (null == sl.field_m) {
                            break L41;
                          } else {
                            if (param1 <= sl.field_m.length) {
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            } else {
                              break L41;
                            }
                          }
                        }
                        sl.field_m = new boolean[2 * param1];
                        id.field_d = -2147483648;
                        ug.field_b = -2147483648;
                        cq.field_i = 0;
                        q.field_x = 2147483647;
                        f.field_y = 2147483647;
                        return;
                      } else {
                        if (hm.field_A.length >= param1) {
                          L42: {
                            L43: {
                              if (null == ac.field_I) {
                                break L43;
                              } else {
                                if (param1 - -param0 > ac.field_I.length) {
                                  break L43;
                                } else {
                                  break L42;
                                }
                              }
                            }
                            ac.field_I = new int[2 * (param0 + param1)];
                            break L42;
                          }
                          if (null == sl.field_m) {
                            sl.field_m = new boolean[2 * param1];
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            if (param1 > sl.field_m.length) {
                              sl.field_m = new boolean[2 * param1];
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            } else {
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            }
                          }
                        } else {
                          L44: {
                            L45: {
                              hm.field_A = new int[param1 * 2];
                              if (null == ac.field_I) {
                                break L45;
                              } else {
                                if (param1 - -param0 > ac.field_I.length) {
                                  break L45;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            ac.field_I = new int[2 * (param0 + param1)];
                            break L44;
                          }
                          L46: {
                            if (null == sl.field_m) {
                              break L46;
                            } else {
                              if (param1 <= sl.field_m.length) {
                                id.field_d = -2147483648;
                                ug.field_b = -2147483648;
                                cq.field_i = 0;
                                q.field_x = 2147483647;
                                f.field_y = 2147483647;
                                return;
                              } else {
                                break L46;
                              }
                            }
                          }
                          sl.field_m = new boolean[2 * param1];
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        }
                      }
                    } else {
                      L47: {
                        L48: {
                          jf.field_N = new int[param1 * 2];
                          if (null == hm.field_A) {
                            break L48;
                          } else {
                            if (hm.field_A.length >= param1) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        hm.field_A = new int[param1 * 2];
                        break L47;
                      }
                      L49: {
                        L50: {
                          if (null == ac.field_I) {
                            break L50;
                          } else {
                            if (param1 - -param0 > ac.field_I.length) {
                              break L50;
                            } else {
                              break L49;
                            }
                          }
                        }
                        ac.field_I = new int[2 * (param0 + param1)];
                        break L49;
                      }
                      L51: {
                        if (null == sl.field_m) {
                          break L51;
                        } else {
                          if (param1 <= sl.field_m.length) {
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            break L51;
                          }
                        }
                      }
                      sl.field_m = new boolean[2 * param1];
                      id.field_d = -2147483648;
                      ug.field_b = -2147483648;
                      cq.field_i = 0;
                      q.field_x = 2147483647;
                      f.field_y = 2147483647;
                      return;
                    }
                  }
                } else {
                  break L33;
                }
              }
            }
            L52: {
              L53: {
                ub.field_p = new int[2 * param1];
                if (null == jf.field_N) {
                  break L53;
                } else {
                  if (jf.field_N.length >= param1) {
                    break L52;
                  } else {
                    break L53;
                  }
                }
              }
              jf.field_N = new int[param1 * 2];
              break L52;
            }
            L54: {
              L55: {
                if (null == hm.field_A) {
                  break L55;
                } else {
                  if (hm.field_A.length >= param1) {
                    break L54;
                  } else {
                    break L55;
                  }
                }
              }
              hm.field_A = new int[param1 * 2];
              break L54;
            }
            L56: {
              L57: {
                if (null == ac.field_I) {
                  break L57;
                } else {
                  if (param1 - -param0 > ac.field_I.length) {
                    break L57;
                  } else {
                    break L56;
                  }
                }
              }
              ac.field_I = new int[2 * (param0 + param1)];
              break L56;
            }
            L58: {
              if (null == sl.field_m) {
                break L58;
              } else {
                if (param1 <= sl.field_m.length) {
                  id.field_d = -2147483648;
                  ug.field_b = -2147483648;
                  cq.field_i = 0;
                  q.field_x = 2147483647;
                  f.field_y = 2147483647;
                  return;
                } else {
                  break L58;
                }
              }
            }
            sl.field_m = new boolean[2 * param1];
            id.field_d = -2147483648;
            ug.field_b = -2147483648;
            cq.field_i = 0;
            q.field_x = 2147483647;
            f.field_y = 2147483647;
            return;
          }
        } else {
          L59: {
            L60: {
              on.field_e = new int[param1 * 2];
              if (li.field_g == null) {
                break L60;
              } else {
                if (param1 <= li.field_g.length) {
                  break L59;
                } else {
                  break L60;
                }
              }
            }
            li.field_g = new int[2 * param1];
            break L59;
          }
          L61: {
            if (null == ub.field_p) {
              break L61;
            } else {
              if (param1 <= ub.field_p.length) {
                if (null == jf.field_N) {
                  L62: {
                    L63: {
                      jf.field_N = new int[param1 * 2];
                      if (null == hm.field_A) {
                        break L63;
                      } else {
                        if (hm.field_A.length >= param1) {
                          break L62;
                        } else {
                          break L63;
                        }
                      }
                    }
                    hm.field_A = new int[param1 * 2];
                    break L62;
                  }
                  L64: {
                    L65: {
                      if (null == ac.field_I) {
                        break L65;
                      } else {
                        if (param1 - -param0 > ac.field_I.length) {
                          break L65;
                        } else {
                          break L64;
                        }
                      }
                    }
                    ac.field_I = new int[2 * (param0 + param1)];
                    break L64;
                  }
                  L66: {
                    if (null == sl.field_m) {
                      break L66;
                    } else {
                      if (param1 <= sl.field_m.length) {
                        id.field_d = -2147483648;
                        ug.field_b = -2147483648;
                        cq.field_i = 0;
                        q.field_x = 2147483647;
                        f.field_y = 2147483647;
                        return;
                      } else {
                        break L66;
                      }
                    }
                  }
                  sl.field_m = new boolean[2 * param1];
                  id.field_d = -2147483648;
                  ug.field_b = -2147483648;
                  cq.field_i = 0;
                  q.field_x = 2147483647;
                  f.field_y = 2147483647;
                  return;
                } else {
                  if (jf.field_N.length >= param1) {
                    if (null == hm.field_A) {
                      L67: {
                        L68: {
                          hm.field_A = new int[param1 * 2];
                          if (null == ac.field_I) {
                            break L68;
                          } else {
                            if (param1 - -param0 > ac.field_I.length) {
                              break L68;
                            } else {
                              break L67;
                            }
                          }
                        }
                        ac.field_I = new int[2 * (param0 + param1)];
                        break L67;
                      }
                      L69: {
                        if (null == sl.field_m) {
                          break L69;
                        } else {
                          if (param1 <= sl.field_m.length) {
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            break L69;
                          }
                        }
                      }
                      sl.field_m = new boolean[2 * param1];
                      id.field_d = -2147483648;
                      ug.field_b = -2147483648;
                      cq.field_i = 0;
                      q.field_x = 2147483647;
                      f.field_y = 2147483647;
                      return;
                    } else {
                      if (hm.field_A.length >= param1) {
                        L70: {
                          L71: {
                            if (null == ac.field_I) {
                              break L71;
                            } else {
                              if (param1 - -param0 > ac.field_I.length) {
                                break L71;
                              } else {
                                break L70;
                              }
                            }
                          }
                          ac.field_I = new int[2 * (param0 + param1)];
                          break L70;
                        }
                        if (null == sl.field_m) {
                          sl.field_m = new boolean[2 * param1];
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        } else {
                          if (param1 > sl.field_m.length) {
                            sl.field_m = new boolean[2 * param1];
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          } else {
                            id.field_d = -2147483648;
                            ug.field_b = -2147483648;
                            cq.field_i = 0;
                            q.field_x = 2147483647;
                            f.field_y = 2147483647;
                            return;
                          }
                        }
                      } else {
                        L72: {
                          L73: {
                            hm.field_A = new int[param1 * 2];
                            if (null == ac.field_I) {
                              break L73;
                            } else {
                              if (param1 - -param0 > ac.field_I.length) {
                                break L73;
                              } else {
                                break L72;
                              }
                            }
                          }
                          ac.field_I = new int[2 * (param0 + param1)];
                          break L72;
                        }
                        L74: {
                          if (null == sl.field_m) {
                            break L74;
                          } else {
                            if (param1 <= sl.field_m.length) {
                              id.field_d = -2147483648;
                              ug.field_b = -2147483648;
                              cq.field_i = 0;
                              q.field_x = 2147483647;
                              f.field_y = 2147483647;
                              return;
                            } else {
                              break L74;
                            }
                          }
                        }
                        sl.field_m = new boolean[2 * param1];
                        id.field_d = -2147483648;
                        ug.field_b = -2147483648;
                        cq.field_i = 0;
                        q.field_x = 2147483647;
                        f.field_y = 2147483647;
                        return;
                      }
                    }
                  } else {
                    L75: {
                      L76: {
                        jf.field_N = new int[param1 * 2];
                        if (null == hm.field_A) {
                          break L76;
                        } else {
                          if (hm.field_A.length >= param1) {
                            break L75;
                          } else {
                            break L76;
                          }
                        }
                      }
                      hm.field_A = new int[param1 * 2];
                      break L75;
                    }
                    L77: {
                      L78: {
                        if (null == ac.field_I) {
                          break L78;
                        } else {
                          if (param1 - -param0 > ac.field_I.length) {
                            break L78;
                          } else {
                            break L77;
                          }
                        }
                      }
                      ac.field_I = new int[2 * (param0 + param1)];
                      break L77;
                    }
                    L79: {
                      if (null == sl.field_m) {
                        break L79;
                      } else {
                        if (param1 <= sl.field_m.length) {
                          id.field_d = -2147483648;
                          ug.field_b = -2147483648;
                          cq.field_i = 0;
                          q.field_x = 2147483647;
                          f.field_y = 2147483647;
                          return;
                        } else {
                          break L79;
                        }
                      }
                    }
                    sl.field_m = new boolean[2 * param1];
                    id.field_d = -2147483648;
                    ug.field_b = -2147483648;
                    cq.field_i = 0;
                    q.field_x = 2147483647;
                    f.field_y = 2147483647;
                    return;
                  }
                }
              } else {
                break L61;
              }
            }
          }
          L80: {
            L81: {
              ub.field_p = new int[2 * param1];
              if (null == jf.field_N) {
                break L81;
              } else {
                if (jf.field_N.length >= param1) {
                  break L80;
                } else {
                  break L81;
                }
              }
            }
            jf.field_N = new int[param1 * 2];
            break L80;
          }
          L82: {
            L83: {
              if (null == hm.field_A) {
                break L83;
              } else {
                if (hm.field_A.length >= param1) {
                  break L82;
                } else {
                  break L83;
                }
              }
            }
            hm.field_A = new int[param1 * 2];
            break L82;
          }
          L84: {
            L85: {
              if (null == ac.field_I) {
                break L85;
              } else {
                if (param1 - -param0 > ac.field_I.length) {
                  break L85;
                } else {
                  break L84;
                }
              }
            }
            ac.field_I = new int[2 * (param0 + param1)];
            break L84;
          }
          L86: {
            if (null == sl.field_m) {
              break L86;
            } else {
              if (param1 <= sl.field_m.length) {
                id.field_d = -2147483648;
                ug.field_b = -2147483648;
                cq.field_i = 0;
                q.field_x = 2147483647;
                f.field_y = 2147483647;
                return;
              } else {
                break L86;
              }
            }
          }
          sl.field_m = new boolean[2 * param1];
          id.field_d = -2147483648;
          ug.field_b = -2147483648;
          cq.field_i = 0;
          q.field_x = 2147483647;
          f.field_y = 2147483647;
          return;
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_b = null;
        field_a = (lg[][]) null;
        field_f = null;
        field_e = (int[][]) null;
        field_d = null;
        field_h = null;
        if (param0 > -10) {
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 > -101) {
            field_b = (String) null;
            ti.c(-95);
            return;
        }
        ti.c(-95);
    }

    final static er[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        er var9 = null;
        er var10 = null;
        er var11 = null;
        er var12 = null;
        er var13 = null;
        Object var14 = null;
        int[] var15 = null;
        er var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = bi.field_l;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = bi.field_e;
          var8 = bi.field_j;
          var9 = new er(param1, param0 + -(param1 * 2));
          var9.d();
          bi.e(0, param2, param1, -(param1 * 2) + param0, param4, param5);
          var10 = new er(param1, param1);
          var10.d();
          bi.b(0, 0, param1, param1, param4);
          var11 = new er(16, param1);
          var11.d();
          bi.b(0, 0, 16, param1, param4);
          var12 = new er(param1, param1);
          var12.d();
          bi.b(0, 0, param1, param1, param5);
          var13 = new er(16, param1);
          var13.d();
          bi.b(0, 0, 16, param1, param5);
          var14 = null;
          if ((param3 ^ -1) < -1) {
            var16 = new er(16, 16);
            var14 = var16;
            var16.d();
            bi.b(0, 0, 16, 16, param3);
            break L0;
          } else {
            break L0;
          }
        }
        bi.a(var18, var7, var8);
        return new er[]{var10, var11, var10, var9, (er) (var14), var9, var12, var13, var12};
    }

    static {
        field_b = "Email address is unavailable";
        field_f = "Orb coins: ";
        field_g = "<img=2> / <img=10><br><img=1> / <img=12><br><img=3> / <img=11><br><img=4> / <img=9><br><img=5> / <img=7><br><img=15> / <img=17><br><img=14> / <img=16><br><img=8>";
        field_a = new lg[13][2];
        field_h = "Password is valid";
        field_d = "Create unrated game";
    }
}
