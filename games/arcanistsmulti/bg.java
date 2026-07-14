/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg {
    static kg field_d;
    static String field_b;
    static int field_c;
    static boolean field_a;
    static qb field_e;

    public static void a(byte param0) {
        if (param0 > -7) {
          field_c = 105;
          field_e = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    abstract void a(int param0, byte[] param1);

    final static boolean a(int param0, char param1) {
        if (param1 < 32) {
          if (param1 < 160) {
            if (param0 == -256) {
              L0: {
                if (param1 == 8364) {
                  break L0;
                } else {
                  if (param1 == 338) {
                    break L0;
                  } else {
                    if (8212 == param1) {
                      break L0;
                    } else {
                      if (param1 == 339) {
                        break L0;
                      } else {
                        if (param1 != 376) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              L1: {
                bg.a((byte) 112);
                if (param1 == 8364) {
                  break L1;
                } else {
                  if (param1 == 338) {
                    break L1;
                  } else {
                    if (8212 == param1) {
                      break L1;
                    } else {
                      if (param1 == 339) {
                        break L1;
                      } else {
                        if (param1 != 376) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            }
          } else {
            if (param1 <= 255) {
              return true;
            } else {
              if (param0 == -256) {
                L2: {
                  if (param1 == 8364) {
                    break L2;
                  } else {
                    if (param1 == 338) {
                      break L2;
                    } else {
                      if (8212 == param1) {
                        break L2;
                      } else {
                        if (param1 == 339) {
                          break L2;
                        } else {
                          if (param1 != 376) {
                            return false;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              } else {
                L3: {
                  bg.a((byte) 112);
                  if (param1 == 8364) {
                    break L3;
                  } else {
                    if (param1 == 338) {
                      break L3;
                    } else {
                      if (8212 == param1) {
                        break L3;
                      } else {
                        if (param1 == 339) {
                          break L3;
                        } else {
                          if (param1 != 376) {
                            return false;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              }
            }
          }
        } else {
          if (126 < param1) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                return true;
              } else {
                if (param0 != -256) {
                  bg.a((byte) 112);
                  if (param1 != 8364) {
                    if (param1 != 338) {
                      if (8212 != param1) {
                        if (param1 != 339) {
                          if (param1 == 376) {
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          return true;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  if (param1 != 8364) {
                    if (param1 != 338) {
                      if (8212 != param1) {
                        if (param1 != 339) {
                          if (param1 == 376) {
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          return true;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                }
              }
            } else {
              if (param0 == -256) {
                if (param1 != 8364) {
                  if (param1 != 338) {
                    if (8212 != param1) {
                      if (param1 != 339) {
                        if (param1 != 376) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                bg.a((byte) 112);
                if (param1 != 8364) {
                  if (param1 != 338) {
                    if (8212 != param1) {
                      if (param1 != 339) {
                        if (param1 == 376) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (0 != (nm.field_h ^ -1)) {
          if (param1 == nm.field_h) {
            nm.field_h = param1;
            boolean discarded$2 = lc.a((byte) 112);
            he.field_e.b((byte) -76, 66);
            he.field_e.f(param1, (byte) -78);
            if (param0 <= qf.field_d) {
              if (ua.field_P + ta.a(true, param1) <= jf.field_j) {
                if (-1L != (cb.field_e & 1L << param1 ^ -1L)) {
                  return;
                } else {
                  ua.field_P = ua.field_P + ta.a(true, param1);
                  nm.field_h = -1;
                  cb.field_e = cb.field_e | 1L << param1;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          nm.field_h = param1;
          boolean discarded$3 = lc.a((byte) 112);
          he.field_e.b((byte) -76, 66);
          he.field_e.f(param1, (byte) -78);
          if (param0 <= qf.field_d) {
            if (ua.field_P + ta.a(true, param1) <= jf.field_j) {
              if (-1L != (cb.field_e & 1L << param1 ^ -1L)) {
                return;
              } else {
                ua.field_P = ua.field_P + ta.a(true, param1);
                nm.field_h = -1;
                cb.field_e = cb.field_e | 1L << param1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        cn var2 = null;
        n.field_g.a(param0, true);
        var2 = ln.field_U;
        if (var2 == null) {
          if (param1 > -11) {
            bg.a(97, -65);
            return;
          } else {
            return;
          }
        } else {
          var2.a(n.field_g.field_V, true, n.field_g.field_nb);
          if (param1 <= -11) {
            return;
          } else {
            bg.a(97, -65);
            return;
          }
        }
    }

    abstract byte[] b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Real-life threats";
        field_c = 32;
    }
}
