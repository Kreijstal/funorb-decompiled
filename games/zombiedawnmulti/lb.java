/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_e;
    static ul field_d;
    static int[] field_c;
    static int field_a;
    static String field_b;

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ol.a(param1, false)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (qa.a((byte) 29, param1)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (gn.b((byte) 62, param1)) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.length() != 0) {
                    if (!cr.a(param0, param1, param2 ^ 9)) {
                      if (param2 == -10) {
                        if (a.a(param1, param0, (byte) -74)) {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (ia.a(127, param0, param1)) {
                            stackIn_28_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        stackIn_20_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("lb.C(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0 != 0;
                    } else {
                      return stackIn_28_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!df.field_H) {
          return;
        } else {
          if (-1 == param0) {
            fk.a(hl.field_d[12], true);
            if (var4 != 0) {
              if (0 == param2) {
                fk.a(hl.field_d[1], true);
                if (!param1) {
                  return;
                } else {
                  field_c = (int[]) null;
                  return;
                }
              } else {
                L0: {
                  if (-2 == (param2 ^ -1)) {
                    fk.a(hl.field_d[2], true);
                    if (var4 == 0) {
                      break L0;
                    } else {
                      fk.a(hl.field_d[1], true);
                      if (!param1) {
                        return;
                      } else {
                        field_c = (int[]) null;
                        return;
                      }
                    }
                  } else {
                    if (param2 == 2) {
                      fk.a(hl.field_d[3], true);
                      if (var4 == 0) {
                        break L0;
                      } else {
                        fk.a(hl.field_d[2], true);
                        if (var4 == 0) {
                          if (!param1) {
                            return;
                          } else {
                            field_c = (int[]) null;
                            return;
                          }
                        } else {
                          fk.a(hl.field_d[1], true);
                          if (!param1) {
                            return;
                          } else {
                            field_c = (int[]) null;
                            return;
                          }
                        }
                      }
                    } else {
                      if (-4 != (param2 ^ -1)) {
                        if (4 == param2) {
                          fk.a(hl.field_d[1], true);
                          if (var4 == 0) {
                            break L0;
                          } else {
                            L1: {
                              fk.a(hl.field_d[3], true);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                fk.a(hl.field_d[2], true);
                                if (var4 == 0) {
                                  break L1;
                                } else {
                                  fk.a(hl.field_d[1], true);
                                  if (!param1) {
                                    return;
                                  } else {
                                    field_c = (int[]) null;
                                    return;
                                  }
                                }
                              }
                            }
                            if (!param1) {
                              return;
                            } else {
                              field_c = (int[]) null;
                              return;
                            }
                          }
                        } else {
                          if (!param1) {
                            return;
                          } else {
                            field_c = (int[]) null;
                            return;
                          }
                        }
                      } else {
                        fk.a(hl.field_d[4], true);
                        if (var4 != 0) {
                          L2: {
                            if (4 != param2) {
                              break L2;
                            } else {
                              fk.a(hl.field_d[1], true);
                              if (var4 == 0) {
                                break L2;
                              } else {
                                fk.a(hl.field_d[3], true);
                                if (var4 == 0) {
                                  break L2;
                                } else {
                                  fk.a(hl.field_d[2], true);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    fk.a(hl.field_d[1], true);
                                    if (!param1) {
                                      return;
                                    } else {
                                      field_c = (int[]) null;
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (!param1) {
                            return;
                          } else {
                            field_c = (int[]) null;
                            return;
                          }
                        } else {
                          if (!param1) {
                            return;
                          } else {
                            field_c = (int[]) null;
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                if (!param1) {
                  return;
                } else {
                  field_c = (int[]) null;
                  return;
                }
              }
            } else {
              if (!param1) {
                return;
              } else {
                field_c = (int[]) null;
                return;
              }
            }
          } else {
            if (0 == param2) {
              fk.a(hl.field_d[1], true);
              if (!param1) {
                return;
              } else {
                field_c = (int[]) null;
                return;
              }
            } else {
              if (-2 == (param2 ^ -1)) {
                fk.a(hl.field_d[2], true);
                if (var4 == 0) {
                  if (!param1) {
                    return;
                  } else {
                    field_c = (int[]) null;
                    return;
                  }
                } else {
                  fk.a(hl.field_d[1], true);
                  if (!param1) {
                    return;
                  } else {
                    field_c = (int[]) null;
                    return;
                  }
                }
              } else {
                if (param2 == 2) {
                  fk.a(hl.field_d[3], true);
                  if (var4 != 0) {
                    fk.a(hl.field_d[2], true);
                    if (var4 == 0) {
                      if (!param1) {
                        return;
                      } else {
                        field_c = (int[]) null;
                        return;
                      }
                    } else {
                      L3: {
                        fk.a(hl.field_d[1], true);
                        if (!param1) {
                          break L3;
                        } else {
                          field_c = (int[]) null;
                          break L3;
                        }
                      }
                      return;
                    }
                  } else {
                    if (!param1) {
                      return;
                    } else {
                      field_c = (int[]) null;
                      return;
                    }
                  }
                } else {
                  if (-4 != (param2 ^ -1)) {
                    if (4 == param2) {
                      fk.a(hl.field_d[1], true);
                      if (var4 != 0) {
                        L4: {
                          fk.a(hl.field_d[3], true);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            fk.a(hl.field_d[2], true);
                            fk.a(hl.field_d[1], true);
                            break L4;
                          }
                        }
                        if (param1) {
                          field_c = (int[]) null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (param1) {
                          field_c = (int[]) null;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1) {
                        field_c = (int[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    fk.a(hl.field_d[4], true);
                    if (var4 == 0) {
                      if (param1) {
                        field_c = (int[]) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L5: {
                        if (4 != param2) {
                          break L5;
                        } else {
                          fk.a(hl.field_d[1], true);
                          fk.a(hl.field_d[3], true);
                          fk.a(hl.field_d[2], true);
                          fk.a(hl.field_d[1], true);
                          break L5;
                        }
                      }
                      L6: {
                        if (!param1) {
                          break L6;
                        } else {
                          field_c = (int[]) null;
                          break L6;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        String var1;
        if (ch.field_e) {
          L0: {
            if (h.field_L != null) {
              h.field_L.m(-7435);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = ob.e(-24093);
          b.field_c = new qm(var1, (String) null, true, false, false);
          nb.field_a.b(3016, wj.field_i);
          wj.field_i.a((cf) (b.field_c), (byte) -123);
          if (param0 != 9047) {
            lb.a((byte) -43);
            wj.field_i.h((byte) 49);
            return;
          } else {
            wj.field_i.h((byte) 49);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void a(byte param0) {
        if (param0 != 43) {
          field_b = (String) null;
          field_c = null;
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != 53) {
            return false;
        }
        return 0 <= param1 ? true : false;
    }

    static {
        field_b = "You cannot join this game - it is in progress";
        field_e = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
