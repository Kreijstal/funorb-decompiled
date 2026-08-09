/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static String field_a;

    final static kd a(long param0, String param1, boolean param2, String param3, byte param4) {
        RuntimeException var6 = null;
        kd stackIn_2_0 = null;
        of stackIn_9_0 = null;
        sc stackIn_11_0 = null;
        ec stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 < -107) {
              L1: {
                if (0L != param0) {
                  break L1;
                } else {
                  if (param3 != null) {
                    stackIn_11_0 = new sc(param3, param1);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param2) {
                stackIn_9_0 = new of(param0, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_13_0 = new ec(param0, param1);
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = (kd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("ie.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kd) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (kd) ((Object) stackIn_11_0);
            } else {
              return (kd) ((Object) stackIn_13_0);
            }
          }
        }
    }

    final static int a(int param0) {
        if (param0 >= 38) {
          if (gl.field_I >= 2) {
            if (hl.field_F == 0) {
              if (!ei.field_i.c(-81)) {
                return 20;
              } else {
                if (!ei.field_i.b("commonui", (byte) -3)) {
                  return 40;
                } else {
                  if (ha.field_x.c(-63)) {
                    if (!ha.field_x.b("commonui", (byte) -3)) {
                      return 60;
                    } else {
                      if (!ok.field_G.c(88)) {
                        return 70;
                      } else {
                        if (ok.field_G.a((byte) 48)) {
                          return 100;
                        } else {
                          return 80;
                        }
                      }
                    }
                  } else {
                    return 50;
                  }
                }
              }
            } else {
              L0: {
                if (null == ff.field_b) {
                  break L0;
                } else {
                  if (!ff.field_b.c(123)) {
                    return 14;
                  } else {
                    if (ff.field_b.a("", (byte) -113)) {
                      if (ff.field_b.b("", (byte) -3)) {
                        break L0;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  }
                }
              }
              if (!ei.field_i.c(-121)) {
                return 43;
              } else {
                if (!ei.field_i.b("commonui", (byte) -3)) {
                  return 57;
                } else {
                  if (!ha.field_x.c(116)) {
                    return 71;
                  } else {
                    if (!ha.field_x.b("commonui", (byte) -3)) {
                      return 80;
                    } else {
                      if (!ok.field_G.c(94)) {
                        return 82;
                      } else {
                        if (!ok.field_G.a((byte) 48)) {
                          return 86;
                        } else {
                          return 100;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          field_a = (String) null;
          if (gl.field_I >= 2) {
            if (hl.field_F == 0) {
              if (!ei.field_i.c(-81)) {
                return 20;
              } else {
                if (!ei.field_i.b("commonui", (byte) -3)) {
                  return 40;
                } else {
                  if (ha.field_x.c(-63)) {
                    if (!ha.field_x.b("commonui", (byte) -3)) {
                      return 60;
                    } else {
                      if (!ok.field_G.c(88)) {
                        return 70;
                      } else {
                        if (ok.field_G.a((byte) 48)) {
                          return 100;
                        } else {
                          return 80;
                        }
                      }
                    }
                  } else {
                    return 50;
                  }
                }
              }
            } else {
              if (null != ff.field_b) {
                if (!ff.field_b.c(123)) {
                  return 14;
                } else {
                  if (ff.field_b.a("", (byte) -113)) {
                    if (ff.field_b.b("", (byte) -3)) {
                      if (!ei.field_i.c(-121)) {
                        return 43;
                      } else {
                        if (!ei.field_i.b("commonui", (byte) -3)) {
                          return 57;
                        } else {
                          if (!ha.field_x.c(116)) {
                            return 71;
                          } else {
                            if (!ha.field_x.b("commonui", (byte) -3)) {
                              return 80;
                            } else {
                              if (!ok.field_G.c(94)) {
                                return 82;
                              } else {
                                if (!ok.field_G.a((byte) 48)) {
                                  return 86;
                                } else {
                                  return 100;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 29;
                  }
                }
              } else {
                if (!ei.field_i.c(-121)) {
                  return 43;
                } else {
                  if (!ei.field_i.b("commonui", (byte) -3)) {
                    return 57;
                  } else {
                    if (!ha.field_x.c(116)) {
                      return 71;
                    } else {
                      if (!ha.field_x.b("commonui", (byte) -3)) {
                        return 80;
                      } else {
                        if (!ok.field_G.c(94)) {
                          return 82;
                        } else {
                          if (!ok.field_G.a((byte) 48)) {
                            return 86;
                          } else {
                            return 100;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    final static ng[] a(String param0, kk param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        ng[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 38) {
                break L1;
              } else {
                var6 = (String) null;
                ie.a(11L, (String) null, false, (String) null, (byte) 116);
                break L1;
              }
            }
            var4_int = param1.a(true, param0);
            var5 = param1.a(param2, var4_int, -1);
            stackIn_3_0 = nd.a(param1, var5, var4_int, 16777215);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ie.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(int param0) {
        if (param0 != 82) {
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                if (null == ob.a(param1 + 47, param0)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ie.E(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static void a(byte param0) {
        if (param0 != 93) {
            field_a = (String) null;
            qc.b(4, (byte) -42);
            return;
        }
        qc.b(4, (byte) -42);
    }

    static {
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
