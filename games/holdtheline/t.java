/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends hl {
    static String field_k;
    static int field_n;
    static int[] field_j;
    static int field_l;
    int[] field_m;
    static uf field_i;

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        var2 = param0;
        L0: while (true) {
          if (param1.length() > var2) {
            var3 = param1.charAt(var2);
            if (!oe.a((char) var3, -125)) {
              if (!ii.a(48, (char) var3)) {
                return true;
              } else {
                var2++;
                var2++;
                continue L0;
              }
            } else {
              var2++;
              var2++;
              continue L0;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(String param0, byte param1) {
        if (param1 >= -21) {
            t.a(10);
        }
    }

    final static boolean a(gn param0, gn param1, byte param2, gn param3) {
        if (param0.a((byte) 78)) {
          if (param1.b("font", -121)) {
            if (param1.b("font12", -97)) {
              if (!param1.b("logo", 51)) {
                return false;
              } else {
                if (param1.b("logo_large", param2 ^ 30)) {
                  if (!param1.b("flag", 64)) {
                    return false;
                  } else {
                    if (!param1.b("menubar", -109)) {
                      return false;
                    } else {
                      if (!param1.b("titlebar", 95)) {
                        return false;
                      } else {
                        if (param1.b("titlebar_divleft", param2 ^ 26)) {
                          if (param1.b("titlebar_divright", param2 ^ 91)) {
                            if (param1.b("courseselect_bar", 115)) {
                              if (param1.b("locked", -119)) {
                                if (param1.b("loading", param2 + -227)) {
                                  if (param3.b("basic", -83)) {
                                    if (param2 == 111) {
                                      L0: {
                                        if (!param1.b("keyboard_space", -98)) {
                                          break L0;
                                        } else {
                                          if (!param1.b("keyboard_esc", param2 ^ 31)) {
                                            break L0;
                                          } else {
                                            if (!param1.b("keyboard_right", 81)) {
                                              break L0;
                                            } else {
                                              if (!param1.b("keyboard_left", param2 ^ 56)) {
                                                break L0;
                                              } else {
                                                if (!param1.b("keyboard_down", -92)) {
                                                  break L0;
                                                } else {
                                                  if (!param1.b("keyboard_up", -103)) {
                                                    break L0;
                                                  } else {
                                                    if (!param1.b("keyboard_enter", 53)) {
                                                      break L0;
                                                    } else {
                                                      if (!param1.b("keyboard_ctrl", param2 + 2)) {
                                                        break L0;
                                                      } else {
                                                        if (!param1.b("keyboard_alt", -109)) {
                                                          break L0;
                                                        } else {
                                                          if (!param1.b("keyboard_tab", -119)) {
                                                            break L0;
                                                          } else {
                                                            if (!param1.b("keyboard_q", 51)) {
                                                              break L0;
                                                            } else {
                                                              if (!param1.b("keyboard_a", -95)) {
                                                                break L0;
                                                              } else {
                                                                if (!param1.b("keyboard_x", 86)) {
                                                                  break L0;
                                                                } else {
                                                                  if (!param1.b("keyboard_c", param2 + -226)) {
                                                                    break L0;
                                                                  } else {
                                                                    if (param1.b("frame", param2 + -191)) {
                                                                      if (param1.b("frame_textured", -111)) {
                                                                        if (!param1.b("tarmac", -95)) {
                                                                          return false;
                                                                        } else {
                                                                          if (kb.a(16616, 0)) {
                                                                            if (!param1.b("halloween_zombie", param2 + -70)) {
                                                                              return false;
                                                                            } else {
                                                                              if (!param1.b("halloween_blood", 85)) {
                                                                                return false;
                                                                              } else {
                                                                                return true;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            return true;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        return false;
                                                                      }
                                                                    } else {
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return false;
                                    } else {
                                      field_i = null;
                                      if (param1.b("keyboard_space", -98)) {
                                        if (param1.b("keyboard_esc", param2 ^ 31)) {
                                          if (param1.b("keyboard_right", 81)) {
                                            if (param1.b("keyboard_left", param2 ^ 56)) {
                                              if (param1.b("keyboard_down", -92)) {
                                                if (param1.b("keyboard_up", -103)) {
                                                  if (param1.b("keyboard_enter", 53)) {
                                                    if (param1.b("keyboard_ctrl", param2 + 2)) {
                                                      L1: {
                                                        if (!param1.b("keyboard_alt", -109)) {
                                                          break L1;
                                                        } else {
                                                          if (!param1.b("keyboard_tab", -119)) {
                                                            break L1;
                                                          } else {
                                                            if (!param1.b("keyboard_q", 51)) {
                                                              break L1;
                                                            } else {
                                                              if (!param1.b("keyboard_a", -95)) {
                                                                break L1;
                                                              } else {
                                                                if (!param1.b("keyboard_x", 86)) {
                                                                  break L1;
                                                                } else {
                                                                  if (!param1.b("keyboard_c", param2 + -226)) {
                                                                    break L1;
                                                                  } else {
                                                                    if (param1.b("frame", param2 + -191)) {
                                                                      if (param1.b("frame_textured", -111)) {
                                                                        if (!param1.b("tarmac", -95)) {
                                                                          return false;
                                                                        } else {
                                                                          if (kb.a(16616, 0)) {
                                                                            if (!param1.b("halloween_zombie", param2 + -70)) {
                                                                              return false;
                                                                            } else {
                                                                              if (!param1.b("halloween_blood", 85)) {
                                                                                return false;
                                                                              } else {
                                                                                return true;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            return true;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        return false;
                                                                      }
                                                                    } else {
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return false;
                                                    } else {
                                                      return false;
                                                    }
                                                  } else {
                                                    return false;
                                                  }
                                                } else {
                                                  return false;
                                                }
                                              } else {
                                                return false;
                                              }
                                            } else {
                                              return false;
                                            }
                                          } else {
                                            return false;
                                          }
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        return false;
                                      }
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  return false;
                                }
                              } else {
                                return false;
                              }
                            } else {
                              return false;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_k = null;
        field_i = null;
        field_j = null;
        if (param0 != 0) {
            field_k = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
