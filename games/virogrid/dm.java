/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm extends wb {
    int field_p;
    static int[] field_w;
    static wc field_v;
    static int field_u;
    static km field_r;
    static String field_s;
    static int[] field_x;
    static String field_q;
    static String field_o;
    static String field_t;

    abstract Object b(byte param0);

    public static void e(int param0) {
        field_v = null;
        field_t = null;
        field_o = null;
        int var1 = -57 / ((-8 - param0) / 35);
        field_s = null;
        field_w = null;
        field_x = null;
        field_r = null;
        field_q = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (mi.a(param1 ^ -375, true, param0)) {
          if (param1 == -1478) {
            var2 = 0;
            L0: while (true) {
              if (param0.length() > var2) {
                if (bn.a(-114, param0.charAt(var2))) {
                  var2++;
                  continue L0;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            field_o = null;
            var2 = 0;
            L1: while (true) {
              if (param0.length() > var2) {
                if (bn.a(-114, param0.charAt(var2))) {
                  var2++;
                  continue L1;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    abstract boolean d(int param0);

    dm(int param0) {
        ((dm) this).field_p = param0;
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param1 != 4) {
          field_v = null;
          var2 = param0;
          if (-33 != (var2 ^ -1)) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (-96 != (var2 ^ -1)) {
                  if (45 == var2) {
                    break L0;
                  } else {
                    L1: {
                      if (91 == var2) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) != -94) {
                          if (35 == var2) {
                            break L1;
                          } else {
                            L2: {
                              if (224 == var2) {
                                break L2;
                              } else {
                                if ((var2 ^ -1) == -226) {
                                  break L2;
                                } else {
                                  if (-227 == (var2 ^ -1)) {
                                    break L2;
                                  } else {
                                    if (-229 != (var2 ^ -1)) {
                                      if (-228 == (var2 ^ -1)) {
                                        break L2;
                                      } else {
                                        if ((var2 ^ -1) != -193) {
                                          if (-194 == (var2 ^ -1)) {
                                            break L2;
                                          } else {
                                            if (194 != var2) {
                                              if (var2 == 196) {
                                                break L2;
                                              } else {
                                                if ((var2 ^ -1) == -196) {
                                                  break L2;
                                                } else {
                                                  if (var2 != 232) {
                                                    L3: {
                                                      if (233 == var2) {
                                                        break L3;
                                                      } else {
                                                        if (-235 == (var2 ^ -1)) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (200 == var2) {
                                                              break L3;
                                                            } else {
                                                              if (-202 == (var2 ^ -1)) {
                                                                break L3;
                                                              } else {
                                                                if ((var2 ^ -1) == -203) {
                                                                  break L3;
                                                                } else {
                                                                  if (203 == var2) {
                                                                    break L3;
                                                                  } else {
                                                                    if (237 != var2) {
                                                                      L4: {
                                                                        if ((var2 ^ -1) == -239) {
                                                                          break L4;
                                                                        } else {
                                                                          if (239 == var2) {
                                                                            break L4;
                                                                          } else {
                                                                            if (-206 != (var2 ^ -1)) {
                                                                              if (var2 != 206) {
                                                                                if ((var2 ^ -1) == -208) {
                                                                                  break L4;
                                                                                } else {
                                                                                  L5: {
                                                                                    if (var2 == 242) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (-244 != (var2 ^ -1)) {
                                                                                        if (var2 == 244) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (-247 != (var2 ^ -1)) {
                                                                                            if (-246 == (var2 ^ -1)) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if ((var2 ^ -1) != -211) {
                                                                                                if (211 == var2) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (var2 == 212) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if ((var2 ^ -1) != -215) {
                                                                                                      if (var2 == 213) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (var2 != 250) {
                                                                                                              if (-252 != (var2 ^ -1)) {
                                                                                                                if ((var2 ^ -1) == -253) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (var2 != 217) {
                                                                                                                    if (var2 != 218) {
                                                                                                                      if (-220 == (var2 ^ -1)) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        if ((var2 ^ -1) == -221) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (var2 == 255) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  if ((var2 ^ -1) != -242) {
                                                                                                                                    if ((var2 ^ -1) == -210) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (223 == var2) {
                                                                                                                                        return 'b';
                                                                                                                                      } else {
                                                                                                                                        return Character.toLowerCase(param0);
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'o';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'i';
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      return 'i';
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    return 'e';
                                                  } else {
                                                    return 'e';
                                                  }
                                                }
                                              }
                                            } else {
                                              return 'a';
                                            }
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                            return 'a';
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return param0;
                  }
                } else {
                  break L0;
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param0;
          if (-33 != (var2 ^ -1)) {
            if (var2 != 160) {
              if (-96 != (var2 ^ -1)) {
                if (45 != var2) {
                  if (91 != var2) {
                    L7: {
                      if ((var2 ^ -1) != -94) {
                        if (35 == var2) {
                          break L7;
                        } else {
                          L8: {
                            if (224 == var2) {
                              break L8;
                            } else {
                              if ((var2 ^ -1) == -226) {
                                break L8;
                              } else {
                                if (-227 == (var2 ^ -1)) {
                                  break L8;
                                } else {
                                  if (-229 != (var2 ^ -1)) {
                                    if (-228 == (var2 ^ -1)) {
                                      break L8;
                                    } else {
                                      if ((var2 ^ -1) != -193) {
                                        if (-194 == (var2 ^ -1)) {
                                          break L8;
                                        } else {
                                          if (194 != var2) {
                                            if (var2 == 196) {
                                              break L8;
                                            } else {
                                              if ((var2 ^ -1) == -196) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (var2 != 232) {
                                                    if (233 == var2) {
                                                      break L9;
                                                    } else {
                                                      if (-235 == (var2 ^ -1)) {
                                                        break L9;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L9;
                                                        } else {
                                                          if (200 == var2) {
                                                            break L9;
                                                          } else {
                                                            if (-202 == (var2 ^ -1)) {
                                                              break L9;
                                                            } else {
                                                              if ((var2 ^ -1) == -203) {
                                                                break L9;
                                                              } else {
                                                                if (203 == var2) {
                                                                  break L9;
                                                                } else {
                                                                  L10: {
                                                                    if (237 != var2) {
                                                                      if ((var2 ^ -1) == -239) {
                                                                        break L10;
                                                                      } else {
                                                                        if (239 == var2) {
                                                                          break L10;
                                                                        } else {
                                                                          if (-206 != (var2 ^ -1)) {
                                                                            if (var2 != 206) {
                                                                              if ((var2 ^ -1) == -208) {
                                                                                break L10;
                                                                              } else {
                                                                                L11: {
                                                                                  if (var2 == 242) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    if (-244 != (var2 ^ -1)) {
                                                                                      if (var2 == 244) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if (-247 != (var2 ^ -1)) {
                                                                                          if (-246 == (var2 ^ -1)) {
                                                                                            break L11;
                                                                                          } else {
                                                                                            if ((var2 ^ -1) != -211) {
                                                                                              if (211 == var2) {
                                                                                                break L11;
                                                                                              } else {
                                                                                                if (var2 == 212) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) != -215) {
                                                                                                    if (var2 == 213) {
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      L12: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          if (var2 != 250) {
                                                                                                            if (-252 != (var2 ^ -1)) {
                                                                                                              if ((var2 ^ -1) == -253) {
                                                                                                                break L12;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if (var2 != 218) {
                                                                                                                    if (-220 == (var2 ^ -1)) {
                                                                                                                      break L12;
                                                                                                                    } else {
                                                                                                                      if ((var2 ^ -1) == -221) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (var2 != 231) {
                                                                                                                          if (var2 != 199) {
                                                                                                                            if (var2 == 255) {
                                                                                                                              return 'y';
                                                                                                                            } else {
                                                                                                                              if (var2 != 376) {
                                                                                                                                if ((var2 ^ -1) != -242) {
                                                                                                                                  if ((var2 ^ -1) == -210) {
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    if (223 == var2) {
                                                                                                                                      return 'b';
                                                                                                                                    } else {
                                                                                                                                      return Character.toLowerCase(param0);
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L12;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L12;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L11;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              break L11;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L11;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              break L10;
                                                                            }
                                                                          } else {
                                                                            break L10;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                                return 'e';
                                              }
                                            }
                                          } else {
                                            break L8;
                                          }
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          return 'a';
                        }
                      } else {
                        break L7;
                      }
                    }
                    return param0;
                  } else {
                    return param0;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[5];
        field_s = "Play rated game";
        field_o = "Try changing the '<%0>' setting.";
        field_q = "<%0> is not a member, and cannot play with the current options.";
        field_t = "That name is not available";
    }
}
