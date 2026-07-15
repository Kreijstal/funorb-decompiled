/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends bh {
    int field_v;
    static String field_n;
    int field_s;
    ck field_o;
    int field_D;
    static int field_p;
    static String field_A;
    String field_r;
    int field_z;
    static ud field_w;
    int field_u;
    int field_y;
    static boolean field_x;
    boolean field_q;
    static vj field_C;
    static String field_B;
    int field_t;

    public static void c(byte param0) {
        field_n = null;
        field_C = null;
        field_A = null;
        field_w = null;
        field_B = null;
        if (param0 >= -65) {
            sa.c((byte) -48);
        }
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_28_0 = 0;
        int stackIn_88_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_87_0 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          jc.field_g = jc.field_g + 1;
          if ((field_p ^ -1) != 0) {
            break L0;
          } else {
            if (0 == (u.field_e ^ -1)) {
              u.field_e = pm.field_f;
              field_p = bh.field_g;
              break L0;
            } else {
              L1: {
                if (param0 != null) {
                  if (!param0.equals((Object) (Object) k.field_e)) {
                    break L1;
                  } else {
                    L2: {
                      k.field_e = param0;
                      if (wd.field_d) {
                        break L2;
                      } else {
                        if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                          break L2;
                        } else {
                          if (!pm.field_b) {
                            break L2;
                          } else {
                            dh.field_e = u.field_e;
                            pa.field_Z = field_p;
                            jc.field_g = 0;
                            break L2;
                          }
                        }
                      }
                    }
                    L3: {
                      field_p = param1;
                      u.field_e = -1;
                      if (!wd.field_d) {
                        break L3;
                      } else {
                        if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                          jc.field_g = 0;
                          wd.field_d = false;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (null == k.field_e) {
                    break L1;
                  } else {
                    L4: {
                      k.field_e = param0;
                      if (wd.field_d) {
                        break L4;
                      } else {
                        if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                          break L4;
                        } else {
                          if (!pm.field_b) {
                            break L4;
                          } else {
                            dh.field_e = u.field_e;
                            pa.field_Z = field_p;
                            jc.field_g = 0;
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      field_p = param1;
                      u.field_e = -1;
                      if (!wd.field_d) {
                        break L5;
                      } else {
                        if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                          jc.field_g = 0;
                          wd.field_d = false;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L6: {
                L7: {
                  if (wd.field_d) {
                    break L7;
                  } else {
                    if (jc.field_g < o.field_b) {
                      break L7;
                    } else {
                      if (o.field_b - -he.field_gb <= jc.field_g) {
                        break L7;
                      } else {
                        stackOut_26_0 = 1;
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                  }
                }
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L6;
              }
              L8: {
                var2 = stackIn_28_0;
                if (param0 == null) {
                  jc.field_g = 0;
                  break L8;
                } else {
                  if (wd.field_d) {
                    jc.field_g = o.field_b;
                    break L8;
                  } else {
                    if (var2 == 0) {
                      jc.field_g = 0;
                      break L8;
                    } else {
                      jc.field_g = o.field_b;
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (param0 != null) {
                  wd.field_d = false;
                  dh.field_e = u.field_e;
                  pa.field_Z = field_p;
                  break L9;
                } else {
                  if (var2 != 0) {
                    wd.field_d = true;
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    break L9;
                  } else {
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    break L9;
                  }
                }
              }
              L10: {
                k.field_e = param0;
                if (wd.field_d) {
                  break L10;
                } else {
                  if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                    break L10;
                  } else {
                    if (!pm.field_b) {
                      break L10;
                    } else {
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      jc.field_g = 0;
                      break L10;
                    }
                  }
                }
              }
              L11: {
                field_p = param1;
                u.field_e = -1;
                if (!wd.field_d) {
                  break L11;
                } else {
                  if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                    jc.field_g = 0;
                    wd.field_d = false;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              return;
            }
          }
        }
        L12: {
          if (param0 != null) {
            if (!param0.equals((Object) (Object) k.field_e)) {
              break L12;
            } else {
              L13: {
                k.field_e = param0;
                if (wd.field_d) {
                  break L13;
                } else {
                  if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                    break L13;
                  } else {
                    if (!pm.field_b) {
                      break L13;
                    } else {
                      L14: {
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        jc.field_g = 0;
                        field_p = param1;
                        u.field_e = -1;
                        if (!wd.field_d) {
                          break L14;
                        } else {
                          if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                            jc.field_g = 0;
                            wd.field_d = false;
                            break L14;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L15: {
                field_p = param1;
                u.field_e = -1;
                if (!wd.field_d) {
                  break L15;
                } else {
                  if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                    jc.field_g = 0;
                    wd.field_d = false;
                    break L15;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (null == k.field_e) {
              break L12;
            } else {
              L16: {
                k.field_e = param0;
                if (wd.field_d) {
                  break L16;
                } else {
                  if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                    break L16;
                  } else {
                    if (!pm.field_b) {
                      break L16;
                    } else {
                      L17: {
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        jc.field_g = 0;
                        field_p = param1;
                        u.field_e = -1;
                        if (!wd.field_d) {
                          break L17;
                        } else {
                          if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                            jc.field_g = 0;
                            wd.field_d = false;
                            break L17;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L18: {
                field_p = param1;
                u.field_e = -1;
                if (!wd.field_d) {
                  break L18;
                } else {
                  if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                    jc.field_g = 0;
                    wd.field_d = false;
                    break L18;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        }
        L19: {
          L20: {
            if (wd.field_d) {
              break L20;
            } else {
              if (jc.field_g < o.field_b) {
                break L20;
              } else {
                if (o.field_b - -he.field_gb <= jc.field_g) {
                  break L20;
                } else {
                  stackOut_86_0 = 1;
                  stackIn_88_0 = stackOut_86_0;
                  break L19;
                }
              }
            }
          }
          stackOut_87_0 = 0;
          stackIn_88_0 = stackOut_87_0;
          break L19;
        }
        L21: {
          var2 = stackIn_88_0;
          if (param0 == null) {
            jc.field_g = 0;
            break L21;
          } else {
            if (wd.field_d) {
              jc.field_g = o.field_b;
              break L21;
            } else {
              if (var2 == 0) {
                L22: {
                  jc.field_g = 0;
                  if (param0 != null) {
                    wd.field_d = false;
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    break L22;
                  } else {
                    if (var2 != 0) {
                      wd.field_d = true;
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      break L22;
                    } else {
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      break L22;
                    }
                  }
                }
                L23: {
                  k.field_e = param0;
                  if (wd.field_d) {
                    break L23;
                  } else {
                    if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                      break L23;
                    } else {
                      if (!pm.field_b) {
                        break L23;
                      } else {
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        jc.field_g = 0;
                        break L23;
                      }
                    }
                  }
                }
                L24: {
                  field_p = param1;
                  u.field_e = -1;
                  if (!wd.field_d) {
                    break L24;
                  } else {
                    if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                      jc.field_g = 0;
                      wd.field_d = false;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                }
                return;
              } else {
                jc.field_g = o.field_b;
                break L21;
              }
            }
          }
        }
        if (param0 != null) {
          wd.field_d = false;
          L25: {
            dh.field_e = u.field_e;
            pa.field_Z = field_p;
            k.field_e = param0;
            if (wd.field_d) {
              break L25;
            } else {
              if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                break L25;
              } else {
                if (!pm.field_b) {
                  break L25;
                } else {
                  L26: {
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    jc.field_g = 0;
                    field_p = param1;
                    u.field_e = -1;
                    if (!wd.field_d) {
                      break L26;
                    } else {
                      if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                        jc.field_g = 0;
                        wd.field_d = false;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L27: {
            field_p = param1;
            u.field_e = -1;
            if (!wd.field_d) {
              break L27;
            } else {
              if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                jc.field_g = 0;
                wd.field_d = false;
                break L27;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          if (var2 != 0) {
            wd.field_d = true;
            L28: {
              dh.field_e = u.field_e;
              pa.field_Z = field_p;
              k.field_e = param0;
              if (wd.field_d) {
                break L28;
              } else {
                if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                  break L28;
                } else {
                  if (!pm.field_b) {
                    break L28;
                  } else {
                    L29: {
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      jc.field_g = 0;
                      field_p = param1;
                      u.field_e = -1;
                      if (!wd.field_d) {
                        break L29;
                      } else {
                        if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                          jc.field_g = 0;
                          wd.field_d = false;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L30: {
              field_p = param1;
              u.field_e = -1;
              if (!wd.field_d) {
                break L30;
              } else {
                if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                  jc.field_g = 0;
                  wd.field_d = false;
                  break L30;
                } else {
                  return;
                }
              }
            }
            return;
          } else {
            L31: {
              dh.field_e = u.field_e;
              pa.field_Z = field_p;
              k.field_e = param0;
              if (wd.field_d) {
                break L31;
              } else {
                if ((o.field_b ^ -1) >= (jc.field_g ^ -1)) {
                  break L31;
                } else {
                  if (!pm.field_b) {
                    break L31;
                  } else {
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    jc.field_g = 0;
                    break L31;
                  }
                }
              }
            }
            L32: {
              field_p = param1;
              u.field_e = -1;
              if (!wd.field_d) {
                break L32;
              } else {
                if ((ve.field_hc ^ -1) == (jc.field_g ^ -1)) {
                  jc.field_g = 0;
                  wd.field_d = false;
                  break L32;
                } else {
                  return;
                }
              }
            }
            return;
          }
        }
    }

    sa(boolean param0, int param1, int param2, int param3, int[] param4, int param5, int param6, String[] param7) {
        ((sa) this).field_t = param3;
        ((sa) this).field_u = param1;
        ((sa) this).field_y = param6;
        ((sa) this).field_q = param0 ? true : false;
        ((sa) this).field_D = param2;
        ((sa) this).field_r = hf.a(param7.length, 0, (CharSequence[]) (Object) param7, (byte) 74);
        if (param4 != null) {
            if (param5 >= param4.length) {
                param5 = param4.length + -1;
            }
            ((sa) this).field_s = param4[param5];
        } else {
            ((sa) this).field_s = param5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "OVER <%0>";
        field_p = -1;
        field_A = "members-only content";
        field_C = new vj();
    }
}
