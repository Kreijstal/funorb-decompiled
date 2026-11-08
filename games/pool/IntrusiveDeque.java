/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static ContextMenu field_c;
    static String resign;
    IntrusiveNode field_e;
    private IntrusiveNode field_f;
    static String menuSettings;
    static String muChatLobbyShowAll;

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = this.field_e.next;
        if (var2 == this.field_e) {
          return null;
        }
        var2.unlink((byte) -117);
        if (param0 != -1) {
          return (IntrusiveNode) null;
        }
        return var2;
    }

    final boolean isEmpty(int param0) {
        if (param0 != 0) {
          this.size(-24);
        }
        return this.field_e == this.field_e.previous ? true : false;
    }

    final void clear(byte param0) {
        IntrusiveNode var2;
        if (param0 <= 20) {
          return;
        }
        while (true) {
          var2 = this.field_e.previous;
          if (this.field_e != var2) {
            var2.unlink((byte) -117);
            continue;
          }
          break;
        }
        this.field_f = null;
        return;
    }

    final IntrusiveNode removeLast(byte param0) {
        IntrusiveNode var2 = this.field_e.previous;
        if (this.field_e == var2) {
          return null;
        }
        var2.unlink((byte) -117);
        if (param0 != -41) {
          return (IntrusiveNode) null;
        }
        return var2;
    }

    final IntrusiveNode first(byte param0) {
        if (param0 != -127) {
          this.field_e = (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_e.next;
        if (var2 == this.field_e) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.next;
        return var2;
    }

    public static void releaseStatics(int param0) {
        menuSettings = null;
        resign = null;
        muChatLobbyShowAll = null;
        if (param0 >= -63) {
          menuSettings = (String) null;
        }
        field_c = null;
    }

    final IntrusiveNode next(byte param0) {
        IntrusiveNode var2 = this.field_f;
        if (this.field_e == var2) {
          this.field_f = null;
          return null;
        }
        if (param0 != -46) {
          menuSettings = (String) null;
        }
        this.field_f = var2.next;
        return var2;
    }

    final IntrusiveNode last(byte param0) {
        IntrusiveNode var2 = this.field_e.previous;
        if (this.field_e == var2) {
          this.field_f = null;
          return null;
        }
        int var3 = -68 / ((param0 - 28) / 32);
        this.field_f = var2.previous;
        return var2;
    }

    final static boolean a(int param0, byte param1) {
        if (-1 == param0) {
          return true;
        }
        int var2 = -43 % ((param1 + 69) / 57);
        return (AwtEventQueueSupport.field_d & 1 << param0) != 0 ? true : false;
    }

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = Pool.field_O;
        try {
          var1_int = 0;
          if (param0 < 73) {
            muChatLobbyShowAll = (String) null;
          }
          while (IntrusiveDequeCursor.field_e > var1_int) {
            wb.field_e[var1_int] = null;
            var1_int++;
          }
          IntrusiveDequeCursor.field_e = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ko.B(" + param0 + ')');
        }
    }

    final void addLast(byte param0, IntrusiveNode param1) {
        try {
          if (null != param1.next) {
            param1.unlink((byte) -117);
          }
          if (param0 != -84) {
            IntrusiveDeque.a(-104, (byte) -10);
          }
          param1.next = this.field_e;
          param1.previous = this.field_e.previous;
          param1.next.previous = param1;
          param1.previous.next = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ko.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int size(int param0) {
        int var2 = 0;
        IntrusiveNode var3 = this.field_e.previous;
        if (param0 < 15) {
          muChatLobbyShowAll = (String) null;
        }
        while (var3 != this.field_e) {
          var2++;
          var3 = var3.previous;
        }
        return var2;
    }

    final IntrusiveNode previous(byte param0) {
        IntrusiveNode var2 = this.field_f;
        if (param0 != -5) {
          this.removeFirst(63);
        }
        if (var2 == this.field_e) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.previous;
        return var2;
    }

    final IntrusiveNode a(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_e.previous;
          }
          if (param1 != 0) {
            stackIn_5_0 = (IntrusiveNode) null;
            return stackIn_5_0;
          }
          if (this.field_e != var3) {
            this.field_f = var3.previous;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_f = null;
          stackIn_8_0 = null;
          return (IntrusiveNode) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ko.K(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void addFirst(byte param0, IntrusiveNode param1) {
        try {
          if (param1.next != null) {
            param1.unlink((byte) -117);
          }
          param1.next = this.field_e.next;
          param1.previous = this.field_e;
          param1.next.previous = param1;
          param1.previous.next = param1;
          int var3_int = -68 / ((param0 - 40) / 40);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ko.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          var5_int = 0;
          if (param4 != -147296924) {
            return;
          }
          while (true) {
            if (var5_int >= DialogLayer.field_T.length) {
              return;
            }
            param3 = DialogLayer.field_T[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = RankingsScreen.field_I[incrementValue$1];
              dupTemp$2 = param2[param1];
              dupTemp$3 = param0[dupTemp$2];
              param0[dupTemp$2] = dupTemp$3 + 1;
              RankingsScreen.field_I[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ko.N(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public IntrusiveDeque() {
        this.field_e = new IntrusiveNode();
        this.field_e.next = this.field_e;
        this.field_e.previous = this.field_e;
    }

    static {
        resign = "Resign";
        menuSettings = "Options";
        muChatLobbyShowAll = "Show all lobby chat";
    }
}
