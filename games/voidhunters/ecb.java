/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ecb implements dja {
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 14) {
            field_a = null;
        }
    }

    public final tv a(byte param0) {
        int var2 = -7 % ((-64 - param0) / 50);
        return (tv) (Object) new rsb();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = null;
            return (tv[]) (Object) new rsb[param1];
        }
        return (tv[]) (Object) new rsb[param1];
    }

    final static int a(int param0, byte param1, int param2) {
        if ((param2 ^ -1) > -16385) {
          if ((param2 ^ -1) <= 16383) {
            L0: {
              if (16384 <= param0) {
                L1: {
                  L2: {
                    if (-536870913 >= (param2 ^ -1)) {
                      break L2;
                    } else {
                      if ((param2 ^ -1) > 536870911) {
                        break L2;
                      } else {
                        if ((param0 ^ -1) <= -536870913) {
                          break L2;
                        } else {
                          if (param0 >= -536870912) {
                            break L1;
                          } else {
                            L3: {
                              L4: {
                                param2 = param2 >> 16;
                                param0 = param0 >> 16;
                                if (2097152 <= param2) {
                                  break L4;
                                } else {
                                  if ((param2 ^ -1) > 2097151) {
                                    break L4;
                                  } else {
                                    if (-2097153 >= (param0 ^ -1)) {
                                      break L4;
                                    } else {
                                      if (2097151 < (param0 ^ -1)) {
                                        break L4;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                              param0 = param0 >> 8;
                              param2 = param2 >> 8;
                              break L3;
                            }
                            L5: {
                              L6: {
                                if (param2 >= 131072) {
                                  break L6;
                                } else {
                                  if (param2 < -131072) {
                                    break L6;
                                  } else {
                                    if (131072 <= param0) {
                                      break L6;
                                    } else {
                                      if (131071 >= (param0 ^ -1)) {
                                        break L5;
                                      } else {
                                        L7: {
                                          L8: {
                                            param0 = param0 >> 4;
                                            param2 = param2 >> 4;
                                            if ((param2 ^ -1) <= -32769) {
                                              break L8;
                                            } else {
                                              if (32767 < (param2 ^ -1)) {
                                                break L8;
                                              } else {
                                                if (param0 >= 32768) {
                                                  break L8;
                                                } else {
                                                  if (32767 < (param0 ^ -1)) {
                                                    break L8;
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          param2 = param2 >> 2;
                                          param0 = param0 >> 2;
                                          break L7;
                                        }
                                        L9: {
                                          L10: {
                                            if (16384 <= param2) {
                                              break L10;
                                            } else {
                                              if (param2 < -16384) {
                                                break L10;
                                              } else {
                                                if (16384 <= param0) {
                                                  break L10;
                                                } else {
                                                  if ((param0 ^ -1) > 16383) {
                                                    break L10;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          param0 = param0 >> 1;
                                          param2 = param2 >> 1;
                                          break L9;
                                        }
                                        L11: {
                                          if (param1 == -77) {
                                            break L11;
                                          } else {
                                            ecb.a(34);
                                            break L11;
                                          }
                                        }
                                        return sqb.a(param0, 102, param2);
                                      }
                                    }
                                  }
                                }
                              }
                              param0 = param0 >> 4;
                              param2 = param2 >> 4;
                              break L5;
                            }
                            L12: {
                              L13: {
                                if ((param2 ^ -1) <= -32769) {
                                  break L13;
                                } else {
                                  if (32767 < (param2 ^ -1)) {
                                    break L13;
                                  } else {
                                    if (param0 >= 32768) {
                                      break L13;
                                    } else {
                                      if (32767 < (param0 ^ -1)) {
                                        break L13;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              param2 = param2 >> 2;
                              param0 = param0 >> 2;
                              break L12;
                            }
                            L14: {
                              L15: {
                                if (16384 <= param2) {
                                  break L15;
                                } else {
                                  if (param2 < -16384) {
                                    break L15;
                                  } else {
                                    if (16384 <= param0) {
                                      break L15;
                                    } else {
                                      if ((param0 ^ -1) > 16383) {
                                        break L15;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                              param0 = param0 >> 1;
                              param2 = param2 >> 1;
                              break L14;
                            }
                            if (param1 == -77) {
                              return sqb.a(param0, 102, param2);
                            } else {
                              ecb.a(34);
                              return sqb.a(param0, 102, param2);
                            }
                          }
                        }
                      }
                    }
                  }
                  param2 = param2 >> 16;
                  param0 = param0 >> 16;
                  break L1;
                }
                L16: {
                  L17: {
                    if (2097152 <= param2) {
                      break L17;
                    } else {
                      if ((param2 ^ -1) > 2097151) {
                        break L17;
                      } else {
                        if (-2097153 >= (param0 ^ -1)) {
                          break L17;
                        } else {
                          if (2097151 < (param0 ^ -1)) {
                            break L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  }
                  param0 = param0 >> 8;
                  param2 = param2 >> 8;
                  break L16;
                }
                L18: {
                  L19: {
                    if (param2 >= 131072) {
                      break L19;
                    } else {
                      if (param2 < -131072) {
                        break L19;
                      } else {
                        if (131072 <= param0) {
                          break L19;
                        } else {
                          if (131071 >= (param0 ^ -1)) {
                            break L18;
                          } else {
                            L20: {
                              L21: {
                                param0 = param0 >> 4;
                                param2 = param2 >> 4;
                                if ((param2 ^ -1) <= -32769) {
                                  break L21;
                                } else {
                                  if (32767 < (param2 ^ -1)) {
                                    break L21;
                                  } else {
                                    if (param0 >= 32768) {
                                      break L21;
                                    } else {
                                      if (32767 < (param0 ^ -1)) {
                                        break L21;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                              }
                              param2 = param2 >> 2;
                              param0 = param0 >> 2;
                              break L20;
                            }
                            L22: {
                              L23: {
                                if (16384 <= param2) {
                                  break L23;
                                } else {
                                  if (param2 < -16384) {
                                    break L23;
                                  } else {
                                    if (16384 <= param0) {
                                      break L23;
                                    } else {
                                      if ((param0 ^ -1) > 16383) {
                                        break L23;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                              }
                              param0 = param0 >> 1;
                              param2 = param2 >> 1;
                              break L22;
                            }
                            if (param1 == -77) {
                              return sqb.a(param0, 102, param2);
                            } else {
                              ecb.a(34);
                              return sqb.a(param0, 102, param2);
                            }
                          }
                        }
                      }
                    }
                  }
                  param0 = param0 >> 4;
                  param2 = param2 >> 4;
                  break L18;
                }
                L24: {
                  L25: {
                    if ((param2 ^ -1) <= -32769) {
                      break L25;
                    } else {
                      if (32767 < (param2 ^ -1)) {
                        break L25;
                      } else {
                        if (param0 >= 32768) {
                          break L25;
                        } else {
                          if (32767 < (param0 ^ -1)) {
                            break L25;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  param2 = param2 >> 2;
                  param0 = param0 >> 2;
                  break L24;
                }
                L26: {
                  if (16384 <= param2) {
                    break L26;
                  } else {
                    if (param2 < -16384) {
                      break L26;
                    } else {
                      if (16384 <= param0) {
                        break L26;
                      } else {
                        if ((param0 ^ -1) > 16383) {
                          break L26;
                        } else {
                          if (param1 == -77) {
                            return sqb.a(param0, 102, param2);
                          } else {
                            ecb.a(34);
                            return sqb.a(param0, 102, param2);
                          }
                        }
                      }
                    }
                  }
                }
                param0 = param0 >> 1;
                param2 = param2 >> 1;
                break L0;
              } else {
                if ((param0 ^ -1) <= 16383) {
                  break L0;
                } else {
                  L27: {
                    L28: {
                      if (-536870913 >= (param2 ^ -1)) {
                        break L28;
                      } else {
                        if ((param2 ^ -1) > 536870911) {
                          break L28;
                        } else {
                          if ((param0 ^ -1) <= -536870913) {
                            break L28;
                          } else {
                            if (param0 >= -536870912) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                    }
                    param2 = param2 >> 16;
                    param0 = param0 >> 16;
                    break L27;
                  }
                  L29: {
                    L30: {
                      if (2097152 <= param2) {
                        break L30;
                      } else {
                        if ((param2 ^ -1) > 2097151) {
                          break L30;
                        } else {
                          if (-2097153 >= (param0 ^ -1)) {
                            break L30;
                          } else {
                            if (2097151 < (param0 ^ -1)) {
                              break L30;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                    }
                    param0 = param0 >> 8;
                    param2 = param2 >> 8;
                    break L29;
                  }
                  L31: {
                    L32: {
                      if (param2 >= 131072) {
                        break L32;
                      } else {
                        if (param2 < -131072) {
                          break L32;
                        } else {
                          if (131072 <= param0) {
                            break L32;
                          } else {
                            if (131071 >= (param0 ^ -1)) {
                              break L31;
                            } else {
                              L33: {
                                L34: {
                                  param0 = param0 >> 4;
                                  param2 = param2 >> 4;
                                  if ((param2 ^ -1) <= -32769) {
                                    break L34;
                                  } else {
                                    if (32767 < (param2 ^ -1)) {
                                      break L34;
                                    } else {
                                      if (param0 >= 32768) {
                                        break L34;
                                      } else {
                                        if (32767 < (param0 ^ -1)) {
                                          break L34;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                }
                                param2 = param2 >> 2;
                                param0 = param0 >> 2;
                                break L33;
                              }
                              L35: {
                                L36: {
                                  if (16384 <= param2) {
                                    break L36;
                                  } else {
                                    if (param2 < -16384) {
                                      break L36;
                                    } else {
                                      if (16384 <= param0) {
                                        break L36;
                                      } else {
                                        if ((param0 ^ -1) > 16383) {
                                          break L36;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                  }
                                }
                                param0 = param0 >> 1;
                                param2 = param2 >> 1;
                                break L35;
                              }
                              L37: {
                                if (param1 == -77) {
                                  break L37;
                                } else {
                                  ecb.a(34);
                                  break L37;
                                }
                              }
                              return sqb.a(param0, 102, param2);
                            }
                          }
                        }
                      }
                    }
                    param0 = param0 >> 4;
                    param2 = param2 >> 4;
                    break L31;
                  }
                  L38: {
                    L39: {
                      if ((param2 ^ -1) <= -32769) {
                        break L39;
                      } else {
                        if (32767 < (param2 ^ -1)) {
                          break L39;
                        } else {
                          if (param0 >= 32768) {
                            break L39;
                          } else {
                            if (32767 < (param0 ^ -1)) {
                              break L39;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                    }
                    param2 = param2 >> 2;
                    param0 = param0 >> 2;
                    break L38;
                  }
                  L40: {
                    L41: {
                      if (16384 <= param2) {
                        break L41;
                      } else {
                        if (param2 < -16384) {
                          break L41;
                        } else {
                          if (16384 <= param0) {
                            break L41;
                          } else {
                            if ((param0 ^ -1) > 16383) {
                              break L41;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                    }
                    param0 = param0 >> 1;
                    param2 = param2 >> 1;
                    break L40;
                  }
                  if (param1 == -77) {
                    return sqb.a(param0, 102, param2);
                  } else {
                    ecb.a(34);
                    return sqb.a(param0, 102, param2);
                  }
                }
              }
            }
            if (param1 == -77) {
              return sqb.a(param0, 102, param2);
            } else {
              ecb.a(34);
              return sqb.a(param0, 102, param2);
            }
          } else {
            L42: {
              L43: {
                if (-536870913 >= (param2 ^ -1)) {
                  break L43;
                } else {
                  if ((param2 ^ -1) > 536870911) {
                    break L43;
                  } else {
                    if ((param0 ^ -1) <= -536870913) {
                      break L43;
                    } else {
                      if (param0 >= -536870912) {
                        break L42;
                      } else {
                        L44: {
                          L45: {
                            param2 = param2 >> 16;
                            param0 = param0 >> 16;
                            if (2097152 <= param2) {
                              break L45;
                            } else {
                              if ((param2 ^ -1) > 2097151) {
                                break L45;
                              } else {
                                if (-2097153 >= (param0 ^ -1)) {
                                  break L45;
                                } else {
                                  if (2097151 < (param0 ^ -1)) {
                                    break L45;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                          }
                          param0 = param0 >> 8;
                          param2 = param2 >> 8;
                          break L44;
                        }
                        L46: {
                          L47: {
                            if (param2 >= 131072) {
                              break L47;
                            } else {
                              if (param2 < -131072) {
                                break L47;
                              } else {
                                if (131072 <= param0) {
                                  break L47;
                                } else {
                                  if (131071 >= (param0 ^ -1)) {
                                    break L46;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                          }
                          param0 = param0 >> 4;
                          param2 = param2 >> 4;
                          break L46;
                        }
                        L48: {
                          L49: {
                            if ((param2 ^ -1) <= -32769) {
                              break L49;
                            } else {
                              if (32767 < (param2 ^ -1)) {
                                break L49;
                              } else {
                                if (param0 >= 32768) {
                                  break L49;
                                } else {
                                  if (32767 < (param0 ^ -1)) {
                                    break L49;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                          }
                          param2 = param2 >> 2;
                          param0 = param0 >> 2;
                          break L48;
                        }
                        L50: {
                          L51: {
                            if (16384 <= param2) {
                              break L51;
                            } else {
                              if (param2 < -16384) {
                                break L51;
                              } else {
                                if (16384 <= param0) {
                                  break L51;
                                } else {
                                  if ((param0 ^ -1) > 16383) {
                                    break L51;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                            }
                          }
                          param0 = param0 >> 1;
                          param2 = param2 >> 1;
                          break L50;
                        }
                        L52: {
                          if (param1 == -77) {
                            break L52;
                          } else {
                            ecb.a(34);
                            break L52;
                          }
                        }
                        return sqb.a(param0, 102, param2);
                      }
                    }
                  }
                }
              }
              param2 = param2 >> 16;
              param0 = param0 >> 16;
              break L42;
            }
            L53: {
              L54: {
                if (2097152 <= param2) {
                  break L54;
                } else {
                  if ((param2 ^ -1) > 2097151) {
                    break L54;
                  } else {
                    if (-2097153 >= (param0 ^ -1)) {
                      break L54;
                    } else {
                      if (2097151 < (param0 ^ -1)) {
                        break L54;
                      } else {
                        break L53;
                      }
                    }
                  }
                }
              }
              param0 = param0 >> 8;
              param2 = param2 >> 8;
              break L53;
            }
            L55: {
              L56: {
                if (param2 >= 131072) {
                  break L56;
                } else {
                  if (param2 < -131072) {
                    break L56;
                  } else {
                    if (131072 <= param0) {
                      break L56;
                    } else {
                      if (131071 >= (param0 ^ -1)) {
                        break L55;
                      } else {
                        L57: {
                          L58: {
                            param0 = param0 >> 4;
                            param2 = param2 >> 4;
                            if ((param2 ^ -1) <= -32769) {
                              break L58;
                            } else {
                              if (32767 < (param2 ^ -1)) {
                                break L58;
                              } else {
                                if (param0 >= 32768) {
                                  break L58;
                                } else {
                                  if (32767 < (param0 ^ -1)) {
                                    break L58;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                          }
                          param2 = param2 >> 2;
                          param0 = param0 >> 2;
                          break L57;
                        }
                        L59: {
                          L60: {
                            if (16384 <= param2) {
                              break L60;
                            } else {
                              if (param2 < -16384) {
                                break L60;
                              } else {
                                if (16384 <= param0) {
                                  break L60;
                                } else {
                                  if ((param0 ^ -1) > 16383) {
                                    break L60;
                                  } else {
                                    break L59;
                                  }
                                }
                              }
                            }
                          }
                          param0 = param0 >> 1;
                          param2 = param2 >> 1;
                          break L59;
                        }
                        L61: {
                          if (param1 == -77) {
                            break L61;
                          } else {
                            ecb.a(34);
                            break L61;
                          }
                        }
                        return sqb.a(param0, 102, param2);
                      }
                    }
                  }
                }
              }
              param0 = param0 >> 4;
              param2 = param2 >> 4;
              break L55;
            }
            L62: {
              L63: {
                if ((param2 ^ -1) <= -32769) {
                  break L63;
                } else {
                  if (32767 < (param2 ^ -1)) {
                    break L63;
                  } else {
                    if (param0 >= 32768) {
                      break L63;
                    } else {
                      if (32767 < (param0 ^ -1)) {
                        break L63;
                      } else {
                        break L62;
                      }
                    }
                  }
                }
              }
              param2 = param2 >> 2;
              param0 = param0 >> 2;
              break L62;
            }
            L64: {
              if (16384 <= param2) {
                break L64;
              } else {
                if (param2 < -16384) {
                  break L64;
                } else {
                  if (16384 <= param0) {
                    break L64;
                  } else {
                    if ((param0 ^ -1) > 16383) {
                      break L64;
                    } else {
                      L65: {
                        if (param1 == -77) {
                          break L65;
                        } else {
                          ecb.a(34);
                          break L65;
                        }
                      }
                      return sqb.a(param0, 102, param2);
                    }
                  }
                }
              }
            }
            param0 = param0 >> 1;
            param2 = param2 >> 1;
            if (param1 == -77) {
              return sqb.a(param0, 102, param2);
            } else {
              ecb.a(34);
              return sqb.a(param0, 102, param2);
            }
          }
        } else {
          L66: {
            L67: {
              if (-536870913 >= (param2 ^ -1)) {
                break L67;
              } else {
                if ((param2 ^ -1) > 536870911) {
                  break L67;
                } else {
                  if ((param0 ^ -1) <= -536870913) {
                    break L67;
                  } else {
                    if (param0 >= -536870912) {
                      break L66;
                    } else {
                      L68: {
                        L69: {
                          param2 = param2 >> 16;
                          param0 = param0 >> 16;
                          if (2097152 <= param2) {
                            break L69;
                          } else {
                            if ((param2 ^ -1) > 2097151) {
                              break L69;
                            } else {
                              if (-2097153 >= (param0 ^ -1)) {
                                break L69;
                              } else {
                                if (2097151 < (param0 ^ -1)) {
                                  break L69;
                                } else {
                                  break L68;
                                }
                              }
                            }
                          }
                        }
                        param0 = param0 >> 8;
                        param2 = param2 >> 8;
                        break L68;
                      }
                      L70: {
                        L71: {
                          if (param2 >= 131072) {
                            break L71;
                          } else {
                            if (param2 < -131072) {
                              break L71;
                            } else {
                              if (131072 <= param0) {
                                break L71;
                              } else {
                                if (131071 >= (param0 ^ -1)) {
                                  break L70;
                                } else {
                                  break L71;
                                }
                              }
                            }
                          }
                        }
                        param0 = param0 >> 4;
                        param2 = param2 >> 4;
                        break L70;
                      }
                      L72: {
                        L73: {
                          if ((param2 ^ -1) <= -32769) {
                            break L73;
                          } else {
                            if (32767 < (param2 ^ -1)) {
                              break L73;
                            } else {
                              if (param0 >= 32768) {
                                break L73;
                              } else {
                                if (32767 < (param0 ^ -1)) {
                                  break L73;
                                } else {
                                  break L72;
                                }
                              }
                            }
                          }
                        }
                        param2 = param2 >> 2;
                        param0 = param0 >> 2;
                        break L72;
                      }
                      L74: {
                        L75: {
                          if (16384 <= param2) {
                            break L75;
                          } else {
                            if (param2 < -16384) {
                              break L75;
                            } else {
                              if (16384 <= param0) {
                                break L75;
                              } else {
                                if ((param0 ^ -1) > 16383) {
                                  break L75;
                                } else {
                                  break L74;
                                }
                              }
                            }
                          }
                        }
                        param0 = param0 >> 1;
                        param2 = param2 >> 1;
                        break L74;
                      }
                      L76: {
                        if (param1 == -77) {
                          break L76;
                        } else {
                          ecb.a(34);
                          break L76;
                        }
                      }
                      return sqb.a(param0, 102, param2);
                    }
                  }
                }
              }
            }
            param2 = param2 >> 16;
            param0 = param0 >> 16;
            break L66;
          }
          L77: {
            L78: {
              if (2097152 <= param2) {
                break L78;
              } else {
                if ((param2 ^ -1) > 2097151) {
                  break L78;
                } else {
                  if (-2097153 >= (param0 ^ -1)) {
                    break L78;
                  } else {
                    if (2097151 < (param0 ^ -1)) {
                      break L78;
                    } else {
                      break L77;
                    }
                  }
                }
              }
            }
            param0 = param0 >> 8;
            param2 = param2 >> 8;
            break L77;
          }
          L79: {
            L80: {
              if (param2 >= 131072) {
                break L80;
              } else {
                if (param2 < -131072) {
                  break L80;
                } else {
                  if (131072 <= param0) {
                    break L80;
                  } else {
                    if (131071 >= (param0 ^ -1)) {
                      break L79;
                    } else {
                      L81: {
                        L82: {
                          param0 = param0 >> 4;
                          param2 = param2 >> 4;
                          if ((param2 ^ -1) <= -32769) {
                            break L82;
                          } else {
                            if (32767 < (param2 ^ -1)) {
                              break L82;
                            } else {
                              if (param0 >= 32768) {
                                break L82;
                              } else {
                                if (32767 < (param0 ^ -1)) {
                                  break L82;
                                } else {
                                  break L81;
                                }
                              }
                            }
                          }
                        }
                        param2 = param2 >> 2;
                        param0 = param0 >> 2;
                        break L81;
                      }
                      L83: {
                        L84: {
                          if (16384 <= param2) {
                            break L84;
                          } else {
                            if (param2 < -16384) {
                              break L84;
                            } else {
                              if (16384 <= param0) {
                                break L84;
                              } else {
                                if ((param0 ^ -1) > 16383) {
                                  break L84;
                                } else {
                                  break L83;
                                }
                              }
                            }
                          }
                        }
                        param0 = param0 >> 1;
                        param2 = param2 >> 1;
                        break L83;
                      }
                      L85: {
                        if (param1 == -77) {
                          break L85;
                        } else {
                          ecb.a(34);
                          break L85;
                        }
                      }
                      return sqb.a(param0, 102, param2);
                    }
                  }
                }
              }
            }
            param0 = param0 >> 4;
            param2 = param2 >> 4;
            break L79;
          }
          L86: {
            L87: {
              if ((param2 ^ -1) <= -32769) {
                break L87;
              } else {
                if (32767 < (param2 ^ -1)) {
                  break L87;
                } else {
                  if (param0 >= 32768) {
                    break L87;
                  } else {
                    if (32767 < (param0 ^ -1)) {
                      break L87;
                    } else {
                      break L86;
                    }
                  }
                }
              }
            }
            param2 = param2 >> 2;
            param0 = param0 >> 2;
            break L86;
          }
          L88: {
            if (16384 <= param2) {
              break L88;
            } else {
              if (param2 < -16384) {
                break L88;
              } else {
                if (16384 <= param0) {
                  break L88;
                } else {
                  if ((param0 ^ -1) > 16383) {
                    break L88;
                  } else {
                    L89: {
                      if (param1 == -77) {
                        break L89;
                      } else {
                        ecb.a(34);
                        break L89;
                      }
                    }
                    return sqb.a(param0, 102, param2);
                  }
                }
              }
            }
          }
          param0 = param0 >> 1;
          param2 = param2 >> 1;
          if (param1 == -77) {
            return sqb.a(param0, 102, param2);
          } else {
            ecb.a(34);
            return sqb.a(param0, 102, param2);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{25, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    }
}
