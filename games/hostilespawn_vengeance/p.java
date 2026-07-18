/*
 * Decompiled by CFR-JS 0.4.0.
 */
class p {
    oc field_j;
    static String[] field_g;
    static java.applet.Applet field_a;
    static bd field_d;
    static ic[] field_m;
    static String[] field_k;
    og field_l;
    boolean field_b;
    boolean field_f;
    int field_h;
    int field_i;
    double field_c;
    int field_e;
    boolean field_n;

    final void a(int param0) {
        if (param0 == 8573) {
          if (0.0 <= ((p) this).field_l.field_f) {
            L0: {
              if (((p) this).field_l.field_f > 1.0) {
                ((p) this).field_j.field_e = ((p) this).field_j.field_e + 1;
                ((p) this).field_l.field_f = ((p) this).field_l.field_f - 1.0;
                break L0;
              } else {
                break L0;
              }
            }
            if (((p) this).field_l.field_a < 0.0) {
              L1: {
                ((p) this).field_l.field_a = ((p) this).field_l.field_a + 1.0;
                ((p) this).field_j.field_g = ((p) this).field_j.field_g - 1;
                if (((p) this).field_l.field_a > 1.0) {
                  ((p) this).field_l.field_a = ((p) this).field_l.field_a - 1.0;
                  ((p) this).field_j.field_g = ((p) this).field_j.field_g + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                if (((p) this).field_l.field_a > 1.0) {
                  ((p) this).field_l.field_a = ((p) this).field_l.field_a - 1.0;
                  ((p) this).field_j.field_g = ((p) this).field_j.field_g + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            L3: {
              ((p) this).field_j.field_e = ((p) this).field_j.field_e - 1;
              ((p) this).field_l.field_f = ((p) this).field_l.field_f + 1.0;
              if (((p) this).field_l.field_f > 1.0) {
                ((p) this).field_j.field_e = ((p) this).field_j.field_e + 1;
                ((p) this).field_l.field_f = ((p) this).field_l.field_f - 1.0;
                break L3;
              } else {
                break L3;
              }
            }
            if (((p) this).field_l.field_a >= 0.0) {
              L4: {
                if (((p) this).field_l.field_a > 1.0) {
                  ((p) this).field_l.field_a = ((p) this).field_l.field_a - 1.0;
                  ((p) this).field_j.field_g = ((p) this).field_j.field_g + 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                ((p) this).field_l.field_a = ((p) this).field_l.field_a + 1.0;
                ((p) this).field_j.field_g = ((p) this).field_j.field_g - 1;
                if (((p) this).field_l.field_a > 1.0) {
                  ((p) this).field_l.field_a = ((p) this).field_l.field_a - 1.0;
                  ((p) this).field_j.field_g = ((p) this).field_j.field_g + 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean[] a(int param0, int param1, id param2) {
        boolean[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        boolean[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((p) this).field_i != param1) {
                if (!((p) this).field_b) {
                  var4 = ((p) this).field_l.a(param0, ((p) this).field_c, ((p) this).field_j, false, param2);
                  break L1;
                } else {
                  var4 = ((p) this).field_l.a(((p) this).field_j, ((p) this).field_c, 1, param0, param2);
                  break L1;
                }
              } else {
                var4 = ((p) this).field_l.a(((p) this).field_c, ((p) this).field_j, param0, param2, (byte) -71);
                break L1;
              }
            }
            ((p) this).b((byte) 117);
            stackOut_6_0 = (boolean[]) var4;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("p.B(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(byte param0) {
        if (param0 != 54) {
            Object var3 = null;
            boolean[] discarded$0 = ((p) this).a(-16, -122, (id) null);
            return false;
        }
        return false;
    }

    public static void d() {
        field_a = null;
        field_g = null;
        field_m = null;
        field_k = null;
        field_d = null;
    }

    final boolean a(double param0, double param1, int param2) {
        if (param2 != 29821) {
            return true;
        }
        int var6 = (int)((-param0 + ((double)((p) this).field_j.field_e + ((p) this).field_l.field_f)) * 24.0);
        int var7 = (int)((-param1 + ((double)((p) this).field_j.field_g + ((p) this).field_l.field_a)) * 24.0);
        if (var6 < -16) {
            return false;
        }
        if (16 < var6) {
            return false;
        }
        if (var7 < -16) {
            return false;
        }
        if (var7 > 16) {
            return false;
        }
        return true;
    }

    final void b(byte param0) {
        L0: {
          if (((p) this).field_l.field_f < 0.0) {
            ((p) this).field_j.field_e = ((p) this).field_j.field_e - 1;
            ((p) this).field_l.field_f = ((p) this).field_l.field_f + 1.0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 117) {
          L1: {
            field_k = null;
            if (((p) this).field_l.field_f > 1.0) {
              ((p) this).field_j.field_e = ((p) this).field_j.field_e + 1;
              ((p) this).field_l.field_f = ((p) this).field_l.field_f - 1.0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((p) this).field_l.field_a < 0.0) {
              ((p) this).field_l.field_a = ((p) this).field_l.field_a + 1.0;
              ((p) this).field_j.field_g = ((p) this).field_j.field_g - 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((p) this).field_l.field_a > 1.0) {
              ((p) this).field_l.field_a = ((p) this).field_l.field_a - 1.0;
              ((p) this).field_j.field_g = ((p) this).field_j.field_g + 1;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (((p) this).field_l.field_f > 1.0) {
              ((p) this).field_j.field_e = ((p) this).field_j.field_e + 1;
              ((p) this).field_l.field_f = ((p) this).field_l.field_f - 1.0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (((p) this).field_l.field_a < 0.0) {
              ((p) this).field_l.field_a = ((p) this).field_l.field_a + 1.0;
              ((p) this).field_j.field_g = ((p) this).field_j.field_g - 1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (((p) this).field_l.field_a > 1.0) {
              ((p) this).field_l.field_a = ((p) this).field_l.field_a - 1.0;
              ((p) this).field_j.field_g = ((p) this).field_j.field_g + 1;
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    void a(int param0, double param1, int param2) {
        double var5 = 0.0;
        int var7 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          if (param1 >= 0.0) {
            if (param1 >= 256.0) {
              param1 = param1 - 256.0;
              break L0;
            } else {
              break L0;
            }
          } else {
            param1 = param1 + 256.0;
            break L0;
          }
        }
        if (param0 == 225) {
          L1: {
            var5 = param1 - ((p) this).field_c;
            if (var5 < 128.0) {
              if (-128.0 > var5) {
                var5 = var5 + 256.0;
                break L1;
              } else {
                if (var5 <= (double)param2) {
                  if (var5 >= (double)(-param2)) {
                    ((p) this).field_c = param1;
                    if (256.0 > ((p) this).field_c) {
                      if (0.0 > ((p) this).field_c) {
                        ((p) this).field_c = ((p) this).field_c + 256.0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((p) this).field_c = ((p) this).field_c - 256.0;
                      return;
                    }
                  } else {
                    L2: {
                      if (var5 >= 0.0) {
                        ((p) this).field_c = ((p) this).field_c + (double)param2;
                        break L2;
                      } else {
                        ((p) this).field_c = ((p) this).field_c - (double)param2;
                        break L2;
                      }
                    }
                    if (256.0 > ((p) this).field_c) {
                      if (0.0 <= ((p) this).field_c) {
                        return;
                      } else {
                        ((p) this).field_c = ((p) this).field_c + 256.0;
                        return;
                      }
                    } else {
                      ((p) this).field_c = ((p) this).field_c - 256.0;
                      return;
                    }
                  }
                } else {
                  L3: {
                    if (var5 >= 0.0) {
                      ((p) this).field_c = ((p) this).field_c + (double)param2;
                      break L3;
                    } else {
                      ((p) this).field_c = ((p) this).field_c - (double)param2;
                      break L3;
                    }
                  }
                  L4: {
                    if (256.0 <= ((p) this).field_c) {
                      ((p) this).field_c = ((p) this).field_c - 256.0;
                      break L4;
                    } else {
                      if (0.0 <= ((p) this).field_c) {
                        break L4;
                      } else {
                        ((p) this).field_c = ((p) this).field_c + 256.0;
                        break L4;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              var5 = var5 - 256.0;
              break L1;
            }
          }
          if (var5 <= (double)param2) {
            if (var5 >= (double)(-param2)) {
              ((p) this).field_c = param1;
              if (256.0 > ((p) this).field_c) {
                if (0.0 > ((p) this).field_c) {
                  ((p) this).field_c = ((p) this).field_c + 256.0;
                  return;
                } else {
                  return;
                }
              } else {
                ((p) this).field_c = ((p) this).field_c - 256.0;
                return;
              }
            } else {
              if (var5 >= 0.0) {
                ((p) this).field_c = ((p) this).field_c + (double)param2;
                if (256.0 > ((p) this).field_c) {
                  if (0.0 <= ((p) this).field_c) {
                    return;
                  } else {
                    ((p) this).field_c = ((p) this).field_c + 256.0;
                    return;
                  }
                } else {
                  ((p) this).field_c = ((p) this).field_c - 256.0;
                  return;
                }
              } else {
                ((p) this).field_c = ((p) this).field_c - (double)param2;
                if (256.0 > ((p) this).field_c) {
                  if (0.0 <= ((p) this).field_c) {
                    return;
                  } else {
                    ((p) this).field_c = ((p) this).field_c + 256.0;
                    return;
                  }
                } else {
                  ((p) this).field_c = ((p) this).field_c - 256.0;
                  return;
                }
              }
            }
          } else {
            if (var5 >= 0.0) {
              ((p) this).field_c = ((p) this).field_c + (double)param2;
              if (256.0 > ((p) this).field_c) {
                if (0.0 > ((p) this).field_c) {
                  ((p) this).field_c = ((p) this).field_c + 256.0;
                  return;
                } else {
                  return;
                }
              } else {
                ((p) this).field_c = ((p) this).field_c - 256.0;
                return;
              }
            } else {
              ((p) this).field_c = ((p) this).field_c - (double)param2;
              if (256.0 > ((p) this).field_c) {
                if (0.0 > ((p) this).field_c) {
                  ((p) this).field_c = ((p) this).field_c + 256.0;
                  return;
                } else {
                  return;
                }
              } else {
                ((p) this).field_c = ((p) this).field_c - 256.0;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 6) {
          L0: {
            boolean discarded$10 = ((p) this).a((byte) 27);
            if (6 != ((p) this).field_i) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (6 != ((p) this).field_i) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int c(int param0) {
        if (((p) this).field_i != 36) {
          if (((p) this).field_i != 37) {
            L0: {
              if (((p) this).field_i == 41) {
                break L0;
              } else {
                if (((p) this).field_i == 91) {
                  break L0;
                } else {
                  if (198 > ((p) this).field_i) {
                    if (223 == ((p) this).field_i) {
                      break L0;
                    } else {
                      if (((p) this).field_i != 252) {
                        if (((p) this).field_i != 35) {
                          if (((p) this).field_i < 283) {
                            if (((p) this).field_i != 150) {
                              L1: {
                                if (((p) this).field_i < 323) {
                                  break L1;
                                } else {
                                  if (331 < ((p) this).field_i) {
                                    break L1;
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                              if (param0 == 0) {
                                if (335 > ((p) this).field_i) {
                                  return 1;
                                } else {
                                  if (338 >= ((p) this).field_i) {
                                    return 0;
                                  } else {
                                    return 1;
                                  }
                                }
                              } else {
                                return -50;
                              }
                            } else {
                              return 0;
                            }
                          } else {
                            if (((p) this).field_i < 308) {
                              return 0;
                            } else {
                              if (((p) this).field_i != 150) {
                                L2: {
                                  if (((p) this).field_i < 323) {
                                    break L2;
                                  } else {
                                    if (331 < ((p) this).field_i) {
                                      break L2;
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                                if (param0 == 0) {
                                  if (335 > ((p) this).field_i) {
                                    return 1;
                                  } else {
                                    if (338 >= ((p) this).field_i) {
                                      return 0;
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  return -50;
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        } else {
                          return 0;
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    if (((p) this).field_i <= 202) {
                      break L0;
                    } else {
                      if (223 == ((p) this).field_i) {
                        return 0;
                      } else {
                        if (((p) this).field_i != 252) {
                          if (((p) this).field_i != 35) {
                            if (((p) this).field_i < 283) {
                              if (((p) this).field_i != 150) {
                                L3: {
                                  if (((p) this).field_i < 323) {
                                    break L3;
                                  } else {
                                    if (331 < ((p) this).field_i) {
                                      break L3;
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                                if (param0 == 0) {
                                  if (335 > ((p) this).field_i) {
                                    return 1;
                                  } else {
                                    if (338 >= ((p) this).field_i) {
                                      return 0;
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  return -50;
                                }
                              } else {
                                return 0;
                              }
                            } else {
                              if (((p) this).field_i < 308) {
                                return 0;
                              } else {
                                if (((p) this).field_i != 150) {
                                  L4: {
                                    if (((p) this).field_i < 323) {
                                      break L4;
                                    } else {
                                      if (331 < ((p) this).field_i) {
                                        break L4;
                                      } else {
                                        return 0;
                                      }
                                    }
                                  }
                                  if (param0 == 0) {
                                    if (335 > ((p) this).field_i) {
                                      return 1;
                                    } else {
                                      if (338 >= ((p) this).field_i) {
                                        return 0;
                                      } else {
                                        return 1;
                                      }
                                    }
                                  } else {
                                    return -50;
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          } else {
                            return 0;
                          }
                        } else {
                          return 0;
                        }
                      }
                    }
                  }
                }
              }
            }
            return 0;
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    p() {
        ((p) this).field_j = new oc();
        ((p) this).field_l = new og();
        ((p) this).field_h = 0;
        ((p) this).field_i = 0;
        ((p) this).field_e = 0;
        ((p) this).field_c = 0.0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_m = new ic[2];
    }
}
