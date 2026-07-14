/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    float field_j;
    static dm[] field_g;
    private int field_c;
    private ii[] field_a;
    String field_e;
    static String field_f;
    private int field_d;
    static long field_b;
    static int field_i;
    private int field_h;

    private final void a(int param0, ii param1, int param2) {
        float var4 = 0.0f;
        Object var5 = null;
        var4 = (float)(((eb) this).field_h + 1) + (float)param0 / 100.0f;
        if (param2 <= -90) {
          if (param0 == 0) {
            ((eb) this).field_e = param1.field_g;
            ((eb) this).field_j = var4 * (float)((eb) this).field_c / (float)(1 + ((eb) this).field_d);
            return;
          } else {
            ((eb) this).field_e = param1.field_m + " - " + param0 + "%";
            ((eb) this).field_j = var4 * (float)((eb) this).field_c / (float)(1 + ((eb) this).field_d);
            return;
          }
        } else {
          var5 = null;
          eb.a((java.applet.Applet) null, (byte) 114, (String) null);
          if (param0 == 0) {
            ((eb) this).field_e = param1.field_g;
            ((eb) this).field_j = var4 * (float)((eb) this).field_c / (float)(1 + ((eb) this).field_d);
            return;
          } else {
            ((eb) this).field_e = param1.field_m + " - " + param0 + "%";
            ((eb) this).field_j = var4 * (float)((eb) this).field_c / (float)(1 + ((eb) this).field_d);
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
        if (param0 <= -68) {
            return;
        }
        int discarded$0 = eb.a(-101, -31);
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        Object var4 = null;
        ii var6 = null;
        ii var7 = null;
        var3 = Geoblox.field_C;
        if (!param0) {
          var4 = null;
          eb.a((java.applet.Applet) null, (byte) -56, (String) null);
          L0: while (true) {
            if (((eb) this).field_h < ((eb) this).field_d) {
              var7 = ((eb) this).field_a[((eb) this).field_h];
              if (var7.field_i.a(0)) {
                L1: {
                  if (var7.field_l < 0) {
                    break L1;
                  } else {
                    if (var7.field_i.a((byte) 102, var7.field_l)) {
                      break L1;
                    } else {
                      this.a(var7.field_i.b((byte) 36, var7.field_l), var7, -119);
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var7.field_f) {
                    break L2;
                  } else {
                    if (!var7.field_i.a(var7.field_f, (byte) -126)) {
                      this.a(var7.field_i.a(0, var7.field_f), var7, -123);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var7.field_l ^ -1)) {
                    break L3;
                  } else {
                    if (var7.field_f != null) {
                      break L3;
                    } else {
                      if (null == var7.field_m) {
                        break L3;
                      } else {
                        if (!var7.field_i.b(true)) {
                          this.a(var7.field_i.b((byte) 106), var7, -108);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((eb) this).field_h = ((eb) this).field_h + 1;
                continue L0;
              } else {
                this.a(0, var7, -123);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((eb) this).field_h < ((eb) this).field_d) {
              var6 = ((eb) this).field_a[((eb) this).field_h];
              if (var6.field_i.a(0)) {
                L5: {
                  if (var6.field_l < 0) {
                    break L5;
                  } else {
                    if (var6.field_i.a((byte) 102, var6.field_l)) {
                      break L5;
                    } else {
                      this.a(var6.field_i.b((byte) 36, var6.field_l), var6, -119);
                      return false;
                    }
                  }
                }
                L6: {
                  if (null == var6.field_f) {
                    break L6;
                  } else {
                    if (!var6.field_i.a(var6.field_f, (byte) -126)) {
                      this.a(var6.field_i.a(0, var6.field_f), var6, -123);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var6.field_l ^ -1)) {
                    break L7;
                  } else {
                    if (var6.field_f != null) {
                      break L7;
                    } else {
                      if (null == var6.field_m) {
                        break L7;
                      } else {
                        if (!var6.field_i.b(true)) {
                          this.a(var6.field_i.b((byte) 106), var6, -108);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((eb) this).field_h = ((eb) this).field_h + 1;
                continue L4;
              } else {
                this.a(0, var6, -123);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.field_C;
        gj.field_s = null;
        qh.field_J = 0;
        li.field_a = null;
        var2 = vg.field_a;
        vg.field_a = ij.field_W;
        ij.field_W = var2;
        if (param0 != 51) {
          if (50 == param0) {
            wg.field_i.field_q = 5;
            wg.field_i.field_b = wg.field_i.field_b + 1;
            if (-3 < wg.field_i.field_b) {
              L0: {
                if (wg.field_i.field_b > -3) {
                  break L0;
                } else {
                  if (50 != param0) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (param1 == 28625) {
                if (-5 >= (wg.field_i.field_b ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                field_i = -67;
                if (-5 <= wg.field_i.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              if (-52 != param0) {
                if (wg.field_i.field_b <= -3) {
                  if (50 != param0) {
                    if (param1 == 28625) {
                      if (-5 >= (wg.field_i.field_b ^ -1)) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      field_i = -67;
                      if (-5 <= wg.field_i.field_b) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (param1 == 28625) {
                    if (-5 >= wg.field_i.field_b) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    field_i = -67;
                    if (-5 <= wg.field_i.field_b) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                return 2;
              }
            }
          } else {
            wg.field_i.field_q = 1;
            wg.field_i.field_b = wg.field_i.field_b + 1;
            if (-3 < wg.field_i.field_b) {
              L1: {
                if (wg.field_i.field_b > -3) {
                  break L1;
                } else {
                  if (50 != param0) {
                    break L1;
                  } else {
                    return 5;
                  }
                }
              }
              if (param1 == 28625) {
                if (-5 >= (wg.field_i.field_b ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                field_i = -67;
                if (-5 <= wg.field_i.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              if (-52 != param0) {
                L2: {
                  if (wg.field_i.field_b > -3) {
                    break L2;
                  } else {
                    if (50 != param0) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                L3: {
                  if (param1 == 28625) {
                    break L3;
                  } else {
                    field_i = -67;
                    break L3;
                  }
                }
                if (-5 <= wg.field_i.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                return 2;
              }
            }
          }
        } else {
          wg.field_i.field_q = 2;
          wg.field_i.field_b = wg.field_i.field_b + 1;
          if (-3 >= (wg.field_i.field_b ^ -1)) {
            if (-52 == (param0 ^ -1)) {
              return 2;
            } else {
              if (wg.field_i.field_b <= -3) {
                if (50 != param0) {
                  if (param1 == 28625) {
                    if (-5 <= wg.field_i.field_b) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    field_i = -67;
                    if (-5 >= wg.field_i.field_b) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  return 5;
                }
              } else {
                L4: {
                  if (param1 == 28625) {
                    break L4;
                  } else {
                    field_i = -67;
                    break L4;
                  }
                }
                if (-5 <= wg.field_i.field_b) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            L5: {
              if (wg.field_i.field_b > -3) {
                break L5;
              } else {
                if (50 != param0) {
                  break L5;
                } else {
                  return 5;
                }
              }
            }
            L6: {
              if (param1 == 28625) {
                break L6;
              } else {
                field_i = -67;
                break L6;
              }
            }
            if (-5 <= wg.field_i.field_b) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            try {
                if (param1 <= 109) {
                    field_f = null;
                }
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = wf.a(var3, 59, param0);
                pa.a(var3.toString(), (byte) 64, true, param0);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private eb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Fetching highscores.";
        field_i = 2;
    }
}
